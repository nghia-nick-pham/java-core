package bridge_pattern;

import java.util.concurrent.TimeUnit;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class AssemblyWorkShop extends WorkShop {

    public AssemblyWorkShop() {
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Assemblying... ");
        long timeToTake = 100 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
