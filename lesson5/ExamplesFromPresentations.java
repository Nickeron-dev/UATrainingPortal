public class ExamplesFromPresentations {

        public static void main(String... smth) { // just to remember this way to create main()

                // ways to create wrappers
                Integer fiveHundreds = new Integer(500);
                Integer five = Integer.valueOf(5);
                Integer tenT = 10;

                int twenty = tenT + 10; // or ten.intValue() + 10

                Integer oneTwoEight = new Integer(128);
                Integer oneTwoEight1 = new Integer(128);

                // false - obj comparison
                System.out.println(oneTwoEight == oneTwoEight1);
                // true will be unpacked
                System.out.println(oneTwoEight == oneTwoEight1 + 0);
                // true - will be unpacked
                System.out.println(oneTwoEight == 128);

                System.out.println("================");

                Integer fiveOne = 5;
                Integer fiveTwo = 5;
                // are being cached
                System.out.println("between 127 - -128: " + (fiveOne == fiveTwo));
                System.out.println("++ and -- are available: " + ++fiveOne);
                System.out.println("++ and -- are available: " + ++fiveHundreds);

                System.out.println("================");
                Integer fiveH = 500;
                Integer fiveHSecond = fiveH;
                System.out.println("References are same: " + (fiveH == fiveHSecond));
                System.out.println("But");
                fiveH++;
                fiveHSecond++;
                System.out.println("Because of: fiveH = Integer.valueOf(fiveH.intValue() + 1). So new objects are created: " + (fiveH == fiveHSecond));

                // that's why equals() is better
                System.out.println("equals() comparison: " + (fiveH.equals(fiveHSecond)));
                System.out.println("equals(501) comparison: " + (fiveH.equals(501)));

                System.out.println("================");

                Integer ten = 10;
                Long longTen = 10L;
                //System.out.println( ten == longTen ); // compile error
                System.out.println( ( ten + 0 ) == longTen); // true
                
                // false becaues there is Object param in equals
                System.out.println( ten.equals( longTen ) );
                System.out.println( ten.equals(10L) ); // false
                System.out.println( longTen.equals(10) ); // false

                Object ii = 5; // it works

        }

}
