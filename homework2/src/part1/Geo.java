package part1;

public class Geo {
private double lat;
private double lng;

    public Geo() {
    }

    public Geo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}

