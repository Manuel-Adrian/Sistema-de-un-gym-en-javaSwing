/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rutinas;

import login.Usuario;
import login.Cita;

/**
 *
 * @author hp
 */
public class Rutin extends javax.swing.JFrame {

    /**
     * Creates new form Rutin
     */
    public Rutin() {
        initComponents();
         this.setLocationRelativeTo(null);
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
        btnregresa = new javax.swing.JButton();
        btnavanzado = new javax.swing.JButton();
        btnlibre = new javax.swing.JButton();
        btnintermedio = new javax.swing.JButton();
        btnbasico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregresa.setBackground(new java.awt.Color(255, 51, 51));
        btnregresa.setText("REGRESAR AL MENU");
        btnregresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        btnavanzado.setBackground(new java.awt.Color(255, 255, 255));
        btnavanzado.setText("AVANZADO");
        btnavanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavanzadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnavanzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 120, 50));

        btnlibre.setBackground(new java.awt.Color(255, 255, 255));
        btnlibre.setText("LIBRE");
        btnlibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibreActionPerformed(evt);
            }
        });
        jPanel1.add(btnlibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, 50));

        btnintermedio.setBackground(new java.awt.Color(255, 255, 255));
        btnintermedio.setText("INTERMEDIO");
        btnintermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnintermedioActionPerformed(evt);
            }
        });
        jPanel1.add(btnintermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 50));

        btnbasico.setBackground(new java.awt.Color(255, 255, 255));
        btnbasico.setText("B??SICO");
        btnbasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbasicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnbasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, 50));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("RUTINAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/F1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 642, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbasicoActionPerformed
        Basico();
    }//GEN-LAST:event_btnbasicoActionPerformed

    private void btnintermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnintermedioActionPerformed
        Inter();
    }//GEN-LAST:event_btnintermedioActionPerformed

    private void btnlibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibreActionPerformed
        Libre();
    }//GEN-LAST:event_btnlibreActionPerformed

    private void btnavanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavanzadoActionPerformed
        Aavanzado();
    }//GEN-LAST:event_btnavanzadoActionPerformed

    private void btnregresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresaActionPerformed
        Usuario forma = new Usuario();
        forma.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnregresaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Basico(){
         Basico forma=new Basico();
                forma.setVisible(true);
                this.dispose();
    }
    public void Inter(){
         Inter forma=new Inter();
                forma.setVisible(true);
                this.dispose();
    }
    public void Libre(){
         Libre forma=new Libre();
                forma.setVisible(true);
                this.dispose();
    }
    public void Aavanzado(){
         Avanz forma=new Avanz();
                forma.setVisible(true);
                this.dispose();
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
            java.util.logging.Logger.getLogger(Rutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rutin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnavanzado;
    private javax.swing.JButton btnbasico;
    private javax.swing.JButton btnintermedio;
    private javax.swing.JButton btnlibre;
    private javax.swing.JButton btnregresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
