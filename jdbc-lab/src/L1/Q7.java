package L1;
import java.sql.*;


public class Q7 {

	public static void main(String[] args) throws SQLException {
		
		 long start = System.nanoTime();
		for(int i=0;i<100;i++) {
			try(Connection conn = Pool.get()) {}
		}
       
        long ms = (System.nanoTime() - start) / 1_000_000;
        System.out.println("100 connections took " + ms + " ms");
		//i think this will use dynamic arrays array list and iam just learning them in other schedules
	}

}
