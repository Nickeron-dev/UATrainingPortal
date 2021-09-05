package classes;

public class ExampleFromPresentation {
        public static void main(String... args) {
                char c2 = '\u0031';
                char c1 = '1';
                char c3 = 49;
                System.out.println(c1 + c2 + c3);

                char c22 = '\u0031';
                char c11 = '1';
                char c33 = 49;
                System.out.println("" + c11 + c22 + c33); // concat

                int v1 = 1;
                long v2 = 2L;
                //v1 = v1 + v2;
                System.out.println(v1);

                int v11 = 1;
                long v22 = 2;
                v11 += v22;
                System.out.println(v11);

                int x = 1;
                int y = 2;
                System.out.println("x + y = " + x + y);
                System.out.println(1 + 2 + "text");
                System.out.println(x + y + "text");
                System.out.println("text" + 1 + 2); // starts to cast after "text"

                byte b = 1;
                //byte c = b + 1; // compile error cause 1 is automatically int
                //byte c = (byte) b + 1; // error anyway
                //System.out.println(c);

                System.out.println(Integer.toBinaryString(17));
                System.out.println(Integer.toBinaryString(-17));
        }
}
