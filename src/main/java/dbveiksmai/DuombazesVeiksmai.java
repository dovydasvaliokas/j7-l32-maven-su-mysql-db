package dbveiksmai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DuombazesVeiksmai {
    public static final String DB_NUORODA = "jdbc:mysql://localhost:3306/java7_biblioteka?serverTimezone=UTC&characterEncoding=utf8";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public DuombazesVeiksmai() {
    }

    public static Connection prisijungtiPrieDuombazes() throws SQLException {
        return DriverManager.getConnection(DB_NUORODA, DB_USER, DB_PASSWORD);
    }
}
