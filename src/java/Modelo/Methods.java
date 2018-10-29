/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;  
/**
 *
 * @author maritocx
 */
public class Methods {
    Connection connDB=null;
    boolean correct=true;
    
    static CallableStatement call=null;
    
    /*Calling the login function in database*/
    public boolean Login(String usser, String pass){
        String query ="Select Login(?,?)";  
        connDB = ConnectionDB.ConnectionDB();
        try{
            call=connDB.prepareCall(query);
            call.setString(1, usser);
            call.setString(2, pass);
            call.execute();
            ResultSet result = call.getResultSet();
             
            while(result.next()){
                correct=result.getBoolean(1);
            }
            
            if (correct==true) {
                return correct;
            }
            else{
                correct=false;
            }
            
        }catch (SQLException e){
            
        }
        
            return correct;
    }
    
}
