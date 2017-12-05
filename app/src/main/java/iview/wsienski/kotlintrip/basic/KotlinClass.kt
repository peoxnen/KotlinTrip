package iview.wsienski.kotlintrip.basic

/**
 * Created by Witold Sienski on 05.12.2017.
 */
class KotlinClass {

    fun nullSafety() {
        var name: String? = null

        //nullsafety check
        name?.length

        // Smart cast
        if (name != null)
            name.length

        try {
            name!!.length
        } catch (e: NullPointerException) {
            // Will throw an exception
        }
    }
}