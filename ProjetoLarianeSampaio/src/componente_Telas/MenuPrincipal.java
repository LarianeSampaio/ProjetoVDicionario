
package componente_Telas;


public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jimCliente = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jimAutor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmCadastros.setText("Cadastros");

        jimCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente_Imagens/cadastro.png"))); // NOI18N
        jimCliente.setText("Cadastros");
        jimCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimClienteActionPerformed(evt);
            }
        });
        jmCadastros.add(jimCliente);

        jMenuBar1.add(jmCadastros);

        jMenuSobre.setText("Sobre");

        jimAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente_Imagens/profile.png"))); // NOI18N
        jimAutor.setText("Autor");
        jimAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimAutorActionPerformed(evt);
            }
        });
        jMenuSobre.add(jimAutor);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jimClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jimClienteActionPerformed
        TelaCadastro cliente = new TelaCadastro();
        cliente.setVisible( true );
    }//GEN-LAST:event_jimClienteActionPerformed

    private void jimAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jimAutorActionPerformed
       TelaAutor autor = new TelaAutor();
       autor.setVisible( true );
    }//GEN-LAST:event_jimAutorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    AplicaNimbusLookAndFeel.pegaNimbus();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenuItem jimAutor;
    private javax.swing.JMenuItem jimCliente;
    private javax.swing.JMenu jmCadastros;
    // End of variables declaration//GEN-END:variables
}
