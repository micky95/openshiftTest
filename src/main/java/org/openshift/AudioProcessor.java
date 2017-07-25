package org.openshift;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class AudioProcessor {
	
	public String process() {
		String res="";
		
		try{
            String databaseURL = "jdbc:postgresql://";
            databaseURL += System.getenv("POSTGRESQL_SERVICE_HOST");
            databaseURL += "/" + System.getenv("POSTGRESQL_DATABASE");
            String username = System.getenv("POSTGRESQL_USER");
            String password = System.getenv("PGPASSWORD");
            Connection connection = DriverManager.getConnection(databaseURL, username,
            password);
            
            if (connection != null) {
            	return "tis gelukt!!";
//                String SQL = "select a.string AS first, b.string AS second, c.string AS noun from short_adjective a , long_adjective b, noun c ORDER BY random() limit 1";
//                Statement stmt = connection.createStatement();
//                ResultSet rs = stmt.executeQuery(SQL);
//                while (rs.next()) {
//                    if (vowels.indexOf(rs.getString("first").charAt(0)) == -1) {
//                        article = "a";
//                }
//                theInsult = String.format("Thou art %s %s %s %s!", article,
//                rs.getString("first"), rs.getString("second"), rs.getString("noun"));
            }
//            rs.close();
            connection.close();
        
    } catch (Exception e) {
        return "Database connection problem!";
      }
		return res;
		
	}

}
