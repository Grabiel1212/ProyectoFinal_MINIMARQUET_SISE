/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REGISTRO;

/**
 *
 * @author grabiel
 */
public class empleado {
 // clase principal
    //variantes principales 
    String nombre ;
    String  ape;
    String correo;
    int telefono;
    String contra;
    double saldo;

  
    //asemos un metodo vacio
    public empleado(){
        
    }
    
    //asemos otro metodo con parametros 
    //esto nos asegura que los obejtos tengan valores validos
    public empleado(String nombre , String ape, String correo , int telefono , String contra,double saldo){
        this.nombre=nombre ;
        this.ape=ape;
        this.correo =correo;
        this.telefono=telefono;
        this.contra=contra;
        this.saldo=saldo;
    }
    
    //contructores get y set (get= muestra o retorna  y set = modific)
    public String getNombre(){
        return nombre; //muestra
    }
    
      public void  setNombre(String nombre){
     this.nombre=nombre ;// modifica
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    // metodo propio
    
    
      public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
