/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Formation
 */
public class NewBienvenue extends javax.swing.JPanel {

    /**
     * Creates new form NewBienvenue
     */
    public NewBienvenue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelBienvenue = new javax.swing.JLabel();
        jLabelIdentifiant = new javax.swing.JLabel();
        jLabelPasword = new javax.swing.JLabel();
        jTextFieldIdentifiant = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonBienvenueConnecter = new javax.swing.JButton();
        jButtonBienvenueDeconnection = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 691));
        setMinimumSize(new java.awt.Dimension(1000, 691));
        setPreferredSize(new java.awt.Dimension(1000, 691));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0};
        layout.rowHeights = new int[] {0, 6, 0, 6, 0, 6, 0, 6, 0, 6, 0};
        setLayout(layout);

        jLabelBienvenue.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelBienvenue.setText("Bienvenue sur airafpa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(102, 5, 107, 5);
        add(jLabelBienvenue, gridBagConstraints);

        jLabelIdentifiant.setText("identifiant");
        jLabelIdentifiant.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabelIdentifiant.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabelIdentifiant.setPreferredSize(new java.awt.Dimension(100, 20));
        jLabelIdentifiant.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 33, 0, 33);
        add(jLabelIdentifiant, gridBagConstraints);

        jLabelPasword.setText("pasword");
        jLabelPasword.setMaximumSize(new java.awt.Dimension(100, 24));
        jLabelPasword.setMinimumSize(new java.awt.Dimension(100, 24));
        jLabelPasword.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        add(jLabelPasword, gridBagConstraints);

        jTextFieldIdentifiant.setMaximumSize(new java.awt.Dimension(150, 24));
        jTextFieldIdentifiant.setMinimumSize(new java.awt.Dimension(150, 24));
        jTextFieldIdentifiant.setOpaque(false);
        jTextFieldIdentifiant.setPreferredSize(new java.awt.Dimension(150, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(jTextFieldIdentifiant, gridBagConstraints);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setMinimumSize(new java.awt.Dimension(150, 24));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(150, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        add(jPasswordField1, gridBagConstraints);

        jButtonBienvenueConnecter.setText("connecter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        add(jButtonBienvenueConnecter, gridBagConstraints);

        jButtonBienvenueDeconnection.setText("deconnection");
        jButtonBienvenueDeconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBienvenueDeconnectionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        add(jButtonBienvenueDeconnection, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBienvenueDeconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBienvenueDeconnectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBienvenueDeconnectionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBienvenueConnecter;
    private javax.swing.JButton jButtonBienvenueDeconnection;
    private javax.swing.JLabel jLabelBienvenue;
    private javax.swing.JLabel jLabelIdentifiant;
    private javax.swing.JLabel jLabelPasword;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldIdentifiant;
    // End of variables declaration//GEN-END:variables
}