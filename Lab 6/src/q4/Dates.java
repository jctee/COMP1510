package q4;

import java.util.Scanner; 

/**
 * Asks user to input a date with restrictions and displays
 * whether or not the date is valid.
 * 
 * @author JC
 * @version 1.0
 */
public class Dates { 
    
    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) { 
        int month, day, year;   //date read in from user 
        int daysInMonth;        //number of days in month read in 
        boolean monthValid, yearValid, dayValid;  //true if input from user is valid 
        boolean leapYear;      //true if user's year is a leap year 
 
        monthValid = false;
        yearValid = false;
        dayValid = false;

        Scanner scan = new Scanner(System.in); 
        

        //Get integer month, day, and year from user 
        System.out.print("Enter a month as an integer from 1-12: ");
        month = scan.nextInt();
        System.out.print("Enter a year from 1000-1999: ");
        year = scan.nextInt();
        System.out.print("Enter a valid day: ");
        day = scan.nextInt();
        
        //Check to see if month is valid
        if (month >= 1 && month <= 12) {
            monthValid = true;
        }
        else {
            monthValid = false;
        }
        
        
        if (year >= 1000 && year <= 1999){
            yearValid = true;
        }
        else {
            yearValid = false;
        }
        
        if ((year % 4 == 0) && year % 100 != 0)
        {
            System.out.println(year + " is a leap year.");
            leapYear = true;
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println(year + " is a leap year.");
            leapYear = true;
        }
        else
        {
            System.out.println(year + " is not a leap year.");
            leapYear = false;
        }
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 
                || month == 10 || month == 12) {
            daysInMonth = 31;
            if (day <= daysInMonth){
                dayValid = true;
            }} else if (month == 4 || month == 6 || month == 9 || month == 11){
            daysInMonth = 30;
            if (day <= daysInMonth){
                dayValid = true;
            }} else if (month == 2) {
            if (leapYear == true) {
                daysInMonth = 29;
                if (day <= daysInMonth){
                    dayValid = true;
                }
            }
            else {
                daysInMonth = 28;
                if (day <= daysInMonth){
                    dayValid = true;
                }
            }
        } else {
            daysInMonth = 0;
        }
        
        if ((dayValid == true) && (yearValid == true) && (monthValid == true))
        {
            System.out.println("Date is valid.");
        } else {
            System.out.println("Date is not valid.");
        }
        
        
            
            
        //Check to see if year is valid 
        //Determine whether it's a leap year 
        //Determine number of days in month 
        //User number of days in month to check to see if day is valid 
        //Determine whether date is valid and print appropriate message 

    } 
} 
