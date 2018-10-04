package bridge_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public abstract class Vehicle {

    // assempbly line for the workshops
    protected List<WorkShop> workshops = new ArrayList<WorkShop>();
    public Vehicle() {
        super();
    }
    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }
    public abstract void manufacture();
    public abstract int minWorkTime();
}
