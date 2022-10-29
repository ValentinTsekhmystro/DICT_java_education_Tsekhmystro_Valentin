package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Bob.");
        System.out.println("I was created in 2022.");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String userName = myObj.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
        Scanner remainder = new Scanner(System.in);
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = remainder.nextInt();
        int remainder5 = remainder.nextInt();
        int remainder7 = remainder.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is "+ age +"; that's a good time to start programming!");
        Scanner number = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int a = number.nextInt();
        for(int i = 0; i <= a; i++){
            System.out.println(i + "!");
        }
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
        "2. To decompose a program into several small subroutines.\n" +
        "3. To determine the execution time of a program.\n" +
        "4. To interrupt the execution of a program.");
        while (true) {
            Scanner reply = new Scanner(System.in);
            int k = reply.nextInt();
            if (k == 2) {
                System.out.println("Completed, have a nice day!\n" +
                        "Congratulations, have a nice day!");
                break;
            }
            else {
                System.out.println("Please, try again.");
            }
        }
    }
}
