package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // URL, username, dan password sesuai dengan konfigurasi MySQL Anda
            String url = "jdbc:mysql://localhost:3306/db_rbk"; // Nama database Anda
            String user = "root"; // Username MySQL Anda
            String password = ""; // Password MySQL Anda
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }
}
