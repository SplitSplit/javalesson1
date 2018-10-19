package ru.ponomaryov.se;

public class MainClass {

    public static void main(String[] args) {
        int a = 2;
        double b = 6.5D;
        float c = 3.3F;
        long d = 100500L;
        byte e = 65;
        char f = 'd';
        boolean g = false;

        System.out.println(Example3(3.0F,20.0F,4.2F,1.1F));
        System.out.println(Example4(5, 12));
        Example5(10);
        System.out.println(Example6(-4));
        Example7("Вася");
        Example8(2000);
    }
    private static float Example3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean Example4(int a, int b){
        int result = a + b;
        return result >= 10 && result <=20;
    }

    private static void Example5(int number){
        if(number < 0){
            System.out.println("Переданное число отрицательное.");
        } else {
            System.out.println("Переданное число положительное.");
        }
    }

    private static boolean Example6(int number){
        return number < 0;
    }

    private static void Example7(String str){
        System.out.println( "Привет, " + str + "!");
    }

    private static void Example8(int year){
        if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
