package q2;

public class Compare3 {

    public static Comparable largest(Comparable first, Comparable second, Comparable third){
        Comparable largest = third;
        
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0){
            largest = first;
        }
        else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0){
            largest = second;
        }
        
        
        return largest;
    }
}

