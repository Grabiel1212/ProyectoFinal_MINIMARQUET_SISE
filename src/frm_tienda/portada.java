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

/**
 *
 * @author grabiel
 */
public class portada extends javax.swing.JFrame {
//para el sonido
    AudioClip sonido;
    AudioClip sonido2;
    AudioClip sonido3;
     AudioClip sonido4;
    /**
     * Creates new form portada
     */
    public portada() {
        initComponents();
        this.setLocationRelativeTo(null);
   
        ImageIcon icono = new ImageIcon("fondooferta.gif");
          this.txtimagneoferta.setIcon(new ImageIcon("fondooferta.gif"));
        
        
        
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/clik.wav"));
       sonido2=java.applet.Applet.newAudioClip(getClass().getResource("/audios/audiodespedida.wav"));
         sonido3=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonidobutton02.wav"));
         sonido4=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonidoBotoon03.wav"));
       
      claseUsuario resibir =usuarioGenaral.transferencia;
      this.txtusuario.setText(""+resibir.getUsuario());
      
       verSaldo();
   
 if ( proceso.modooscuro ) {
     
      this.fondo0001.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-negro-grande-portada.png")));
       this.fondo002.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-lineal-portada-dark.png")));
          this.jLabel24.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-cuadrado-producto-dark.png")));
          
          //boton erlecytrodomestico
              this.btnelectrodomesticos.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-electrodomestico-dark.png")));
              this.btnelectrodomesticos.setBackground(Color.BLACK);
                this.btnelectrodomesticos.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-electrodomesticopresionado-negro.png")));
                this.btnelectrodomesticos.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-electrodomesticopresionado-negro.png")));
                
                // botton volza y zapatps
                  this.btnbosasysapatos.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/btn-volzazapatos-dark.jpg")));
              this.btnbosasysapatos.setBackground(Color.BLACK);
                this.btnbosasysapatos.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton.volzaszapatos-presionado-negro.png")));
                this.btnbosasysapatos.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton.volzaszapatos-presionado-negro.png")));
                
                //botton salus y velleza
                  this.btnsaludybelleza.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-saluvelleza-dark.png")));
              this.btnsaludybelleza.setBackground(Color.BLACK);
                this.btnsaludybelleza.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-saludvelleza-presionado-negro.png")));
                this.btnsaludybelleza.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/boton-saludvelleza-presionado-negro.png")));
                
                //botton asesorios y moda
                  this.btnasesoriosdemoda.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-aseriosyModa-dark.png")));
              this.btnasesoriosdemoda.setBackground(Color.BLACK);
                this.btnasesoriosdemoda.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-asesoriosModa-presionado-noche.png")));
                this.btnasesoriosdemoda.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-asesoriosModa-presionado-noche.png")));
                
                //botton comida rapida
                  this.btncomidarapida.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-comidaRapida-dark.png")));
              this.btncomidarapida.setBackground(Color.BLACK);
                this.btncomidarapida.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-comidaraoida-presionado-noche.png")));
                this.btncomidarapida.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-comidaraoida-presionado-noche.png")));
                
                //fruta y verduras
                  this.btnfrutasyverduras.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botoon-fytasverduras-dark.png")));
              this.btnfrutasyverduras.setBackground(Color.BLACK);
                this.btnfrutasyverduras.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-frutasVedruras-presionado-noche.png")));
                this.btnfrutasyverduras.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-frutasVedruras-presionado-noche.png")));
                
                //viveres
                  this.btnbiveres.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-viveres-dark.jpg")));
              this.btnbiveres.setBackground(Color.BLACK);
                this.btnbiveres.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-viveres-presionado-noche.png")));
                this.btnbiveres.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton-viveres-presionado-noche.png")));
                
                //boton añadir carrito
                // bton01
                this.btn01.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito-dack01.png")));
                 this.btn01.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn01.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carritopresionado-darck.png")));
                this.btn01.setBackground(Color.white);
                
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
                
                jLabel14.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/PRESIO-120-DARK.png")));
                 jLabel15.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/80.00soles-dark.png")));
                  jLabel18.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/31.60soles-drak.png")));
                  
                  //ls letras
                  jLabel7.setForeground(Color.white);
                  jLabel12.setForeground(Color.white);
                  jLabel8.setForeground(Color.white);
                  jLabel16.setForeground(Color.white);
                  jLabel9.setForeground(Color.white);
                  jLabel17.setForeground(Color.white);
                  jLabel10.setForeground(Color.white);
                  jLabel19.setForeground(Color.white);
                  jLabel11.setForeground(Color.white);
                  jLabel20.setForeground(Color.white);
                  
           
                  txtimagneoferta.setIcon(new ImageIcon("fondooferta-unscreen-dack.gif"));
                  
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
    
    public void mensaje(){
        JOptionPane.showMessageDialog(rootPane,"Se Agrego asu Carrito");
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
        jPanel2 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnrecargar = new javax.swing.JButton();
        btncerrarseccion = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        btncarrito = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        fondo002 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnelectrodomesticos = new javax.swing.JButton();
        btnsaludybelleza = new javax.swing.JButton();
        btnasesoriosdemoda = new javax.swing.JButton();
        btnbiveres = new javax.swing.JButton();
        btncomidarapida = new javax.swing.JButton();
        btnfrutasyverduras = new javax.swing.JButton();
        btnbosasysapatos = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtimagneoferta = new javax.swing.JLabel();
        fondo0001 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbuscar.setBorder(null);
        jPanel2.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 770, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/logoGrande_market.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 260, 70));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/rdondito_fondo_negro_salir.png"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });
        jPanel2.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 10, -1, -1));

        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/redondito_fondonegro_minimizar.png"))); // NOI18N
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });
        jPanel2.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 10, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/redondito_fondonegro_cuadrado.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 10, -1, -1));

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
        jPanel2.add(btnrecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 50, 80, 70));

        btncerrarseccion.setBackground(new java.awt.Color(0, 0, 0));
        btncerrarseccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/cerrar_seccion_new.png"))); // NOI18N
        btncerrarseccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncerrarseccion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/cerra_seccion_new_presionado.png"))); // NOI18N
        btncerrarseccion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/cerra_seccion_new_presionado.png"))); // NOI18N
        btncerrarseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarseccionActionPerformed(evt);
            }
        });
        jPanel2.add(btncerrarseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 50, 80, 70));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Saldo :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 10, -1, 20));

        txtsaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtsaldo.setEnabled(false);
        jPanel2.add(txtsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 10, 180, -1));

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
        jPanel2.add(btncarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 50, 80, 70));

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/buscador_lupa.png"))); // NOI18N
        btnbuscar.setBorder(null);
        btnbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/buscador_lupa_presionado.png"))); // NOI18N
        btnbuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/buscador_lupa_presionado.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 40, 70, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/barra_debuscar.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        txtusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtusuario.setEnabled(false);
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 80, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Usuario :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 10, -1, -1));
        jPanel2.add(fondo002, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnelectrodomesticos.setBackground(new java.awt.Color(255, 255, 255));
        btnelectrodomesticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/electrodomesticos.png"))); // NOI18N
        btnelectrodomesticos.setBorder(null);
        btnelectrodomesticos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/electrodomestico_presionado.png"))); // NOI18N
        btnelectrodomesticos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/electrodomestico_presionado.png"))); // NOI18N
        btnelectrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelectrodomesticosActionPerformed(evt);
            }
        });
        jPanel3.add(btnelectrodomesticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 30, 230, 40));

        btnsaludybelleza.setBackground(new java.awt.Color(255, 255, 255));
        btnsaludybelleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/new botton_salud&belleza.jpg"))); // NOI18N
        btnsaludybelleza.setBorder(null);
        btnsaludybelleza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/newsalus&velleza_presionadp.png"))); // NOI18N
        btnsaludybelleza.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/newsalus&velleza_presionadp.png"))); // NOI18N
        btnsaludybelleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaludybellezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnsaludybelleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 40));

        btnasesoriosdemoda.setBackground(new java.awt.Color(255, 255, 255));
        btnasesoriosdemoda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/Aseosrios&moda.jpg"))); // NOI18N
        btnasesoriosdemoda.setBorder(null);
        btnasesoriosdemoda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/asesorio&moda_presionado.png"))); // NOI18N
        btnasesoriosdemoda.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/asesorio&moda_presionado.png"))); // NOI18N
        btnasesoriosdemoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnasesoriosdemodaActionPerformed(evt);
            }
        });
        jPanel3.add(btnasesoriosdemoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, 40));

        btnbiveres.setBackground(new java.awt.Color(255, 255, 255));
        btnbiveres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/viveres.png"))); // NOI18N
        btnbiveres.setBorder(null);
        btnbiveres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/viveres_presionado.png"))); // NOI18N
        btnbiveres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/viveres_presionado.png"))); // NOI18N
        btnbiveres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiveresActionPerformed(evt);
            }
        });
        jPanel3.add(btnbiveres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 230, 40));

        btncomidarapida.setBackground(new java.awt.Color(255, 255, 255));
        btncomidarapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/comidaRAPIDA.png"))); // NOI18N
        btncomidarapida.setBorder(null);
        btncomidarapida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/COMIDArAPIDA_PRESIONADO.png"))); // NOI18N
        btncomidarapida.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/COMIDArAPIDA_PRESIONADO.png"))); // NOI18N
        btncomidarapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomidarapidaActionPerformed(evt);
            }
        });
        jPanel3.add(btncomidarapida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 40));

        btnfrutasyverduras.setBackground(new java.awt.Color(255, 255, 255));
        btnfrutasyverduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/frutas&verduras.png"))); // NOI18N
        btnfrutasyverduras.setBorder(null);
        btnfrutasyverduras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/frutas&verduras_presionado.png"))); // NOI18N
        btnfrutasyverduras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/frutas&verduras_presionado.png"))); // NOI18N
        btnfrutasyverduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrutasyverdurasActionPerformed(evt);
            }
        });
        jPanel3.add(btnfrutasyverduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 230, 40));

        btnbosasysapatos.setBackground(new java.awt.Color(255, 255, 255));
        btnbosasysapatos.setForeground(new java.awt.Color(255, 255, 255));
        btnbosasysapatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/newbolzas y zapatos.png"))); // NOI18N
        btnbosasysapatos.setBorder(null);
        btnbosasysapatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/volzasy zapatos _presionados.png"))); // NOI18N
        btnbosasysapatos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/volzasy zapatos _presionados.png"))); // NOI18N
        btnbosasysapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbosasysapatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnbosasysapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 40));
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 560));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 250, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/119147359_171723464533244_8336329518415589931_n.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 300, 290));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/FOItUecXIBsn80g.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 300, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/combo02_1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 150, 400, 300));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/combo_trio (1).jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 360, 310));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/combo4.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 360, 330));

        jLabel7.setText("Mega combo  Para tu cosina");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        jLabel8.setText("Super Combo especial Para Relajarte");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 460, -1, -1));

        jLabel9.setText("Combo Nutritivo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 460, 140, -1));

        jLabel10.setText("Combo tacos & gaseosa");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 910, -1, -1));

        jLabel11.setText("Super pack para tu Cosina");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 910, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("S/ 90.00");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/DESCUENTO_P1.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 80, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/descuento02.PNG"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 480, 70, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("S/ 78.99");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 480, 60, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("S/ 28.00");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 490, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/descuento03.PNG"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 940, 80, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("S/ 21.90");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 940, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("S/299.90");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 950, -1, -1));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn2.setBorder(null);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 510, 140, 30));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn3.setBorder(null);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 510, 140, 30));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn4.setBorder(null);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 980, 140, 30));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn5.setBorder(null);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 980, 140, 30));

        btn01.setBackground(new java.awt.Color(255, 255, 255));
        btn01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/botton_carrito.png"))); // NOI18N
        btn01.setBorder(null);
        btn01.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn01.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/rrrrrr.png"))); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel1.add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 140, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_productos/categorias.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
        jPanel1.add(txtimagneoferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 610, 500, 380));
        jPanel1.add(fondo0001, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1930, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnelectrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelectrodomesticosActionPerformed
        // TODO add your handling code here:
        
        sonido.play();
        
        frmelectrodomesticos abrir = new frmelectrodomesticos();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnelectrodomesticosActionPerformed

    private void btnsaludybellezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaludybellezaActionPerformed
        // TODO add your handling code here:
           sonido.play();
          frmVelleza abrir = new frmVelleza();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsaludybellezaActionPerformed

    private void btnasesoriosdemodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnasesoriosdemodaActionPerformed
        // TODO add your handling code here:
           sonido.play();
          frmModa abrir = new frmModa();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnasesoriosdemodaActionPerformed

    private void btncomidarapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomidarapidaActionPerformed
        // TODO add your handling code here:
           sonido.play();
          frmcomidaR abrir = new frmcomidaR();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncomidarapidaActionPerformed

    private void btnfrutasyverdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrutasyverdurasActionPerformed
        // TODO add your handling code here:
           sonido.play();
          frmVerduras abrir = new frmVerduras();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnfrutasyverdurasActionPerformed

    private void btnbiveresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiveresActionPerformed
        // TODO add your handling code here:
           sonido.play();
          frmViveres abrir = new frmViveres();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbiveresActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
           sonido3.play();
        mensaje();
          datos_tienda añadir = new datos_tienda();
         añadir.setProducto("Super combo Especial para relajarte");
         añadir.setPresio(78.99);
         añadir.setTipo_producto("!!Promocion!!");
         añadir.setSubTotal(añadir.getPresio());
           añadir.setSaldo(12.00);
         
           
        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
       añadir.setId(clase_gloval.inicio.size());
        
       clase_gloval.inicio.add(añadir);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
           sonido3.play();
         mensaje();
         datos_tienda añadir = new   datos_tienda();
         añadir.setProducto("Combo Nutritivo");
         añadir.setPresio(28.00);
         añadir.setTipo_producto("!!Promocion!!");
         añadir.setSubTotal(añadir.getPresio());
         
           
        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
       añadir.setId(clase_gloval.inicio.size());
        
       clase_gloval.inicio.add(añadir);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
           sonido3.play();
        mensaje();
             datos_tienda añadir = new    datos_tienda();
         añadir.setProducto("Combo tacos & Gaseosa");
         añadir.setPresio(21.90);
         añadir.setTipo_producto("!!Promocion!!");
         añadir.setSubTotal(añadir.getPresio());
         
           
        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
       añadir.setId(clase_gloval.inicio.size());
        
       clase_gloval.inicio.add(añadir);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
           sonido3.play();
     mensaje();
             datos_tienda añadir = new    datos_tienda();
         añadir.setProducto("Super pack para tu cosina");
         añadir.setPresio(299.90);
         añadir.setTipo_producto("!!Promocion!!");
         añadir.setSubTotal(añadir.getPresio());
         
           
        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
       añadir.setId(clase_gloval.inicio.size());
        
       clase_gloval.inicio.add(añadir);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        sonido3.play();
        mensaje();
        
         datos_tienda añadir = new    datos_tienda();
         añadir.setProducto("Mega combo Cosina");
         añadir.setPresio(90.00);
         añadir.setTipo_producto("!!Promocion!!");
         añadir.setSubTotal(añadir.getPresio());
         
           
        //colocamos el id y nos marque segun su pocision osea 0 , 1 , 2 ,3 etc
       añadir.setId(clase_gloval.inicio.size());
        
       clase_gloval.inicio.add(añadir);
       
         
    }//GEN-LAST:event_btn01ActionPerformed

    private void lblsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsalirMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_lblsalirMouseClicked

    private void btncarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarritoActionPerformed
        // TODO add your handling code here:
             sonido4.play();
        frmcarrito abrir = new frmcarrito();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncarritoActionPerformed

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        // TODO add your handling code here:
           this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void btncerrarseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarseccionActionPerformed
        // TODO add your handling code here:
        sonido2.play();
        login abrir = new login ();
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarseccionActionPerformed

    private void btnbosasysapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbosasysapatosActionPerformed
        // TODO add your handling code here:
          sonido.play();
         frmVolsos abrir = new frmVolsos();
         abrir.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnbosasysapatosActionPerformed

    private void btnrecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecargarActionPerformed
        // TODO add your handling code here:
             sonido4.play();
        frmrecargar abrir = new frmrecargar();
        abrir.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnrecargarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
             sonido4.play();
          claseproducto resibir =productogeneral.tranferir;
          
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

    /**
     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new portada().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnasesoriosdemoda;
    private javax.swing.JButton btnbiveres;
    private javax.swing.JButton btnbosasysapatos;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncarrito;
    private javax.swing.JButton btncerrarseccion;
    private javax.swing.JButton btncomidarapida;
    private javax.swing.JButton btnelectrodomesticos;
    private javax.swing.JButton btnfrutasyverduras;
    private javax.swing.JButton btnrecargar;
    private javax.swing.JButton btnsaludybelleza;
    private javax.swing.JLabel fondo0001;
    private javax.swing.JLabel fondo002;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel txtimagneoferta;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
