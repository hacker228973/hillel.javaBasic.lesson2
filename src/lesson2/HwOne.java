package lesson2;

import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("pleas enter a variable a");
        int a = scanner.nextInt();
        System.out.println("pleas enter a variable b");
        int b = scanner.nextInt();
        System.out.println("a = "+a+"\n"+"b = "+b+"\n");

        System.out.println("swap places...");
        int c = b;
        b = a;
        a = c;
        System.out.println("a = "+a+"\n"+"b = "+b);
    }
}
