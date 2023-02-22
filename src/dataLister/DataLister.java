package dataLister;

import Db.ConnectionConfiguration;
import Entitet.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class DataLister {
   protected static List<User> userList;
    protected static List<Address> addresses;
    protected static List<Book>books;
    protected static List<Author>authors;
    protected static List<Lending>lends;


 public DataLister(){
 }

protected static void getUsers(){
    userList = new ArrayList<>();
    try {

        Connection connection = ConnectionConfiguration.getConnection();
        {
            PreparedStatement statement = connection.prepareStatement(("SELECT * FROM biblio.bruger"));
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("idbruger");
                String navn = result.getString("fornavn");
                int addresse = result.getInt("adresse");

                User user = new User(id, navn, addresse);
                userList.add(user);
            }


        }
    } catch (Exception e) {

        e.printStackTrace();


    }

    for (User user : userList) {
        System.out.println(user);

    }
}

protected static void getAddresses(){
    addresses = new ArrayList<>();
    try {

        Connection connection = ConnectionConfiguration.getConnection();
        {
            PreparedStatement statement = connection.prepareStatement(("SELECT * FROM biblio.adresse"));
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("idadresse");
                int postnr = result.getInt("postnr");
                String city = result.getString("by");

                Address address = new Address(id, postnr, city);
                addresses.add(address);
            }


        }
    } catch (Exception e) {

        e.printStackTrace();


    }

    for (Address adress  :addresses ) {
        System.out.println(adress);
    }
}

 public static void getBooks(){
     books = new ArrayList<>();
    try {

        Connection connection = ConnectionConfiguration.getConnection();
        {
            PreparedStatement statement = connection.prepareStatement(("SELECT * FROM biblio.bog"));
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int bogid = result.getInt("idbøger");
                String navn = result.getString("navn");
                int forfatterid = result.getInt("forfatter");

                Book book = new Book(bogid, navn, forfatterid);
                books.add(book);
            }


        }
    } catch (Exception e) {

        e.printStackTrace();


    }

    for (Book book  :books ) {
        System.out.println(book);
    }
}

protected static void getAuthors(){
    authors = new ArrayList<>();
    try {

        Connection connection = ConnectionConfiguration.getConnection();
        {
            PreparedStatement statement = connection.prepareStatement(("SELECT * FROM biblio.forfatter"));
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int forfatterid = result.getInt("forfatter");
                String navn = result.getString("fornavn");
                String efternavn = result.getString("efternavn");

                Author author = new Author(forfatterid, navn, efternavn);
                authors.add(author);
            }


        }
    } catch (Exception e) {

        e.printStackTrace();


    }

    for (Author author  :authors ) {
        System.out.println(author);
    }
}

protected static void getbookLends(){
    lends = new ArrayList<>();
    try {

        Connection connection = ConnectionConfiguration.getConnection();
        {
            PreparedStatement statement = connection.prepareStatement(("SELECT * FROM biblio.udlån"));
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int idudlån = result.getInt("idudlån");
                String dato = result.getString("dato");
                String tid = result.getString("tid");
                int bogid = result.getInt("bogid");
                int brugerid = result.getInt("brugerid");

                Lending lend = new Lending(idudlån, dato, tid,bogid,brugerid);
                lends.add(lend);
            }


        }
    } catch (Exception e) {

        e.printStackTrace();


    }

    for (Lending lend  :lends ) {
        System.out.println(lend);
    }
}

}

