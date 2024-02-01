/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

import REGISTRO.empleado;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author grabiel
 */
public class proceso {
    
     public static boolean modooscuro = false;
    //INDICAMOS LA RUTA EN DONDE TENEMOS NUESTRO ARCHIVO O BASE DE DATOS
    String ruta ="BD_USUARIOS.txt";
    
    //LECTURA
    FileReader fr;
    BufferedReader br;
    
    //ESCRITURA
    FileWriter fw;
    
    //OBJETO
    empleado e;
    
     public  ArrayList<empleado> array= new ArrayList();//asemos una arailist para que lo podramos en una tabla
     
    //METODO INSERTAR
     public void insertar(empleado e)throws FileNotFoundException, IOException{//este metodo es para evitar los erores que se puede ocucionar en  le formulario
     fw = new FileWriter(ruta, true) ;   //abrir el archivo
     String cad=e.getNombre()+"-"+e.getApe()+"-"+e.getCorreo()+"-"+e.getTelefono()+"-"+e.getContra()+"-"+e.getSaldo();
     //lo grabamos
     fw.write(cad);//lo gramos la imformacion
     fw.write(10);//enter
     fw.close();//cerrar
     }
    
    //METODO LEER
    public void leer()throws FileNotFoundException , IOException{
        array.clear();//para limpiar nuestro araylist
        fr=new  FileReader(ruta);
        br =new   BufferedReader (fr);//copiar la imformaciomn ala memoria
        
        //leemos la primera linea de nuestro archivo
        String cad=br.readLine();
        String vec[];//divicion de la cadena 
        
        while (cad!=null){
            vec=cad.split("-");
            e= new empleado( vec[0],vec[1],vec[2],Integer.parseInt(vec[3]),vec[4],Double.parseDouble(vec[5]));
            
            //le agregamos a nuestr arraylist 
            array.add(e);
            cad=br.readLine();//se vuelve a repetir todo los registros 
        }
        
    }
    
    // metodo buscar 
    String nom="";
    String men="";

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public  String buscarDatoEnArchivo( String valorBuscado) {
         empleado ut = new empleado();
        try {
            BufferedReader br = new BufferedReader(new FileReader("BD_USUARIOS.txt"));
            String linea;
         
            while ((linea = br.readLine()) != null) {
             String[] datos = linea.split("-");
            String usuario = datos[0];
            String contraseña =datos[4];
             if (linea.contains(valorBuscado)) {
                 setNom(usuario);
                 
                
//                   return usuario;
//                    return "El valor buscado se encuentra en la siguiente línea: " + usuario;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        
           
        }
     
     
       
        return null;
     }
    
    
   
}
