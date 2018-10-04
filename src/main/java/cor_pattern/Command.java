package cor_pattern;

/**
 * Created by NghiaPV on 10/4/2018.
 */
public interface Command<T> {

    public void execute(T context);

}
