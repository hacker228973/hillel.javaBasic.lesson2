package lesson5;

import java.util.Scanner;

public class HwTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xSize= scanner.nextInt();
        int ySize= scanner.nextInt();
        int zSize= scanner.nextInt();
        int dimensions=xSize*ySize*zSize;
        switch (dimensions) {
            case 44000 -> System.out.println("yea, everythin is ok");
            case 46640 -> System.out.println("yea, everythin is ok)");
            default -> System.out.println("ou, u have some problems, cause ur luggage size is not correct");
        }
    }
}
