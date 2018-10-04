package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class PaymentContest {

    List<PaymentStrategy> lstPaymentStrategy;

    public PaymentContest() {
        this.lstPaymentStrategy = new ArrayList<>();
    }

    public  void addPayment(PaymentStrategy payment){
      this.lstPaymentStrategy.add(payment);
    }

    public void consolidate(){
        for (PaymentStrategy payment: lstPaymentStrategy
             ) {
            payment.pay();
        }
    }
}
