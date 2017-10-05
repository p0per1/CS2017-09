package by.it.sc04_evening_tue_thu.popruga.lesson03.lesson04;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class Testing {


    @Test
    public void testTaskA1() throws Exception {
        Testing testing = new Testing(TaskA1.class, "7 2");
        testing.contains("9 5 14 3 1\n9.0 5.0 14.0 3.5 1.0");
    }

    @Test
    public void testTaskA2() throws Exception {
        Testing testing = new Testing(TaskA2.class);
        String[] lines = testing.stringWriter.toString().trim().split("\\n");
        if (lines.length < 5)
            fail("Недостаточно строк");
        if (!lines[0].equals("Мое любимое стихотворение:"))
            fail("Нет заголовка: Мое любимое стихотворение:");
        String old = "old";
        for (String s : lines) {
            if (s.length() < 5)
                fail("Слишком короткие строки");
            if (old.equals(s))
                fail("Есть одинаковые строки");
            old = s;
        }
    }

    @Test
    public void testTaskB1() throws Exception {
        Testing testing = new Testing(TaskB1.class);
        testing.contains(
                "575.2220000610351\n" +
                        "111.111 7 73 273 111.111"
        );
    }

    @Test
    public void testTaskB2() throws Exception {
        Testing testing;
        testing = new Testing(TaskB2.class, "2 5 3");
        testing.contains("-1.0");
        testing.contains("-1.5");
        testing = new Testing(TaskB2.class, "2 4 2");
        testing.contains("-1.0\n");
        testing = new Testing(TaskB2.class, "2 2 2");
        testing.contains("Отрицательный дискриминант");
    }

    @Test
    public void testTaskC1() throws Exception {
        try {
            Method m = TaskC1.class.getDeclaredMethod("convertCelsiumToFahrenheit", int.class);
            assertEquals(104.0, (double) m.invoke(null, 40), 1e-22);
            assertEquals(68.0, (double) m.invoke(null, 20), 1e-22);
            assertEquals(32.0, (double) m.invoke(null, 0), 1e-22);
        } catch (NoSuchMethodException e) {
            org.junit.Assert.fail("Метод convertCelsiumToFahrenheit не найден");
        }
    }

    @Test
    public void testTaskC2() throws Exception {
        try {
        Method m = TaskC2.class.getDeclaredMethod("sumDigitsInNumber", int.class);
        assertEquals((int) m.invoke(null, 5467), 22);
        assertEquals((int) m.invoke(null, 5555), 20);
        assertEquals((int) m.invoke(null, 1111), 4);
        assertEquals((int) m.invoke(null, 9993), 30);
        } catch (NoSuchMethodException e) {
            org.junit.Assert.fail("Метод sumDigitsInNumber не найден");
        }
    }


    /*
    ===========================================================================================================
    НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
    Но изучить как он работает - можно, это всегда будет полезно.
    ===========================================================================================================
     */
    public Testing() {
        //Конструктор тестов
    }

    //Конструктор тестов
    private Testing(Class<?> c) {
        this(c, "");
    }

    //Конструктор тестов
    private Testing(Class<?> c, String in) {
        reader = new StringReader(in); //заполнение ввода
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return reader.read();
            }
        };
        System.setIn(inputStream);   //перехват ввода

        System.setOut(newOut); //перехват стандартного вывода
        try {
            Class[] argTypes = new Class[]{String[].class};
            Method main = c.getDeclaredMethod("main", argTypes);
            main.invoke(null, (Object) new String[]{});

        } catch (Exception x) {
            x.printStackTrace();
        }
        System.setOut(oldOut); //возврат вывода
    }

    //проверка вывода
    private void contains(String str) {
        assertTrue("Строка не найдена: " + str + "\n", stringWriter.toString().contains(str));
    }


    //переменные теста
    private StringWriter stringWriter = new StringWriter();
    private PrintStream oldOut = System.out;
    private StringReader reader;


    //поле для перехвата потока вывода
    private PrintStream newOut;

    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[2];

            @Override
            public void write(int b) throws IOException {
                if (b < 0) { //ловим и собираем двухбайтовый UTF (первый код > 127, или в байте <0)
                    if (bytes[0] == 0) { //если это первый байт
                        bytes[0] = (byte) b; //то запомним его
                    } else {
                        bytes[1] = (byte) b; //иначе это второй байт
                        String s = new String(bytes); //соберем весь символ
                        stringWriter.append(s); //запомним вывод для теста
                        oldOut.append(s); //копию в обычный вывод
                        bytes[0] = 0; //забудем все.
                    }
                } else {
                    char c = (char) b; //ловим и собираем однобайтовый UTF
                    bytes[0] = 0;
                    if (c != '\r') {
                        stringWriter.write(c); //запомним вывод для теста
                    }
                    oldOut.write(c); //копию в обычный вывод
                }
            }
        });
    }

}
