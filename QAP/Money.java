

/*Creates the Money class and the two private instance variables:
 */
public class Money {
    private long dollars;
    private long cents;

    /* Creates a constructor which takes a double called amount as a parameter. If
     the amount passed in is less than 0, an Illegal Argument Exception is thrown
     and a string is printed. Otherwise, the double is converted to cents, which
     is set to a long called convertCents.
     Then dollars is set to convertCents divided by 100, and cents is set to the
     remainder. */
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Has to be above 0.");
        } else {
            long convertCents = Math.round(amount * 100);
            dollars = convertCents / 100;
            cents = convertCents % 100;
        }
    }
    /* 
     Creates a constructor which is passed a Money object called otherObject as a
     parameter. Dollars is set to the dollars value of otherObject, and cents is
     set to the cents value of otherObject
     */
    public Money(Money otherObject) {
        dollars = otherObject.dollars;
        cents = otherObject.cents;
    }
    /*
     Creates a method add(), which is passed a Money object called otherAmount as
     a parameter. A new money object called newAmount is created, and given the
     amount 0. newAmount's dollars value is set to the sum of the dollars value of
     the CreditCard used to invoke the method and the dollars value of
     otherAmount. newAmount's cents value is set to the sum of the cents value of
     the CreditCard used to invoke the method and the cents value of otherAmount.
     If the cents of the CreditCard used to invoke the method is more than 99, a
     new long called totalDollars is created to roll over the amount. cents is
     divide by 100, and totalDollars multiplied by 100 is subtracted from it. Then
     totalDollars is added to dollars. newAmount is returned.*/
    public Money add(Money otherAmount) {
        Money newAmount = new Money(0);
        newAmount.dollars = this.dollars + otherAmount.dollars;
        newAmount.cents = this.cents + otherAmount.cents;
        if (this.cents > 99) {
            long totalDollars = this.cents / 100;
            this.cents -= totalDollars * 100;
            this.dollars += totalDollars;
        }

        return newAmount;
    }
    /*
     Creates a new method subtract() which is passed a Money object called
     otherAmount as a parameter. A new money object called newAmount is created,
     and given the amount 0. If the cents value of the CreditCard used to invoke
     the method is less than 0, 100 is added to the cents value and the dollar
     amount is decreased by 1. Then the dollars value of otherAmount is subtracted
     from the dollars value of the CreditCard used to invoke the method, and set
     to newAmount's dollars value, and the cents value of otherAmount is
     subtracted from the cents value of the CreditCard used to
     invoke the method, and set to newAmount's cents value. It returns newAmount.*/
    public Money subtract(Money otherAmount) {
        Money newAmount = new Money(0);
        if (this.cents < 0) {
            this.cents += 100;
            this.dollars--;
        }
        newAmount.dollars = this.dollars - otherAmount.dollars;
        newAmount.cents = this.cents - otherAmount.cents;
        return newAmount;

    }

    /*
     Creates a method compareTo(), which takes a Money object called amount as a
     parameter. If the dollars value of the CreditCard used to invoke the method
     is less than the dollars value of amount, a value of -1 is returned. If the
     dollars value of the CreditCard used to invoke the method is more than the
     dollars value of amount, a value of 1 is returned. The same is then applied
     to cents values. Otherwise, a zero is returned.
     */
    public int compareTo(Money amount) {

        if (this.dollars < amount.dollars) {
            return -1;
        } else if (this.dollars > amount.dollars) {
            return 1;
        } else if (this.cents < amount.cents) {
            return -1;
        } else if (this.cents > amount.cents) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
     Creates a method equals(), which takes a Money object called otherObject as a
     parameter. It returns a boolean, true if the object used to invoke the method
     is equal to otherObject, false if it is not.
     */
    public boolean equals(Money otherObject) {
        return (this == otherObject);
    }

    /* Creates a method called toString(), which returns the formatted string below:*/
    public String toString() {
        return String.format("$%02d.%02d", dollars, cents);

    }

}
