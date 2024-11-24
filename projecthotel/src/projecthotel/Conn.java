package projecthotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection C;
    Statement s;
   
    Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql:///projecthotel", "root", "aryan");
            s = C.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return s;
    }
}