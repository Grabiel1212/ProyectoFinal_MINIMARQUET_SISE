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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author grabiel
 */
public class frmcorreoR extends javax.swing.JFrame {

    //coidgo de verificacion
     int codigo=0;
     String correoE="";
     
     
     proceso ot = new  proceso();
     
     AudioClip sonido2;
    /**
     * Creates new form frmcorreoR
     */
    public frmcorreoR() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //bloqueoo
        this.txtcodigoverificacion.enable(false);
        this.txtusuario.enable(false);
        this.txtpasword.enable(false);
        this.txtpaswordConfirmar.enable(false);
        
        
        sonido2=java.applet.Applet.newAudioClip(getClass().getResource("/audios/sonido_clik.wav"));
        
        // cambiar modo moche
         if ( proceso.modooscuro ) {
           this.lbldondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondo-coreo-dark-01.jpg")));
           this.fondo02.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondo_coreo-dark-02.png")));
            this.jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/logoMediano_market.png")));
            
              this.lblindrofucircoreo.setForeground(Color.WHITE);
                this.lblsolicitarcodigo.setForeground(Color.WHITE);  
                this.lblingresarcodigo.setForeground(Color.WHITE); 
                this.lblusuario.setForeground(Color.WHITE);
                this.lblcontra.setForeground(Color.WHITE);
                this.lblcontra02.setForeground(Color.WHITE);  
            
                this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/iconCorreo-blanco.jpg")));
                this.jSeparator1.setForeground(Color.WHITE);
                 this.jSeparator2.setForeground(Color.WHITE);
                  this.jSeparator3.setForeground(Color.WHITE);
                   this.jSeparator4.setForeground(Color.WHITE);
                    this.jSeparator5.setForeground(Color.WHITE);
                
                 this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fonco-c-02.png")));
            this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondo-c-01.png")));
            
           this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondondito_rojo_noche.png")));
        this.lblmini.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_verde_noche.jpg")));
         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_amarilo_nocche.png")));
         
         
         this.txtcoreeoelectronico.setForeground(Color.white);
          this.txtcodigoverificacion.setForeground(Color.white);
           this.txtusuario.setForeground(Color.white);
            this.txtpasword.setForeground(Color.white);
             this.txtpaswordConfirmar.setForeground(Color.white);
             
               this.txtcoreeoelectronico.setBackground(Color.black);
          this.txtcodigoverificacion.setBackground(Color.black);
           this.txtusuario.setBackground(Color.black);
            this.txtpasword.setBackground(Color.black);
             this.txtpaswordConfirmar.setBackground(Color.black);
            
        }
    }
    

    
    public void contra(){
             
         try {
        // Definir el archivo de texto
        File archivo = new File("BD_USUARIOS.txt");
        Scanner lector = new Scanner(archivo);

        // Leer el archivo y almacenar cada línea en una lista
        java.util.List<String> lineas = new java.util.ArrayList<String>();
        while (lector.hasNextLine()) {
          lineas.add(lector.nextLine());
        }
        lector.close();

        // Recorrer las líneas y buscar el correo que deseas modificar
        for (int i = 0; i < lineas.size(); i++) {
          String[] partes = lineas.get(i).split("-");
          String correo = partes[2];
          if (correo.equals(this.txtcoreeoelectronico.getText())) {
            // Modificar la contraseña en esta línea
            partes[4] = this.txtpasword.getText();

            // Actualizar la línea en la lista
            lineas.set(i, String.join("-", partes));

            // Escribir la lista actualizada de vuelta en el archivo de texto
            FileWriter escritor = new FileWriter(archivo);
            for (String linea : lineas) {
              escritor.write(linea + "\n");
            }
            escritor.close();

            JOptionPane.showMessageDialog(null, "Contraseña Modificada Exitosamente.");
            return;
          }
        }

        JOptionPane.showMessageDialog(null, "El correo ingresado no existe en el archivo.");

      } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer o escribir en el archivo");
        ex.printStackTrace();
      }
      
   

    }
    
    
    public void buscar(){
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
          String correo= partes[2];
          String usuario=partes[0];
          
          
             if (correo.equals(this.txtcoreeoelectronico.getText())) {
          
     this.txtcoreeoelectronico.enable(false);
     this.txtcodigoverificacion.enable(false);
        this.txtpasword.enable(true);
this.txtusuario.setText(usuario);
          JOptionPane.showMessageDialog(null, "Correo Electronico encontrado");
            return;
          }
         }
         
            JOptionPane.showMessageDialog(null, "Correo Herroneo");
              this.txtcoreeoelectronico.setText("");
                this.txtcodigoverificacion.setText("");
                this.txtcoreeoelectronico.enable(true);
                this.txtcodigoverificacion.enable(true);
        
        }catch(IOException ex){
             JOptionPane.showMessageDialog(null, "Error al leer o escribir en el archivo");
            ex.printStackTrace();
        }
        
                
                
    
    
    }
    
    
// para validar mi correo con mi codigo
     public  void transfer_to_email(String correo){
        String correoEnvia = "smartmarquetperu1212@gmail.com";
        String contraseña = "xharygdumkjlvlcd";
        
        String mensaje ="Su codigo de verificacion es : "+codigo;
        
        Properties objetoPEC = new Properties();
        
        objetoPEC.put("mail.smtp.host", "smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable","true");
        objetoPEC.put("mail.smtp.port","587");
        objetoPEC.setProperty("mail.smtp.port","587");
         objetoPEC.put("mail.smtp.user", correoEnvia);
          objetoPEC.setProperty("mail.smtp.auth","true");
          
          Session sesion = Session.getDefaultInstance(objetoPEC);
          MimeMessage mail = new MimeMessage(sesion);
         
          
          try {
              mail.setFrom(new InternetAddress(correoEnvia));
              mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
              mail.setSubject("Codigo de Verificacion");
              mail.setText(mensaje);
              
              Transport trasnporte = sesion.getTransport("smtp");
              trasnporte.connect(correoEnvia, contraseña);
              trasnporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
              trasnporte.close();
              
//              JOptionPane.showMessageDialog(null,"el correo se envio correctamemte ");
              
          }catch ( Exception ex){
                JOptionPane.showMessageDialog(null,"eror envio de correo ...\n "+ex);
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtcoreeoelectronico = new javax.swing.JTextField();
        lblingresarcodigo = new javax.swing.JLabel();
        txtcodigoverificacion = new javax.swing.JTextField();
        lblindrofucircoreo = new javax.swing.JLabel();
        lblsolicitarcodigo = new javax.swing.JLabel();
        btnberificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblcontra = new javax.swing.JLabel();
        lblcontra02 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        txtpasword = new javax.swing.JPasswordField();
        txtpaswordConfirmar = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Pbar = new javax.swing.JProgressBar();
        lblcuadrado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        lbldondo01 = new javax.swing.JLabel();
        fondo02 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcoreeoelectronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcoreeoelectronico.setBorder(null);
        jPanel2.add(txtcoreeoelectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 20));

        lblingresarcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblingresarcodigo.setText("¿ Ingresar codigo de verificacion ?");
        jPanel2.add(lblingresarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtcodigoverificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigoverificacion.setBorder(null);
        jPanel2.add(txtcodigoverificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 167, 20));

        lblindrofucircoreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblindrofucircoreo.setText("¿ introducir Correo electronico ?");
        jPanel2.add(lblindrofucircoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblsolicitarcodigo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblsolicitarcodigo.setText("¿ solicitar codigo ?");
        lblsolicitarcodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsolicitarcodigoMouseClicked(evt);
            }
        });
        jPanel2.add(lblsolicitarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        btnberificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_coreeoVerificar.png"))); // NOI18N
        btnberificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_presionado_correovERIFICAR.png"))); // NOI18N
        btnberificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_presionado_correovERIFICAR.png"))); // NOI18N
        btnberificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnberificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnberificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 80, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 160, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/iconologinnew (1).png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 30, 20));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 260, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblusuario.setText("Su Usuario es ");
        jPanel3.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 22, -1, -1));

        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setBorder(null);
        jPanel3.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 46, 199, 22));

        lblcontra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontra.setText("ingresar Nueva contraseña ");
        jPanel3.add(lblcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 98, -1, -1));

        lblcontra02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontra02.setText("Ingrese nuevamente la contraseña");
        jPanel3.add(lblcontra02, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 173, -1, -1));

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botoon_ACTUALIZA_VERDE.png"))); // NOI18N
        btnactualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/BOTON_PRESIONADO_VERDE.png"))); // NOI18N
        btnactualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/BOTON_PRESIONADO_VERDE.png"))); // NOI18N
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 271, 80, 29));

        txtpasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasword.setBorder(null);
        txtpasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpaswordMouseClicked(evt);
            }
        });
        jPanel3.add(txtpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 128, 146, 21));

        txtpaswordConfirmar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpaswordConfirmar.setBorder(null);
        txtpaswordConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpaswordConfirmarMouseClicked(evt);
            }
        });
        jPanel3.add(txtpaswordConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 203, 153, 22));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 75, 199, 16));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 156, 199, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 232, 193, 21));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 340));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 300, 340));

        Pbar.setBackground(new java.awt.Color(255, 255, 255));
        Pbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pbar.setStringPainted(true);
        jPanel1.add(Pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 290, 30));

        lblcuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/new_bottonverede_grey.png"))); // NOI18N
        lblcuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcuadradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblcuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/logo_market_03_grey.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 220, -1));

        lblmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newbotton_redondito_grey.jpg"))); // NOI18N
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });
        jPanel1.add(lblmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newredondo_grey.png"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 40, 30));

        lbldondo01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/fondo_rcorreo01.jpg"))); // NOI18N
        jPanel1.add(lbldondo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 810));

        fondo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/fondo_rcorreo01_1.jpg"))); // NOI18N
        jPanel1.add(fondo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 210, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpaswordConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpaswordConfirmarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaswordConfirmarMouseClicked

    private void txtpaswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpaswordMouseClicked
        // TODO add your handling code here:

        if (!this.txtpasword.getText().isEmpty()){
            this.txtpaswordConfirmar.enable(true);
        }else{

        }

    }//GEN-LAST:event_txtpaswordMouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        sonido2.play();
        
        String comprovar=this.txtpaswordConfirmar.getText();
        if (this.txtpasword.getText().equals(comprovar)){
            contra();
            login abrir = new login();
            abrir.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"La contraña a Modificar son Diferentes!!!");
        }

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnberificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnberificarActionPerformed
 sonido2.play();
        int codigoP=Integer.parseInt(this.txtcodigoverificacion.getText());
        String us="";

        Thread hilos = new Thread (){
            public void  run(){
                Pbar.setMaximum(3000);
                for(int a=0; a<3000;a++){
                    System.out.println("numeros : "+a);
                    Pbar.setValue(a);

                    if (Pbar.getValue()==2999){

                        if (codigoP==codigo){

                            buscar();

                        }else{
                            JOptionPane.showMessageDialog(null, "!!Error  \n !Codigo Incorrecto¡ !");

                        }

                    }
                }
                Pbar.setValue(0);
            }
        };
        hilos.start();

    }//GEN-LAST:event_btnberificarActionPerformed

    private void lblsolicitarcodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsolicitarcodigoMouseClicked
        // TODO add your handling code here:
        sonido2.play();
        correoE=this.txtcoreeoelectronico.getText();
        
          String mail = this.txtcoreeoelectronico.getText();
        // int x = JOptionPane.showConfirmDialog(null,"desea enviar un correo ", "enviando correo ...",JOptionPane.PLAIN_MESSAGE);
        
        
        
      
 
        
        
        
        
        if (!this.txtcoreeoelectronico.getText().isEmpty()){
            Random rand = new Random();
            codigo = rand.nextInt(9000) + 1000;
                 transfer_to_email(mail);
            JOptionPane.showMessageDialog(null, "Su Codigo de Verificacion a sido Enviado");
            this.txtcodigoverificacion.enable(true);

        }else{
            JOptionPane.showMessageDialog(null, "!!Por Favor Ingresar Su Correo Electronico !");

        }

    }//GEN-LAST:event_lblsolicitarcodigoMouseClicked

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
         boolean agrandado = false;
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
            java.util.logging.Logger.getLogger(frmcorreoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcorreoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcorreoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcorreoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcorreoR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Pbar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnberificar;
    private javax.swing.JLabel fondo02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblcontra02;
    private javax.swing.JLabel lblcuadrado;
    private javax.swing.JLabel lbldondo01;
    private javax.swing.JLabel lblindrofucircoreo;
    private javax.swing.JLabel lblingresarcodigo;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lblsolicitarcodigo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtcodigoverificacion;
    private javax.swing.JTextField txtcoreeoelectronico;
    private javax.swing.JPasswordField txtpasword;
    private javax.swing.JPasswordField txtpaswordConfirmar;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
