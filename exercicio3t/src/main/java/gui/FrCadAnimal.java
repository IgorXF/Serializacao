package gui;


import classes.Animal;
import gerenciador.GerenciaAnimal;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author igorxf
 */
public class FrCadAnimal extends javax.swing.JFrame {

    private boolean editando;
    private String codAntigo;
    private GerenciaAnimal gerenciadorAnimal;

    public FrCadAnimal() throws FileNotFoundException {
        this.editando = false;
        this.codAntigo = "";
        this.gerenciadorAnimal = new GerenciaAnimal();
        initComponents();
        this.limparCampos();
        this.habilitarCampos(false);
        
        gerenciadorAnimal.carregarDoArquivo("ListagemAnimal.csv");
        edtListagem.setText(gerenciadorAnimal.toString());
    }

    public void habilitarCampos(boolean flag) {
        edtCod.setEnabled(flag);
        edtRaca.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtEspecie.setEnabled(flag);
        edtPeso.setEnabled(flag);
    }

    public void limparCampos() {
        edtCod.setText("");
        edtRaca.setText("");
        edtIdade.setText("");
        edtEspecie.setText("");
        edtPeso.setText("");
    }

    public void objetoParaCampos(Animal a) {
        edtCod.setText(a.getCod());
        edtRaca.setText(a.getRaca());
        edtIdade.setText(a.getIdade() + "");
        edtPeso.setText(a.getPeso() + "");
        edtEspecie.setText(a.getEspecie());
    }

    public Animal camposParaObjeto() {
        Animal a = new Animal();
        a.setCod(edtCod.getText());
        a.setEspecie(edtEspecie.getText());
        a.setRaca(edtRaca.getText());
        
        String idade = edtIdade.getText();
        int c = 0;
        if (!idade.isEmpty()) {
            c = Integer.parseInt(idade);
        }
        a.setIdade(c);

        
        String peso = edtPeso.getText();
        double b = 0.0;
        if (!peso.isEmpty()) {
            b = Double.parseDouble(peso);
        }
        a.setPeso(b);

        
        return a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        penBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        bntSalvar = new javax.swing.JButton();
        penAtributos = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        edtCod = new javax.swing.JTextField();
        edtRaca = new javax.swing.JTextField();
        edtEspecie = new javax.swing.JTextField();
        edtPeso = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Noto Sans Light", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Animal");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        penBotoes.add(btnNovo);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        penBotoes.add(btnEditar);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        penBotoes.add(btnCancelar);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        penBotoes.add(btnExcluir);

        bntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_32x32.png"))); // NOI18N
        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });
        penBotoes.add(bntSalvar);

        lblCod.setText("Cod:");

        lblRaca.setText("Raça:");

        lblIdade.setText("Idade:");

        lblEspecie.setText("Espécie:");

        lblPeso.setText("Peso:");

        edtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodActionPerformed(evt);
            }
        });

        edtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEspecieActionPerformed(evt);
            }
        });

        edtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout penAtributosLayout = new javax.swing.GroupLayout(penAtributos);
        penAtributos.setLayout(penAtributosLayout);
        penAtributosLayout.setHorizontalGroup(
            penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penAtributosLayout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCod)
                        .addGap(13, 13, 13))
                    .addGroup(penAtributosLayout.createSequentialGroup()
                        .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(penAtributosLayout.createSequentialGroup()
                                .addComponent(edtIdade)
                                .addGap(3, 3, 3))
                            .addComponent(edtPeso))))
                .addGap(144, 144, 144)
                .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtRaca)
                    .addComponent(edtEspecie))
                .addGap(145, 145, 145))
        );
        penAtributosLayout.setVerticalGroup(
            penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penAtributosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(lblRaca)
                    .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(lblEspecie)
                    .addComponent(edtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(penBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(penAtributos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(penBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCodActionPerformed

    private void edtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEspecieActionPerformed

    private void edtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPesoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String codEscolhido = JOptionPane.showInputDialog("Informe o Cod do Animal que deseja EDITAR:", "");

        Animal animalEditando = gerenciadorAnimal.buscarAnimal(codEscolhido);

        if (animalEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe este animal.");
            this.editando = false;
        } else {
            this.limparCampos();
            this.habilitarCampos(true);

            this.objetoParaCampos(animalEditando);
            this.editando = true;
            this.codAntigo = animalEditando.getCod();
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String codEscolhido = JOptionPane.showInputDialog("Informe o Cod do animal que deseja excluir:", "");

        Animal a = gerenciadorAnimal.buscarAnimal(codEscolhido);

        if (a == null) {
            JOptionPane.showMessageDialog(this, "Não existe este Animal.");
        } else {
            gerenciadorAnimal.removerAnimal(codEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }
        
        String listagem = gerenciadorAnimal.toString();
        edtListagem.setText(listagem);

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        Animal a = this.camposParaObjeto();


        if(this.editando){
            gerenciadorAnimal.atualizarAnimal(codAntigo, a);
        }else{
            gerenciadorAnimal.adicionarAnimal(a);
        }

        
        //No final reset a tela
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        String listagem = gerenciadorAnimal.toString();
        edtListagem.setText(listagem);
        
        try {
            gerenciadorAnimal.salvarNoArquivo("ListagemAnimal.csv");
        } catch (IOException ex) {
            Logger.getLogger(FrCadAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JTextField edtCod;
    private javax.swing.JTextField edtEspecie;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtPeso;
    private javax.swing.JTextField edtRaca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel penAtributos;
    private javax.swing.JPanel penBotoes;
    // End of variables declaration//GEN-END:variables

}
