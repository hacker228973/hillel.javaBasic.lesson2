package lesson3;

import java.util.Scanner;
import static java.lang.Math.pow;
public class HwTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas enter meaning a ");
        int a = scanner.nextInt();
        System.out.println("pleas enter meaning b ");
        int b = scanner.nextInt();
        System.out.println("pleas enter meaning c ");
        int c = scanner.nextInt();
        System.out.println(Math.abs(a-b) / pow(a+b,3) - pow(c,0.5));
    }
}
