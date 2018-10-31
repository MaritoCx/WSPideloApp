/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.sql.Connection;
/**
 *
 * @author maritocx
 */
public class ConnectionDB{
    public static Connection conDB;
        
    public static Connection ConnectionDB(){
        try{
            /*Carga|Registra el driver*/
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /*Conexion*/
            conDB=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/PideloApp","root","marito97");
                System.out.println("Connection successfully!!! :D");
        }
        catch(SQLException ex){
        }catch(Exception e){
        }
        
        return conDB;
    }
    
    public static void close(ResultSet result, Statement s, Connection c) {
        try { if (result != null) result.close(); } catch (Exception e) {}
        try { if (s != null) s.close(); } catch (Exception e) {}
        try { if (c != null) c.close(); } catch (Exception e) {}
    }
    
}
