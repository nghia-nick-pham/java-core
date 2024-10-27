package cor_pattern;

import java.util.Map;

/**
 * Created by NghiaPV on 10/4/2018.
 */
public class SencondCommand implements  Command<Map<String, Object>> {


    @Override
    public void execute(Map<String, Object> context) {
        System.out.println("this is second command");
        for (Map.Entry<String, Object> map: context.entrySet()
                ) {
            System.out.println("key : " + map.getKey() + "; value : " + map.getValue().toString());
        }
        System.out.println("--------------------------");
    }

}
