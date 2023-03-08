package part3;

public class Book extends Papirus{
    private int pageCount;
    public Book(int width, int height,int pageCount){
        super(width,height);
        this.pageCount = pageCount;
    }
}
