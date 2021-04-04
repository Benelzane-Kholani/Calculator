/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;
import java.util.Scanner;
/**
 *
 * @author zaihd
 */
public class Subraction 
{
    int choice, num1, num2, answer;

        System.out.println("\tCalculator");
        System.out.println("1: Minus");
        System.out.println("2: Exit");

        System.out.println("Enter first number");
        num1 = scn.nextInt();
        System.out.println("Enter second number");
        num2 = scn.nextInt();
        System.out.println("Enter your choice");

        choice = scn.nextInt();

        switch (choice) {
            case 1:
                answer = num1 - num2;
                System.out.println("Subtraction: " + answer);
                break;
            case 5:
                System.out.println("Thank you.");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice");
        }
        System.out.println("Switch done.");
       

    
}
