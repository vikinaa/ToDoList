/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todo;

/**
 *
 * @author vikto
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Menu() {
        initComponents();
        this.setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        addNoteButton = new javax.swing.JButton();
        peekNotesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("To-do list");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 44, -1, -1));

        addNoteButton.setBackground(new java.awt.Color(204, 204, 204));
        addNoteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addNoteButton.setText("Добави бележка");
        addNoteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addNoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNoteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addNoteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 201, 70));

        peekNotesButton.setBackground(new java.awt.Color(204, 204, 204));
        peekNotesButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        peekNotesButton.setText("Преглеждане на бележки");
        peekNotesButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        peekNotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peekNotesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(peekNotesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 201, 71));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\OneDrive\\Работен плот\\spiral-notebook-paper-texture3.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 820, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNoteButtonActionPerformed

        this.setVisible(false);
        new AddNote().setVisible(true);
        


    }//GEN-LAST:event_addNoteButtonActionPerformed

    private void peekNotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peekNotesButtonActionPerformed
        this.setVisible(false);
        new Notes().setVisible(true);
    }//GEN-LAST:event_peekNotesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNoteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton peekNotesButton;
    // End of variables declaration//GEN-END:variables
}
