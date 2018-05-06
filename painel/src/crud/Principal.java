/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import javax.swing.JOptionPane;

/**
 *
 * @author lucaslimoni
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_sexo = new javax.swing.ButtonGroup();
        t_nome = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        c_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbx_maiordeidade = new javax.swing.JCheckBox();
        rbtn_masculino = new javax.swing.JRadioButton();
        rbtn_feminino = new javax.swing.JRadioButton();
        t_sexo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t_nome.setText("Nome");

        btn_enviar.setText("Enviar");
        btn_enviar.setAlignmentY(1.0F);
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });
        btn_enviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_enviarKeyPressed(evt);
            }
        });

        cbx_maiordeidade.setText("Maior de idade");

        grupo_sexo.add(rbtn_masculino);
        rbtn_masculino.setText("Masculino");

        grupo_sexo.add(rbtn_feminino);
        rbtn_feminino.setText("Feminino");

        t_sexo.setText("Sexo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_nome)
                    .addComponent(jLabel1)
                    .addComponent(t_sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_nome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_enviar)
                                    .addComponent(cbx_maiordeidade))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtn_masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(rbtn_feminino)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nome)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_maiordeidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_masculino)
                    .addComponent(rbtn_feminino)
                    .addComponent(t_sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btn_enviar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_enviarKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btn_enviarKeyPressed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        // TODO add your handling code here:
        String Idade = "";
        if(cbx_maiordeidade.isSelected())
            Idade = "Você é maior de idade!";
        else
            Idade = "Você é menor de idade!";
        
        String Sexo = "";
        
        if(rbtn_masculino.isSelected())
            Sexo = "Masculino";
        else if (rbtn_feminino.isSelected())
            Sexo = "Feminino";
        else
            Sexo = "Sexo não informado";
        
            
        JOptionPane.showMessageDialog(rootPane, "Seu nome é: " + c_nome.getText() + " e " + Idade + " e sexo: "+ Sexo, "Alerta", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(c_nome.getText());
    }//GEN-LAST:event_btn_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JTextField c_nome;
    private javax.swing.JCheckBox cbx_maiordeidade;
    private javax.swing.ButtonGroup grupo_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbtn_feminino;
    private javax.swing.JRadioButton rbtn_masculino;
    private javax.swing.JLabel t_nome;
    private javax.swing.JLabel t_sexo;
    // End of variables declaration//GEN-END:variables
}
