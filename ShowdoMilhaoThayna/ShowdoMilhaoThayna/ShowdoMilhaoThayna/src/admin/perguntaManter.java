package admin;

import dao.PerguntaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pergunta;

public class perguntaManter extends javax.swing.JFrame {

    List<Pergunta> lista;
    Integer pos, ult;

    public perguntaManter() {
        initComponents();
        PerguntaDAO dao = new PerguntaDAO();
        lista = dao.listar();
        pos = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        b = new javax.swing.JLabel();
        txtEnunciado = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        botaoinserir2 = new javax.swing.JButton();
        botaolimpar = new javax.swing.JButton();
        botaoexcluir = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();
        pergunta = new javax.swing.JLabel();
        listagem = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        botaoprimeiro2 = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        txtB = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        d = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        nivel = new javax.swing.JLabel();
        resp = new javax.swing.JLabel();
        cbxResposta = new javax.swing.JComboBox();
        cbxNivel = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b.setText("B:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        botaoinserir2.setBackground(new java.awt.Color(255, 255, 255));
        botaoinserir2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoinserir2.setText("Inserir");
        botaoinserir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserir2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(botaoinserir2)
                .addGap(18, 18, 18)
                .addComponent(botaolimpar)
                .addGap(18, 18, 18)
                .addComponent(botaoexcluir)
                .addGap(18, 18, 18)
                .addComponent(botaoconsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoinserir2)
                    .addComponent(botaolimpar)
                    .addComponent(botaoexcluir)
                    .addComponent(botaoconsultar))
                .addContainerGap())
        );

        pergunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pergunta.setText("Pergunta");

        listagem.setBackground(new java.awt.Color(255, 255, 255));
        listagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listagem.setText("Ir para a listagem");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        botaoprimeiro2.setBackground(new java.awt.Color(255, 255, 255));
        botaoprimeiro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoprimeiro2.setText("Primeiro");
        botaoprimeiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiro2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botaoprimeiro2)
                .addGap(18, 18, 18)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoprimeiro2)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoultimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        a.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        a.setText("A:");

        enunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enunciado.setText("Enunciado:");

        c.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c.setText("C:");

        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        d.setText("D:");

        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });

        nivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nivel.setText("Nível de dificuldade:");

        resp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resp.setText("Resposta Certa:");

        cbxResposta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxResposta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "A", "B", "C", "D" }));

        cbxNivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "1", "2", "3", "4", "5" }));
        cbxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNivelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID:");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(enunciado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnunciado)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(pergunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(listagem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d)
                            .addComponent(c)
                            .addComponent(a)
                            .addComponent(b))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA)
                            .addComponent(txtB)
                            .addComponent(txtC)
                            .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listagem)
                    .addComponent(pergunta))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enunciado)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resp)
                    .addComponent(cbxResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivel)
                    .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoinserir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserir2ActionPerformed
        Pergunta o = new Pergunta();
        Boolean deu = false;
        if (txtEnunciado.getText().isEmpty() || txtA.getText().isEmpty() || txtB.getText().isEmpty()
                || txtC.getText().isEmpty() || txtD.getText().isEmpty() || cbxNivel.getSelectedIndex() == 0
                || cbxResposta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos as lacunas!");
            deu = false;
        } else {
            deu = true;
        }
        if (deu == true) {
            o.setEnunciado(txtEnunciado.getText());
            o.setA(txtA.getText());
            o.setB(txtB.getText());
            o.setC(txtC.getText());
            o.setD(txtD.getText());
            o.setNivel(Integer.parseInt(cbxNivel.getSelectedItem().toString()));
            o.setCerta(cbxResposta.getSelectedItem().toString());
            PerguntaDAO dao = new PerguntaDAO();
            dao.inserir(o);
            lista = dao.listar();
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }
    }//GEN-LAST:event_botaoinserir2ActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(null, "Limpeza com sucesso!");
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        if (txtEnunciado.getText().isEmpty() == false) {
            if (lista.size() >= 0) {
                PerguntaDAO dao = new PerguntaDAO();
                Boolean deucerto = dao.excluir(lista.get(pos));
                if (deucerto == true) {
                    Limpar();
                    pos= 0;
                    lista = dao.listar();
                    JOptionPane.showMessageDialog(null, "Excluído!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            }
        }
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        Integer id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da pergunta que deseja pesquisar: "));
        boolean encontrou = false;
        Integer posicaoencontrou= 0;
        for (Pergunta pergunta : lista) {
            if (id == (pergunta.getId())) {
                encontrou = true;
                pos = posicaoencontrou;
                txtEnunciado.setText(pergunta.getEnunciado());
                txtA.setText(pergunta.getA());
                txtB.setText(pergunta.getB());
                txtC.setText(pergunta.getC());
                txtD.setText(pergunta.getD());
                cbxNivel.setSelectedItem(pergunta.getNivel());
                cbxResposta.setSelectedItem(pergunta.getCerta());
                txtID.setText(pergunta.getId().toString());
                pos = posicaoencontrou;
                break;
            }
            posicaoencontrou++;
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Pergunta encontrada!");
        } else {
            JOptionPane.showMessageDialog(null, "Pergunta não encontrada!");
            Limpar();
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        perguntaListar l = new perguntaListar();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    private void botaoprimeiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiro2ActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        pos = 0;
        Pergunta elemento = lista.get(0);
        if (lista.size() > 0) {
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtID.setText(elemento.getId().toString());
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoprimeiro2ActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            pos = pos - 1;
            Pergunta elemento = lista.get(pos);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtID.setText(elemento.getId().toString());
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        } 
        if (pos==0) {
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (pos < lista.size() - 1) {
            pos = pos + 1;
            Pergunta elemento = lista.get(pos);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtID.setText(elemento.getId().toString());
        }
        if (lista.size() - 1 == pos) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);
        if (lista.size() > 0) {
            pos = lista.size() - 1;
            Pergunta elemento = lista.get(pos);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtID.setText(elemento.getId().toString());
        }
        if (lista.size() - 1 == pos && lista.size() == 1) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDActionPerformed

    private void cbxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNivelActionPerformed

    public void Limpar() {
        txtEnunciado.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        cbxNivel.setSelectedIndex(0);
        cbxResposta.setSelectedIndex(0);
        txtID.setText(null);
    }

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaoinserir2;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro2;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JLabel c;
    private javax.swing.JComboBox cbxNivel;
    private javax.swing.JComboBox cbxResposta;
    private javax.swing.JLabel d;
    private javax.swing.JLabel enunciado;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listagem;
    private javax.swing.JLabel nivel;
    private javax.swing.JLabel pergunta;
    private javax.swing.JLabel resp;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
