
package sistemarodoviario.view;


public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaPrincipal = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTela = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuRodoviaria = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuAssento = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("onibus assentos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fe(evt);
            }
        });

        jPanelTelaPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        jPanelTelaPrincipal.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/images.png"))); // NOI18N

        jLabelTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTela)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(18, 18, 18)
                .addComponent(jLabelTela)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jMenuRodoviaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ICONE.png"))); // NOI18N
        jMenuRodoviaria.setText("Rodoviaria");
        jMenuRodoviaria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenu1.setText("Vizualizar passageiro");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu1.setHideActionText(true);
        jMenuRodoviaria.add(jMenu1);

        jMenuAssento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuAssento.setText("Reservar Assento");
        jMenuAssento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuRodoviaria.add(jMenuAssento);

        jMenuBarTelaPrincipal.add(jMenuRodoviaria);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuCadastros.setText("Onibus a Frota");
        jMenuCadastros.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuCadastro.add(jMenuCadastros);

        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuCliente.setText("Cliente");
        jMenuCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaCadastraCliente(evt);
            }
        });
        jMenuCadastro.add(jMenuCliente);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_telaCadastraCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaCadastraCliente

        TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente(this);
        telaCadastroCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaCadastraCliente

    private void fe(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fe
        // TODO add your handling code here:
    }//GEN-LAST:event_fe

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTela;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAssento;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenu jMenuRodoviaria;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
