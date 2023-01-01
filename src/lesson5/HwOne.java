package lesson5;

import java.util.Scanner;

public class HwOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fullMark=0;
        for(int i = 0;i<5;i++){
            int mark= scanner.nextInt();
            fullMark=fullMark+mark;
        }
        int averageMark=fullMark/5;
        if(averageMark>=10){
            System.out.println("Congradulations, u got a higher scholarship");
        }else{
            if(averageMark>=8){
                System.out.println("Congradulations, u got a scholarship");
            }else{
                System.out.println("unfortunatly u didnt get a scholarship ");
            }
        }
    }

}
