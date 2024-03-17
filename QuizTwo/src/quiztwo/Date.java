/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiztwo;

/**
 *
 * @author chery
 */
public class Date {
    //member variable declaration
    private int year;
    private int month;
    private int day;
   //Constructor
    public Date(int year,int month,int day){
      this.year = year;
      this.month = month;
      this.day = day;
        
    }
    //member methods
    public void displayDate(){
        System.out.println(year+"-" +month+"-" +day);
    }
    
}
