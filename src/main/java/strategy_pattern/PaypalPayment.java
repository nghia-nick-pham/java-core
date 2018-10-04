package strategy_pattern;

import java.util.Date;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class PaypalPayment implements PaymentStrategy {

    int amount;
    Date date;
    String bankName;
    String country;

    public PaypalPayment(int amount, Date date, String bankName, String country) {
        this.amount = amount;
        this.date = date!=null?(Date) date.clone():null;
        this.bankName = bankName;
        this.country = country;
    }

    @Override
    public void pay() {
        System.out.println( "amount : " + this.amount +
                "; date : " + this.date +
                "; bankName : " + this.bankName +
                "; country : " + this.country);
    }


}
