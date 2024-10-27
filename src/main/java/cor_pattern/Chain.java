package cor_pattern;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by NghiaPV on 10/4/2018.
 */
public class Chain {

    List<Command> lstCommand;

    public Chain(Command... commands) {
        lstCommand = Arrays.asList(commands);
    }

    public void printExecute(Map<String, Object> context ){
        for (Command command: lstCommand
             ) {
            command.execute(context);
        }
    }
}
