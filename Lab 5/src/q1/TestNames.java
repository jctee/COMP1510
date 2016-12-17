package q1;
import java.util.Scanner;

/**
 * <p>Prompts user for 2 names and provides
 * different orders of the name. Also gives
 * the initials and length of the name. </p>
 * @author JC
 * @version 1.0
 */
public class TestNames {

    /**
     * <p>This is the main method.</p>
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome Student 1");
        System.out.print("Please enter your first name: ");
        String firstName1 = scan.nextLine();
        System.out.print("Please enter your middle name: ");
        String middleName1 = scan.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName1 = scan.nextLine();
        
        System.out.println("Welcome Student 2");
        System.out.print("Please enter your first name: ");
        String firstName2 = scan.nextLine();
        System.out.print("Please enter your middle name: ");
        String middleName2 = scan.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName2 = scan.nextLine();
        
        Name student1 =  new Name(firstName1, middleName1, lastName1); 
        Name student2 = new Name (firstName2, middleName2, lastName2);
        
        System.out.println(student1.firstMiddleLast());
        System.out.println(student1.lastFirstMiddle());
        System.out.println(student1.initials());
        System.out.println(student1.length());
        System.out.println(student1.equals(student2));
        
        System.out.println(student2.firstMiddleLast());
        System.out.println(student2.lastFirstMiddle());
        System.out.println(student2.initials());
        System.out.println(student2.length());
        System.out.println(student2.equals(student1));
    }

}
