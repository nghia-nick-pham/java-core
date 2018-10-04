package factory_pattern;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class Server extends  PC{
    String cpu;
    String ram;
    String vga;

    public Server(String cpu, String ram, String vga) {
        this.cpu = cpu;
        this.ram = ram;
        this.vga = vga;
    }

    @Override
    public String getCPU() {
        return this.cpu + " of server ";
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
