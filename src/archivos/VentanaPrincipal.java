package archivos;

import clases.RegistroCuenta;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class VentanaPrincipal extends javax.swing.JFrame {
    private Formatter salida;
    private Scanner entrada;
    
    public VentanaPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncomprobar = new javax.swing.JButton();
        btnleer = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();
        txtruta = new javax.swing.JTextField();
        lblcreacion = new javax.swing.JLabel();
        lblruta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatxtresult = new javax.swing.JTextArea();
        lblcontenido = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areatxtcontenido = new javax.swing.JTextArea();
        lblcontenidoruta = new javax.swing.JLabel();
        lblcuenta = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();
        txtcuenta = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncomprobar.setText("Comprobar");
        btncomprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprobarActionPerformed(evt);
            }
        });

        btnleer.setText("Leer");
        btnleer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerActionPerformed(evt);
            }
        });

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        lblcreacion.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lblcreacion.setText("Creación de archivos");

        lblruta.setText("Ruta:");

        areatxtresult.setColumns(20);
        areatxtresult.setRows(5);
        jScrollPane1.setViewportView(areatxtresult);

        lblcontenido.setText("Contenido del archivo:");

        areatxtcontenido.setColumns(20);
        areatxtcontenido.setRows(5);
        jScrollPane2.setViewportView(areatxtcontenido);

        lblcontenidoruta.setText("Contenido de la ruta:");

        lblcuenta.setText("Cuenta:");

        lblnombre.setText("Nombre:");

        lblapellido.setText("Apellido:");

        lblsaldo.setText("Saldo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcontenidoruta)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcontenido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnleer))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcreacion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblruta)
                                .addGap(18, 18, 18)
                                .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncomprobar)))
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcuenta)
                        .addGap(18, 18, 18)
                        .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblsaldo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblnombre)
                                .addComponent(lblapellido)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncrear)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtapellido)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblcreacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblruta)
                                .addComponent(btncomprobar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblcuenta)
                                .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblapellido)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsaldo)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btncrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcontenido)))
                            .addComponent(lblcontenidoruta))))
                .addGap(18, 18, 18)
                .addComponent(btnleer)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnleerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerActionPerformed
        RegistroCuenta registro = new RegistroCuenta();

        abrirArchivoTexto();

        try {
            while (entrada.hasNext()) {
                registro.establecerCuenta(entrada.nextInt());
                registro.establecerPrimerNombre(entrada.next());
                registro.establecerApellidoPaterno(entrada.next());
                registro.establecerSaldo(entrada.nextDouble());
                areatxtcontenido.setText("Cuenta\t" + "Primer nombre\t\t" + "apellido Paterno\t" + "Saldo\t\n\n" + registro.obtenerCuenta()
                        + "\t" + registro.obtenerPrimerNombre() + "\t\t" + registro.obtenerApellidoPaterno() + "\t\t" + registro.obtenerSaldo());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado");
            entrada.close();
            System.exit(1);

        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo");
            System.exit(1);
        }
        cerrarArchivoTexto();
    }//GEN-LAST:event_btnleerActionPerformed

    private void btncomprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprobarActionPerformed
        String ruta = txtruta.getText();

        File nombre = new File(ruta);
        if (nombre.exists()) {
            areatxtresult.setText(nombre.getName() + " Existe\n"
                    + (nombre.isFile() ? "Es un archivo\n" : "No es un archivo\n")
                    + (nombre.isDirectory() ? "Es un directorio\n" : "No es un directorio\n")
                    + (nombre.isAbsolute() ? "Es ruta absoluta\n" : "No es ruta absoluta\n")
                    + "Ultima modificacion: " + nombre.lastModified() + "\n"
                    + "Tamanio: " + nombre.length() + "\n"
                    + "Ruta: " + nombre.getPath() + "\n"
                    + "Ruta absoluta: " + nombre.getAbsolutePath() + "\n"
                    + "Padre: " + nombre.getParent());
        } else {
            areatxtresult.setText(ruta + " no existe");
        }
    }//GEN-LAST:event_btncomprobarActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed

        RegistroCuenta registro = new RegistroCuenta();
        abrirArchivo();
        Scanner entrada = new Scanner(System.in);
        
        int cuenta = Integer.parseInt(txtcuenta.getText());
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        double saldo = Double.parseDouble(txtsaldo.getText());
        
        
            try {
                registro.establecerCuenta(cuenta);
                registro.establecerPrimerNombre(nombre);
                registro.establecerApellidoPaterno(apellido);
                registro.establecerSaldo(saldo);

                if (registro.obtenerCuenta() > 0) {
                    salida.format("%d %s %s %.2f\n", registro.obtenerCuenta(),
                            registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),
                            registro.obtenerSaldo());
                } else {
                    System.out.println("El numero de cuenta debe ser mayor a 0");
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir el archivo");
                return;
            } catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo");
                entrada.nextLine();
            }
            
            cerrarArchivo();        
    }//GEN-LAST:event_btncrearActionPerformed
    
    public void abrirArchivo() {
        try {
            salida = new Formatter("Clientes.txt");
        } catch (SecurityException securityException) {
            System.err.println("No tiene acceso de escritura a este archivo");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al crear archivo");
            System.exit(1);

        }
    }

    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    }
    
    public void abrirArchivoTexto() {
        try {
            entrada = new Scanner(new File("Clientes.txt"));
            
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("ERROR AL ABRIR EL ARCHIVO");
            System.exit(1);
        }
    }
    
    public void cerrarArchivoTexto(){
        if (entrada != null) {
            entrada.close();
        }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areatxtcontenido;
    private javax.swing.JTextArea areatxtresult;
    private javax.swing.JButton btncomprobar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btnleer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcontenido;
    private javax.swing.JLabel lblcontenidoruta;
    private javax.swing.JLabel lblcreacion;
    private javax.swing.JLabel lblcuenta;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblruta;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtruta;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
