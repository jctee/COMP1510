package p1;

public class Grades
{
    public static void main(String[] args)
    {
        
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        
        student1.inputGrades();
        student2.inputGrades();
        
        
        System.out.println("The average for " + student1.getName() + " is " + student1.getAverage());
        System.out.println("The average for " + student2.getName() + " is " + student2.getAverage());
        
        //input grades for Mary
        //print average for Mary
        System.out.println();
        //input grades for Mike
        //print average for Mike
    }
} 