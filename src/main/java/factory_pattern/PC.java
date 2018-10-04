package factory_pattern;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public abstract class PC {
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getVGA();

    @Override
    public String toString() {
        return "CPU : " + getCPU() +
                " RAM : " + getRAM() +
                " VGA : " + getVGA() ;
    }
}
