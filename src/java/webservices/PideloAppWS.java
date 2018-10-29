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

    /**
     * Web service operation
     * @param usuario
     * @param contrasenia
     * @return 
     */
    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasenia") String contrasenia) {
        //TODO write your implementation code here:
        Methods methods = new Methods();
        if (methods.Login(usuario, contrasenia)==true) {
            return true;
        }
        else{
            return false;    
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ChangePassword")
    public String ChangePassword(@WebParam(name = "email") String email, @WebParam(name = "password") String password, @WebParam(name = "newPassword") String newPassword) {
        //TODO write your implementation code here:
        return null;
    }
}
