/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiztwo;

/**
 *
 * @author chery
 */
public class Patient {
    
   //member variable declaration
    private final String name;
    private final int age;
    private final String disease;
    private final Date dateOfAdmission;
    private final Date dateOfDischarge;
   //Constructor
    public Patient(String name,int age,String disease,Date dateOfAdmission,Date dateOfDischarge){
     
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
    
    };
    //member methods
    public void displayInformation(){
    
        System.out.println("Name of patient:"+name);
        System.out.println("Age of patient:"+age);
        System.out.println("Disease of patient:"+disease);
        System.out.println("Date of Admission:");
        dateOfAdmission.displayDate();
        System.out.println("Date Of Discharge:");
        dateOfDischarge.displayDate();   
    }
            
}
