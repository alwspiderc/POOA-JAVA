package br.ucsal;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

        // Banco de dados editar arquivo RunServer:
        // cd ..\data
        // @java -classpath ../lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:my.db --dbname.0 ucsaldb

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //FactotyMethod
        try{ 
            //Criei uma conexão
            Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/ucsaldb", "SA", "");
            //Criei um comando 
            Statement stmt = c.createStatement();
            //Executei um comando
            ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
            List<Consumidor> lista = new ArrayList<>();

            Field[] atributos =  Consumidor.class.getDeclaredFields();
            //Obtendo o resultado
            while(rs.next()){
                Consumidor consumidor = new Consumidor();
            
                consumidor.setId(rs.getLong("ID"));
                consumidor.setNome(rs.getString("FIRSTNAME"));
                consumidor.setSobrenome(rs.getString("LASTNAME"));
                consumidor.setCidade(rs.getString("CITY"));
                consumidor.setRua(rs.getString("STREET"));
                lista.add(consumidor);
            }
            stmt.close();
            c.close();

            for (Consumidor consumidor : lista) {
                System.out.println(consumidor);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }


}