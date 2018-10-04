package strategy_pattern;

import java.util.Date;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class CreditPayment implements  PaymentStrategy{

    int amount;
    Date date;

    public CreditPayment(int amount, Date date) {
        this.amount = amount;
        this.date = date!=null? (Date)date.clone() : null;
    }


    @Override
    public void pay() {
        System.out.println( "amount : " + this.amount + " date : " + this.date );
    }


}
