package dataLister;

import Db.ConnectionConfiguration;
import Entitet.Address;
import Entitet.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressInsert {

    protected static void addressInsert(Address adress){

        Connection connection = ConnectionConfiguration.getConnection();


        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO bruger (postnr,by) VALUES(?,?)");
            statement.setInt(1,adress.getPostnr());
            statement.setString(2,adress.getCity());
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
