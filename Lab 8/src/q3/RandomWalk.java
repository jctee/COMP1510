package q3;

import java.util.Random;

/**
 * Randomly moves particles step by step,
 * continues as long as they haven't reached the
 * max steps or go out of bounds
 * @author JC
 * @version 1.0
 */
public class RandomWalk {
    
    int maxSteps;
    int boundary;
    int x;
    int y;
    int numSteps;
    int maxDistance;
    
    /**
     * Constructs RandomWalk with only boundaries and steps
     * @param max of type int
     * @param edge of type int
     */
    public RandomWalk (int max, int edge){
        maxSteps = max;
        boundary = edge;
        x = 0;
        y = 0;
        numSteps = 0;
        maxDistance = 0;
    }
    
    /**
     * Constructs RandomWalk with boundaries,steps, and starting coords
     * @param max of type int
     * @param edge of type int
     * @param startX of type int
     * @param startY of type int
     */
    public RandomWalk (int max, int edge, int startX, int startY){
        maxSteps = max;
        boundary = edge;
        x = startX;
        y = startY;
        numSteps = 0;
        maxDistance = 0;
    }
    
    /**
     * Returns a description of the particle of type String
     */
    public String toString(){
        return ("Steps: " + numSteps + "; Position: (" + x + "," + y +")");
        
    }
    
    private int max(int num1, int num2){
        return Math.abs((Math.abs(num1) >= Math.abs(num2) ? num1 : num2));
    }
    
    /**
     * Takes 1 randomly generated step
     */
    public void takeStep(){
        int step;
        Random walk = new Random();
        step = walk.nextInt(4);
        switch (step){
        case 0:
            x++;
            maxDistance = max(maxDistance,x);
            numSteps++;
            break;
        case 1:
            y++;
            maxDistance = max(maxDistance,y);
            numSteps++;
            break;
        case 2:
            x--;
            maxDistance = max(maxDistance,x);
            numSteps++;
            break;
        case 3:
            y--;
            maxDistance = max(maxDistance,y);
            numSteps++;
            break;
        }
    }
        
        /**
         * Checks to see if particle hasnt reached max steps yet
         * @return true if particle hasnt reached max steps yet
         */
        public boolean moreSteps() {
            if (numSteps < maxSteps)
                return true;
            else
                return false;
        }

        /**
         * Checks to see if particle is still in bounds
         * @return true if particle is still in bounds
         */
        public boolean inBounds() {
            return (x <= boundary && x >= boundary * (-1) && y <= boundary && y >= boundary
                    * (-1)) ? true : false;
        }
        
        /**
         * randomly walks particle as long as it hasnt reached max steps or went out of bounds
         */
        public void walk(){
            while (this.moreSteps() && this.inBounds())
            {
                this.takeStep();
                System.out.println(toString());
            }
        }

        /**
         * returns x coordinate
         * @return x coordinate of type int
         */
        public int getX() {
            return x;
        }

        /**
         * returns y coordinate
         * @return y coordinate of type int
         */
        public int getY() {
            return y;
        }
        
        /**
         * returns the furthest position the particle has reached
         * @return maximum distance of type int
         */
        public int getMaxDistance(){
            return maxDistance;
        }
        
        
    

}
