public class TaskOne {
    public void printThreeWords() {
        System.out.print("""
                Orange\s
                Banana\s
                Apple""");
    }

    public void checkSumSign() {
        int a = 5;
        int b = -10;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    public void printColor() {

        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }

    }

    public void compareNumbers() {
        int a = 2;
        int b = 4;

        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }
}
