/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Objects.Restaurant;
import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;  
import java.util.ArrayList;
/**
 *
 * @author maritocx
 */
public class Methods {
    Connection connDB=null;
    String correct="";
    ResultSet result=null;
    static CallableStatement call=null;
    
    /*Calling the login function in database*/
    public String Login(String usser, String pass){
        String query ="Select Login(?,?)";  
        connDB = ConnectionDB.ConnectionDB();
        try{
            call=connDB.prepareCall(query);
            call.setString(1, usser);
            call.setString(2, pass);
            call.execute();
            result = call.getResultSet();
             
            while(result.next()){
                correct=result.getString(1);
            }
            
            if (correct.equals("Login correcto")) {
                return correct;
            }
            else if(correct.equals("Usuario correcto")){
                return correct;
            }
            else{
                return correct;
            }
            
        }catch (SQLException e){
            
        }finally{
            ConnectionDB.close(result,call,connDB);
        }
        
            return correct;
    }
    
    /*Calling the storage procedure to change the password*/
    public String changePass(String user, String email, String pass){
        String msg="";
        
        String query="Call changePassword(?,?,?,?)";
        connDB= ConnectionDB.ConnectionDB();
        try{
            call=connDB.prepareCall(query);
            call.setString(1, user);
            call.setString(2, email);
            call.setString(3, pass);
            call.registerOutParameter(4, java.sql.Types.VARCHAR);
            call.execute();
            
            msg=call.getString(4);
       
        }catch(SQLException e){
            
        }finally{
            ConnectionDB.close(result,call,connDB);
        }
        return msg;
    }
    
    /*Calling the storage procedure to fill the Restaurants*/
    public ArrayList fill(){
        ArrayList<Restaurant> Lrestaurant = new ArrayList<Restaurant>();
        Restaurant restaurant1 = new Restaurant();
        
        String query="";
        
        return Lrestaurant;
    }
    
}
