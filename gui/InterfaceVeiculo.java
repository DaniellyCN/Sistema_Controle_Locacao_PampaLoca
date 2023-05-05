/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Gerenciar.GerenciarVeiculo;
import Gerenciar.Lista;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author milena
 */
public class InterfaceVeiculo extends javax.swing.JFrame {
    GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    DefaultListModel modeloLista = new DefaultListModel();
    
    String modo;
    
    
    //Construtor 
    public InterfaceVeiculo(GerenciarVeiculo gerenciarVeiculo1) {
        initComponents();
        this.gerenciarVeiculo= gerenciarVeiculo; 
        
        setLocationRelativeTo(null);
        modo="Navegar";
        ManipularInterface();
        
        
        
    }

    public void loadTableVeiculo(){
   DefaultTableModel modeloCarro = new DefaultTableModel(new Object [] {
       "Placa","Modelo", "Marca","Ano", "Potencia", "Nºlugares" , "Categorias"},0);

           
    }  
    
    public void ManipularInterface(){
        switch(modo){
            case "Navegar":
            placaVeiculo.setEnabled(false);
            modeloVeiculo.setEnabled(false);
            marcaVeiculo.setEnabled(false);
            anoVeiculo.setEnabled(false);
            potenciaVeiculo.setEnabled(false);
            qtdLugarVeiculo.setEnabled(false);
            categoriaVeiculo.setEnabled(false);
            botaoNovo.setEnabled(true);
            botaoEditar.setEnabled(false);
            botaoExcluir.setEnabled(false);
            botaoSalvar.setEnabled(false);
            botaoCancelar.setEnabled(false);
            break;
            case "Novo":
            placaVeiculo.setEnabled(true);
            modeloVeiculo.setEnabled(true);
            marcaVeiculo.setEnabled(true);
            anoVeiculo.setEnabled(true);
            potenciaVeiculo.setEnabled(true);
            qtdLugarVeiculo.setEnabled(true);
            categoriaVeiculo.setEnabled(true);
            botaoNovo.setEnabled(false);
            botaoEditar.setEnabled(false);
            botaoExcluir.setEnabled(false);
            botaoSalvar.setEnabled(false);
            botaoCancelar.setEnabled(false);
            break;
            case "Editar":
            placaVeiculo.setEnabled(true);
            modeloVeiculo.setEnabled(true);
            marcaVeiculo.setEnabled(true);
            anoVeiculo.setEnabled(true);
            potenciaVeiculo.setEnabled(true);
            qtdLugarVeiculo.setEnabled(true);
            categoriaVeiculo.setEnabled(true);
            botaoNovo.setEnabled(false);
            botaoEditar.setEnabled(false);
            botaoExcluir.setEnabled(false);
            botaoSalvar.setEnabled(false);
            botaoCancelar.setEnabled(false);
             break;
            case "Excluir":
            placaVeiculo.setEnabled(false);
            modeloVeiculo.setEnabled(false);
            marcaVeiculo.setEnabled(false);
            anoVeiculo.setEnabled(false);
            potenciaVeiculo.setEnabled(false);
            qtdLugarVeiculo.setEnabled(false);
            categoriaVeiculo.setEnabled(false);
            botaoNovo.setEnabled(true);
            botaoEditar.setEnabled(false);
            botaoExcluir.setEnabled(false);
            botaoSalvar.setEnabled(false);
            botaoCancelar.setEnabled(false);
              break;
            case "Selecao":
            placaVeiculo.setEnabled(false);
            modeloVeiculo.setEnabled(false);
            marcaVeiculo.setEnabled(false);
            anoVeiculo.setEnabled(false);
            potenciaVeiculo.setEnabled(false);
            qtdLugarVeiculo.setEnabled(false);
            categoriaVeiculo.setEnabled(false);
            botaoNovo.setEnabled(true);
            botaoEditar.setEnabled(true);
            botaoExcluir.setEnabled(false);
            botaoSalvar.setEnabled(false);
            botaoCancelar.setEnabled(false);
            break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVeiculo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        placaVeiculo = new javax.swing.JTextField();
        modeloVeiculo = new javax.swing.JTextField();
        marcaVeiculo = new javax.swing.JTextField();
        anoVeiculo = new javax.swing.JTextField();
        potenciaVeiculo = new javax.swing.JTextField();
        qtdLugarVeiculo = new javax.swing.JTextField();
        categoriaVeiculo = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Modelo", "Marca", "Ano", "Potencia", "N Lugares", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tabelaVeiculo);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        jLabel1.setText("Placa");

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca");

        jLabel4.setText("Ano");

        jLabel5.setText("Potencia");

        jLabel6.setText("N lugares");

        jLabel7.setText("Categoria");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(placaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoriaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(qtdLugarVeiculo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(potenciaVeiculo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(marcaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(modeloVeiculo)
                                .addComponent(anoVeiculo)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(placaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(marcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(anoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(potenciaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qtdLugarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoriaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoSalvar)
                        .addComponent(botaoCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoNovo)
                                .addGap(18, 18, 18)
                                .addComponent(botaoEditar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoExcluir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Veiculo", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        
        
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
    placaVeiculo.setText("");
    modeloVeiculo.setText("");
    marcaVeiculo.setText("");
    anoVeiculo.setText("");
    potenciaVeiculo.setText("");
    qtdLugarVeiculo.setText("");
    categoriaVeiculo.setText("");
    modo="Navegar";
    ManipularInterface();
        
        
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
     modo="Novo";
    ManipularInterface();
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        modo="Editar";
        ManipularInterface();
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       
        
        
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InterfaceVeiculo(gerenciarVeiculo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoVeiculo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField categoriaVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField marcaVeiculo;
    private javax.swing.JTextField modeloVeiculo;
    private javax.swing.JTextField placaVeiculo;
    private javax.swing.JTextField potenciaVeiculo;
    private javax.swing.JTextField qtdLugarVeiculo;
    private javax.swing.JTable tabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
