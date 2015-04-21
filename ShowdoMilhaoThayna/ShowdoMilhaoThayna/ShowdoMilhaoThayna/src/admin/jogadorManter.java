package admin;

import dao.JogadorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class jogadorManter extends javax.swing.JFrame {

    List<Jogador> lista;
    Integer pos, ult;

    public jogadorManter() {
        initComponents();
       
        JogadorDAO dao = new JogadorDAO();
        lista = dao.listar();
        pos= 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoprimeiro = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botaoinserir = new javax.swing.JButton();
        botaolimpar = new javax.swing.JButton();
        botaoexcluir = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();
        listagem = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jogador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jogador.setText("Jogador");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        botaoprimeiro.setBackground(new java.awt.Color(255, 255, 255));
        botaoprimeiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoprimeiro.setText("Primeiro");
        botaoprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiroActionPerformed(evt);
            }
        });

        botaoanterior.setBackground(new java.awt.Color(255, 255, 255));
        botaoanterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoanterior.setText("Anterior");
        botaoanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoanteriorActionPerformed(evt);
            }
        });

        botaoproximo.setBackground(new java.awt.Color(255, 255, 255));
        botaoproximo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoproximo.setText("Próximo");
        botaoproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoproximoActionPerformed(evt);
            }
        });

        botaoultimo.setBackground(new java.awt.Color(255, 255, 255));
        botaoultimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoultimo.setText("Último");
        botaoultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botaoprimeiro)
                .addGap(18, 18, 18)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoprimeiro)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoultimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        botaoinserir.setBackground(new java.awt.Color(255, 255, 255));
        botaoinserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoinserir.setText("Inserir");
        botaoinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserirActionPerformed(evt);
            }
        });

        botaolimpar.setBackground(new java.awt.Color(255, 255, 255));
        botaolimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaolimpar.setText("Limpar");
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });

        botaoexcluir.setBackground(new java.awt.Color(255, 255, 255));
        botaoexcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoexcluir.setText("Excluir");
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });

        botaoconsultar.setBackground(new java.awt.Color(255, 255, 255));
        botaoconsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(botaoinserir)
                .addGap(18, 18, 18)
                .addComponent(botaolimpar)
                .addGap(18, 18, 18)
                .addComponent(botaoexcluir)
                .addGap(18, 18, 18)
                .addComponent(botaoconsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoinserir)
                    .addComponent(botaolimpar)
                    .addComponent(botaoexcluir)
                    .addComponent(botaoconsultar))
                .addContainerGap())
        );

        listagem.setBackground(new java.awt.Color(255, 255, 255));
        listagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listagem.setText("Ir para a listagem");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(125, 125, 125)))
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jogador)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(listagem)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listagem)
                    .addComponent(jogador))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            pos = 0;
            Jogador elemento = lista.get(0);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            pos = pos - 1;
            Jogador elemento = lista.get(pos);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
        if (pos == 0) {
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (pos < lista.size() - 1) {
            pos = pos + 1;
            Jogador elemento = lista.get(pos);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() - 1 == pos) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);
        if (lista.size() > 0) {
            pos = lista.size() - 1;
            Jogador elemento = lista.get(pos);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() - 1 == pos && lista.size() == 1) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
        Jogador obj = new Jogador();
        Boolean deu = false;
        if (txtSenha.getText().isEmpty() || txtLogin.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos as lacunas!");
            deu = false;
        } else {
            deu = true;
        }
        if (deu == true) {
            obj.setLogin(txtLogin.getText());
            obj.setSenha(txtSenha.getText());
            obj.setEmail(txtEmail.getText());
            JogadorDAO dao = new JogadorDAO();
            dao.inserir(obj);
            lista = dao.listar();
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(null, "Limpeza efetuada com sucesso!");
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        if (txtLogin.getText().isEmpty() == false) {
            if (lista.size() >= 0) {
                JogadorDAO dao = new JogadorDAO();
                Boolean deucerto = dao.excluir(lista.get(pos));
                if (deucerto == true) {
                    Limpar();
                    pos = 0;
                    lista = dao.listar();
                    JOptionPane.showMessageDialog(null, "Excluído!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String login = JOptionPane.showInputDialog("Digite o login do jogador que deseja pesquisar: ");
        boolean encontra = false;
        Integer posicaoencontrou = 0;
        for (Jogador j: lista) {
            if (login.equals(j.getLogin())) {
                encontra = true;
                pos = posicaoencontrou;
                txtLogin.setText(j.getLogin());
                txtSenha.setText(j.getSenha());
                txtEmail.setText(j.getEmail());
                pos = posicaoencontrou;
                break;
            }
            posicaoencontrou++;
        }
        if (encontra == true) {
            JOptionPane.showMessageDialog(null, "Login encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Não achamos seu login ou não há nenhum cadastrado.");
            Limpar();
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        jogadorListar lista = new jogadorListar();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    public void Limpar() {
        txtLogin.setText("");
        txtSenha.setText("");
        txtEmail.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogadorManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaoinserir;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jogador;
    private javax.swing.JButton listagem;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
