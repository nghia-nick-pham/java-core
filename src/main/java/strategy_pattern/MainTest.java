package strategy_pattern;

import java.util.Date;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class MainTest {

    public static void main(String[] args) {

        PaymentContest payments = new PaymentContest();
        payments.addPayment(new CreditPayment(1000, new Date()));
        payments.addPayment(new CreditPayment(2000, new Date()));
        payments.addPayment(new PaypalPayment(3000, new Date(), "Vietcombank", "VN"));
        payments.consolidate();

    }
}
