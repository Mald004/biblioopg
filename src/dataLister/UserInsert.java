package dataLister;

import Db.ConnectionConfiguration;
import Entitet.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {

    protected static void userInsert(User user){

        Connection connection = ConnectionConfiguration.getConnection();
        System.out.println(user.getFornavn());


        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO bruger (fornavn,efternavn,adresse) VALUES(?,?,?)");
            statement.setString(1,user.getFornavn() );
            statement.setString(2,user.getEfternavn() );
            statement.setInt(3,user.getAdresse());
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
