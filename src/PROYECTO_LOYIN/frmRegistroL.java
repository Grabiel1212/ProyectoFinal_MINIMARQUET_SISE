/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PROYECTO_LOYIN;

import CONTROL.proceso;
import REGISTRO.empleado;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author grabiel
 */
public class frmRegistroL extends javax.swing.JFrame {

  //llamo ami objeto o clase
    proceso objp = new proceso();
    
      AudioClip sonido2;
      
   public frmRegistroL() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        sonido2=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonido_clik.wav"));
        
        
        
//           cambiar modo moche
          if (  proceso.modooscuro ) {
           this.fondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_login/fondo-black-negro.jpg")));
           this.fondo02.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondodarkcorero02.jpg")));
           this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/logo_smart-fondonegro.png")));
           this.lblnombre.setForeground(Color.WHITE);
           this.lblapellido.setForeground(Color.WHITE);
           this.lblcorreo.setForeground(Color.WHITE);
           this.lbltelefono.setForeground(Color.WHITE);
           this.lblcontra.setForeground(Color.WHITE);
           this.lblcontra02.setForeground(Color.WHITE);
//            
       this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondondito_rojo_noche.png")));
        this.lblmini.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_verde_noche.jpg")));
         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_amarilo_nocche.png")));
         
             this.txtnombre.setForeground(Color.gray);
           this.txtapellidos.setForeground(Color.gray);
           this.txtcoreo.setForeground(Color.gray);
           this.txttelefono.setForeground(Color.gray);
           this.txtcontraseña.setForeground(Color.gray);
           this.txtcomprovarcontra.setForeground(Color.gray);
           
             this.txtnombre.setBackground(Color.decode("#090909"));
           this.txtapellidos.setBackground(Color.decode("#090909"));
           this.txtcoreo.setBackground(Color.decode("#090909"));
           this.txttelefono.setBackground(Color.decode("#090909"));
           this.txtcontraseña.setBackground(Color.decode("#090909"));
           this.txtcomprovarcontra.setBackground(Color.decode("#090909"));
         
         
        } 
    }
   
   //metood para abrir 
  public void abrir(){
         login abrir =new login ();
        this.dispose();
        abrir.setVisible(true);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblcontra = new javax.swing.JLabel();
        lblcontra02 = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        btmcrearcuenta = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        lblapellido = new javax.swing.JLabel();
        txtcomprovarcontra = new javax.swing.JPasswordField();
        lblcorreo = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtcoreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fondo02 = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();
        lblcuadrado = new javax.swing.JLabel();
        fondo01 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcontra.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblcontra.setText("Contraseña :");
        jPanel2.add(lblcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        lblcontra02.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblcontra02.setText("Confirmar contraseña : ");
        jPanel2.add(lblcontra02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        lbltelefono.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lbltelefono.setText("Telefono :");
        jPanel2.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txtnombre.setBackground(new java.awt.Color(236, 236, 236));
        txtnombre.setForeground(new java.awt.Color(204, 204, 204));
        txtnombre.setText("ingresar usuario");
        txtnombre.setBorder(null);
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreMouseClicked(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 151, -1));

        txttelefono.setBackground(new java.awt.Color(236, 236, 236));
        txttelefono.setForeground(new java.awt.Color(204, 204, 204));
        txttelefono.setText("ingresar movil");
        txttelefono.setBorder(null);
        txttelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttelefonoMouseClicked(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 151, -1));

        txtapellidos.setBackground(new java.awt.Color(236, 236, 236));
        txtapellidos.setForeground(new java.awt.Color(204, 204, 204));
        txtapellidos.setText("ingresar apellidos");
        txtapellidos.setBorder(null);
        txtapellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidosMouseClicked(evt);
            }
        });
        jPanel2.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 151, -1));

        btmcrearcuenta.setBackground(new java.awt.Color(236, 236, 236));
        btmcrearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        btmcrearcuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newbotton_crear.png"))); // NOI18N
        btmcrearcuenta.setBorder(null);
        btmcrearcuenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newBotton_presionadoRegresar.png"))); // NOI18N
        btmcrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmcrearcuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btmcrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, 30));

        lblnombre.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblnombre.setText("Nombre :");
        jPanel2.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_regresar.png"))); // NOI18N
        btnregresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_presionarRegresar.png"))); // NOI18N
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 80, 30));

        lblapellido.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblapellido.setText("Apellidos :");
        jPanel2.add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtcomprovarcontra.setBackground(new java.awt.Color(236, 236, 236));
        txtcomprovarcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcomprovarcontra.setText("******");
        txtcomprovarcontra.setBorder(null);
        txtcomprovarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcomprovarcontraMouseClicked(evt);
            }
        });
        txtcomprovarcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcomprovarcontraKeyPressed(evt);
            }
        });
        jPanel2.add(txtcomprovarcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 120, 27));

        lblcorreo.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lblcorreo.setText("Correo Electronico :");
        jPanel2.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtcontraseña.setBackground(new java.awt.Color(236, 236, 236));
        txtcontraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtcontraseña.setText("*******");
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontraseñaMouseClicked(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        jPanel2.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, 27));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 170, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 140, 20));

        txtcoreo.setBackground(new java.awt.Color(236, 236, 236));
        txtcoreo.setForeground(new java.awt.Color(204, 204, 204));
        txtcoreo.setText("ingresar correo");
        txtcoreo.setBorder(null);
        txtcoreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcoreoMouseClicked(evt);
            }
        });
        txtcoreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcoreoKeyPressed(evt);
            }
        });
        jPanel2.add(txtcoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/logo_smart.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 150, 50));

        fondo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/z1 (2).jpg"))); // NOI18N
        jPanel2.add(fondo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 360, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 360, 480));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/redondito_1.png"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 30, 30));

        lblmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/botton_verde_claro.png"))); // NOI18N
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });
        jPanel1.add(lblmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 30, 30));

        lblcuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/redonditoamarillo_dia.png"))); // NOI18N
        lblcuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcuadradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblcuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 30));

        fondo01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_login/Abstract background design (2).jpeg"))); // NOI18N
        jPanel1.add(fondo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmcrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmcrearcuentaActionPerformed
        //
        sonido2.play();
   
       String  nombre = this.txtnombre.getText();
       String  apellido = this.txtapellidos.getText();
       String  coreo = this.txtcoreo.getText();
       int telefono =Integer.parseInt(this.txttelefono.getText());
       double saldo=0;
       
       String pasword=new String (this.txtcontraseña.getPassword());
       String  contra = this.txtcontraseña.getText();
       String coprovar=this.txtcomprovarcontra.getText();
       
     if(this.txtcontraseña.getText().equals(coprovar)){
         
         if (!nombre.isEmpty()&& !apellido.isEmpty()&& !coreo.isEmpty() && !this.txttelefono.getText().equals("")){
             if(!this.txtnombre.getText().equals("ingresar usuario") && !this.txtapellidos.getText().equals("ingresar apellidos")&& !this.txtcoreo.getText().equals("ingresar correo")&&!this.txttelefono.getText().equals("ingresar movil")){
     
             
        empleado obje;
           obje = new empleado(nombre,apellido,coreo,telefono,contra,saldo);
          JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");  
      abrir();
          
         
       try{
       
       objp.insertar(obje);
      
       
       }catch(Exception e){
           
       }
         }else{
              JOptionPane.showMessageDialog(rootPane, "No Dejar Espacios Vacios");
              
        }
         }else{
               JOptionPane.showMessageDialog(rootPane, "No Dejar Espacios Vacios");
         }
     }else{
          JOptionPane.showMessageDialog(rootPane, "error");
     }
            
      
    
    }//GEN-LAST:event_btmcrearcuentaActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
      
        
            sonido2.play();
       int n= JOptionPane.showConfirmDialog(null,"¿ Esta seguro que desea Salir ?");
        
        if (n==JOptionPane.OK_OPTION){
               abrir();
        }else if ( n==JOptionPane.CANCEL_OPTION){
//            JOptionPane.showMessageDialog(null,"terminar con su registro");
        }else if (n==JOptionPane.NO_OPTION){
//             JOptionPane.showMessageDialog(null,"terminar con su registro");
        }
     
    }//GEN-LAST:event_btnregresarActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        // TODO add your handling code here:
        
         //asemos una restrincion para la cantidad de numero
        if(this.txttelefono.getText().length()>=9){
            evt.consume();
        }
        
        //asemos una restrincion solo para numeros
        int key = evt.getKeyChar();
        
        boolean  numeros = key >=48 && key<=57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseClicked
        // TODO add your handling code here:
        
        if (  proceso.modooscuro ) {
               if(this.txtnombre.getText().equals("ingresar usuario")){
      this.txtnombre.setText("");
      this.txtnombre.setForeground(Color.white);
        }
        
      
      
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
          
      if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }
     
   if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
   
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
        }
        
      if(this.txtnombre.getText().equals("ingresar usuario")){
      this.txtnombre.setText("");
      this.txtnombre.setForeground(Color.black);
        }
        
      
      
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
          
      if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }
     
   if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
   
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnombreMouseClicked

    private void txtapellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidosMouseClicked
        // TODO add your handling code here:
           if (  proceso.modooscuro ) {
                if (this.txtapellidos.getText().equals("ingresar apellidos")){
            this.txtapellidos.setText("");
           this.txtapellidos.setForeground(Color.white);
        }
        
         if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
      if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }
   
      
   if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
   
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
           }
        
        
        
           if (this.txtapellidos.getText().equals("ingresar apellidos")){
            this.txtapellidos.setText("");
           this.txtapellidos.setForeground(Color.black);
        }
        
         if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
      if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }
   
      
   if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
   
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
         
        
    }//GEN-LAST:event_txtapellidosMouseClicked

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed

    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void txtcomprovarcontraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomprovarcontraKeyPressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtcomprovarcontraKeyPressed

    private void txtcoreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcoreoKeyPressed
        // TODO add your handling code here:

      
    }//GEN-LAST:event_txtcoreoKeyPressed

    private void txtcoreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcoreoMouseClicked
        // TODO add your handling code here:
            if (  proceso.modooscuro ) {
                
             if (this.txtcoreo.getText().equals("ingresar correo")){
            this.txtcoreo.setText("");
           this.txtcoreo.setForeground(Color.white);
        }
           if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
      if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
   
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
            }
        
        
        
             if (this.txtcoreo.getText().equals("ingresar correo")){
            this.txtcoreo.setText("");
           this.txtcoreo.setForeground(Color.black);
        }
           if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
      if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
   
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
         
    }//GEN-LAST:event_txtcoreoMouseClicked

    private void txttelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefonoMouseClicked
        // TODO add your handling code here:
        
            if (  proceso.modooscuro ) {
                 
              if (this.txttelefono.getText().equals("ingresar movil")){
            this.txttelefono.setText("");
           this.txttelefono.setForeground(Color.white);
        }
                     if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
        if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }
        
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
        
            }
        
        
        
        
        
              if (this.txttelefono.getText().equals("ingresar movil")){
            this.txttelefono.setText("");
           this.txttelefono.setForeground(Color.black);
        }
                     if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
        if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }
        
      if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
   
        if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txttelefonoMouseClicked

    private void txtcontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMouseClicked
        // TODO add your handling code here:
         if (  proceso.modooscuro ) {
                           if (String.valueOf(this.txtcontraseña.getPassword()).equals("*******")){
            this.txtcontraseña.setText("");
           this.txtcontraseña.setForeground(Color.white);
        }
                   
                         if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
        if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }    
          if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
          
           if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
            
         }
        
        
        
        
                   if (String.valueOf(this.txtcontraseña.getPassword()).equals("*******")){
            this.txtcontraseña.setText("");
           this.txtcontraseña.setForeground(Color.black);
        }
                   
                         if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
        if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }    
          if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
          
           if (String.valueOf(this.txtcomprovarcontra.getPassword()).isEmpty()){
             this.txtcomprovarcontra.setText("******");
     this.txtcomprovarcontra.setForeground(Color.gray);
        }
                   
    }//GEN-LAST:event_txtcontraseñaMouseClicked

    private void txtcomprovarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomprovarcontraMouseClicked
        // TODO add your handling code here:
        if (  proceso.modooscuro ) {
               
                    if (String.valueOf(this.txtcomprovarcontra.getPassword()).equals("******")){
            this.txtcomprovarcontra.setText("");
           this.txtcomprovarcontra.setForeground(Color.white);
        }
                              
                         if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
        if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }    
          if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
           if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
        
        }
        
        
                    if (String.valueOf(this.txtcomprovarcontra.getPassword()).equals("******")){
            this.txtcomprovarcontra.setText("");
           this.txtcomprovarcontra.setForeground(Color.black);
        }
                              
                         if(this.txtnombre.getText().isEmpty()){
               this.txtnombre.setText("ingresar usuario");
                this.txtnombre.setForeground(Color.gray);
         }
              
     if (this.txtapellidos.getText().isEmpty()){
     this.txtapellidos.setText("ingresar apellidos");
     this.txtapellidos.setForeground(Color.gray);
        }
        if (this.txtcoreo.getText().isEmpty()){
     this.txtcoreo.setText("ingresar correo");
     this.txtcoreo.setForeground(Color.gray);
        }    
          if (this.txttelefono.getText().isEmpty()){
     this.txttelefono.setText("ingresar movil");
     this.txttelefono.setForeground(Color.gray);
        }
           if (String.valueOf(this.txtcontraseña.getPassword()).isEmpty()){
             this.txtcontraseña.setText("*******");
     this.txtcontraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcomprovarcontraMouseClicked

    private void lblsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsalirMouseClicked
        // TODO add your handling code here:
            sonido2.play();
        this.dispose();
    }//GEN-LAST:event_lblsalirMouseClicked

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        // TODO add your handling code here:
            sonido2.play();
           this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked

    private void lblcuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcuadradoMouseClicked
        // TODO add your handling code here:
            sonido2.play();
        boolean agrandado=false;
            if (agrandado) {
                    setSize(new Dimension(960, 710));
                  
                    agrandado = false;
                } else {
                    setSize(new Dimension(1200, 1010));
                    this.setLocationRelativeTo(this);
                  
                    agrandado = true;
                }
    }//GEN-LAST:event_lblcuadradoMouseClicked

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
            java.util.logging.Logger.getLogger(frmRegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmcrearcuenta;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel fondo01;
    private javax.swing.JLabel fondo02;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblcontra02;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblcuadrado;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JPasswordField txtcomprovarcontra;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcoreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
