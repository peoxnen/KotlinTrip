package iview.wsienski.kotlintrip.basic

/**
 * Created by Witold Sienski on 06.12.2017.
 */
fun String.isEmail(): Boolean{
    return this.contains("@")
}