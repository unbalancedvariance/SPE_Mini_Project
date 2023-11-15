package org.example;
// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class Main {
    // private static final Logger logger = LogManager.getLogger(Main.class);
    public static int add(int a, int b){
        return a + b;
    } 

    public static int subtract(int a, int b){
        return a - b;
    } 

    public static int multiply(int a, int b){
        return a * b;
    } 

    public static int divide(int a, int b){
        return a / b;
    } 


    public static void main(String[] args) {

        while (true){ 
            System.out.println("\n-------Welcome to Calculator------\n");
            System.out.println("Choose Your Operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            // take input
            if (choice == 1){
                System.out.println("Enter First Number: ");
                int a = sc.nextInt();
    
                System.out.println("Enter Second Number: ");
                int b = sc.nextInt();

                System.out.println("Result: " + a + "+" + b + " = " + add(a, b));
            }
            else if (choice == 2){
                System.out.println("Enter First Number: ");
                int a = sc.nextInt();
    
                System.out.println("Enter Second Number: ");
                int b = sc.nextInt();

                System.out.println("Result: " + a + "-" + b + " = " +  subtract(a, b));
            }
            else if (choice == 3){
                System.out.println("Enter First Number: ");
                int a = sc.nextInt();
    
                System.out.println("Enter Second Number: ");
                int b = sc.nextInt();

                System.out.println("Result: " + a + "*" + b + " = " + multiply(a, b));
            }  
            else if (choice == 4){
                System.out.println("Enter First Number: ");
                int a = sc.nextInt();
    
                System.out.println("Enter Second Number: ");
                int b = sc.nextInt();

                System.out.println("Result: " + a + "/" + b + " = " + divide(a, b));
            }
            else if (choice == 5){
                System.out.println("Thanks for using this calculator!");
                break;
            }
            else{
                System.out.println("Invalid Input! Please try again.");
            }
        }
    }
}