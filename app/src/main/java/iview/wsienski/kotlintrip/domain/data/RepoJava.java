package iview.wsienski.kotlintrip.domain.data;

/**
 * Created by WSienski on 27/12/2017.
 */

public class RepoJava {

    private String name;
    private String owner;

    public RepoJava(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
