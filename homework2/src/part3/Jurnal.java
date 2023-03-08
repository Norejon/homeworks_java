package part3;

public class Jurnal extends Book {
    private boolean isGlyanets;


    public Jurnal(int width, int height, int pageCount, boolean isGlyanets) {
        super(width, height, pageCount);
        this.isGlyanets = isGlyanets;
    }
}
