package q1;

/**
 * Calculates the average for arguments passed by the command line
 * @author JC
 * @version 1.0
 */
public class Average {

    /**
     * this is the main method
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        avg = sum/args.length;
        System.out.println("The average of the arguments passed is " + avg);
    }
}