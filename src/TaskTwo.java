public class TaskTwo {
    public void checkSum(int a, int b) {
        boolean result;
        if (a + b >= 10 && a + b <= 20) {
            result = true;
        } else result = false;
        System.out.println(result);

    }

    public void negPos(int num) {
        if (num >= 0) {
            System.out.println("Положительное");
        } else
            System.out.println("Отрицательное");
    }

    public void negPosBool(int num) {

        boolean result;
        if (num >= 0) {
            result = true;
        } else result = false;
        System.out.println(result);
    }

    public void printWrd(int cnt, String word) {
        for (int i = 1; i <= cnt; i++) {
            System.out.println(word);
        }
    }

    public void leapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Не високосный");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Високосный");
        }
    }

    public void replace() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] ^= 1;
            System.out.println(array[i]);
        }
    }

    public void arrFill() {
        int[] array = new int[101];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }

    public void multiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.println(array[i]);
        }
    }

    public void matrixDiagonal() {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
                if (matrix[i] == matrix[j]) {
                    matrix[i][j] = 1;

                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
    }
    public void mutableArray(int len, int initialValue){
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }
}
