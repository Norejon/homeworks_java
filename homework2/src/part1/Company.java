package part1;

public class Company {
    private String name;
    private String catchPharse;
    private String bs;

    public Company() {
    }

    public Company(String name, String catchPharse, String bs) {
        this.name = name;
        this.catchPharse = catchPharse;
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", catchPharse='" + catchPharse + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
