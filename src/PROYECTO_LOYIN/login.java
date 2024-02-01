/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PROYECTO_LOYIN;

import CONTROL.proceso;
import REGISTRO.empleado;
import clases_frm.claseUsuario;
import clases_frm.usuarioGenaral;
import frm_tienda.anuncioSISE;
import frm_tienda.clase_gloval;
import frm_tienda.portada;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;




/**
 *
 * @author grabiel
 */
public class login extends javax.swing.JFrame {
    
   //llamamos anuestra clase
  
//bariante paraq cambiar le modo oscuro
    boolean modoOscuro=false;
   boolean agrandado = false;
  int intentos =3;

  
  //para nuestro cornometro
  int min=0, seg=15, ora=0;
  Timer tiempo;
  int valorT=15;
  boolean bandera=true;
  boolean parar=true;

  AudioClip sonido;
  AudioClip sonido2;

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
//     jPanel2.setBackground(new Color(21, 11, 0, 46));
  
    // Establecer que el formulario sea visible
              setSize(new Dimension(960, 710));
        setVisible(true);
        
             sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/audioMujerlogin.wav"));
             sonido2=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonido_clik.wav"));
             
             
           if (  proceso.modooscuro ) {
                  this.btnentrar.setBackground(Color.black);
              //para el fondo 01 negro
          this.lblfondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fondo-black-negro.jpg")));
          //para el panel 02 del login
          this.lblfondo02.setIcon(new ImageIcon(getClass().getResource("/imagen_login/dark02 (1).jpg")));
          //imagen del usuario
          this.lblfondousuario.setIcon(new ImageIcon(getClass().getResource("/imagen_login/ICONO_MODONOCTURNO_USUARIO (2).jpg")));
          
               //cambipo de letra 
         this.txtusuario.setBackground(Color.black);
  this.txtusuario.setForeground(Color.gray);
          this.txtcontraseña.setBackground(Color.black);
 this.txtcontraseña.setForeground(Color.gray);
 
  this.jLabel1.setForeground(Color.white);
  this.jLabel2.setForeground(Color.white);
           //cambio de letra
           this.lblolvidastescontraseña.setForeground(Color.WHITE);
           this.lblnotienesunacuenta.setForeground(Color.WHITE);
           this.lblresgistrate.setForeground(Color.WHITE);
           
            this.lblora.setForeground(Color.WHITE);
            this.lblmin.setForeground(Color.WHITE);
            this.lblseg.setForeground(Color.WHITE);
            
            //cambio del color del fondo
       jPanel2.setBackground(Color.black);
       
       //cambiar el color de contorno de los redonditos
       
       this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondondito_rojo_noche.png")));
        this.lblminimizar.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_verde_noche.jpg")));
         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_amarilo_nocche.png")));
       
         
         this.lbldiseñofecha.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fecha_modi.png")));
       this.lbllineas.setIcon(new ImageIcon(getClass().getResource("/imagen_login/diseño_lineas.png")));
       
  
       
       
       
       //para el botoom que cambie de color
          this.btnmodonocturno.setIcon(new ImageIcon(getClass().getResource("/imagen_login/btton_01_cambio_blanco.png")));
       
          
        } else {
          // sinop
                     //para el fondo 01 negro
          this.lblfondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_login/Abstract background design (2).jpeg")));
          //para el panel 02 del login
          this.lblfondo02.setIcon(new ImageIcon(getClass().getResource("/imagen_login/peuqe02modi.jpg")));
          //imagen del usuario
          this.lblfondousuario.setIcon(new ImageIcon(getClass().getResource("/imagen_login/user (1).png")));
          
          //cambipo de letra 
//           this.txtusuario.setBackground(Color.decode("#000000"));
   this.txtusuario.setBackground(Color.white);
//           this.txtcontraseña.setBackground(Color.decode("#000000"));
      this.txtcontraseña.setBackground(Color.white);
           //cambio de letra
           this.lblolvidastescontraseña.setForeground(Color.black);
           this.lblnotienesunacuenta.setForeground(Color.black);
           this.lblresgistrate.setForeground(Color.black);
           
            this.lblora.setForeground(Color.black);
            this.lblmin.setForeground(Color.black);
            this.lblseg.setForeground(Color.black);
            
            //cambio del color del fondo
       jPanel2.setBackground(Color.WHITE);
       
       //cambiar el color de contorno de los redonditos
       
       this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito.png")));
        this.lblminimizar.setIcon(new ImageIcon(getClass().getResource("/imagen_login/botton_verde_claro.png")));
         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redonditoamarillo_dia.png")));
       
         
//         this.lbldiseñofecha.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fecha_modi.png")));
//       this.lbllineas.setIcon(new ImageIcon(getClass().getResource("/imagen_login/diseño_lineas.png")));
       
       
       
       
       
       //para el botoom que cambie de color
          this.btnmodonocturno.setIcon(new ImageIcon(getClass().getResource("/imagen_login/botton_modo_claro_prueva_01.png")));
        }
      
     
    
    }
     public void RestablecerI(){
       intentos=3;
            valorT+= 15;
        seg =valorT;
        min=1;
        if (seg==60){
             JOptionPane.showMessageDialog(null,"AH!! EXIDIDO LOS INTETNOS POR FAVOR INTENTE EN 24 ORAS");
       intentos=0;
       seg =60;
        min=1;
        }
     }
    
    
    // metodo para el tiemppo 
     public void TiempoRegresivo(){
         tiempo = new Timer(1000, new ActionListener() {
     
           @Override
           public void actionPerformed(ActionEvent e) {
        if (seg==0){
            seg=60;
            min--;
        }
        if (min<0){
            JOptionPane.showMessageDialog(null,"!Tiempo!");
            min=0;
            seg=0;
            tiempo.stop();
            lblseg.setText("");
            lblmin.setText("");
            RestablecerI();
       
           
            
        }else{
            seg--;
            if(seg<60){
               lblseg.setText(""+seg);
               bandera=false;
            }
             if(min<60){
               lblmin.setText(""+min);
             
            }
              if(seg<60){
               lblseg.setText(""+seg);
              
            }
        }
           }
       });
   

      
  
  tiempo.start();
     }
   
  
     //asemos o
     //para cmabiar modo nochhe
     public void CambiarModo(){
           proceso.modooscuro = !   proceso.modooscuro ; // cambia el estado del modo oscuro
        if (  proceso.modooscuro ) {
              //para el fondo 01 negro
            this.lblfondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fondo-black-negro.jpg")));
          //para el panel 02 del login
          this.lblfondo02.setIcon(new ImageIcon(getClass().getResource("/imagen_login/dark02 (1).jpg")));
          //imagen del usuario
          this.lblfondousuario.setIcon(new ImageIcon(getClass().getResource("/imagen_login/ICONO_MODONOCTURNO_USUARIO (2).jpg")));
          
          //cambipo de letra 
         this.txtusuario.setBackground(Color.black);
  this.txtusuario.setForeground(Color.gray);
          this.txtcontraseña.setBackground(Color.black);
 this.txtcontraseña.setForeground(Color.gray);
 
  this.jLabel1.setForeground(Color.white);
  this.jLabel2.setForeground(Color.white);
 
 
 
           //cambio de letra
           this.lblolvidastescontraseña.setForeground(Color.WHITE);
           this.lblnotienesunacuenta.setForeground(Color.WHITE);
           this.lblresgistrate.setForeground(Color.WHITE);
           
            this.lblora.setForeground(Color.WHITE);
            this.lblmin.setForeground(Color.WHITE);
            this.lblseg.setForeground(Color.WHITE);
            
            //cambio del color del fondo
       jPanel2.setBackground(Color.black);
       
       //cambiar el color de contorno de los redonditos
       
       this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondondito_rojo_noche.png")));
        this.lblminimizar.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_verde_noche.jpg")));
         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_amarilo_nocche.png")));
       
         
         this.lbldiseñofecha.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fecha_modi.png")));
       this.lbllineas.setIcon(new ImageIcon(getClass().getResource("/imagen_login/diseño_lineas.png")));
       
       
       
       
       
       //para el botoom que cambie de color
          this.btnmodonocturno.setIcon(new ImageIcon(getClass().getResource("/imagen_login/btton_01_cambio_blanco.png")));
          
        } else {

  login cambiar = new login();
             this.dispose();
            cambiar.setVisible(true);
     }
     } 
     
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblora = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnentrar = new javax.swing.JButton();
        lblseg = new javax.swing.JLabel();
        lblfondousuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblolvidastescontraseña = new javax.swing.JLabel();
        lblnotienesunacuenta = new javax.swing.JLabel();
        lblresgistrate = new javax.swing.JLabel();
        lbldiseñofecha = new javax.swing.JLabel();
        lbllineas = new javax.swing.JLabel();
        lbladministrados = new javax.swing.JLabel();
        lblfondo02 = new javax.swing.JLabel();
        btnmodonocturno = new javax.swing.JButton();
        lblsalir = new javax.swing.JLabel();
        lblcuadrado = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        lblfondo01 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblora.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jPanel2.add(lblora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 20, 20));

        txtcontraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcontraseña.setText("*******");
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraseñaMousePressed(evt);
            }
        });
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, 30));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        lblmin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jPanel2.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 20, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 190, 20));

        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setText("Ingrese su nombre usuario");
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 180, 30));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        btnentrar.setBackground(new java.awt.Color(255, 255, 255));
        btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/bottonlogin_04.png"))); // NOI18N
        btnentrar.setBorder(null);
        btnentrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/botonpresionado.png"))); // NOI18N
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 90, 40));

        lblseg.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jPanel2.add(lblseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 20, 20));

        lblfondousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/user (1).png"))); // NOI18N
        jPanel2.add(lblfondousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 140, 170));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 190, 10));

        lblolvidastescontraseña.setBackground(new java.awt.Color(255, 255, 255));
        lblolvidastescontraseña.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblolvidastescontraseña.setText("¿ olvidastes tu contraseña ?");
        lblolvidastescontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblolvidastescontraseñaMouseClicked(evt);
            }
        });
        jPanel2.add(lblolvidastescontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 20));

        lblnotienesunacuenta.setText("¿No tienes una cuenta?");
        jPanel2.add(lblnotienesunacuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        lblresgistrate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblresgistrate.setText("Registrate");
        lblresgistrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblresgistrateMouseClicked(evt);
            }
        });
        jPanel2.add(lblresgistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));
        jPanel2.add(lbldiseñofecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 400, 300, 80));
        jPanel2.add(lbllineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, 110));

        lbladministrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladministradosMouseClicked(evt);
            }
        });
        jPanel2.add(lbladministrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));

        lblfondo02.setBackground(new java.awt.Color(255, 255, 255));
        lblfondo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/peuqe02modi.jpg"))); // NOI18N
        jPanel2.add(lblfondo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 320, 510));

        btnmodonocturno.setBackground(new java.awt.Color(0, 65, 97));
        btnmodonocturno.setForeground(new java.awt.Color(255, 255, 255));
        btnmodonocturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/botton_modo_claro_prueva_01.png"))); // NOI18N
        btnmodonocturno.setBorder(null);
        btnmodonocturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodonocturnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodonocturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        lblsalir.setFont(new java.awt.Font("Trebuchet MS", 1, 100)); // NOI18N
        lblsalir.setForeground(new java.awt.Color(255, 0, 51));
        lblsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/redondito.png"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 30, 30));

        lblcuadrado.setFont(new java.awt.Font("Trebuchet MS", 1, 100)); // NOI18N
        lblcuadrado.setForeground(new java.awt.Color(255, 255, 0));
        lblcuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/redonditoamarillo_dia.png"))); // NOI18N
        lblcuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcuadradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblcuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 20, 30));

        lblminimizar.setFont(new java.awt.Font("Trebuchet MS", 1, 100)); // NOI18N
        lblminimizar.setForeground(new java.awt.Color(0, 204, 51));
        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/botton_verde_claro.png"))); // NOI18N
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });
        jPanel1.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 20, 50));

        lblfondo01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/Abstract background design (2).jpeg"))); // NOI18N
        jPanel1.add(lblfondo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
      // creo mi objeto
      claseUsuario enviar =usuarioGenaral.transferencia;
         
       
  String us="admin";
  String pas="admin";
  
  
            
        if (!this.txtusuario.getText().isEmpty()){
  
          String pasword=new String (this.txtcontraseña.getPassword());
          if (this.txtusuario.getText().equals(us) && pasword.equals(pas)){
           ADMINISTRADOR fr = new ADMINISTRADOR();
           fr.setVisible(true);
           this.dispose();
          
      }
        }


sonido2.play();

String usuario = this.txtusuario.getText();
enviar.setUsuario(usuario);
    String contraseña =this.txtcontraseña.getText();
    if (intentos >0){
    if (validarLogin(usuario, contraseña)) {
           
        JOptionPane.showMessageDialog(null, "¡Bienvenido " + usuario + "!");
        anuncioSISE abrir1 = new anuncioSISE();
        
        portada abrir = new portada();
        
        abrir.setVisible(true);
        abrir1.setVisible(true);
          this.dispose();
        
        //audio para presentar
   
sonido.play();

        
        

    } else if (intentos ==3){
             intentos= intentos-1;
             JOptionPane.showMessageDialog(null, "Le Quedan  " + intentos + " Intentos"  );
          }else if(intentos ==2){
              intentos= intentos-1;
             JOptionPane.showMessageDialog(null, "Le Quedan  " + intentos + " Intentos"  );
          }else if (intentos ==1){
              intentos= intentos-1;
              JOptionPane.showMessageDialog(null, "Le Quedan  " + intentos + " Intentos"  );
              JOptionPane.showMessageDialog(rootPane, "Intentalo Mas Tarde !!" );
              
                 TiempoRegresivo();
     
          }

    }
    }//GEN-LAST:event_btnentrarActionPerformed

    
    public boolean validarLogin(String usuarioIngresado, String contraseñaIngresada) {
    try {
        BufferedReader br = new BufferedReader(new FileReader("BD_USUARIOS.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] datos = line.split("-");
            String usuario = datos[0];
            String contraseña = datos[4];
            if (usuario.equals(usuarioIngresado) && contraseña.equals(contraseñaIngresada)) {
                br.close();
                return true;
            }
        }
        br.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        // TODO add your handling code here:
if (  proceso.modooscuro ){
      
          if(this.txtusuario.getText().equals("Ingrese su nombre usuario")){
       this.txtusuario.setText("");
      this.txtusuario.setForeground(Color.white);
        }
        
        if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
 
 }

    
          if(this.txtusuario.getText().equals("Ingrese su nombre usuario")){
       this.txtusuario.setText("");
      this.txtusuario.setForeground(Color.black);
        }
        
        if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
      /////////////
     
   
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMousePressed
        // TODO add your handling code here:
  if (  proceso.modooscuro ){
              if (String.valueOf(this.txtcontraseña.getPassword()).equals("*******")){
            this.txtcontraseña.setText("");
           this.txtcontraseña.setForeground(Color.white);
        }
        
         if(this.txtusuario.getText().isEmpty()){
               this.txtusuario.setText("Ingrese su nombre usuario");
                this.txtusuario.setForeground(Color.gray);
         }
  }
        
        
                 if (String.valueOf(this.txtcontraseña.getPassword()).equals("*******")){
            this.txtcontraseña.setText("");
           this.txtcontraseña.setForeground(Color.black);
        }
        
         if(this.txtusuario.getText().isEmpty()){
               this.txtusuario.setText("Ingrese su nombre usuario");
                this.txtusuario.setForeground(Color.gray);
         }
          
         
         //////////////
        
         
    }//GEN-LAST:event_txtcontraseñaMousePressed

     
   
    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void lblresgistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresgistrateMouseClicked
        // TODO add your handling code here:
        sonido2.play();

         frmRegistroL abrir = new frmRegistroL();
        this.dispose();
        abrir.setVisible(true);
    }//GEN-LAST:event_lblresgistrateMouseClicked

    
    private void btnmodonocturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodonocturnoActionPerformed
        // TODO add your handling code here:
        sonido2.play();
CambiarModo();
        
//        
////        if(!modoOscuro){
////            //para el fondo 01 negro
////          this.lblfondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_login/prueva_dark (2).jpg")));
////          //para el panel 02 del login
////          this.lblfondo02.setIcon(new ImageIcon(getClass().getResource("/imagen_login/dark02 (1).jpg")));
////          //imagen del usuario
////          this.lblfondousuario.setIcon(new ImageIcon(getClass().getResource("/imagen_login/ICONO_MODONOCTURNO_USUARIO (2).jpg")));
////          
////          //cambipo de letra 
//////           this.txtusuario.setBackground(Color.decode("#000000"));
////  this.txtusuario.setBackground(Color.gray);
//////           this.txtcontraseña.setBackground(Color.decode("#000000"));
//// this.txtcontraseña.setBackground(Color.gray);
////           //cambio de letra
////           this.lblolvidastescontraseña.setForeground(Color.WHITE);
////           this.lblnotienesunacuenta.setForeground(Color.WHITE);
////           this.lblresgistrate.setForeground(Color.WHITE);
////           
////            this.lblora.setForeground(Color.WHITE);
////            this.lblmin.setForeground(Color.WHITE);
////            this.lblseg.setForeground(Color.WHITE);
////            
////            //cambio del color del fondo
////       jPanel2.setBackground(Color.black);
////       
////       //cambiar el color de contorno de los redonditos
////       
////       this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondondito_rojo_noche.png")));
////        this.lblminimizar.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_verde_noche.jpg")));
////         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_amarilo_nocche.png")));
////       
////         
////         this.lbldiseñofecha.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fecha_modi.png")));
////       this.lbllineas.setIcon(new ImageIcon(getClass().getResource("/imagen_login/diseño_lineas.png")));
////       
////       
////       
////       
////       
////       //para el botoom que cambie de color
////          this.btnmodonocturno.setIcon(new ImageIcon(getClass().getResource("/imagen_login/btton_01_cambio_blanco.png")));
////          
////           modoOscuro=true;
////        }else{
////            login cambiar = new login();
////             this.dispose();
////            cambiar.setVisible(true);
////        }
//        
        
        
   
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnmodonocturnoActionPerformed

    
    
    private void lblsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsalirMouseClicked
        // TODO add your handling code here:
        sonido2.play();

        System.exit(0);
    }//GEN-LAST:event_lblsalirMouseClicked

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        // TODO add your handling code here:
        sonido2.play();

           this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void lblolvidastescontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblolvidastescontraseñaMouseClicked
        // TODO add your handling code here:
        sonido2.play();

        frm_olvidastes_contra abrir = new frm_olvidastes_contra();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblolvidastescontraseñaMouseClicked

    private void lblcuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcuadradoMouseClicked
        // TODO add your handling code here:
//        if (this.lblcuadrado.isMaximumSizeSet()){
//              setSize(1060, 1010);
//        }else{
//          setSize(960, 710);
//    }
 // Cambiar el tamaño del formulario al hacer clic en el botón
 sonido2.play();


                if (agrandado) {
                    setSize(new Dimension(960, 710));
                  
                    agrandado = false;
                } else {
                    setSize(new Dimension(1200, 1010));
                    this.setLocationRelativeTo(this);
                  
                    agrandado = true;
                }
       
        
    }//GEN-LAST:event_lblcuadradoMouseClicked

    private void lbladministradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladministradosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbladministradosMouseClicked

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnmodonocturno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbladministrados;
    private javax.swing.JLabel lblcuadrado;
    private javax.swing.JLabel lbldiseñofecha;
    private javax.swing.JLabel lblfondo01;
    private javax.swing.JLabel lblfondo02;
    private javax.swing.JLabel lblfondousuario;
    private javax.swing.JLabel lbllineas;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JLabel lblnotienesunacuenta;
    private javax.swing.JLabel lblolvidastescontraseña;
    private javax.swing.JLabel lblora;
    private javax.swing.JLabel lblresgistrate;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lblseg;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void createScene() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
