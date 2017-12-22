package iview.wsienski.kotlintrip.data.properties;

/**
 * Created by WSienski on 22/12/2017.
 */

public class LanguageJava {

    private String name;

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = String.format("Language is %s", name);
    }
}
