package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/pokemondb";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "12345678";

    private DatabaseConnection() throws ClassNotFoundException, SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        }catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(e.getMessage());
        }

    }


    public static DatabaseConnection getInstance() throws SQLException, ClassNotFoundException {

        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }
        return instance;

    }

    public Connection getConnection() {
        return connection;
    }


}
