package factory_pattern;

/**
 * Created by NghiaPV on 9/30/2018.
 */
public class Factory {

    public static String getInfo(String type, String CPU, String RAM, String VGA){

        if("Client".equalsIgnoreCase(type)) {
            return new Client(CPU, RAM, VGA).toString() ;}
        else if("Server".equalsIgnoreCase(type)){
            return new Server(CPU, RAM, VGA).toString() ;
        }else{
            return null;
        }

    }

}
