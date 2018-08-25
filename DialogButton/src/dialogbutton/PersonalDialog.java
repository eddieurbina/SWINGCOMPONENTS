package dialogbutton;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PersonalDialog extends javax.swing.JFrame {

    public PersonalDialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnOption1 = new javax.swing.JButton();
        btnOption2 = new javax.swing.JButton();
        btnOption3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnOption4 = new javax.swing.JButton();
        btnOption5 = new javax.swing.JButton();
        btnOption6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnOption7 = new javax.swing.JButton();
        btnOption8 = new javax.swing.JButton();
        btnOption9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dialog Windows "));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOption1.setText("Option 1");
        btnOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption1ActionPerformed(evt);
            }
        });

        btnOption2.setText("Option 2");
        btnOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption2ActionPerformed(evt);
            }
        });

        btnOption3.setText("Option 3");
        btnOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOption1)
                .addGap(62, 62, 62)
                .addComponent(btnOption2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOption3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOption2)
                    .addComponent(btnOption3)
                    .addComponent(btnOption1))
                .addGap(35, 35, 35))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOption4.setText("Option 4");
        btnOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption4ActionPerformed(evt);
            }
        });

        btnOption5.setText("Option 5");
        btnOption5.setToolTipText("");
        btnOption5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption5ActionPerformed(evt);
            }
        });

        btnOption6.setText("Option 6");
        btnOption6.setToolTipText("");
        btnOption6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOption4)
                .addGap(63, 63, 63)
                .addComponent(btnOption5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnOption6)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOption4)
                    .addComponent(btnOption5)
                    .addComponent(btnOption6))
                .addGap(34, 34, 34))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOption7.setText("Option 7");
        btnOption7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption7ActionPerformed(evt);
            }
        });

        btnOption8.setText("Option 8");
        btnOption8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption8ActionPerformed(evt);
            }
        });

        btnOption9.setText("Option 9");
        btnOption9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOption7)
                .addGap(60, 60, 60)
                .addComponent(btnOption8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOption9)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOption7)
                    .addComponent(btnOption8)
                    .addComponent(btnOption9))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setText("Show Message Dialog");

        jLabel2.setText("Input Message Dialog");

        jLabel3.setText("Show Confirm Dialog");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption1ActionPerformed
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }//GEN-LAST:event_btnOption1ActionPerformed

    private void btnOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption2ActionPerformed
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana",
                "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnOption2ActionPerformed

    private void btnOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption3ActionPerformed
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Icon.png"));
        ImageIcon tamano = new ImageIcon(icon.getImage().getScaledInstance(5, 5, 1));
    }//GEN-LAST:event_btnOption3ActionPerformed

    private void btnOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption4ActionPerformed
        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
        System.out.println("Respuesta: " + respuesta);
    }//GEN-LAST:event_btnOption4ActionPerformed

    private void btnOption5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption5ActionPerformed
        String respuesta = JOptionPane.showInputDialog(null,
                "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnOption5ActionPerformed

    private void btnOption6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption6ActionPerformed
        String[] carreras = {
            "Ingenieria en Sistemas Computacionales",
            "Ingenieria Industrial",
            "Ingenieria en Mecatrónica",
            "Ingenieria en Informatica",
            "Ingenieria petroquimica"
        };

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Icon2.png"));
        ImageIcon tamano = new ImageIcon(icon.getImage().getScaledInstance(5, 5, 1));

        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar",
                "Carrera", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
        System.out.println("Respuesta: " + resp);
    }//GEN-LAST:event_btnOption6ActionPerformed

    private void btnOption7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption7ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Estta seguro?", "Alerta!",
                JOptionPane.YES_NO_OPTION);
        System.out.println("Respuesta: " + resp);
    }//GEN-LAST:event_btnOption7ActionPerformed

    private void btnOption8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption8ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Está seguro?", "Alerta!",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        System.out.println("Respuesta: " + resp);
    }//GEN-LAST:event_btnOption8ActionPerformed

    private void btnOption9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption9ActionPerformed
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Icon2.png"));
        ImageIcon tamano = new ImageIcon(icon.getImage().getScaledInstance(5, 5, 1));
        String options[] = {"Option A", "Option B", "Option C", "Option D"};
            int selection = JOptionPane.showOptionDialog(null, "Es necesario seleccionar una opcion", "Titulo", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        
    }//GEN-LAST:event_btnOption9ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalDialog().setVisible(true);
            }
        });
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOption1;
    private javax.swing.JButton btnOption2;
    private javax.swing.JButton btnOption3;
    private javax.swing.JButton btnOption4;
    private javax.swing.JButton btnOption5;
    private javax.swing.JButton btnOption6;
    private javax.swing.JButton btnOption7;
    private javax.swing.JButton btnOption8;
    private javax.swing.JButton btnOption9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
