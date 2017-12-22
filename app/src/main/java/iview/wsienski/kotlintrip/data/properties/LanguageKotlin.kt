package iview.wsienski.kotlintrip.data.properties

/**
 * Created by WSienski on 22/12/2017.
 */
class LanguageKotlin {

    var name: String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "Language is $value"
        }
}