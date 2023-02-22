package dataLister;

import Db.ConnectionConfiguration;
import Entitet.Author;
import Entitet.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorInsert {
    protected static void authorInsert(Author author){

        Connection connection = ConnectionConfiguration.getConnection();


        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO bruger (fornavn,efternavn) VALUES(?,?)");
            statement.setString(1,author.getFornavn() );
            statement.setString(2,author.getEfternavn());
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
