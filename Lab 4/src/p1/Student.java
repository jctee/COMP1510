package p1;

import java.util.Scanner;
public class Student
{
    public String name;
    public int test1;
    public int test2;
    
    
    public Student(String studentName)
    {
        name = studentName;
        System.out.println("Your name is: " + studentName);
    }
    //---------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //---------------------------------------------
    public void inputGrades()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter test1 and test2 score for " + name + ", separated by a space: ");
        test1 = scan.nextInt();
        test2 = scan.nextInt();
        
        System.out.println("Name: " + name + " Test1: " + test1 + " Test2: " + test2 );
        
        
    }
    //add body of inputGrades
    
    //---------------------------------------------
    //getAverage: compute and return the student's test average // ---------------------------------------------
    //add header for getAverage
    
    public double getAverage()
    {
        
        return ((test1 + test2) /2.0) ;
    }
    //---------------------------------------------
    //getName: print the student's name
    //---------------------------------------------
    //add header for printName
    public String getName()
    {
    return name;
    }
 }