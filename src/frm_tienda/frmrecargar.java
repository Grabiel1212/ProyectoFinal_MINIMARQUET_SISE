/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm_tienda;



import CONTROL.proceso;
import clases_frm.claseUsuario;


import clases_frm.usuarioGenaral;
import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author grabiel
 */
public class frmrecargar extends javax.swing.JFrame {

    /**
     * Creates new form frmrecargar
     */
    public frmrecargar() {
        initComponents();
        
          this.setLocationRelativeTo(null);
          
          if ( proceso.modooscuro ) {
     
      this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/fondo-recargar-negro02.png")));
      this.jPanel2.setBackground(Color.black);
      
      jLabel1.setForeground(Color.white);
      jLabel2.setForeground(Color.white);
      jLabel3.setForeground(Color.white);
      jLabel4.setForeground(Color.white);
      jLabel5.setForeground(Color.white);
      jLabel6.setForeground(Color.white);
      jLabel7.setForeground(Color.white);
      
      this.jSeparator1.setForeground(Color.white);
       this.jSeparator2.setForeground(Color.white);
        this.jSeparator3.setForeground(Color.white);
         this.jSeparator4.setForeground(Color.white);
          this.jSeparator5.setForeground(Color.white);
           this.jSeparator6.setForeground(Color.white);
            this.jSeparator7.setForeground(Color.white);
      
         this.txtsalir.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/redondito_1-DARK-RECARGAR.png")));
           this.txtminimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/redondito_1-MINI-DARK-RECARGAR.jpg")));
               this.jLabel12.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/redondito_1-CUADRado-recagar-dark.jpg")));
               
                  this.jLabel9.setIcon(new ImageIcon(getClass().getResource("/imagenes_Tienda/logoMediano_market (1)-dark.png")));
                  
                   this.txtnombre.setForeground(Color.GRAY);
                    this.txtnombre.setBackground(Color.black);
                    this.txtparteno.setForeground(Color.gray);
                    this.txtparteno.setBackground(Color.black);
                    
                     this.txtmaterno.setForeground(Color.GRAY);
                    this.txtmaterno.setBackground(Color.black);
                    this.txtrecarga.setForeground(Color.gray);
                    this.txtrecarga.setBackground(Color.black);
                    
                     this.txtnumerodelatarjeta.setForeground(Color.GRAY);
                    this.txtnumerodelatarjeta.setBackground(Color.black);
                    this.txtfechavencimiwnto.setForeground(Color.gray);
                    this.txtfechavencimiwnto.setBackground(Color.black);
                    
                     this.txtcodidoseguridad.setForeground(Color.GRAY);
                    this.txtcodidoseguridad.setBackground(Color.black);
                   
    
          }
    }
    
  

    public void recarga(){
        
        double recar = Double.parseDouble(this.txtrecarga.getText());
        claseUsuario resibir =usuarioGenaral.transferencia;
     
        
         
//         double recarA=recar+sal;
        
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
          String usuario = partes[0];
          String saldo = partes[5];
          if (usuario.equals(resibir.getUsuario())) {
            // Modificar la contraseña en esta línea
            double total = recar +Double.parseDouble(saldo);
            partes[5] =""+total;

            // Actualizar la línea en la lista
            lineas.set(i, String.join("-", partes));

            // Escribir la lista actualizada de vuelta en el archivo de texto
            FileWriter escritor = new FileWriter(archivo);
            for (String linea : lineas) {
              escritor.write(linea + "\n");
            }
            escritor.close();

            JOptionPane.showMessageDialog(null, "Recarga Exitosa");
            return;
          }
        }

        JOptionPane.showMessageDialog(null, "Usuario herroneo");

      } catch (IOException ex) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmaterno = new javax.swing.JTextField();
        txtparteno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumerodelatarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfechavencimiwnto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcodidoseguridad = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtrecarga = new javax.swing.JTextField();
        btnprocesar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsalir = new javax.swing.JLabel();
        txtminimizar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Titular :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 20));

        txtnombre.setForeground(new java.awt.Color(204, 204, 204));
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombre.setText("Ingresar Nombre");
        txtnombre.setBorder(null);
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreMouseClicked(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("Apellido Materno ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        txtmaterno.setForeground(new java.awt.Color(204, 204, 204));
        txtmaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmaterno.setText("ingresar Materno ");
        txtmaterno.setBorder(null);
        txtmaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmaternoMouseClicked(evt);
            }
        });
        jPanel2.add(txtmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, 30));

        txtparteno.setForeground(new java.awt.Color(204, 204, 204));
        txtparteno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtparteno.setText("Ingresar Paterno");
        txtparteno.setBorder(null);
        txtparteno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpartenoMouseClicked(evt);
            }
        });
        jPanel2.add(txtparteno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Numero de la Tarjeta :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtnumerodelatarjeta.setForeground(new java.awt.Color(204, 204, 204));
        txtnumerodelatarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumerodelatarjeta.setText("**** **** **** ****");
        txtnumerodelatarjeta.setBorder(null);
        txtnumerodelatarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnumerodelatarjetaMouseClicked(evt);
            }
        });
        txtnumerodelatarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumerodelatarjetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerodelatarjetaKeyTyped(evt);
            }
        });
        jPanel2.add(txtnumerodelatarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 220, 20));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setText("fecha Vencimiento ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtfechavencimiwnto.setForeground(new java.awt.Color(204, 204, 204));
        txtfechavencimiwnto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfechavencimiwnto.setText("0/0/2023");
        txtfechavencimiwnto.setBorder(null);
        txtfechavencimiwnto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfechavencimiwntoMouseClicked(evt);
            }
        });
        txtfechavencimiwnto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechavencimiwntoKeyTyped(evt);
            }
        });
        jPanel2.add(txtfechavencimiwnto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 100, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Codigo seguridad");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        txtcodidoseguridad.setForeground(new java.awt.Color(204, 204, 204));
        txtcodidoseguridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodidoseguridad.setText("***");
        txtcodidoseguridad.setBorder(null);
        txtcodidoseguridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcodidoseguridadMouseClicked(evt);
            }
        });
        txtcodidoseguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodidoseguridadActionPerformed(evt);
            }
        });
        txtcodidoseguridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodidoseguridadKeyTyped(evt);
            }
        });
        jPanel2.add(txtcodidoseguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 90, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("Monto A Recargar : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        txtrecarga.setForeground(new java.awt.Color(204, 204, 204));
        txtrecarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrecarga.setText("Ingresar Monto");
        txtrecarga.setBorder(null);
        txtrecarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrecargaMouseClicked(evt);
            }
        });
        txtrecarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrecargaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrecargaKeyTyped(evt);
            }
        });
        jPanel2.add(txtrecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, 20));

        btnprocesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/btnbottonrecargar.png"))); // NOI18N
        btnprocesar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/bottonrecargarPresionado.png"))); // NOI18N
        btnprocesar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/bottonrecargarPresionado.png"))); // NOI18N
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });
        jPanel2.add(btnprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 100, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 250, 20));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 20));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 110, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/logo_market_02 (1).png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 450, 490));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/new_bottonverede_grey.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, -1));

        txtsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newredondo_grey.png"))); // NOI18N
        txtsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalirMouseClicked(evt);
            }
        });
        jPanel1.add(txtsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        txtminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_registro/newbotton_redondito_grey.jpg"))); // NOI18N
        txtminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtminimizarMouseClicked(evt);
            }
        });
        jPanel1.add(txtminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_Tienda/frecarga.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
        // TODO add your handling code here:
      
      String nombre =this.txtnombre.getText();
      String paterno = this.txtparteno.getText();
      String materno = this.txtmaterno.getText();
      String fecha=this.txtfechavencimiwnto.getText();
      String saldo =this.txtrecarga.getText();
      String tarjeta= this.txtnumerodelatarjeta.getText();
      String codigo =this.txtcodidoseguridad.getText();
     
       if (!nombre.equals("Ingresar Nombre") && ! paterno.equals("Ingresar Paterno") && !materno.equals("ingresar Materno ") &&  !fecha.equals("0/0/2023") && !saldo.equals("Ingresar Monto")
               && !tarjeta.equals("**** **** **** ****" ) && !codigo.equals("***")){
            recarga();
            
               portada abrir = new portada();
        abrir.setVisible(true);
        this.dispose();   
        
       }else{
           JOptionPane.showMessageDialog(null," ! Por favor completar los Datos Vacios !");
       }
     
        
    }//GEN-LAST:event_btnprocesarActionPerformed

    private void txtrecargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrecargaKeyPressed
        // TODO add your handling code here:
            //asemos una restrincion para la cantidad de numero
       
    }//GEN-LAST:event_txtrecargaKeyPressed

    private void txtnumerodelatarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerodelatarjetaKeyPressed
        // TODO add your handling code here:
            //asemos una restrincion para la cantidad de numero
      
    }//GEN-LAST:event_txtnumerodelatarjetaKeyPressed

    private void txtnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseClicked
        // TODO add your handling code here:
        if ( proceso.modooscuro ){
            
               if(this.txtnombre.getText().equals("Ingresar Nombre")){
      this.txtnombre.setText("");
      this.txtnombre.setForeground(Color.white);
        }
        
       if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
      
     if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
     
      
       
         if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
           if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
     
            
        }
          if(this.txtnombre.getText().equals("Ingresar Nombre")){
      this.txtnombre.setText("");
      this.txtnombre.setForeground(Color.black);
        }
        
       if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
      
     if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
     
      
       
         if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
           if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
     
     
     
     
     
    }//GEN-LAST:event_txtnombreMouseClicked

    private void txtpartenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpartenoMouseClicked
        // TODO add your handling code here:
        
        if ( proceso.modooscuro ){
            
          if(this.txtparteno.getText().equals("Ingresar Paterno")){
      this.txtparteno.setText("");
      this.txtparteno.setForeground(Color.white);
        }
        
               if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
               
                 
         if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
           if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
    }                
        
            if(this.txtparteno.getText().equals("Ingresar Paterno")){
      this.txtparteno.setText("");
      this.txtparteno.setForeground(Color.black);
        }
        
               if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
               
                 
         if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
           if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtpartenoMouseClicked

    private void txtmaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmaternoMouseClicked
        // TODO add your handling code here:
        if ( proceso.modooscuro ){
                 if(this.txtmaterno.getText().equals("ingresar Materno ")){
      this.txtmaterno.setText("");
      this.txtmaterno.setForeground(Color.white);
        }
               
                           if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
        
                           
       if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
       
                  
         if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
           if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
        }
        
               if(this.txtmaterno.getText().equals("ingresar Materno ")){
      this.txtmaterno.setText("");
      this.txtmaterno.setForeground(Color.black);
        }
               
                           if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
        
                           
       if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
       
                  
         if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
           if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtmaternoMouseClicked

    private void txtrecargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrecargaMouseClicked
        // TODO add your handling code here:
          if ( proceso.modooscuro ){
                 if(this.txtrecarga.getText().equals("Ingresar Monto")){
      this.txtrecarga.setText("");
      this.txtrecarga.setForeground(Color.white);
        }
                 
               if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
                   
                        if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
          }
        
                 if(this.txtrecarga.getText().equals("Ingresar Monto")){
      this.txtrecarga.setText("");
      this.txtrecarga.setForeground(Color.black);
        }
                 
               if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
                   
                        if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
             if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtrecargaMouseClicked

    private void txtnumerodelatarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnumerodelatarjetaMouseClicked
        // TODO add your handling code here:
        if ( proceso.modooscuro ){
                 if(this.txtnumerodelatarjeta.getText().equals("**** **** **** ****")){
      this.txtnumerodelatarjeta.setText("");
      this.txtnumerodelatarjeta.setForeground(Color.white);
        }
                            
               if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
            
                       if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
                       
                               if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
        }
        
        
              if(this.txtnumerodelatarjeta.getText().equals("**** **** **** ****")){
      this.txtnumerodelatarjeta.setText("");
      this.txtnumerodelatarjeta.setForeground(Color.black);
        }
                            
               if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
            
                       if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
                       
                               if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
        if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnumerodelatarjetaMouseClicked

    private void txtfechavencimiwntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechavencimiwntoMouseClicked
        // TODO add your handling code here:
         if ( proceso.modooscuro ){
             
               if(this.txtfechavencimiwnto.getText().equals("0/0/2023")){
      this.txtfechavencimiwnto.setText("");
      this.txtfechavencimiwnto.setForeground(Color.white);
        }
               
                        if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
            
                       if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
                       
                       
                        if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
                        
                          if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
         }
        
        
               if(this.txtfechavencimiwnto.getText().equals("0/0/2023")){
      this.txtfechavencimiwnto.setText("");
      this.txtfechavencimiwnto.setForeground(Color.black);
        }
               
                        if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
            
                       if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
                       
                       
                        if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
                        
                          if (String.valueOf(this.txtcodidoseguridad.getPassword()).isEmpty()){
             this.txtcodidoseguridad.setText("***");
     this.txtcodidoseguridad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtfechavencimiwntoMouseClicked

    private void txtcodidoseguridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcodidoseguridadMouseClicked
        // TODO add your handling code here:
          if ( proceso.modooscuro ){
               if (String.valueOf(this.txtcodidoseguridad.getPassword()).equals("***")){
            this.txtcodidoseguridad.setText("");
           this.txtcodidoseguridad.setForeground(Color.white);
        }
        
                                       if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
            
                       if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
                                          
                        if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
      
                                                    if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
          }
        
                   if (String.valueOf(this.txtcodidoseguridad.getPassword()).equals("***")){
            this.txtcodidoseguridad.setText("");
           this.txtcodidoseguridad.setForeground(Color.black);
        }
        
                                       if (this.txtnombre.getText().isEmpty()){
     this.txtnombre.setText("Ingresar Nombre");
     this.txtnombre.setForeground(Color.gray);
        }
               
               if (this.txtmaterno.getText().isEmpty()){
     this.txtmaterno.setText("ingresar Materno ");
     this.txtmaterno.setForeground(Color.gray);
        }
                 
                   if (this.txtparteno.getText().isEmpty()){
     this.txtparteno.setText("Ingresar Paterno");
     this.txtparteno.setForeground(Color.gray);
        }
            
                       if (this.txtrecarga.getText().isEmpty()){
     this.txtrecarga.setText("Ingresar Monto");
     this.txtrecarga.setForeground(Color.gray);
        }
                                          
                        if (this.txtnumerodelatarjeta.getText().isEmpty()){
     this.txtnumerodelatarjeta.setText("**** **** **** ****");
     this.txtnumerodelatarjeta.setForeground(Color.gray);
        }
      
                                                    if (this.txtfechavencimiwnto.getText().isEmpty()){
     this.txtfechavencimiwnto.setText("0/0/2023");
     this.txtfechavencimiwnto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcodidoseguridadMouseClicked

    private void txtrecargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrecargaKeyTyped
        // TODO add your handling code here:
         if(this.txtrecarga.getText().length()>=10){
            evt.consume();
        }
        
        //asemos una restrincion solo para numeros
        int key = evt.getKeyChar();
        
        boolean  numeros = key >=48 && key<=57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtrecargaKeyTyped

    private void txtnumerodelatarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerodelatarjetaKeyTyped
        // TODO add your handling code here:
          if(this.txtnumerodelatarjeta.getText().length()>=16){
            evt.consume();
        }
        
        //asemos una restrincion solo para numeros
        int key = evt.getKeyChar();
        
        boolean  numeros = key >=48 && key<=57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtnumerodelatarjetaKeyTyped

    private void txtfechavencimiwntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechavencimiwntoKeyTyped
        // TODO add your handling code here:
          if(this.txtfechavencimiwnto.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtfechavencimiwntoKeyTyped

    private void txtcodidoseguridadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodidoseguridadKeyTyped
        // TODO add your handling code here:
             if(this.txtcodidoseguridad.getText().length()>=3){
            evt.consume();
        }
        
        //asemos una restrincion solo para numeros
        int key = evt.getKeyChar();
        
        boolean  numeros = key >=48 && key<=57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtcodidoseguridadKeyTyped

    private void txtcodidoseguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodidoseguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodidoseguridadActionPerformed

    private void txtsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalirMouseClicked
        // TODO add your handling code here:
           portada abrir = new portada();
        abrir.setVisible(true);
        this.dispose();   
        
    }//GEN-LAST:event_txtsalirMouseClicked

    private void txtminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtminimizarMouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_txtminimizarMouseClicked

//    /**
//     * @param args the command line arguments
////     */
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
//            java.util.logging.Logger.getLogger(frmrecargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmrecargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmrecargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmrecargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmrecargar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprocesar;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPasswordField txtcodidoseguridad;
    private javax.swing.JTextField txtfechavencimiwnto;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JLabel txtminimizar;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerodelatarjeta;
    private javax.swing.JTextField txtparteno;
    private javax.swing.JTextField txtrecarga;
    private javax.swing.JLabel txtsalir;
    // End of variables declaration//GEN-END:variables
}
