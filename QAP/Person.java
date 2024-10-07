
//Creates the Person class and the three private instance variables: 
public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    /* Creates a constructor with three string parameters, last, first, and home. It
     sets the last, first, and home of the Account object to the
     values of the parameters passed in:*/
    public Person(String last, String first, Address home) {
        this.lastName = last;
        this.firstName = first;
        this.home = home;
    }

    // Creates a method called toString(), which returns the string below:
    public String toString() {
        return (this.firstName + " " + this.lastName + ", " + this.home);
    }

}
