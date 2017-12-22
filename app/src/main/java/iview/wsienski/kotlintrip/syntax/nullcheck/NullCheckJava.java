package iview.wsienski.kotlintrip.syntax.nullcheck;

/**
 * Created by Witold Sienski on 05.12.2017.
 */

public class NullCheckJava {

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

    public boolean isEmail(String email) {
        if (email == null || email.length() <= 0)
            return false;
        return email.contains("@");
    }
}
