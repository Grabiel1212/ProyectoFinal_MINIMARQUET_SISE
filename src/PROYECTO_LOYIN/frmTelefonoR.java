/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PROYECTO_LOYIN;

import CONTROL.proceso;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author grabiel
 */
public class frmTelefonoR extends javax.swing.JFrame {
 int codigo=0;
     String telefono="";
     
     
     proceso ot = new  proceso();
     AudioClip sonido2;
    /**
     * Creates new form frmTelefonoR
     */
    public frmTelefonoR() {
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
           this.fondo01.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondo-coreo-dark-01.jpg")));
           this.jLabel6.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondo_coreo-dark-02.png")));
            this.jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/logoMediano_market.png")));
            
              this.jLabel1.setForeground(Color.WHITE);
                this.lblsolicitarCodigo.setForeground(Color.WHITE);  
                this.jLabel2.setForeground(Color.WHITE); 
                this.jLabel3.setForeground(Color.WHITE);
                this.jLabel4.setForeground(Color.WHITE);
                this.jLabel5.setForeground(Color.WHITE);  
            
                this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/iconotelefonoBlanco.jpg")));
                this.jSeparator1.setForeground(Color.WHITE);
                 this.jSeparator2.setForeground(Color.WHITE);
                  this.jSeparator3.setForeground(Color.WHITE);
                   this.jSeparator4.setForeground(Color.WHITE);
                    this.jSeparator5.setForeground(Color.WHITE);
                
                 this.jLabel9.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fonco-c-02.png")));
            this.jLabel12.setIcon(new ImageIcon(getClass().getResource("/imagen_registro/fondo-c-01.png")));
            jPanel3.setBackground(Color.BLACK);
            
           this.lblsalir.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondondito_rojo_noche.png")));
        this.lblmini.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_verde_noche.jpg")));
         this.lblcuadrado.setIcon(new ImageIcon(getClass().getResource("/imagen_login/redondito_amarilo_nocche.png")));
         
           this.txttelefono.setForeground(Color.white);
          this.txtcodigoverificacion.setForeground(Color.white);
           this.txtusuario.setForeground(Color.white);
            this.txtpasword.setForeground(Color.white);
             this.txtpaswordConfirmar.setForeground(Color.white);
             
               this.txttelefono.setBackground(Color.black);
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
          String telefono = partes[3];
          if (telefono.equals(this.txttelefono.getText())) {
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

        JOptionPane.showMessageDialog(null, "!! Numero telefonico Herroneo !!");

      } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "!Error Al Leer o Escribir en el Archivo!");
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
          String telefono = partes[3];
          String usuario=partes[0];
          
          
             if (telefono.equals(this.txttelefono.getText())) {
          
     this.txttelefono.enable(false);
     this.txtcodigoverificacion.enable(false);
        this.txtpasword.enable(true);
this.txtusuario.setText(usuario);
          JOptionPane.showMessageDialog(null, "Nemero Telefonico Encontrado");
            return;
          }
         }
         
            JOptionPane.showMessageDialog(null, "!Numero Telefonico Herroneo!");
              this.txttelefono.setText("");
                this.txtcodigoverificacion.setText("");
                this.txttelefono.enable(true);
                this.txtcodigoverificacion.enable(true);
        
        }catch(IOException ex){
             JOptionPane.showMessageDialog(null, "!Error al leer o escribir en el archivo!");
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

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Pbar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        txttelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcodigoverificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblsolicitarCodigo = new javax.swing.JLabel();
        btnberificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        txtpasword = new javax.swing.JPasswordField();
        txtpaswordConfirmar = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();
        lblcuadrado = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fondo01 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pbar.setStringPainted(true);
        jPanel1.add(Pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 230, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttelefono.setBorder(null);
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("¿ Ingresar codigo de verificacion ?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtcodigoverificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigoverificacion.setBorder(null);
        jPanel2.add(txtcodigoverificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("¿ introducir Numero Telefonico?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblsolicitarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblsolicitarCodigo.setText("¿ solicitar codigo ?");
        lblsolicitarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsolicitarCodigoMouseClicked(evt);
            }
        });
        jPanel2.add(lblsolicitarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        btnberificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_coreeoVerificar.png"))); // NOI18N
        btnberificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botton_presionado_correovERIFICAR.png"))); // NOI18N
        btnberificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnberificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnberificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 78, 160, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/icontelefonoo (1).png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 20, 20));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 260, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Su Usuario es ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 14, -1, -1));

        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setBorder(null);
        jPanel3.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 44, 189, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ingresar Nueva contraseña ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 85, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese nuevamente la contraseña");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 155, -1, -1));

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/botoon_ACTUALIZA_VERDE.png"))); // NOI18N
        btnactualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/BOTON_PRESIONADO_VERDE.png"))); // NOI18N
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 82, 28));

        txtpasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasword.setBorder(null);
        txtpasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpaswordMouseClicked(evt);
            }
        });
        jPanel3.add(txtpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 109, 131, -1));

        txtpaswordConfirmar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpaswordConfirmar.setBorder(null);
        txtpaswordConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpaswordConfirmarMouseClicked(evt);
            }
        });
        jPanel3.add(txtpaswordConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 190, 131, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 67, 189, 11));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 132, 172, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 213, 171, 10));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 300, 350));

        lblmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newbotton_redondito_grey.jpg"))); // NOI18N
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });
        jPanel1.add(lblmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, 20));

        lblcuadrado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/new_bottonverede_grey_1.png"))); // NOI18N
        lblcuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcuadradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblcuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 20));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newredondo_grey.png"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/logo_market_03_grey.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 210, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/fondo_rcorreo01_1.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 220, 740));

        fondo01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/fondo_rcorreo01.jpg"))); // NOI18N
        jPanel1.add(fondo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblsolicitarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsolicitarCodigoMouseClicked
        // TODO add your handling code here:
sonido2.play();
        telefono=this.txttelefono.getText();
        if (!this.txttelefono.getText().isEmpty()){
            Random rand = new Random();
            codigo = rand.nextInt(90) + 10;
            JOptionPane.showMessageDialog(null, ""+codigo);
            this.txtcodigoverificacion.enable(true);

        }else{
            JOptionPane.showMessageDialog(null, "!!Por favor Ingresar Su Numero Telefonico!!");

        }

    }//GEN-LAST:event_lblsolicitarCodigoMouseClicked

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
            JOptionPane.showMessageDialog(null,"!La Contraseña A Modificar son Diferentes");
        }

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtpaswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpaswordMouseClicked
        // TODO add your handling code here:

        if (!this.txtpasword.getText().isEmpty()){
            this.txtpaswordConfirmar.enable(true);
        }else{

        }

    }//GEN-LAST:event_txtpaswordMouseClicked

    private void txtpaswordConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpaswordConfirmarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaswordConfirmarMouseClicked

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
 
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
            java.util.logging.Logger.getLogger(frmTelefonoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTelefonoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTelefonoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTelefonoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTelefonoR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Pbar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnberificar;
    private javax.swing.JLabel fondo01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblcuadrado;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lblsolicitarCodigo;
    private javax.swing.JTextField txtcodigoverificacion;
    private javax.swing.JPasswordField txtpasword;
    private javax.swing.JPasswordField txtpaswordConfirmar;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
