package cor_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by NghiaPV on 10/4/2018.
 */
public class MainTest {

    public static void main(String[] args) {

        Chain chain = new Chain(new FirstCommand(), new SencondCommand());
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        chain.printExecute(map);


    }



}
