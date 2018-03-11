/**
 * @author Kyle.Wang
 * 2018/1/29 0029 9:41
 */
public class Artist {

    private String name;
    private String country;

    public Artist(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Artist{" + "name='" + name + '\'' + ", country='" + country + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setAddress(String country) {
        this.country = country;
    }
}
