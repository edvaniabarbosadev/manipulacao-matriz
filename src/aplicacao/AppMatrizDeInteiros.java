package aplicacao;

import entidades.Cabecalho;
import entidades.MatrizDeInteiros;
import entidades.TabelaModelo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class AppMatrizDeInteiros extends javax.swing.JFrame {
    
    MatrizDeInteiros matriz;
    TabelaModelo tabela;

    AppMatrizDeInteiros() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOrdemMatriz = new javax.swing.JPanel();
        lblOrdemMatr = new javax.swing.JLabel();
        lblLinhas = new javax.swing.JLabel();
        lblColunas = new javax.swing.JLabel();
        txtLinhas = new javax.swing.JTextField();
        txtColunas = new javax.swing.JTextField();
        btnDefinirMartiz = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        splMatriz = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        pnlOperacoes = new javax.swing.JPanel();
        lblOperacoes = new javax.swing.JLabel();
        btnDiagPrincipa = new javax.swing.JButton();
        btnDiagSecundaria = new javax.swing.JButton();
        btnSomaLinhas = new javax.swing.JButton();
        btnSomaColunas = new javax.swing.JButton();
        btnTransposta = new javax.swing.JButton();
        btnSomaTotal = new javax.swing.JButton();
        btnGerarMatriz = new javax.swing.JButton();
        btnTrocarValores = new javax.swing.JButton();
        btnPares = new javax.swing.JButton();
        btnMaiorValor = new javax.swing.JButton();
        btnSubstituirValores = new javax.swing.JButton();
        btnSimetrica = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnBuscarValor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlOrdemMatriz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlOrdemMatriz.setName("pnlOrdemMatriz"); // NOI18N

        lblOrdemMatr.setText("Ordem da Matriz: ");

        lblLinhas.setText("Linhas: ");

        lblColunas.setText("Colunas:");

        btnDefinirMartiz.setText("Definir Matriz");
        btnDefinirMartiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirMartizActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOrdemMatrizLayout = new javax.swing.GroupLayout(pnlOrdemMatriz);
        pnlOrdemMatriz.setLayout(pnlOrdemMatrizLayout);
        pnlOrdemMatrizLayout.setHorizontalGroup(
            pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdemMatrizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrdemMatrizLayout.createSequentialGroup()
                        .addComponent(lblOrdemMatr)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlOrdemMatrizLayout.createSequentialGroup()
                        .addGroup(pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOrdemMatrizLayout.createSequentialGroup()
                                .addComponent(lblLinhas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColunas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdemMatrizLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDefinirMartiz)))
                .addContainerGap())
        );
        pnlOrdemMatrizLayout.setVerticalGroup(
            pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdemMatrizLayout.createSequentialGroup()
                .addGroup(pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrdemMatrizLayout.createSequentialGroup()
                        .addComponent(lblOrdemMatr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLinhas)
                            .addComponent(lblColunas)
                            .addComponent(txtLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdemMatrizLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlOrdemMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDefinirMartiz)
                            .addComponent(btnLimpar))))
                .addContainerGap())
        );

        splMatriz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        splMatriz.setViewportView(tblMatriz);

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        pnlOperacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblOperacoes.setText("Operaçoes");

        btnDiagPrincipa.setText("Diag Principal");
        btnDiagPrincipa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagPrincipaActionPerformed(evt);
            }
        });

        btnDiagSecundaria.setText("Diag Secundaria");
        btnDiagSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSecundariaActionPerformed(evt);
            }
        });

        btnSomaLinhas.setText("Soma Linhas");
        btnSomaLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaLinhasActionPerformed(evt);
            }
        });

        btnSomaColunas.setText("Soma Colunas");
        btnSomaColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaColunasActionPerformed(evt);
            }
        });

        btnTransposta.setText("Transposta");
        btnTransposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranspostaActionPerformed(evt);
            }
        });

        btnSomaTotal.setText("Somar Tudo");
        btnSomaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaTotalActionPerformed(evt);
            }
        });

        btnGerarMatriz.setText("Gerar Matriz");
        btnGerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarMatrizActionPerformed(evt);
            }
        });

        btnTrocarValores.setText("Trocar Valores");
        btnTrocarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarValoresActionPerformed(evt);
            }
        });

        btnPares.setText("Pares");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        btnMaiorValor.setText("Maior Valor");
        btnMaiorValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorValorActionPerformed(evt);
            }
        });

        btnSubstituirValores.setText("Substituir Valores");
        btnSubstituirValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubstituirValoresActionPerformed(evt);
            }
        });

        btnSimetrica.setText("Simétrica?");
        btnSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimetricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOperacoesLayout = new javax.swing.GroupLayout(pnlOperacoes);
        pnlOperacoes.setLayout(pnlOperacoesLayout);
        pnlOperacoesLayout.setHorizontalGroup(
            pnlOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacoesLayout.createSequentialGroup()
                .addGroup(pnlOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOperacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOperacoes))
                    .addGroup(pnlOperacoesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnlOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDiagPrincipa)
                            .addComponent(btnDiagSecundaria)
                            .addComponent(btnSomaLinhas)
                            .addComponent(btnSomaColunas)
                            .addComponent(btnTransposta)
                            .addComponent(btnSomaTotal)
                            .addComponent(btnGerarMatriz)
                            .addComponent(btnTrocarValores)
                            .addComponent(btnPares)
                            .addComponent(btnMaiorValor)
                            .addComponent(btnSubstituirValores)
                            .addComponent(btnSimetrica))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlOperacoesLayout.setVerticalGroup(
            pnlOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOperacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerarMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiagPrincipa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiagSecundaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSomaTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSomaLinhas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSomaColunas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrocarValores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaiorValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubstituirValores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSimetrica)
                .addGap(46, 46, 46))
        );

        lblValor1.setText("Insira um valor:");

        btnBuscarValor.setText("Buscar");
        btnBuscarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(splMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlOrdemMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlOrdemMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(splMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor1)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarValor)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                                                                                        //txtLinhas           // Linhas
    private Boolean validaTextFieldOrdemMatriz(JTextField textField, String nomeCampo) {
        if (
             textField.getText().isEmpty() || 
             Integer.parseInt(textField.getText()) <= 0
         ) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Informe um valor valido para " + nomeCampo, 
                    "Manipula Matriz",
                    0
            );
            return false;
        } else {
            return true;
        }
    }
    
    private void formataTabela() { // Insere os valores da matriz para a tabela
        tabela = new TabelaModelo(matriz.getMatriz());
        tblMatriz.setModel(tabela);
        Cabecalho cabecalho = new Cabecalho();
        TableColumn tableColumn = tblMatriz.getColumn("");
        tableColumn.setCellRenderer(cabecalho);
        tblMatriz.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
    
    private void btnDefinirMartizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirMartizActionPerformed
        if (validaTextFieldOrdemMatriz(txtLinhas, "Linhas") && validaTextFieldOrdemMatriz(txtColunas, "Colunas")) {
            int linha = Integer.parseInt(txtLinhas.getText());
            int coluna = Integer.parseInt(txtColunas.getText());
            matriz = new MatrizDeInteiros(linha, coluna);
            formataTabela();
        }
    }//GEN-LAST:event_btnDefinirMartizActionPerformed

    private void btnGerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarMatrizActionPerformed
       matriz.setMatriz();
       formataTabela(); 
    }//GEN-LAST:event_btnGerarMatrizActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txaResultado.setText("");
        txtLinhas.setText(null);
        txtColunas.setText(null);
        tabela.excluiLinhasTabela();
        txtLinhas.requestFocusInWindow();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSomaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaTotalActionPerformed
        txaResultado.setText(String.valueOf(matriz.somaMatriz()));        
    }//GEN-LAST:event_btnSomaTotalActionPerformed

    private void btnSomaLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaLinhasActionPerformed
        String textoSomaLinha = "";
        int[] arraySomaLinha = matriz.somaLinhas();
        for(int i = 0; i < arraySomaLinha.length; i++) {
            textoSomaLinha += "Linha " + i + ": " + arraySomaLinha[i] + "\n";
        }
        txaResultado.setText(textoSomaLinha);
    }//GEN-LAST:event_btnSomaLinhasActionPerformed

    private void btnSomaColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaColunasActionPerformed
        String textoSomaColuna = "";
        int[] arraySomaColuna = matriz.somaColunas();
        for(int i = 0; i < arraySomaColuna.length; i++) {
            textoSomaColuna += "Linha " + i + ": " + arraySomaColuna[i] + "\n";
        }
        txaResultado.setText(textoSomaColuna);
    }//GEN-LAST:event_btnSomaColunasActionPerformed

    private void btnTranspostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranspostaActionPerformed
        matriz.transposta();
        formataTabela();
    }//GEN-LAST:event_btnTranspostaActionPerformed

    private void btnDiagPrincipaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagPrincipaActionPerformed
       txaResultado.setText(matriz.diagonalPrincipal());
    }//GEN-LAST:event_btnDiagPrincipaActionPerformed

    private void btnDiagSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSecundariaActionPerformed
        txaResultado.setText(matriz.diagonalSecundaria());
    }//GEN-LAST:event_btnDiagSecundariaActionPerformed

    private void btnTrocarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarValoresActionPerformed
        matriz.trocarValores();
        formataTabela();
    }//GEN-LAST:event_btnTrocarValoresActionPerformed

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
        txaResultado.setText(matriz.valoresPares());
    }//GEN-LAST:event_btnParesActionPerformed

    private void btnMaiorValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiorValorActionPerformed
        txaResultado.setText(matriz.maiorValor());
    }//GEN-LAST:event_btnMaiorValorActionPerformed

    private void btnSubstituirValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubstituirValoresActionPerformed
        matriz.substituirParesImpar();
        formataTabela();
    }//GEN-LAST:event_btnSubstituirValoresActionPerformed

    private void btnSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimetricaActionPerformed
        txaResultado.setText(matriz.isSimetrica());
    }//GEN-LAST:event_btnSimetricaActionPerformed

    private void btnBuscarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarValorActionPerformed
       txaResultado.setText(matriz.encontrarValor(Integer.parseInt(txtValor.getText())));
       txtValor.setText("");
    }//GEN-LAST:event_btnBuscarValorActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppMatrizDeInteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMatrizDeInteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMatrizDeInteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMatrizDeInteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMatrizDeInteiros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarValor;
    private javax.swing.JButton btnDefinirMartiz;
    private javax.swing.JButton btnDiagPrincipa;
    private javax.swing.JButton btnDiagSecundaria;
    private javax.swing.JButton btnGerarMatriz;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMaiorValor;
    private javax.swing.JButton btnPares;
    private javax.swing.JButton btnSimetrica;
    private javax.swing.JButton btnSomaColunas;
    private javax.swing.JButton btnSomaLinhas;
    private javax.swing.JButton btnSomaTotal;
    private javax.swing.JButton btnSubstituirValores;
    private javax.swing.JButton btnTransposta;
    private javax.swing.JButton btnTrocarValores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColunas;
    private javax.swing.JLabel lblLinhas;
    private javax.swing.JLabel lblOperacoes;
    private javax.swing.JLabel lblOrdemMatr;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JPanel pnlOperacoes;
    private javax.swing.JPanel pnlOrdemMatriz;
    private javax.swing.JScrollPane splMatriz;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtColunas;
    private javax.swing.JTextField txtLinhas;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
