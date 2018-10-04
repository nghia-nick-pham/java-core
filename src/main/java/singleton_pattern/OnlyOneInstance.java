package singleton_pattern;

/**
 * Created by NghiaPV on 10/3/2018.
 */
public class OnlyOneInstance {

    private static OnlyOneInstance instance;
    private String prop;


    private OnlyOneInstance( ) {
    }


    public static OnlyOneInstance getInstance(){
        if(instance == null){
            instance = new OnlyOneInstance();

        }
        return  instance;
    }

    /**
     * Gets prop
     *
     * @return String
     * @author NghiaPV
     */
    public String getProp() {
        return prop;
    }

    /**
     * Sets prop
     *
     * @return String
     * @author NghiaPV
     */
    public void setProp(String prop) {
        this.prop = prop;
    }
}
