package dataLister;

import Db.ConnectionConfiguration;
import Entitet.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookInsert {
    protected static void userInsert(Book book){

        Connection connection = ConnectionConfiguration.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO bog (navn,forfatter) VALUES(?,?)");
            statement.setString(1,book.getName());
            statement.setInt(2,book.getForfatterid());
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
