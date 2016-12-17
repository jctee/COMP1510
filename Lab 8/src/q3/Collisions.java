package q3;

/**
 * This is the driver class for RandomWalk.java
 * @author JC
 * @version 1.0
 */
public class Collisions {
    
    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args){
        int collisions = 0;
        
        RandomWalk particle1 = new RandomWalk (100000, 2000000, -3, 0);
        RandomWalk particle2 = new RandomWalk (100000, 2000000, 3, 0);
        
        for (int i=0 ; i< 100000; i++){
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2))
                collisions++;
                    
        }
        
        System.out.println("The number of collisions is: " + collisions);
            
        
    }
    
    /**
     * Returns true if the 2 particles are occupying the same position at a given time
     * @param p1 
     * @param p2
     * @return true if 2 particles are occupying the same position
     */
    public static boolean samePosition(RandomWalk p1, RandomWalk p2){
        return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
    }

}
