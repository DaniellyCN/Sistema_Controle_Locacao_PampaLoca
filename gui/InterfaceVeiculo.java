/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Gerenciar.GerenciarCategoria;
import Gerenciar.GerenciarLocacao;
import Gerenciar.GerenciarVeiculo;
import Gerenciar.Lista;
import Gerenciar.Veiculo;
import Gerenciar.Categoria;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author milena
 */
public class InterfaceVeiculo extends javax.swing.JFrame {
    GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    GerenciarCategoria gerenciarCategoria = new GerenciarCategoria();
    GerenciarLocacao gerenciarLocacao = new GerenciarLocacao();
    DefaultTableModel modeloV = new DefaultTableModel();
    DefaultListModel modeloLista = new DefaultListModel();
    String modo;
    Lista locacoes_lista = new Lista();
    
   
    public InterfaceVeiculo(GerenciarVeiculo gerenciarVeiculo1) {
        initComponents();
        this.gerenciarVeiculo = gerenciarVeiculo; 
    
        ComboBoxModel comboBoxCategoriaModel = new  DefaultComboBoxModel(gerenciarCategoria.toArray());
        ComboBoxCategoria.setModel(comboBoxCategoriaModel);
       
        /*ComboBoxModel comboBoxCategoriaModel = new DefaultComboBoxModel(gerenciarCategoria.toArray());
        ComboBoxCategoria.setModel(comboBoxCategoriaModel);*/

        
        setLocationRelativeTo(null);
        modo="Navegar";
        ManipularInterface();
        
        
        
        // adiciona listener de seleção à tabela
        tabelaVeiculo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            // verifica se uma linha da tabela foi selecionada
            if (!tabelaVeiculo.getSelectionModel().isSelectionEmpty()) {
                // habilita o botão de Excluir
                botaoExcluir.setEnabled(true);
            } else {
                // desabilita o botão de Excluir
                botaoExcluir.setEnabled(false);
            }
        }
    });
        
        
    }

    public void loadTableVeiculo(){
    DefaultTableModel novoModelo = new DefaultTableModel(new Object [] {
       "Placa","Modelo", "Marca","Ano", "Potencia", "Nºlugares" , "Categorias"},0);
            for(int i = 0; i<gerenciarVeiculo.getQuantElementos();i++){
                Object linha []=new Object[]{
                ((Veiculo)gerenciarVeiculo.getLista().getElementoPeloIndice(i)).getPlaca(),
                ((Veiculo)gerenciarVeiculo.getLista().getElementoPeloIndice(i)).getModelo(),
                ((Veiculo)gerenciarVeiculo.getLista().getElementoPeloIndice(i)).getMarca(),
                ((Veiculo)gerenciarVeiculo.getLista().getElementoPeloIndice(i)).getAno(),
                ((Veiculo)gerenciarVeiculo.getLista().getElementoPeloIndice(i)).getPotencia(),
                ((Veiculo)gerenciarVeiculo.getLista().getElementoPeloIndice(i)).getQtdeLugares()

                 };
                 

                 novoModelo.addRow(linha);
                //tabelaVeiculo.setModel(modeloCarro);
            }
            System.out.println("CONFERINDO "+gerenciarVeiculo.listar());
            this.modeloV = novoModelo;
            tabelaVeiculo.setModel(modeloV);
           // tabelaVeiculo.setModel(novoModelo);
           
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
                ComboBoxCategoria.setEnabled(false);
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
                ComboBoxCategoria.setEnabled(true);
                botaoNovo.setEnabled(false);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(false);
                botaoSalvar.setEnabled(true);
                botaoCancelar.setEnabled(true);
                break;
            case "Editar":
                placaVeiculo.setEnabled(true);
                modeloVeiculo.setEnabled(true);
                marcaVeiculo.setEnabled(true);
                anoVeiculo.setEnabled(true);
                potenciaVeiculo.setEnabled(true);
                qtdLugarVeiculo.setEnabled(true);
                ComboBoxCategoria.setEnabled(true);
                botaoNovo.setEnabled(false);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(false);
                botaoSalvar.setEnabled(true);
                botaoCancelar.setEnabled(true);
                break;
            case "Excluir":
                placaVeiculo.setEnabled(false);
                modeloVeiculo.setEnabled(false);
                marcaVeiculo.setEnabled(false);
                anoVeiculo.setEnabled(false);
                potenciaVeiculo.setEnabled(false);
                qtdLugarVeiculo.setEnabled(false);
                ComboBoxCategoria.setEnabled(false);
                botaoNovo.setEnabled(true);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(true);
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
               ComboBoxCategoria.setEnabled(false);
                botaoNovo.setEnabled(true);
                botaoEditar.setEnabled(true);
                botaoExcluir.setEnabled(true);
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
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TodosVeiculos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

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
        tabelaVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVeiculoMouseClicked(evt);
            }
        });
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

        ComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxCategoria, 0, 139, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(placaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdLugarVeiculo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(potenciaVeiculo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(modeloVeiculo)
                            .addComponent(anoVeiculo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCancelar)
                .addGap(15, 15, 15))
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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoSalvar)
                        .addComponent(botaoCancelar)))
                .addContainerGap(32, Short.MAX_VALUE))
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
                        .addContainerGap(81, Short.MAX_VALUE))))
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

        TodosVeiculos.setText("Mostrar veiculos");
        TodosVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosVeiculosActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(TodosVeiculos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(TodosVeiculos)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", jPanel3);

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
           
        if(modo.equals("Novo")){
            Categoria categoria = (Categoria) ComboBoxCategoria.getSelectedItem();
         
            Veiculo novoVeiculo = new Veiculo();
 
            String placa = placaVeiculo.getText();
            String modelo = modeloVeiculo.getText();
            String marca = marcaVeiculo.getText();
            int ano = Integer.parseInt(anoVeiculo.getText());
            int potencia = Integer.parseInt(potenciaVeiculo.getText());
            int qtdLugar = Integer.parseInt(qtdLugarVeiculo.getText());
            
            
            novoVeiculo.setPlaca(placa);
            novoVeiculo.setModelo(modelo);
            novoVeiculo.setMarca(marca);
            novoVeiculo.setAno(ano);
            novoVeiculo.setPotencia(potencia);
            novoVeiculo.setQtdeLugares(qtdLugar);
            novoVeiculo.setCategoriA(categoria);
            
           
            gerenciarVeiculo.adicionar(novoVeiculo);

        }else if(modo.equals("Editar")){
            Categoria categoria = (Categoria) ComboBoxCategoria.getSelectedItem();
         
            int index = tabelaVeiculo.getSelectedRow();
            if (index >= 0 && index < gerenciarVeiculo.getQuantElementos()) {
                Veiculo veiculo = (Veiculo) gerenciarVeiculo.getLista().getElementoPeloIndice(index);
                veiculo.setPlaca(placaVeiculo.getText());
                veiculo.setModelo(modeloVeiculo.getText());
                veiculo.setMarca(marcaVeiculo.getText());
                veiculo.setAno(Integer.parseInt(anoVeiculo.getText()));
                veiculo.setPotencia((int) Double.parseDouble(potenciaVeiculo.getText()));
                veiculo.setCategoriA(categoria);
            
                veiculo.setQtdeLugares(Integer.parseInt(qtdLugarVeiculo.getText()));
                loadTableVeiculo();
            }
        } 
        System.out.println("losta"+gerenciarVeiculo.listar());
        loadTableVeiculo();
        modo="Navegar";
        ManipularInterface();
        
        //pra limpar
        placaVeiculo.setText("");
        modeloVeiculo.setText("");
        marcaVeiculo.setText("");
        anoVeiculo.setText("");
        potenciaVeiculo.setText("");
        qtdLugarVeiculo.setText("");
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
    placaVeiculo.setText("");
    modeloVeiculo.setText("");
    marcaVeiculo.setText("");
    anoVeiculo.setText("");
    potenciaVeiculo.setText("");
    qtdLugarVeiculo.setText("");
    //categoriaVeiculo.setText("");
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
        
        //editar(evt);
    }//GEN-LAST:event_botaoEditarActionPerformed

     
    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int linhaSelecionada = tabelaVeiculo.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um veículo para excluir.");
            return;
        }

        //Obtendo a plca do veiculo selecionada
        String placa = tabelaVeiculo.getValueAt(linhaSelecionada, 0).toString();
      
        try {
            gerenciarVeiculo.excluir(placa, locacoes_lista);
            JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
             
            ((DefaultTableModel)tabelaVeiculo.getModel()).removeRow(linhaSelecionada);
            loadTableVeiculo();
            System.out.println("Lista de veículos após exclusão: " + gerenciarVeiculo.listar());

        } catch (Exception e) {
            if (e.getMessage().equals("Veículo, com a placa informada, não encontrado.")) {
                JOptionPane.showMessageDialog(this, "Veículo não encontrado.");
            } else {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        System.out.println("Erro ao excluir veículo: " + e.getMessage());
    }
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void ComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCategoriaActionPerformed

    private void tabelaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVeiculoMouseClicked
     // Obtém o índice da linha selecionada
    int index = tabelaVeiculo.getSelectedRow();

    // Verifica se há uma linha selecionada e se o índice é válido
    if (index >= 0 && index < gerenciarVeiculo.tamanho()) {
        // Obtém o veículo correspondente à linha selecionada
      Veiculo v = (Veiculo) gerenciarVeiculo.getLista().getElementoPeloIndice(index);

      // Carrega os dados do veículo na tela
        placaVeiculo.setText(v.getPlaca());
        modeloVeiculo.setText(v.getModelo());
        marcaVeiculo.setText(v.getMarca());
        anoVeiculo.setText(String.valueOf(v.getAno()));
        potenciaVeiculo.setText(String.valueOf(v.getPotencia()));
        qtdLugarVeiculo.setText(String.valueOf(v.getQtdeLugares()));

        modo = "Selecao";
        ManipularInterface();
    }
        
    }//GEN-LAST:event_tabelaVeiculoMouseClicked

    private void TodosVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosVeiculosActionPerformed
       
          modeloLista.removeAllElements();
        
    // iterar sobre todos os elementos da lista de veículos
    for (int i = 0; i < gerenciarVeiculo.getQuantElementos(); i++) {
        // adicionar cada veículo encontrado ao modelo da lista
        modeloLista.addElement(gerenciarVeiculo.getLista().getElementoPeloIndice(i));
    }
    
    // setar o modelo da lista no JList
 jList2.setModel(modeloLista);
        
        
        
        
        
        
        
       
        /*modeloLista.removeAllElements();
        
       // iterar sobre todos os elementos da lista de veículos
    for (int i = 0; i < gerenciarVeiculo.getQuantElementos(); i++) {
        // adicionar cada veículo encontrado ao modelo da lista
        modeloLista.addElement(gerenciarVeiculo.getLista().getElementoPeloIndice(i));
    }
        
       System.out.println("clicando no botao "+gerenciarVeiculo.listar());
        
        if (modeloLista.isEmpty()) {
        System.out.println("O modelo da lista está vazio!");
    } else {
        System.out.println("O modelo da lista está preenchido com " + modeloLista.getSize() + " elementos.");
    }*/
    }//GEN-LAST:event_TodosVeiculosActionPerformed

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
    private javax.swing.JComboBox<String> ComboBoxCategoria;
    private javax.swing.JButton TodosVeiculos;
    private javax.swing.JTextField anoVeiculo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField marcaVeiculo;
    private javax.swing.JTextField modeloVeiculo;
    private javax.swing.JTextField placaVeiculo;
    private javax.swing.JTextField potenciaVeiculo;
    private javax.swing.JTextField qtdLugarVeiculo;
    private javax.swing.JTable tabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
