package Entitet;

public class Lending {
    int lending;
    String date;
    String time;
    int bookid;
    int userid;

    public Lending(int lending, String date, String time, int bookid, int userid) {
        this.lending = lending;
        this.date = date;
        this.time = time;
        this.bookid = bookid;
        this.userid = userid;
    }

    public int getLending() {
        return lending;
    }

    public void setLending(int lending) {
        this.lending = lending;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Lending" +
                " [lending:" + lending+"]" +
                " [date:" + date+"}" +
                " [time:" + time+"]" +
                " [bookid:" + bookid+"]"+
                " [userid:" + userid+"]";
    }
}
