package iview.wsienski.kotlintrip;

import org.junit.Assert;
import org.junit.Test;

import iview.wsienski.kotlintrip.basic.NullCheckJava;

/**
 * Created by Witold Sienski on 06.12.2017.
 */

public class NullCheckJavaTest {

    @Test
    public void isEmailCorrect(){
        String email = "test@test.pl";
        NullCheckJava nullCheckJava = new NullCheckJava();

        Assert.assertTrue(nullCheckJava.isEmail(email));
    }

    @Test
    public void isEmailNotCorrectForNull(){
        String email = null;
        NullCheckJava nullCheckJava = new NullCheckJava();

        Assert.assertFalse(nullCheckJava.isEmail(email));
    }
}
