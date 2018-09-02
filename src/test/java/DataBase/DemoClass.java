package DataBase;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      MySql obj = new MySql();
        Class.forName("MySql");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());


    }
}

class MySql {

    //instance
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("You are in static block");
    }

}

//load and thus execute DriverClass and register the driver