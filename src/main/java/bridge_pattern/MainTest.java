package bridge_pattern;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class MainTest {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new AssemblyWorkShop());
        bike.manufacture();

        Vehicle car = new Car();
        car.joinWorkshop(new AssemblyWorkShop());
        car.joinWorkshop(new ExtremeWorkShop());
        car.manufacture();
    }
}
