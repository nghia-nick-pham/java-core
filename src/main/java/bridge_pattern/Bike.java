package bridge_pattern;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class Bike extends Vehicle {

    @Override
    public void manufacture() {
        System.out.println("Manufactoring Bike");
        workshops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 20;
    }
}
