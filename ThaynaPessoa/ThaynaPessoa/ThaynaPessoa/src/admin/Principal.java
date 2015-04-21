package admin;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuPessoaL = new javax.swing.JMenuItem();
        mnuPessoaG = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mnuCidadeL = new javax.swing.JMenuItem();
        mnuCidadeG = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Pessoa");

        mnuPessoaL.setText("Listar");
        mnuPessoaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoaLActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPessoaL);

        mnuPessoaG.setText("Gerenciar");
        mnuPessoaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoaGActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPessoaG);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("Cidade");

        mnuCidadeL.setText("Listar");
        mnuCidadeL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCidadeLActionPerformed(evt);
            }
        });
        jMenu8.add(mnuCidadeL);

        mnuCidadeG.setText("Gerenciar");
        mnuCidadeG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCidadeGActionPerformed(evt);
            }
        });
        jMenu8.add(mnuCidadeG);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPessoaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoaLActionPerformed
        pessoaListar telalistarp = new pessoaListar();
        telalistarp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telalistarp.setVisible(true);
    }//GEN-LAST:event_mnuPessoaLActionPerformed

    private void mnuPessoaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoaGActionPerformed
        PessoaJFrame tela = new PessoaJFrame();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_mnuPessoaGActionPerformed

    private void mnuCidadeLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCidadeLActionPerformed
        cidadeListar telalist = new cidadeListar();
        telalist.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telalist.setVisible(true);
    }//GEN-LAST:event_mnuCidadeLActionPerformed

    private void mnuCidadeGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCidadeGActionPerformed
        CidadeJFrame telacid = new CidadeJFrame();
        telacid.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telacid.setVisible(true);
    }//GEN-LAST:event_mnuCidadeGActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mnuCidadeG;
    private javax.swing.JMenuItem mnuCidadeL;
    private javax.swing.JMenuItem mnuPessoaG;
    private javax.swing.JMenuItem mnuPessoaL;
    // End of variables declaration//GEN-END:variables
}
