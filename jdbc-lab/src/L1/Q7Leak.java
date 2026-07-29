package L1;

import java.sql.*;
import java.util.*;

public class Q7Leak {
    public static void main(String[] args) throws Exception {

        List<Connection> held = new ArrayList<>();   // keep every one alive
        int i = 0;

        try {
            while (true) {
                i++;
                held.add(DB.get());
                System.out.println("opened #" + i);
            }
        } catch (SQLException e) {
            System.out.println(">>> DIED at connection #" + i);
            e.printStackTrace();
        }
    }
}