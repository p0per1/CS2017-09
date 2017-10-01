package by.it.akhmelev.lesson03;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class Testing {


    @Test
    public void testTaskA1() throws Exception {
        Testing testing = new Testing(TaskA1.class);
        testing.contains("Hello world!");
    }

    @Test
    public void testTaskA2() throws Exception {
        Testing testing = new Testing(TaskA2.class);
        testing.contains(
                "Я начинаю изучать Java!\n" +
                        "Я начинаю изучать Java!\n" +
                        "Я начинаю изучать Java!\n" +
                        "Я начинаю изучать Java!\n" +
                        "Я начинаю изучать Java!\n"
        );
    }

    @Test
    public void testTaskA3() throws Exception {
        Testing testing = new Testing(TaskA3.class);
        testing.contains("3*3+4*4=25");
    }

    @Test
    public void testTaskC1() throws Exception {
        String in="7\n" +
                "3\n";
        Testing testing=new Testing(TaskC1.class, in);
        testing.contains("Sum = 10\n");
    }

    public Testing() {
    }

    private Testing(Class<?> c) {
        this(c,"");
    }

    private Testing(Class<?> c, String in) {
        reader=new StringReader(in); //заполнение ввода
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

    private void contains(String str) {
        assertTrue("Строка не найдена: " + str + "\n", stringWriter.toString().contains(str));
    }



    private StringWriter stringWriter = new StringWriter();
    private PrintStream oldOut = System.out;
    private StringReader reader;


    private PrintStream newOut;
    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[2];

            @Override
            public void write(int b) throws IOException {
                if (b < 0) {
                    if (bytes[0] == 0) {
                        bytes[0] = (byte) b;
                    } else {
                        bytes[1] = (byte) b;
                        String s = new String(bytes);
                        stringWriter.append(s);
                        oldOut.append(s);
                        bytes[0] = 0;
                    }
                } else {
                    bytes[0] = 0;
                    char c = (char) b;
                    if (c != '\r') {
                        stringWriter.write(c);
                    }
                    oldOut.write(c);
                }
            }
        });
    }

}
