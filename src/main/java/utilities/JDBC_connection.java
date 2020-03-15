package utilities;

import java.sql.*;
import java.util.ArrayList;

public class JDBC_connection {

    public static void main(String[] args) throws SQLException {

        /*
            connection
            statement
            result set

         */
//        String URL ="jdbc:mysql://database-techno.c771qxmldhez.us-east-2.rds.amazonaws.com:3306/daulet2030_studens_database";
//        String username = "daulet2030";
//        String password = readProperties.getData( "password" );
//
//        Connection connection = DriverManager.getConnection(URL,username,password  );
//
//        Statement statement = connection.createStatement();
//
//        ResultSet resultset = statement.executeQuery( "select * from students;" );
//
//        ArrayList<String> data = new ArrayList<>(  );
//
//        while(resultset.next()){
//            data.add( resultset.getString( "first_name" ) );
//        }
//        System.out.println(data);



        ArrayList<String> mySTR = getDataFromDatabase( "select first_name from students;" , "first_Name" );

        System.out.println(mySTR);



    }


    public static ArrayList<String> getDataFromDatabase(String myQuery ,String columnLabel) throws SQLException {

        String URL ="jdbc:mysql://database-techno.c771qxmldhez.us-east-2.rds.amazonaws.com:3306/daulet2030_studens_database";
        String username = "daulet2030";
        String password = readProperties.getData( "password" );

        Connection connection = DriverManager.getConnection(URL,username,password  );

        Statement statement = connection.createStatement();

        ResultSet resultset = statement.executeQuery( myQuery );

        ArrayList<String> data = new ArrayList<>(  );

        while(resultset.next()){
            data.add( resultset.getString( columnLabel ) );
        }

        return data;

    }

}
