package q1;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest {
    public static void main(String[] args) {
        
        Dog dog1 = new Labrador("Nelson","Yellow");
        
        
        System.out.println(dog1.getName() + " says " + dog1.speak());
        System.out.println(dog1.avgBreedWeight());
        
        
        dog1.sleep();
        
        
        Yorkshire dog2 = new Yorkshire("Victor");
        System.out.println(dog2.getName() + " says " + dog2.speak());
        System.out.println(dog2.avgBreedWeight());
    }
}