package iview.wsienski.kotlintrip.data.inheritance;

/**
 * Created by WSienski on 22/12/2017.
 */

public class DogJava extends AnimalJava {

    String race;

    public DogJava(String name, String race) {
        super(name);
        this.race = race;
    }
}
