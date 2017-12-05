package iview.wsienski.kotlintrip;

import org.junit.Assert;
import org.junit.Test;

import iview.wsienski.kotlintrip.basic.JavaClass;

/**
 * Created by Witold Sienski on 06.12.2017.
 */

public class JavaClassTest {

    @Test
    public void isEmailCorrect(){
        String email = "test@test.pl";
        JavaClass javaClass = new JavaClass();

        Assert.assertTrue(javaClass.isEmail(email));
    }

    @Test
    public void isEmailNotCorrectForNull(){
        String email = null;
        JavaClass javaClass = new JavaClass();

        Assert.assertFalse(javaClass.isEmail(email));
    }
}
