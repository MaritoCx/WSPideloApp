/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author maritocx
 */
public class Restaurant {
    private String name;         //Name of the Restaurant ("Empresa" in the database) 
    private int type;            //Kind of the Restaurant
    private String email;        //Restaurant's email
    private String h_open;       //open hour
    private String h_close;      //close hour
    private String img;          //URL of the image
    private ArrayList<Country> Country;    //List of countries with branch

    public Restaurant(){
        name="";
        type=0;
        email="";
        h_open="";
        h_close="";
        img="";
        Country= new ArrayList<Country>();
    }
    
    public void name(String nameL){
        name=nameL;
    }
    public void type(int typeL){
        type=typeL;
    }
    public void email(String emailL){
        email=emailL;
    }
    public void h_open(String h_openL){
        h_open=h_openL;
    }
    public void h_closeL(String h_closeL){
        h_close=h_closeL;
    }
    public void img(String imgL){
        img=imgL;
    }
    
    public String name(){
        return name;
    }
    public int type(){
        return type;
    }
    public String email(){
        return email;
    }
    public String h_open(){
        return h_open;
    }
    public String h_close(){
        return h_close;
    }
    public String img(){
        return img;
    }
}

