package q1;

/**
 * <p>Creates a string with 3 parts to it.
 * The first name, middle name, and the last name. </p>
 * 
 * @author JC
 * @version 1.0
 */
public class Name {
    
    private String firstName, middleName, lastName;
    
    /**
     * <p> Constructs object of type Name </p>
     * 
     * @param first
     * @param middle
     * @param last
     */
    public Name (String first, String middle, String last) {
     
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    /**
     * <p>returns the first name.<p>
     * @return firstName as a string
     */
    public String getFirst(){
        return (firstName);
    }
    
    /**
     * <p>returns the middle name.<p>
     * @return middleName as a string
     */
    public String getMiddle(){
        return (middleName);
    }
    
    /**
     * <p>returns the last name.<p>
     * @return lastName as a string
     */
    public String getLast(){
        return (lastName);
    }
    
    /**
     * <p>returns the name as first middle last.<p>
     * @return the whole name as a string
     */
    public String firstMiddleLast(){
        return (firstName + " " + middleName + " " + lastName);
    }
    
    /**
     * <p>return the name as last, first middle.<p>
     * @return the whole name as a string
     */
    public String lastFirstMiddle(){
        return (lastName + ", " + firstName + " " + middleName);
    }
    
    /**
     * <p>checks if 2 names are the same.<p>
     * @param otherName
     * @return true if the 2 names are the same
     */
    public boolean equals (Name otherName){
        return otherName.firstName.equalsIgnoreCase(firstName) &&
                otherName.middleName.equalsIgnoreCase(middleName) &&
                otherName.lastName.equalsIgnoreCase(lastName);
    }
    
    /**
     * <p>gives the intials of the person<p>
     * @return initials as a string
     */
    public String initials(){
        String initials = firstName.substring(0,1) + middleName.substring(0,1)
        + lastName.substring(0,1);
        return initials.toUpperCase();
    }
    
    /**
     * <p>gives the length of the full name.<p>
     * @return length as an integer.
     */
    public int length(){
        int length = firstName.length() + middleName.length() + lastName.length();
        return length;
    }
}

