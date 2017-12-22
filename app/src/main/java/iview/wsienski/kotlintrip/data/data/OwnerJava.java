package iview.wsienski.kotlintrip.data.data;

/**
 * Created by Witold Sienski on 05.12.2017.
 */

public class OwnerJava {

    long id;
    String login;
    String url;

    public OwnerJava(long id, String login, String url) {
        this.id = id;
        this.login = login;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnerJava ownerJava = (OwnerJava) o;

        if (id != ownerJava.id) return false;
        if (login != null ? !login.equals(ownerJava.login) : ownerJava.login != null) return false;
        return url != null ? url.equals(ownerJava.url) : ownerJava.url == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OwnerJava{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
