package bar;

import org.joda.time.DateTime;

public class FromJava {

    public static int getTime() {
        DateTime time = new DateTime(2012, 2, 6, 14, 34, 23);
        System.out.println("Year:" + time.getYear());
        return time.getYear();
    }
}
