import java.util.HashMap;
import java.util.Scanner;

/**
 * Midterm Project Grand Circus
 *
 * Java June 2017
 *
 * (Alphabetical Order)
 * Michael Gleeson
 * Matthew Menna
 * Mark Ritter
 * Vernon Scott
 */

public abstract class Payment {
    Scanner scan= new Scanner(System.in);

    public double subtotal(HashMap<Integer, String> price, HashMap<Integer, String> quantity) {
        double subTotal = 0;

        for (String value : price.values()) {
            subTotal += Double.parseDouble(value);
        }
        return subTotal;
    }


    public double generatePayment (double i){
        return 0;
    }

    public String generatePayment (String creditNum, String cVV, String expDate){
        return null;
    }

    public String generatePayment (String d){

        return null;
    }

}
