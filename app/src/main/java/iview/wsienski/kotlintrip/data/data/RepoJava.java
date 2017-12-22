package iview.wsienski.kotlintrip.data.data;

/**
 * Created by WSienski on 22/12/2017.
 */

public class RepoJava {

    private long id;
    private String name;
    private String description;
    private String url;
    private String createdAt;
    private OwnerJava owner;
    private boolean priv;

    public RepoJava(){

    }

    public RepoJava(long id, String name, String description, String url, String createdAt, OwnerJava owner, boolean priv) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.createdAt = createdAt;
        this.owner = owner;
        this.priv = priv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OwnerJava getOwner() {
        return owner;
    }

    public void setOwner(OwnerJava owner) {
        this.owner = owner;
    }

    public boolean isPriv() {
        return priv;
    }

    public void setPriv(boolean priv) {
        this.priv = priv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepoJava repoJava = (RepoJava) o;

        if (priv != repoJava.priv) return false;
        if (id != repoJava.id) return false;
        if (name != null ? !name.equals(repoJava.name) : repoJava.name != null) return false;
        if (description != null ? !description.equals(repoJava.description) : repoJava.description != null)
            return false;
        if (url != null ? !url.equals(repoJava.url) : repoJava.url != null) return false;
        if (createdAt != null ? !createdAt.equals(repoJava.createdAt) : repoJava.createdAt != null)
            return false;
        return owner != null ? owner.equals(repoJava.owner) : repoJava.owner == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (priv ? 1 : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "RepoJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", owner=" + owner +
                ", priv=" + priv +
                '}';
    }
}
