/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiztwo;

import java.util.Scanner;

/**
 *
 * @author chery
 */
public class QuizTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Enter patient information
        Patient patient1 = enterPatientInformation(scanner);
        
        // Display patient information
        displayPatientInformation(patient1);
        
        // Close the scanner
        scanner.close();
    }
    
    
    // Method to enter patient information
    public static Patient enterPatientInformation(Scanner scanner) {
        System.out.println("Enter patient information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Disease: ");
        String disease = scanner.nextLine();
        System.out.println("Enter Admission Date:");
        Date dateOfAdmission = enterDate(scanner);
        System.out.println("Enter Discharge Date:");
        Date dateOfDischarge = enterDate(scanner);
        
        return new Patient(name, age, disease, dateOfAdmission, dateOfDischarge);
    }
    
    // Method to enter date information
    public static Date enterDate(Scanner scanner) {
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Day: ");
        int day = scanner.nextInt();
        
        return new Date(year, month, day);
    }
    
    // Method to display patient information
    public static void displayPatientInformation(Patient patient) {
        System.out.println("\nPatient Information:");
        patient.displayInformation();   
    }
    
}
