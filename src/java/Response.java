package src.java;
import java.util.*;
import net.sf.flora2.API.*;
import net.sf.flora2.API.util.*;

/**
 * This class is used to deal with the query responses from the session.
 * It is essentially an `ArrayList<String>', but it can be constructed from
 * a `Iterator<FloraObject>' object which is the type returned by queries.
 */
public class Response extends ArrayList<String> {

    public Response() {
        super();
    }

    public Response(ArrayList<String> sList) {
        super(sList);
    }

    public Response(Iterator<FloraObject> source) {
        while(source.hasNext()) {
            this.add(source.next().toString());
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (String obj : this) {
            str += "\n" + obj;
        }
        return str;
    }
}