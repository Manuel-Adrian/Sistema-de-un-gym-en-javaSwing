package login;

import com.mysql.cj.protocol.Resultset;
import conexionsql.conexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class frmlogin extends javax.swing.JFrame {
conexionSQL cc=new conexionSQL();
Connection con=cc.conexxion();
    public frmlogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
    }
    public void limpiarCajas(){
    txtrfc.setText(null);        
     txtpass.setText(null);                  
}
    
  
   
public void validarAcceso(){
    int resultado=0;
     
    try {
      String rfc=txtrfc.getText();
       String pass=String.valueOf(txtpass.getPassword());
       if(rfc.equals("admin")&&pass.equals("210600")){
           JOptionPane.showMessageDialog(null,"BIENVENIDO AL SISTEMA ADMIN "+txtrfc.getText()); 
                users forma=new users();
                forma.setVisible(true);
                this.dispose();
       }else{
           
       
        String sql="select*from usuarios where rfc='"+rfc+"' and clave='"+pass+"' ";
       
     
        ///////////////////////////////////////////////////////////////////////////////////
      Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        if(rs.next()){
            resultado=1;
            if(resultado==1){
               JOptionPane.showMessageDialog(null,"BIENVENIDO AL SISTEMA "+txtrfc.getText()); 
                Usuario form=new Usuario();
                form.setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(null,"Error en el acceso vuelva a intentar");
                limpiarCajas();
            }
        } else{
            JOptionPane.showMessageDialog(null,"ERROR USUARIO NO REGISTRADO, LLAMANOS PARA QUE SEAS USUARIO DE GYM MONSTER");
            limpiarCajas();
        }
         }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error en el acceso vuelva a intentar"+e.getMessage());
        limpiarCajas();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtrfc = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("GYM MONSTER EL MEJOR GIMNASIO DE LA ZONA.\nCONTAMOS CON:\n\n-CITAS PARA EVITAR AGLOMENACIONES\n-CLASES EN VIVO (EN CASO DE QUE NO PUEDAS ASISTIR)\n-RUTINAS & PLANES ALIMENTICIOS");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 596, 166));

        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("LLAMANOS PARA INSCRIBIRTE EN NUESTRA INSTALACIÓN\nTEL. 598641002541\nCEL.5541239678");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 610, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("INGRESA TUS DATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 234, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("RFC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 266, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CLAVE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 341, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        txtrfc.setBackground(new java.awt.Color(255, 255, 255));
        txtrfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrfcActionPerformed(evt);
            }
        });
        jPanel1.add(txtrfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 160, -1));

        txtpass.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 160, -1));

        jTextArea4.setBackground(new java.awt.Color(153, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("GYM MONSTER");
        jScrollPane4.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, -10, 430, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/99.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 230, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarAcceso();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtrfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfcActionPerformed

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
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtrfc;
    // End of variables declaration//GEN-END:variables
}
