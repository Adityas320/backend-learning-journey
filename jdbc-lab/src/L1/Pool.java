package L1;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Pool {

    // Build the taxi stand ONCE, when the program starts.
    private static final HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/company_db");
        config.setUsername("postgres");
        config.setPassword("root");   // ← your real password
        config.setMaximumPoolSize(10);               // 10 cars parked at the stand

        dataSource = new HikariDataSource(config);
    }

    // Borrow a connection from the stand.
    public static Connection get() throws SQLException {
        return dataSource.getConnection();
    }
}