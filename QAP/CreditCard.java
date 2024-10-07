
//Creates the CreditCard class and the three private instance variables:
public class CreditCard {

    Money balance;
    Money creditLimit;
    Person owner;

     /*
     Creates a constructor which takes a Person object as a parameter, and a Money
     object
     as another parameter. It sets the creditLimit and owner of the Account object
     to the values of the objects passed in as parameters. It also sets
     the balance as a new Money object, and passes in the amount 0:
     */
    public CreditCard(Person newCardHolder, Money limit) {
        balance = new Money(0);
        creditLimit = limit;
        owner = newCardHolder;
    }

     /*Creates a get method, which creates a new Money object with the value of the
     balance of the Credit Card
     used to invoke the method set as the amount. It returns
     the new Money object: */
    public Money getBalance() {
        return new Money(balance);
    }

     /*Creates a get method, which creates a new Money object with the value of the
     creditLimit of the Credit Card
     used to invoke the method set as the amount. It returns
     the new Money object: */
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

     /*Creates a get method, which uses the toString method() of the person class on
     the owner value, and returns the String. */
    public String getPersonals() {
        return owner.toString();
    }

     /*
      Creates a method charge() which takes in a Money object called amount as a
     parameter. The method invokes the add()
     method in the Money class to add the amount to the balance of the CreditCard
     used to invoke the charge() method. It
     then calls the compareTo() method in the Money class, and passes in the
     creditLimit as a parameter. The compareTo method returns a value, and if the
     value is more than or equal to 0, a String is printed out. Otherwise, the new
     balance is set as the balance.
      */
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) >= 0) {
            System.out.println("Exceeds Credit Limit.");
        } else {
            System.out.println("Charge: " + amount);
            balance = balance.add(amount);
        }
    }

     /*
     Creates a new method payment() which takes in a Money object called amount as
     a parameter. The method invokes the subtract()
     method in the Money class to subtract the amount from the balance of the
     CreditCard used to invoke the payment() method.
      */
    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);
    }

}
