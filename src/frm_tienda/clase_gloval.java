/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frm_tienda;



import java.util.ArrayList;
import PROYECTO_LOYIN.login;

import clases_frm.datos_tienda;

/**
 *
 * @author grabiel
 */
public class clase_gloval {
    
    //crado un aarrayLIST
    public static ArrayList <datos_tienda> inicio;
    //creo mi arrayLIst para el saldo
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inicio = new ArrayList<>();
  
//        
        login abrir = new login ();
        abrir.setVisible(true);
//portada abrir = new portada ();
//abrir.setVisible(true);
    
        
    }
    
}
