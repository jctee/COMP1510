package q3;

/**
 * This is the driver for Coin.java
 * @author JC
 *
 */
public class Runs
    {
    
    /**
     * this is the main method
     * @param args
     */
    public static void main (String[] args)
        {
        final int FLIPS = 100; // number of coin flips
        int currentRun =0; // length of the current run of HEADS
        int maxRun =0;     // length of the maximum run so far

        // Create a coin object
        Coin coins = new Coin();
        
        // Update the run information
    
        

        // Flip the coin FLIPS times
    
        for (int i = 0; i < FLIPS; i++)
        {
                
        // Flip the coin & print the result
            coins.flip();
            System.out.println(coins.toString());
            
            if (coins.isHeads() == true) {
                currentRun++;
                if (currentRun > maxRun){
                    maxRun = currentRun;
                }
            }
            else {
                currentRun = 0;
            }
                
        }

        // Print the results
        System.out.println(maxRun);
        }
    }