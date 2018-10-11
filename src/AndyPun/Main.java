package AndyPun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name ?");
        String name = input.nextLine();
        System.out.println("Hello "+name+" nice to meet you.");
        Scanner input2 = new Scanner(System.in);
        System.out.print("What is your age ?");
        int age = input2.nextInt();
        System.out.println("That's great!, nice to meet you " + age + " year old ");
    }
}