package iview.wsienski.kotlintrip.domain.command

/**
 * Created by WSienski on 27/12/2017.
 */
interface Command<out T> {
    fun run(): T
}