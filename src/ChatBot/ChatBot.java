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


    }
}
