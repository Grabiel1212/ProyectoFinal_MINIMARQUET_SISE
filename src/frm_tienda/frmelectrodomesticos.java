/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm_tienda;

import CONTROL.proceso;
import PROYECTO_LOYIN.login;
import clases_frm.claseUsuario;
import clases_frm.claseproducto;
import clases_frm.datos_tienda;
import clases_frm.productogeneral;
import clases_frm.usuarioGenaral;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author grabiel
 */
public class frmelectrodomesticos extends javax.swing.JFrame {

    //llamo ami objeto
    datos_tienda ex = new datos_tienda();
    //variantes para mi cantidad
    int c1 , c2 , c3 , c4 ,c5 ,c6,c7,c8,c9,c10 ,c11,c12;
    
    //mis objetos spinner
       SpinnerNumberModel e1 = new SpinnerNumberModel();
       SpinnerNumberModel e2 = new SpinnerNumberModel();
       SpinnerNumberModel e3 = new SpinnerNumberModel();
       SpinnerNumberModel e4 = new SpinnerNumberModel();
       SpinnerNumberModel e5 = new SpinnerNumberModel();
       SpinnerNumberModel e6 = new SpinnerNumberModel();
       SpinnerNumberModel e7 = new SpinnerNumberModel();
       SpinnerNumberModel e8 = new SpinnerNumberModel();
       SpinnerNumberModel e9 = new SpinnerNumberModel();
       SpinnerNumberModel e10 = new SpinnerNumberModel();
       SpinnerNumberModel e11 = new SpinnerNumberModel();
       SpinnerNumberModel e12 = new SpinnerNumberModel();
      
       
       
       
       
       
       
    /**
     * Creates new form frmelectrodomesticos
     */
    AudioClip sonido;
     AudioClip sonido2;
       AudioClip sonido3;
        AudioClip sonido4;
    public frmelectrodomesticos() {
        initComponents();
            this.setLocationRelativeTo(null);
             sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/clik.wav"));
                 sonido2=java.applet.Applet.newAudioClip(getClass().getResource("/audios/audiodespedida.wav"));
             sonido3=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonidobutton02.wav"));
               sonido4=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonidoBotoon03.wav"));
               
               
               
               this.btn1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn1.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn1.setBackground(Color.white);
               
               this.btn2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn2.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn2.setBackground(Color.white);
                btn2.setBorderPainted(false);
                
                this.btn3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn3.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn3.setBackground(Color.white);
                    btn3.setBorderPainted(false);
               
                     this.btn4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn4.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn4.setBackground(Color.white);
                    btn4.setBorderPainted(false);
               
               this.btn5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn5.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn5.setBackground(Color.white);
                    btn5.setBorderPainted(false);
                
                this.btn6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn6.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn6.setBackground(Color.white);
                    btn6.setBorderPainted(false);
                
                     this.btn7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn7.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn7.setBackground(Color.white);
                    btn7.setBorderPainted(false);
               
               this.btn8.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn8.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn8.setBackground(Color.white);
                    btn8.setBorderPainted(false);
                
                this.btn9.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn9.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn9.setBackground(Color.white);
                    btn9.setBorderPainted(false);
                
                     this.btn10.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn10.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn10.setBackground(Color.white);
                    btn10.setBorderPainted(false);
               
               this.btn11.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn11.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn11.setBackground(Color.white);
                    btn11.setBorderPainted(false);
                
                this.btn12.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn12.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/rrrrrr.png")));
                this.btn12.setBackground(Color.white);
                    btn12.setBorderPainted(false);
               
               
               
               
               
               
             
               claseUsuario resibir =usuarioGenaral.transferencia;
      this.txtusuario.setText(""+resibir.getUsuario());
             verSaldo();
             
               claseproducto enviar =productogeneral.tranferir;
               enviar.setP1(this.lblpro1.getText());
          
             e1.setMinimum(0);
             e1.setMaximum(10);
             c1= Integer.parseInt(this.spiner01.getValue().toString());
             this.spiner01.setModel(e1);
             
             
             e2.setMinimum(0);
             e2.setMaximum(10);
             c2= Integer.parseInt(this.spineer02.getValue().toString());
             this.spineer02.setModel(e2);
             
     
             e3.setMinimum(0);
             e3.setMaximum(10);
             c3= Integer.parseInt(this.spinner03.getValue().toString());
             this.spinner03.setModel(e3);
             
        
             e4.setMinimum(0);
             e4.setMaximum(10);
             c4= Integer.parseInt(this.spinner04.getValue().toString());
             this.spinner04.setModel(e4);
             
      
             e5.setMinimum(0);
             e5.setMaximum(10);
             c5= Integer.parseInt(this.spinner05.getValue().toString());
             this.spinner05.setModel(e5);
             
      
             e6.setMinimum(0);
             e6.setMaximum(10);
             c6= Integer.parseInt(this.spinner06.getValue().toString());
             this.spinner06.setModel(e6);
             
             
             e7.setMinimum(0);
             e7.setMaximum(10);
             c7= Integer.parseInt(this.spinner07.getValue().toString());
             this.spinner07.setModel(e7);
             
                  
             e8.setMinimum(0);
             e8.setMaximum(10);
             c8= Integer.parseInt(this.spinner08.getValue().toString());
             this.spinner08.setModel(e8);
             
               
             e9.setMinimum(0);
             e9.setMaximum(10);
             c9= Integer.parseInt(this.spinner09.getValue().toString());
             this.spinner09.setModel(e9);
             
            
             e10.setMinimum(0);
             e10.setMaximum(10);
             c10= Integer.parseInt(this.spinner10.getValue().toString());
             this.spinner10.setModel(e10);
             
               
             e11.setMinimum(0);
             e11.setMaximum(10);
             c11= Integer.parseInt(this.spinner11.getValue().toString());
             this.spinner11.setModel(e11);
             
              
             e12.setMinimum(0);
             e12.setMaximum(10);
             c12= Integer.parseInt(this.spinner12.getValue().toString());
             this.spinner12.setModel(e12);
             
            if ( proceso.modooscuro ) {
     
      this.fondo02.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-enorme-dark.png")));
       this.fondo01.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-lineal-masdelgado.png")));
          this.jLabel43.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-cuadradoPRODUCTOS-DARK.png")));
          
          
                
                // botton volza y zapatps
                  this.btnvolsosyzapatos.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/btn-volzazapatos-dark.jpg")));
              this.btnvolsosyzapatos.setBackground(Color.BLACK);
                this.btnvolsosyzapatos.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton.volzaszapatos-presionado-negro.png")));
                this.btnvolsosyzapatos.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton.volzaszapatos-presionado-negro.png")));
                
                //botton salus y velleza
                  this.btnVelleza.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-saluvelleza-dark.png")));
              this.btnVelleza.setBackground(Color.BLACK);
                this.btnVelleza.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-saludvelleza-presionado-negro.png")));
                this.btnVelleza.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-saludvelleza-presionado-negro.png")));
                
                //botton asesorios y moda
                  this.btnmoda.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-aseriosyModa-dark.png")));
              this.btnmoda.setBackground(Color.BLACK);
                this.btnmoda.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-asesoriosModa-presionado-noche.png")));
                this.btnmoda.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-asesoriosModa-presionado-noche.png")));
                
                //botton comida rapida
                  this.btncomida.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-comidaRapida-dark.png")));
              this.btncomida.setBackground(Color.BLACK);
                this.btncomida.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-comidaraoida-presionado-noche.png")));
                this.btncomida.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-comidaraoida-presionado-noche.png")));
                
                //fruta y verduras
                  this.btnfrutas.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botoon-fytasverduras-dark.png")));
              this.btnfrutas.setBackground(Color.BLACK);
                this.btnfrutas.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-frutasVedruras-presionado-noche.png")));
                this.btnfrutas.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-frutasVedruras-presionado-noche.png")));
                
                //viveres
                  this.btnviveres.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-viveres-dark.jpg")));
              this.btnviveres.setBackground(Color.BLACK);
                this.btnviveres.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-viveres-presionado-noche.png")));
                this.btnviveres.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-viveres-presionado-noche.png")));
                
                //boton añadir carrito
                // bton01
                this.btn1.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn1.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn1.setBackground(Color.white);
                
                //botton02
                  this.btn2.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn2.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn2.setBackground(Color.white);
                
                //bottom03
                  this.btn3.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn3.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn3.setBackground(Color.white);
                
                //botton04
                  this.btn4.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn4.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn4.setBackground(Color.white);
                
                //botton05
                  this.btn5.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn5.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn5.setBackground(Color.white);
                
                //botton 06
                  this.btn6.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn6.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn6.setBackground(Color.white);
                
                // botton 07
                  this.btn7.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn7.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn7.setBackground(Color.white);
                
                // botton 08
                  this.btn8.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn8.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn8.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn8.setBackground(Color.white);
                
                
                //botton 09
                  this.btn9.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn9.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn9.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn9.setBackground(Color.white);
                
                
                // botton 10
                  this.btn10.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn10.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn10.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn10.setBackground(Color.white);
                
                // botton 11
                  this.btn11.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn11.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn11.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn11.setBackground(Color.white);
                
                // botton 12
                  this.btn12.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn12.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn12.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn12.setBackground(Color.white);
                
                
                 //ls letras
                  lblpro1.setForeground(Color.white);
                  jLabel37.setForeground(Color.white);
                  jLabel25.setForeground(Color.white);
                  jLabel14.setForeground(Color.white);
                  jLabel15.setForeground(Color.white);
                  jLabel26.setForeground(Color.white);
                  
                  jLabel16.setForeground(Color.white);
                  jLabel27.setForeground(Color.white);
                  jLabel20.setForeground(Color.white);
                  jLabel31.setForeground(Color.white);
                  jLabel19.setForeground(Color.white);
                  jLabel30.setForeground(Color.white);
                  jLabel18.setForeground(Color.white);
                  jLabel29.setForeground(Color.white);
                  
                  jLabel17.setForeground(Color.white);
                  jLabel28.setForeground(Color.white);
                  jLabel21.setForeground(Color.white);
                  jLabel32.setForeground(Color.white);
                  jLabel13.setForeground(Color.white);
                  jLabel33.setForeground(Color.white);
                  
                  jLabel23.setForeground(Color.white);
                  jLabel34.setForeground(Color.white);
                  jLabel24.setForeground(Color.white);
                  jLabel35.setForeground(Color.white);
                  
                  lblinicio.setForeground(Color.white);
                  jLabel40.setForeground(Color.white);
                  
                  jLabel22.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/logoelecrrodomestico-removebg-preview-sinfondo.png")));
                  jPanel1.setBackground(Color.black);
                  jPanel2.setBackground(Color.black);
           
            
                  
 }
  
             
             
    }
    
  
    
    public void verSaldo(){
             try{
           // Definir el archivo de texto
        File archivo = new File("BD_USUARIOS.txt");
        Scanner lector = new Scanner(archivo);
        
          java.util.List<String> lineas = new java.util.ArrayList<String>();
        while (lector.hasNextLine()) {
          lineas.add(lector.nextLine());
        }
        lector.close();
        
        
        
         for (int i = 0; i < lineas.size(); i++) {
          String[] partes = lineas.get(i).split("-");
          String usuario= partes[0];
          String saldo=partes[5];
          
          
             if (usuario.equals(this.txtusuario.getText())) {
this.txtsaldo.setText(saldo);
//          JOptionPane.showMessageDialog(null, "Correo Electronico encontrado");
            return;
          }
         }
         
//            JOptionPane.showMessageDialog(null, "correo Herroneo");
              
               
        
        }catch(IOException ex){
             JOptionPane.showMessageDialog(null, "Error al leer o escribir en el archivo");
            ex.printStackTrace();
        }
        
                
                
    
    
                
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btncarrito = new javax.swing.JButton();
        btnrecargar = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        fondo01 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnvolsosyzapatos = new javax.swing.JButton();
        btnVelleza = new javax.swing.JButton();
        btnmoda = new javax.swing.JButton();
        btncomida = new javax.swing.JButton();
        btnfrutas = new javax.swing.JButton();
        btnviveres = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        spineer02 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblpro1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        spinner03 = new javax.swing.JSpinner();
        spinner04 = new javax.swing.JSpinner();
        spinner05 = new javax.swing.JSpinner();
        spinner06 = new javax.swing.JSpinner();
        spinner07 = new javax.swing.JSpinner();
        spinner08 = new javax.swing.JSpinner();
        spinner09 = new javax.swing.JSpinner();
        spinner10 = new javax.swing.JSpinner();
        spinner11 = new javax.swing.JSpinner();
        spinner12 = new javax.swing.JSpinner();
        spiner01 = new javax.swing.JSpinner();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        lblinicio = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fondo02 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/CAFETERA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/BATIDORA.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 210, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/ASPIRADORA.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 150, 150, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/freidoraAire.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 430, 120, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/MINIVENTILADOR.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 160, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/WAFLERA.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 240, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/TOSTADORA.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 150, 170, 170));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/exprimidorNARAJA.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 420, 170, 180));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/REFRIJERADORA.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 740, 170, 170));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/COSINA.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 740, 150, 160));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/MICROONDAS.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 790, 200, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/LAVADORA.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 740, 140, 170));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 160, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbuscar.setBorder(null);
        jPanel2.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 770, 30));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/logoGrande_market.png"))); // NOI18N
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 13, 270, 76));

        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/redondito_fondonegro_minimizar.png"))); // NOI18N
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });
        jPanel2.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 0, 20, 30));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/redondito_fondonegro_cuadrado.png"))); // NOI18N
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 0, -1, 30));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/rdondito_fondo_negro_salir.png"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });
        jPanel2.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 0, -1, 30));

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/cerrar_seccion_new.png"))); // NOI18N
        btnsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/cerra_seccion_new_presionado.png"))); // NOI18N
        btnsalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/cerra_seccion_new_presionado.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 40, 80, 70));

        btncarrito.setBackground(new java.awt.Color(0, 0, 0));
        btncarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/carrito.png"))); // NOI18N
        btncarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/carrito_presionado.png"))); // NOI18N
        btncarrito.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/carrito_presionado.png"))); // NOI18N
        btncarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarritoActionPerformed(evt);
            }
        });
        jPanel2.add(btncarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 40, 80, 70));

        btnrecargar.setBackground(new java.awt.Color(0, 0, 0));
        btnrecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/Recargar_btn.png"))); // NOI18N
        btnrecargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnrecargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/recargar_presionado.png"))); // NOI18N
        btnrecargar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/recargar_presionado.png"))); // NOI18N
        btnrecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecargarActionPerformed(evt);
            }
        });
        jPanel2.add(btnrecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 40, 80, 70));

        jLabel39.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Saldo :");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, -1, 30));

        txtsaldo.setEnabled(false);
        jPanel2.add(txtsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 10, 80, -1));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/buscador_lupa.png"))); // NOI18N
        btnbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/buscador_lupa_presionado.png"))); // NOI18N
        btnbuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/buscador_lupa_presionado.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, 70, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/barra_debuscar.png"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Usuario :");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, -1, -1));

        txtusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtusuario.setEnabled(false);
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 10, 80, -1));
        jPanel2.add(fondo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnvolsosyzapatos.setBackground(new java.awt.Color(255, 255, 255));
        btnvolsosyzapatos.setForeground(new java.awt.Color(255, 255, 255));
        btnvolsosyzapatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/newbolzas y zapatos.png"))); // NOI18N
        btnvolsosyzapatos.setBorder(null);
        btnvolsosyzapatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/volzasy zapatos _presionados.png"))); // NOI18N
        btnvolsosyzapatos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/volzasy zapatos _presionados.png"))); // NOI18N
        btnvolsosyzapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolsosyzapatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnvolsosyzapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 40));

        btnVelleza.setBackground(new java.awt.Color(255, 255, 255));
        btnVelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/new botton_salud&belleza.jpg"))); // NOI18N
        btnVelleza.setBorder(null);
        btnVelleza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/newsalus&velleza_presionadp.png"))); // NOI18N
        btnVelleza.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/newsalus&velleza_presionadp.png"))); // NOI18N
        btnVelleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVellezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnVelleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 40));

        btnmoda.setBackground(new java.awt.Color(255, 255, 255));
        btnmoda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/Aseosrios&moda.jpg"))); // NOI18N
        btnmoda.setBorder(null);
        btnmoda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/asesorio&moda_presionado.png"))); // NOI18N
        btnmoda.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/asesorio&moda_presionado.png"))); // NOI18N
        btnmoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodaActionPerformed(evt);
            }
        });
        jPanel3.add(btnmoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, 40));

        btncomida.setBackground(new java.awt.Color(255, 255, 255));
        btncomida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/comidaRAPIDA.png"))); // NOI18N
        btncomida.setBorder(null);
        btncomida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/COMIDArAPIDA_PRESIONADO.png"))); // NOI18N
        btncomida.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/COMIDArAPIDA_PRESIONADO.png"))); // NOI18N
        btncomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomidaActionPerformed(evt);
            }
        });
        jPanel3.add(btncomida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 40));

        btnfrutas.setBackground(new java.awt.Color(255, 255, 255));
        btnfrutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/frutas&verduras.png"))); // NOI18N
        btnfrutas.setBorder(null);
        btnfrutas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/frutas&verduras_presionado.png"))); // NOI18N
        btnfrutas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/frutas&verduras_presionado.png"))); // NOI18N
        btnfrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrutasActionPerformed(evt);
            }
        });
        jPanel3.add(btnfrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, 40));

        btnviveres.setBackground(new java.awt.Color(255, 255, 255));
        btnviveres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/viveres.png"))); // NOI18N
        btnviveres.setBorder(null);
        btnviveres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/viveres_presionado.png"))); // NOI18N
        btnviveres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/viveres_presionado.png"))); // NOI18N
        btnviveres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviveresActionPerformed(evt);
            }
        });
        jPanel3.add(btnviveres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, 40));
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 390));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, 390));

        spineer02.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spineer02StateChanged(evt);
            }
        });
        jPanel1.add(spineer02, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 90, -1));

        jLabel13.setText("Microondas & Horno - Electrolux");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 910, 190, 20));

        jLabel14.setText("S/ 89.00");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, -1, -1));

        jLabel15.setText("Aspiradora - Electrolux");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 310, -1, -1));

        jLabel16.setText("Imaco Tostadora 850w");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 320, -1, -1));

        jLabel17.setText("Ventidalor Recargable ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, -1, -1));

        jLabel18.setText("Sabdiwchera Electrica 140w");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, -1, -1));

        jLabel19.setText("Explimidor de Frutas Recargable");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 590, -1, -1));

        jLabel20.setText("Freidora de Aire  - Oster");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 580, -1, 30));

        jLabel21.setText("Refrijeradora & conjeladora 345L");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 910, -1, -1));

        lblpro1.setText("Cafetera Electriva- Electrolux");
        jPanel1.add(lblpro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jLabel23.setText("Cosina & Horno - Indurama");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 910, -1, -1));

        jLabel24.setText("Lavadora Dijital 15kl");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 910, -1, -1));

        jLabel25.setText("Batidora 7 Velocidades");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, -1, -1));

        jLabel26.setText("S/149.00");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 340, -1, -1));

        jLabel27.setText("S/120.90");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 336, -1, 20));

        jLabel28.setText("S/39.90");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, -1, -1));

        jLabel29.setText("S/129.00");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, -1, -1));

        jLabel30.setText("S/ 153.00");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 610, -1, -1));

        jLabel31.setText("S/ 399.00");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 610, -1, 20));

        jLabel32.setText("S/999.90");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 930, -1, -1));

        jLabel33.setText("S/ 489.00");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 930, -1, -1));

        jLabel34.setText("S/869.00");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 930, -1, -1));

        jLabel35.setText("S/1749.10");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 930, -1, -1));

        jLabel37.setText("S/ 149.00");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        spinner03.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner03StateChanged(evt);
            }
        });
        jPanel1.add(spinner03, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 360, 90, -1));

        spinner04.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner04StateChanged(evt);
            }
        });
        jPanel1.add(spinner04, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 360, 90, -1));

        spinner05.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                spinner05AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        spinner05.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner05StateChanged(evt);
            }
        });
        jPanel1.add(spinner05, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 90, -1));

        spinner06.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner06StateChanged(evt);
            }
        });
        jPanel1.add(spinner06, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 650, 90, -1));

        spinner07.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner07StateChanged(evt);
            }
        });
        jPanel1.add(spinner07, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 640, 90, -1));

        spinner08.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner08StateChanged(evt);
            }
        });
        jPanel1.add(spinner08, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 640, 90, -1));

        spinner09.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner09StateChanged(evt);
            }
        });
        jPanel1.add(spinner09, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 950, 90, -1));

        spinner10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner10StateChanged(evt);
            }
        });
        jPanel1.add(spinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 950, 90, -1));

        spinner11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner11StateChanged(evt);
            }
        });
        jPanel1.add(spinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 950, 90, -1));

        spinner12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner12StateChanged(evt);
            }
        });
        jPanel1.add(spinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 950, 90, -1));

        spiner01.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner01StateChanged(evt);
            }
        });
        jPanel1.add(spiner01, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 90, -1));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 390, 160, 30));

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 390, 160, 30));

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, 160, 30));

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 690, 160, 30));

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 680, 160, 30));

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 680, 160, 30));

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 980, 160, 30));

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 980, 160, 30));

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 980, 160, 30));

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 980, 160, 30));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn1.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 160, 30));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/categorias.png"))); // NOI18N
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 40));

        lblinicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblinicio.setText("Inicio ");
        lblinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblinicioMouseClicked(evt);
            }
        });
        jPanel1.add(lblinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("/ Electrodomesticos");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/logoelecrrodomestico.jpg"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 350, 340));
        jPanel1.add(fondo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1960, 1100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your h
          sonido3.play();
            datos_tienda añadir = new datos_tienda();

            if(c11>0){
        añadir.setProducto("Cosina & Horno - Indurama");
        añadir.setPresio(869.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c11);
        añadir.setSubTotal(añadir.getPresio()*c11);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
            }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e11.setValue(0);
    }//GEN-LAST:event_btn11ActionPerformed

    private void lblinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinicioMouseClicked
        // TODO add your handling code here:
             portada abrir = new portada();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblinicioMouseClicked

    private void btnVellezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVellezaActionPerformed
        // TODO add your handling code here:
        sonido.play();
            frmVelleza abrir = new frmVelleza();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVellezaActionPerformed

    private void btnfrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrutasActionPerformed
        // TODO add your handling code here:
           sonido.play();
             frmVerduras abrir = new frmVerduras();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnfrutasActionPerformed

    private void btncarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarritoActionPerformed
        // TODO add your handling code here:
             sonido4.play();
        frmcarrito abrir = new frmcarrito();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncarritoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
              sonido2.play();
        login abrir = new login ();
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnvolsosyzapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolsosyzapatosActionPerformed
        // TODO add your handling code here:
           sonido.play();
          frmVolsos abrir = new frmVolsos();
         abrir.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnvolsosyzapatosActionPerformed

    private void btnmodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodaActionPerformed
        // TODO add your handling code here:
           sonido.play();
             frmModa abrir = new frmModa();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmodaActionPerformed

    private void btncomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomidaActionPerformed
        // TODO add your handling code here:
           sonido.play();
           frmcomidaR abrir = new frmcomidaR();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncomidaActionPerformed

    private void btnviveresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviveresActionPerformed
        // TODO add your handling code here:
           sonido.play();
           frmViveres abrir = new frmViveres();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnviveresActionPerformed

    private void lblsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsalirMouseClicked
        // TODO add your handling code here:
           System.exit(0);
    }//GEN-LAST:event_lblsalirMouseClicked

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        // TODO add your handling code here:
         this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void spiner01StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner01StateChanged
        // TODO add your handling code here:
         c1= Integer.parseInt(this.spiner01.getValue().toString());
    }//GEN-LAST:event_spiner01StateChanged

    private void spineer02StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spineer02StateChanged
        // TODO add your handling code here:
              c2= Integer.parseInt(this.spineer02.getValue().toString());
    }//GEN-LAST:event_spineer02StateChanged

    private void spinner03StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner03StateChanged
        // TODO add your handling code here:
              c3= Integer.parseInt(this.spinner03.getValue().toString());
    }//GEN-LAST:event_spinner03StateChanged

    private void spinner04StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner04StateChanged
        // TODO add your handling code here:
             c4= Integer.parseInt(this.spinner04.getValue().toString());
    }//GEN-LAST:event_spinner04StateChanged

    private void spinner05AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_spinner05AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_spinner05AncestorAdded

    private void spinner05StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner05StateChanged
        // TODO add your handling code here:
             c5= Integer.parseInt(this.spinner05.getValue().toString());
    }//GEN-LAST:event_spinner05StateChanged

    private void spinner06StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner06StateChanged
        // TODO add your handling code here:
             c6= Integer.parseInt(this.spinner06.getValue().toString());
    }//GEN-LAST:event_spinner06StateChanged

    private void spinner07StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner07StateChanged
        // TODO add your handling code here:
             c7= Integer.parseInt(this.spinner07.getValue().toString());
    }//GEN-LAST:event_spinner07StateChanged

    private void spinner08StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner08StateChanged
        // TODO add your handling code here:
             c8= Integer.parseInt(this.spinner08.getValue().toString());
    }//GEN-LAST:event_spinner08StateChanged

    private void spinner09StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner09StateChanged
        // TODO add your handling code here:
             c9= Integer.parseInt(this.spinner09.getValue().toString());
    }//GEN-LAST:event_spinner09StateChanged

    private void spinner10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner10StateChanged
        // TODO add your handling code here:
             c10= Integer.parseInt(this.spinner10.getValue().toString());
    }//GEN-LAST:event_spinner10StateChanged

    private void spinner11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner11StateChanged
        // TODO add your handling code here:
             c11= Integer.parseInt(this.spinner11.getValue().toString());
    }//GEN-LAST:event_spinner11StateChanged

    private void spinner12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner12StateChanged
        // TODO add your handling code here:
             c12= Integer.parseInt(this.spinner12.getValue().toString());
    }//GEN-LAST:event_spinner12StateChanged

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();

        if (c1>0){
        añadir.setProducto("Cafetera Electriva- Electrolux");
        añadir.setPresio(149.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c1);
        añadir.setSubTotal(añadir.getPresio()*c1);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e1.setValue(0);

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();

        if(c2>0){
        añadir.setProducto("Batidora 7 Velocidades");
        añadir.setPresio(89.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c2);
        añadir.setSubTotal(añadir.getPresio()*c2);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e2.setValue(0);

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();

        if (c3>0){
        añadir.setProducto("Aspiradora - Electrolux");
        añadir.setPresio(149.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c3);
        añadir.setSubTotal(añadir.getPresio()*c3);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e3.setValue(0);

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
          sonido3.play();

        if(c4>0){
        datos_tienda añadir = new datos_tienda();

        añadir.setProducto("Imaco Tostadora 850w");
        añadir.setPresio(120.90);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c4);
        añadir.setSubTotal(añadir.getPresio()*c4);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e4.setValue(0);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();
 if (c5>0){
        añadir.setProducto("Ventidalor Recargable ");
        añadir.setPresio(39.90);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c5);
        añadir.setSubTotal(añadir.getPresio()*c5);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
 }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e5.setValue(0);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();

        if(c6>0){
        añadir.setProducto("Sabdiwchera Electrica 140w");
        añadir.setPresio(129.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c6);
        añadir.setSubTotal(añadir.getPresio()*c6);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e6.setValue(0);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();

        if(c7>0){
        añadir.setProducto("Explimidor de Frutas Recargable");
        añadir.setPresio(153.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c7);
        añadir.setSubTotal(añadir.getPresio()*c7);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e7.setValue(0);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
        datos_tienda añadir = new datos_tienda();
 if (c8>0){
        añadir.setProducto("Freidora de Aire  - Oster");
        añadir.setPresio(399.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c8);
        añadir.setSubTotal(añadir.getPresio()*c8);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
 }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e8.setValue(0);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
           datos_tienda añadir = new datos_tienda();

           if(c9>0){
        añadir.setProducto("Refrijeradora & conjeladora 345L");
        añadir.setPresio(999.90);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c9);
        añadir.setSubTotal(añadir.getPresio()*c9);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
           }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e9.setValue(0);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
            datos_tienda añadir = new datos_tienda();

            if(c10>0){
        añadir.setProducto("Microondas & Horno - Electrolux");
        añadir.setPresio(489.00);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c10);
        añadir.setSubTotal(añadir.getPresio()*c10);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
            }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e10.setValue(0);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
          sonido3.play();
                datos_tienda añadir = new datos_tienda();

                if(c12>0){
        añadir.setProducto("Lavadora Dijital 15kl");
        añadir.setPresio(1749.10);
        añadir.setTipo_producto("Electrodomesticos");
        añadir.setCantidad(c12);
        añadir.setSubTotal(añadir.getPresio()*c12);

        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
        añadir.setId(clase_gloval.inicio.size());

        clase_gloval.inicio.add(añadir);

        ex.mensaje();
                }else{
            JOptionPane.showMessageDialog(null,"Por favor Ingresar la cantidad a comprar");
        }
        //para limpiar mi spinner
        e12.setValue(0);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
             sonido4.play();
         // buscar eletrodomesticos
          String bpro=this.txtbuscar.getText();
           if (bpro.equalsIgnoreCase("cafetera") || bpro.equalsIgnoreCase("cafetera electrica") || bpro.equalsIgnoreCase("batidora")|| bpro.equalsIgnoreCase("aspiradora")|| bpro.equalsIgnoreCase("tostadora")
                   || bpro.equalsIgnoreCase("ventilador")|| bpro.equalsIgnoreCase("saddiwchera")|| bpro.equalsIgnoreCase("exprimidor")|| bpro.equalsIgnoreCase("exprimidor de frutas")
                   || bpro.equalsIgnoreCase("freidora")|| bpro.equalsIgnoreCase("refrijeradora")|| bpro.equalsIgnoreCase("microondas")|| bpro.equalsIgnoreCase("cosina")|| bpro.equalsIgnoreCase("lavadora")){
                 
                  frmelectrodomesticos abrir = new frmelectrodomesticos();
        abrir.setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );
           }else{
               if (bpro.equalsIgnoreCase("zapatilla") || bpro.equalsIgnoreCase("volzo") || bpro.equalsIgnoreCase("bolzo")|| bpro.equalsIgnoreCase("cartera")|| bpro.equalsIgnoreCase("tostadora")){
                 
         frmVolsos abrir = new frmVolsos();
         abrir.setVisible(true);
         this.dispose();;
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );
           }else{
                    if (bpro.equalsIgnoreCase("arroz") || bpro.equalsIgnoreCase("lenteja") || bpro.equalsIgnoreCase("canchita")|| bpro.equalsIgnoreCase("popcord")|| bpro.equalsIgnoreCase("canchita popcord")
                   || bpro.equalsIgnoreCase("sal")|| bpro.equalsIgnoreCase("azucar")|| bpro.equalsIgnoreCase("aceite")|| bpro.equalsIgnoreCase("aceite oliva")
                   || bpro.equalsIgnoreCase("aji panca")|| bpro.equalsIgnoreCase("aji")|| bpro.equalsIgnoreCase("mayonesa")|| bpro.equalsIgnoreCase("pomarola")|| bpro.equalsIgnoreCase("tarri")){
                 
           frmViveres abrir = new frmViveres();
        abrir.setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );
                        }else{
                               if (bpro.equalsIgnoreCase("melon") || bpro.equalsIgnoreCase("mango") || bpro.equalsIgnoreCase("papaya")|| bpro.equalsIgnoreCase("melocoton")|| bpro.equalsIgnoreCase("piña")
                   || bpro.equalsIgnoreCase("arandanos")|| bpro.equalsIgnoreCase("maraculla")|| bpro.equalsIgnoreCase("maracuya")|| bpro.equalsIgnoreCase("choclo")
                   || bpro.equalsIgnoreCase("pepino")|| bpro.equalsIgnoreCase("cebolla")|| bpro.equalsIgnoreCase("tomate")|| bpro.equalsIgnoreCase("tomates")|| bpro.equalsIgnoreCase("champiniones")){
                 
                frmVerduras abrir = new frmVerduras();
        abrir.setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );
                             }else{
                                             if (bpro.equalsIgnoreCase("deliniador") || bpro.equalsIgnoreCase("esmalte") || bpro.equalsIgnoreCase("crema")|| bpro.equalsIgnoreCase("brillo")|| bpro.equalsIgnoreCase("brillo labial")
                   || bpro.equalsIgnoreCase("labial")|| bpro.equalsIgnoreCase("bronceador")|| bpro.equalsIgnoreCase("cepillo lavial")|| bpro.equalsIgnoreCase("labial liquida")
                   || bpro.equalsIgnoreCase("maquillaje")|| bpro.equalsIgnoreCase("mascara de pestaña")|| bpro.equalsIgnoreCase("pack de maquillaje")){
                 
             frmVelleza abrir = new frmVelleza();
        abrir.setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );
                                         }else{
                                                                 if (bpro.equalsIgnoreCase("yogers") || bpro.equalsIgnoreCase("polera") || bpro.equalsIgnoreCase("gorra")|| bpro.equalsIgnoreCase("gorras")|| bpro.equalsIgnoreCase("conjuntos")
                   || bpro.equalsIgnoreCase("pantalon")|| bpro.equalsIgnoreCase("pantalon vaquero")|| bpro.equalsIgnoreCase("vestido")|| bpro.equalsIgnoreCase("top")
                   || bpro.equalsIgnoreCase("yin")|| bpro.equalsIgnoreCase("polera yin")|| bpro.equalsIgnoreCase("polera anime")|| bpro.equalsIgnoreCase("polera negra")){
       
         frmModa abrir = new frmModa();
        abrir.setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );
                                                      }else{
                            if (bpro.equalsIgnoreCase("amburgesa") || bpro.equalsIgnoreCase("amburgesa con res") || bpro.equalsIgnoreCase("amburgesa de chorizo")|| bpro.equalsIgnoreCase("chiza")|| bpro.equalsIgnoreCase("pizza")
                   || bpro.equalsIgnoreCase("pizza con peperoni")|| bpro.equalsIgnoreCase("combos de comida")){
       
          frmcomidaR abrir = new frmcomidaR();
        abrir.setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(rootPane,"Productos relacionados"  );     
                                                                 }else{
                                     JOptionPane.showMessageDialog(rootPane,"Producto no encontrado"  );
                            }
                                             }
                               }
                    }
               }
           }
           
          
//               
//               
               
           }     
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnrecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecargarActionPerformed
        // TODO add your handling code here:
             sonido4.play();
           frmrecargar abrir = new frmrecargar();
        abrir.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnrecargarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmelectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmelectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmelectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmelectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmelectrodomesticos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnVelleza;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncarrito;
    private javax.swing.JButton btncomida;
    private javax.swing.JButton btnfrutas;
    private javax.swing.JButton btnmoda;
    private javax.swing.JButton btnrecargar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnviveres;
    private javax.swing.JButton btnvolsosyzapatos;
    private javax.swing.JLabel fondo01;
    private javax.swing.JLabel fondo02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JLabel lblpro1;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JSpinner spineer02;
    private javax.swing.JSpinner spiner01;
    private javax.swing.JSpinner spinner03;
    private javax.swing.JSpinner spinner04;
    private javax.swing.JSpinner spinner05;
    private javax.swing.JSpinner spinner06;
    private javax.swing.JSpinner spinner07;
    private javax.swing.JSpinner spinner08;
    private javax.swing.JSpinner spinner09;
    private javax.swing.JSpinner spinner10;
    private javax.swing.JSpinner spinner11;
    private javax.swing.JSpinner spinner12;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
