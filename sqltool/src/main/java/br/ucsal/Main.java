package br.ucsal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Banco de dados editar arquivo RunServer:
        // cd ..\data
        // @java -classpath ../lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:my.db --dbname.0 ucsaldb

        try  {
            Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/ucsaldb", "SA", "");
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
            List<Consumidor> lista = new ArrayList<>();

            while (rs.next()) {
                Consumidor consumidor = new Consumidor();
                consumidor.setNome(rs.getString("FIRSTNAME"));
                
                // System.out.println(rs.getString("FIRSTNAME"));
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}