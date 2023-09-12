package PACKAGE_NAME;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int resultOne = add(2,3);
        System.out.println(resultOne);
        String resultTwo = greeting(name);
        System.out.println(resultTwo);
        int resultThree = add(3,4,5,6);
        System.out.println(resultThree);
        String toBePrinted = toBePrinted(name);
        System.out.println(toBePrinted);

    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static String greeting(String name){
        return "Bonjour," + name + "!";
    }
    public static int add(int num1, int num2, int num3, int num4){
        int resultOne = add(num1, num2);
        int resultTwo = add(resultOne, num3);
        int resultThree = add(resultTwo, num4);
        return resultThree;
    }
    public static String toBePrinted(String name) {
        String message = "Hello";
        toBePrinted(message);
    }

    }

