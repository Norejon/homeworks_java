package part3;

public class Comics extends Book {
    private String name;

    public Comics(int width, int height, int pageCount, String name) {
        super(width, height, pageCount);
        this.name = name;
    }
}
