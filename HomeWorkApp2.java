package geekbrains.JavaLevel1.task2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 11));                 // Проверяем работу метода checkSum

        printPositiveOrNegativeNumber(8);                        // Проверяем работу метода printPositiveOrNegativeNumber

        System.out.println(checkPositiveOrNegativeNumber(0));    // Проверяем работу метода checkPositiveOrNegativeNumber

        printStringXTimes("Привет, мир!!!", 5);               // Проверяем работу метода printStringXTimes

        int [] years ={3,4,100,200,400,2000,2001,2002,2003};        // Проверяем работу метода checkLeapYear с помощью массива
        for (int year:years) {
            System.out.println(checkLeapYear(year));
        }
    }


    public static boolean checkSum(int a, int b) {
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPositiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println(a + " - положительное число");
        } else {
            System.out.println(a + " - отрицательное число");
        }
    }

    public static boolean checkPositiveOrNegativeNumber(int a) {
        if (a < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printStringXTimes(String a, int b) {
        for (; b > 0; b--) {
            System.out.println(a);
        }
    }

    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean checkLeapYear(int leap) {
        if ((leap % 4) == 0) {
            if ((leap % 100) == 0){
                if ((leap % 400 == 0)){
                    return true;
                } return false;
            } return true;
        } else {
            return false;
        }
    }
}


