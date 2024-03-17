/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiztwoloop;

/**
 *
 * @author chery
 */
public class QuizTwoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Output number using for loop
        for (int i = 12; i <= 28; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println();
        
        // Output number using do...while loop
        int num = 12;
        do {
            System.out.print(num + " ");
            num += 2;
        } while (num <= 50);
        System.out.println();
        
        // Output number using while loop
        int sum = 0;
        int oddNum = 1;
        while (oddNum <= 50) {
            sum += oddNum;
            oddNum += 2;
        }
        System.out.println("Sum of odd numbers from 1 to 50: " + sum);
    }
    
}
