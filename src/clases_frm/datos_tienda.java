/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_frm;

import javax.swing.JOptionPane;

/**
 *
 * @author grabiel
 */
public class datos_tienda {

    //MIS VARIANTES 
   private int id ;
   private String producto;
   private int cantidad;
   private double presio;
   private String tipo_producto;
   private double subTotal;
private double saldo;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the presio
     */
    public double getPresio() {
        return presio;
    }

    /**
     * @param presio the presio to set
     */
    public void setPresio(double presio) {
        this.presio = presio;
    }

    /**
     * @return the tipo_producto
     */
    public String getTipo_producto() {
        return tipo_producto;
    }

    /**
     * @param tipo_producto the tipo_producto to set
     */
    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

   public void mensaje(){
       JOptionPane.showMessageDialog(null,"Se agrego asu carrito");
   }
  
 public void mensaje02(){
      JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
 }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
