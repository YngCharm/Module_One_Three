public class Main {
    public static void main(String[] args) {
/*        TaskOne taskOne = new TaskOne();
*//*        taskOne.printThreeWords();
        taskOne.checkSumSign();
        taskOne.printColor();
        taskOne.compareNumbers();*//*

        TaskTwo taskTwo = new TaskTwo();
       *//* taskTwo.checkSum(30, 7);
        taskTwo.negPos(3);
        taskTwo.negPosBool(-1);
        taskTwo.printWrd(3, "пенсил");
        taskTwo.leapYear(900);
        taskTwo.replace();*//*
        //taskTwo.arrFill();
        //taskTwo.multiply();
        taskTwo.matrixDiagonal();
        taskTwo.mutableArray(10, 6);*/

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Сахно Илья Эльдарович", "Программист", "attthebest@gmail.com", "88005553535", "100$", 19);
        employees[1] = new Employee("Комляков Владислав Александрович", "Оператор", "ivanzolo2004@mail.ru", "8706452391", "-50$", 19);
        employees[2] = new Employee("Эгарков Родион - ", "Репер", "yngDady@yandex.ru", "8907654321", "10000001$", 45);
        employees[3] = new Employee("Кувалдин Молоток Перфораторович", "Медиа", "tyktyk04@gmail.com", "8911666771", "200000002$", 57);
        employees[4] = new Employee("Угли Рустем Потуши", "Арбузер", "oprashka2023@yappi.uz", "326482919", "2 арбуз", 89);

        for (Employee employee : employees){
            if (employee.age > 40){
                employee.info();
            }


        }
        Park park = new Park();
        Park.innerClass innerClass =  new Park.innerClass("Карсуль смерти", "Круглосуточно", "Бесценно");
        innerClass.info();
    }
}