package dataLister;

import Entitet.Address;
import Entitet.Author;
import Entitet.Book;
import Entitet.User;

public class Facade {

    public static void getUser(){
        DataLister.getUsers();
    }

    public static void getAutours(){
        DataLister.getAuthors();
    }

    public static  void getBookLends(){
        DataLister.getbookLends();
    }

    public static  void getBooks(){
        DataLister.getBooks();
    }

    public static  void getAddresses(){
        DataLister.getAddresses();
    }

    public static void insertUser(User user){
        UserInsert.userInsert(user);
    }

    public static void insertBook(Book book){
        BookInsert.userInsert(book);
    }

    public static void insertAuthor(Author author){
        insertAuthor(author);
    }

    public static void insertAddress(Address adress){

    }
}
