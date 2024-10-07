

//Creates the Address class and the four private instance variables: 
public class Address 
    {
        private String street;
        private String city;
        private String state;
        private String zip;

        /*
        Creates a constructor with four string parameters, street, city, state, and
        zip. 
        It sets the street, city, state and zip of the Account object to the
        values of the parameters passed in:
        */
        public Address(String street, String city, String state, String zip)
        {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }

        

        // Creates a method called toString(), which returns the string below:
        public String toString()
        {
            return (this.street + ", " + this.city + ", " + this.state + "\n" + this.zip);

        }
}
