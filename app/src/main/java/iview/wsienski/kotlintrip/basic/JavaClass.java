package iview.wsienski.kotlintrip.basic;

/**
 * Created by Witold Sienski on 05.12.2017.
 */

public class JavaClass {

    void nullSafety() {
        String name = null;

        //you have to check that variable is not null
        if (name != null)
            name.length();

        try {
            name.length();
        } catch (NullPointerException e) {
            //this throws NullPointerException
        }
    }
}
