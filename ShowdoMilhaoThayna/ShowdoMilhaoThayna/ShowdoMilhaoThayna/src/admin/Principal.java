package admin;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        imagem1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuJogadorL = new javax.swing.JMenuItem();
        mnuJogadorG = new javax.swing.JMenuItem();
        mnuPerguntaL = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuPerguntaG = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/showimagem.jpg"))); // NOI18N
        imagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem1MouseClicked(evt);
            }
        });

        jMenu1.setText("Jogador");

        mnuJogadorL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mnuJogadorL.setText("Listar");
        mnuJogadorL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJogadorLActionPerformed(evt);
            }
        });
        jMenu1.add(mnuJogadorL);

        mnuJogadorG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        mnuJogadorG.setText("Gerenciar");
        mnuJogadorG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJogadorGActionPerformed(evt);
            }
        });
        jMenu1.add(mnuJogadorG);

        jMenuBar1.add(jMenu1);

        mnuPerguntaL.setText("Pergunta");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuPerguntaL.add(jMenuItem3);

        mnuPerguntaG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        mnuPerguntaG.setText("Gerenciar");
        mnuPerguntaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPerguntaGActionPerformed(evt);
            }
        });
        mnuPerguntaL.add(mnuPerguntaG);

        jMenuBar1.add(mnuPerguntaL);

        jMenu8.setText("Ranking");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Listar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(imagem1)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(imagem1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuJogadorLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJogadorLActionPerformed
        jogadorListar telalistarj = new jogadorListar();
        telalistarj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telalistarj.setVisible(true);        
    }//GEN-LAST:event_mnuJogadorLActionPerformed

    private void mnuJogadorGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJogadorGActionPerformed
        jogadorManter telaj = new jogadorManter();
        telaj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaj.setVisible(true);
    }//GEN-LAST:event_mnuJogadorGActionPerformed

    private void mnuPerguntaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPerguntaGActionPerformed
        perguntaManter telap = new perguntaManter();
        telap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telap.setVisible(true);
    }//GEN-LAST:event_mnuPerguntaGActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        perguntaListar telalistarp = new perguntaListar();
        telalistarp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telalistarp.setVisible(true);  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            rankingListar telar = new rankingListar();
            telar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            telar.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void imagem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem1MouseClicked
        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/showimagem2.jpg")));
    }//GEN-LAST:event_imagem1MouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnuJogadorG;
    private javax.swing.JMenuItem mnuJogadorL;
    private javax.swing.JMenuItem mnuPerguntaG;
    private javax.swing.JMenu mnuPerguntaL;
    // End of variables declaration//GEN-END:variables
}
