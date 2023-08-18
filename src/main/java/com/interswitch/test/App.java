package com.interswitch.test;

import com.interswitch.maven.ArithmeticEngine;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

//        com.interswitch.services.salary.model.Salary salary =
//                new com.interswitch.services.salary.model.Salary();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = input.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = input.nextDouble();

        ArithmeticEngine engine = new ArithmeticEngine(firstNumber, secondNumber);

        while (true) {
            System.out.println("Select an operation");
            System.out.println("Select 1 to add");
            System.out.println("Select 2 to subtract");
            System.out.println("Select 3 to multiply");
            System.out.println("Select 4 to divide");
            System.out.println("Select 5 for exponents");
            System.out.println("Select 6 to exit");

            String choice = null;
            try {
                System.out.println("Enter your option below:");
//            Scanner Input = new Scanner(System.in);
                choice = input.next();
                double result;

                switch (choice) {
                    case "1":
                        System.out.println("Addition");
                        System.out.println("Enter first number:");
                        result = engine.addTwoNumbers();
                        System.out.printf("%s + %s =%s; ", firstNumber, secondNumber, result);
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Subtraction");
                        result = engine.subTwoNumbers();
                        System.out.printf("%s - %s =%s", firstNumber, secondNumber, result);
                        System.out.println();
                        break;
                    case "3":
                        System.out.println("Multiplication");
                        result = engine.multiplyTwoNumbers();
                        System.out.printf("%s * %s is = %s", firstNumber, secondNumber, result);
                        System.out.println();
                        break;
                    case "4":
                        System.out.println("Division");
                        result = engine.divideTwoNumbers();
                        System.out.printf("%s / %s is = %s", firstNumber, secondNumber, result);
                        System.out.println();
                        break;
                    case "5":
                        System.out.println("Exponent");
                        result = engine.mutTwoNumber();
                        System.out.printf("%s power %s is = %s", firstNumber, secondNumber, result);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid option!!!!!");
                        System.out.println();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (choice.equals("6")) {
                System.out.println("Exiting the program.");
                break;
            }

        }
    }
}
