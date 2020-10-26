public class Main {
    public static void main(String[] args) {
       invertArray();
       fillArray();
       changeArray();
       fillDiagonal();
    }
        public static void invertArray() {
            int[] arr = { 1, 0, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i]) == 0) { arr[i] = 1;
                }else {arr[i] = 0;
                }
            }

        }

        public static void fillArray() {
            int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + i * 2;
            }
        }

        public static void changeArray() {
            int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < w.length; i++) {
                if (w[i] < 6)
                    w[i] = w[i] * 2;
            }

        }

        public  static void fillDiagonal() {
            int[][] arr = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) arr[i][j] = 1;
                }
            }

        }
}




