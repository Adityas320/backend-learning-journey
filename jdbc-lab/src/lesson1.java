import java.sql.*;

public class lesson1 {

    static final String URL  = "jdbc:postgresql://localhost:5432/company_db";
    static final String USER = "postgres";
    static final String PASS = "root";

    public static void main(String[] args) {

        String sql = "SELECT emp_id, name, salary FROM jdbc_emp ORDER BY salary DESC";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement  st   = conn.createStatement();
             ResultSet  rs   = st.executeQuery(sql)) {

            while (rs.next()) {
                int    id     = rs.getInt("emp_id");
                String name   = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + " | " + name + " | " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}