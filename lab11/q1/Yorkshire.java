package q1;

//*****************************************************************
//Yorkshire.java
//
//A class derived from Dog that holds information about
//a Yorkshire terrier. Overrides Dog speak method.
//
//*****************************************************************
public class Yorkshire extends Dog {
    private static int breedWeight = 50;
    
    public Yorkshire(String name) {
        super(name);
    }

    // -------------------------------------------------------------
    // Small bark -- override.s speak method in Dog
    // -------------------------------------------------------------
    public String speak() {
        return "lol";
    }
    
    public int avgBreedWeight() {
        return breedWeight;
    }
}