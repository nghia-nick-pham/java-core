package factory_pattern;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class Client extends PC {

    String cpu;
    String ram;
    String vga;

    public Client(String cpu, String ram, String vga) {
        this.cpu = cpu;
        this.ram = ram;
        this.vga = vga;
    }

    @Override
    public String getCPU() {
        return this.cpu + " of client ";
    }

    @Override
    public String getRAM() {
        return this.vga;
    }

    @Override
    public String getVGA() {
        return this.vga;
    }
}
