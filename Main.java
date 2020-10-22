public class Main {
    public static void main(String[] args) {
        doVariableDemo();
        System.out.println(calculate(3,4,10,5));
        System.out.println(task10and20( 1, 8));
        isPositiveOrNegative(-3);
        System.out.println(isNegative(4));
        greetings("Нррывв");
        visokos(2020);

    }
        public static void doVariableDemo() {
            byte var1;
            var1 = 12;
            short var2;
            var2 = 3333;
            int var3;
            var3 = 3434344;
            long var4;
            var4 = 83329390402232L;
            float var5;
            var5 = 34243253253253253F;
            double var6;
            var6 = 23243235435453454343545D;
            boolean bool;
            bool = true;
        }


        public static int calculate( int a, int b, int c, int d ) {
            return a * (b + (c / d));

        }

        public static boolean task10and20(int k, int l) {
            if ((k + l) >= 10 && (k + l) <= 20) {
                return true;
                }
                return false;
        }

        public static int isPositiveOrNegative(int f) {
            if (f >= 0) {
                System.out.println("Число положительное");
            }
                System.out.println("Число отрицательное");
            return f;

        }

        public static boolean isNegative(int g) {
            if (g < 0) {
                return true;
            }
                return false;
        }

        public static void greetings(String name) {
            System.out.println("Привет, " +name);
        }

        public static int visokos(int year) {
            if ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");}
            return year;
        }
}
