package iview.wsienski.kotlintrip.data.inheritance;

import timber.log.Timber;

/**
 * Created by WSienski on 22/12/2017.
 */

public class AnimalJava {

    String name;

    public AnimalJava(String name) {
        this.name = name;
    }

    public void greet() {
        Timber.d("Hello my name is %s", name);
    }

    public String greetingsTxt() {
        return String.format("Hello my name is %s", name);
    }

    public void makeCommand(String command) {
        makeCommand(command, 1);
    }

    public void makeCommand(String command, int times) {
        for (int i = 0; i < times; i++) Timber.d("Make command %s", command);
    }
}
