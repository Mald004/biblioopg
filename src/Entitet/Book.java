package Entitet;

public class Book {
    int bookid;
    String name;
    int forfatterid;

    public Book(int bookid, String name, int forfatterid) {
        this.bookid = bookid;
        this.name = name;
        this.forfatterid = forfatterid;
    }

    public Book(String name, int forfatterid){
        this.name = name;
        this.forfatterid = forfatterid;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForfatterid() {
        return forfatterid;
    }

    public void setForfatterid(int forfatterid) {
        this.forfatterid = forfatterid;
    }

    @Override
    public String toString() {
        return "Book" +
                " [bookid: " + bookid+"]" +
                " [name: " + name+"]" +
                " [forfatterid: " + forfatterid+"]";
    }
}
