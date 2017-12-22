package iview.wsienski.kotlintrip.data.inheritance

import timber.log.Timber

/**
 * Created by WSienski on 22/12/2017.
 */
open class AnimalKotlin(val name: String){

    fun greet(){
        Timber.d("Hello my name is $name")
    }

    fun greetingsTxt(): String = "Hello my name is $name"
}