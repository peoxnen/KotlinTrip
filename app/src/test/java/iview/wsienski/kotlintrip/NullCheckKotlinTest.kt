package iview.wsienski.kotlintrip

import iview.wsienski.kotlintrip.basic.isEmail
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by Witold Sienski on 06.12.2017.
 */
class NullCheckKotlinTest {

    @Test
    fun isEmailCorrect() {
        val email = "test@test.pl"

        assertTrue(email.isEmail())
    }

    @Test
    fun isEmailNotCorrectForNull() {
        val email: String? = null

        assertFalse(email?.isEmail() ?: false)
    }

}