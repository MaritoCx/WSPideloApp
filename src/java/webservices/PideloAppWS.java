/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Modelo.*;

/**
 *
 * @author maritocx
 */
@WebService(serviceName = "PideloAppWS")
public class PideloAppWS {

    Methods methods = new Methods();
    
    /**
     * Web service operation
     * @param usuario
     * @param contrasenia
     * @return 
     */
    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasenia") String contrasenia) {
        //Web method to login
        if (methods.Login(usuario, contrasenia)==true) {
            return true;
        }
        else{
            return false;    
        }
        
    }
    

    /**
     * Web service operation
     * @param user
     * @param email
     * @param newPassword
     * @return 
     */
    @WebMethod(operationName = "ChangePassword")
    public String ChangePassword(@WebParam(name = "user") String user, @WebParam(name = "email") String email, 
            @WebParam(name = "newPassword") String newPassword) {
        //TODO write your implementation code here:
        String msg="";
        msg=methods.changePass(user,email,newPassword);
        if (msg.equals("Operacion exitosa")) {
            return "La contraseña se modifico correctamente :)";
        }
        else{
            return "Ocurrio un error";
        }
        
    }
}
