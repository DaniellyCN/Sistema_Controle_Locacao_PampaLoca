/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Gerenciar.GerenciarCategoria;
import Gerenciar.GerenciarLocacao;
import Gerenciar.GerenciarVeiculo;
import Gerenciar.GerenciarArquivo;
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
public class InterfaceCategoria extends javax.swing.JFrame {
    //GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    GerenciarCategoria gerenciarCategoria = new GerenciarCategoria();
    //GerenciarLocacao gerenciarLocacao = new GerenciarLocacao();
    DefaultTableModel modeloV = new DefaultTableModel();
    DefaultListModel modeloLista = new DefaultListModel();
    String modo;
    Lista veiculos_lista = new Lista();
    private int countNovo;
   
    public InterfaceCategoria(GerenciarCategoria gerenciarCategoria) {
        initComponents();
        this.gerenciarCategoria = gerenciarCategoria; 
    
        setLocationRelativeTo(null);
        modo="Navegar";
        ManipularInterface();
        
        carregamentoInicial(); // carrega com os dados iniciais da tabela: do arquivo
        // adiciona listener de seleção à tabela
        tabelaCategoria.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                // verifica se uma linha da tabela foi selecionada
                if (!tabelaCategoria.getSelectionModel().isSelectionEmpty()) {
                    // habilita o botão de Excluir
                    botaoExcluir.setEnabled(true);
                } else {
                    // desabilita o botão de Excluir
                    botaoExcluir.setEnabled(false);
                }
            }
        });
        
        
    }

    public void carregamentoInicial(){
         DefaultTableModel novoModelo = new DefaultTableModel(new Object [] {
           "Identificador","Nome"},0);
    
            GerenciarArquivo arquivo_categorias = new GerenciarArquivo("C:\\Users\\milena\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Categorias.csv",8);
       
            //GerenciarCategoria categorias_lista = new GerenciarCategoria();
            
            for(int i = 0; i < 7; i++ ){
                String linha = arquivo_categorias.lerArquivos()[i];
                String[] linha_separada  = linha.split(";");

                Categoria categoria = new Categoria(Integer.parseInt(linha_separada[0]),linha_separada[1]);
                //System.out.println(categoria.toString());
                gerenciarCategoria.adicionar(categoria); 
                //System.out.println(categoria.toString());


                Object linhaObjeto []=new Object[]{
                            Integer.parseInt(linha_separada[0]),
                            linha_separada[1],

                         };
                novoModelo.addRow(linhaObjeto);

            }
        
        
        System.out.println("CONFERINDO "+gerenciarCategoria.listar());
        this.modeloV = novoModelo;
        tabelaCategoria.setModel(modeloV);
       // tabelaVeiculo.setModel(novoModelo);
    }
    public void loadTableCategoria(){
        
         DefaultTableModel novoModelo = new DefaultTableModel(new Object [] {
           "Identificador","Nome"},0);
         
        for(int i = 0; i<gerenciarCategoria.tamanho() ;i++){
            Object linha []=new Object[]{
                ((Categoria)gerenciarCategoria.getLista().getElementoPeloIndice(i)).getIdentificador(),
                ((Categoria)gerenciarCategoria.getLista().getElementoPeloIndice(i)).getNome(),

             };

             novoModelo.addRow(linha);
            //tabelaVeiculo.setModel(modeloCarro);
        }
        System.out.println("CONFERINDO "+gerenciarCategoria.listar());
        this.modeloV = novoModelo;
        tabelaCategoria.setModel(modeloV);
       // tabelaVeiculo.setModel(novoModelo);
           
    }  
    
    public void ManipularInterface(){
        switch(modo){
            case "Navegar":
                nomeCategoria.setEnabled(false);
                identificadorCategoria.setEnabled(false);
                botaoNovo.setEnabled(true);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(false);
                botaoSalvar.setEnabled(false);
                botaoCancelar.setEnabled(false);
                break;
            case "Novo":
                nomeCategoria.setEnabled(true);
                identificadorCategoria.setEnabled(true);
                botaoNovo.setEnabled(false);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(false);
                botaoSalvar.setEnabled(true);
                botaoCancelar.setEnabled(true);
                break;
            case "Editar":
                nomeCategoria.setEnabled(true);
                identificadorCategoria.setEnabled(true);
                botaoNovo.setEnabled(false);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(false);
                botaoSalvar.setEnabled(true);
                botaoCancelar.setEnabled(true);
                break;
            case "Excluir":
                nomeCategoria.setEnabled(false);
                identificadorCategoria.setEnabled(false);
                botaoNovo.setEnabled(true);
                botaoEditar.setEnabled(false);
                botaoExcluir.setEnabled(true);
                botaoSalvar.setEnabled(false);
                botaoCancelar.setEnabled(false);
                break;
            case "Selecao":
                nomeCategoria.setEnabled(false);
                identificadorCategoria.setEnabled(false);
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
        tabelaCategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCategoria = new javax.swing.JTextField();
        identificadorCategoria = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TodosVeiculos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificador", "Nome"
            }
        ));
        tabelaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCategoria);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        jLabel1.setText("Nome");

        jLabel2.setText("Identificador");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(identificadorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botaoSalvar)
                        .addGap(83, 83, 83)
                        .addComponent(botaoCancelar)))
                .addGap(15, 207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(identificadorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar))
                .addContainerGap(88, Short.MAX_VALUE))
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

        jTabbedPane1.addTab("Categoria", jPanel1);

        TodosVeiculos.setText("Mostrar Categorias Cadastradas");
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
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(TodosVeiculos)
                        .addGap(156, 156, 156))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(TodosVeiculos)
                .addGap(29, 29, 29)
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

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
     modo="Novo";
     countNovo ++;
    ManipularInterface();
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        modo="Editar";
        ManipularInterface();
        
        //editar(evt);
    }//GEN-LAST:event_botaoEditarActionPerformed

     
    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int linhaSelecionada = tabelaCategoria.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para excluir.");
            return;
        }

        //Obtendo a plca do veiculo selecionada
        String identificador_aux = tabelaCategoria.getValueAt(linhaSelecionada, 0).toString();
        int identificador = Integer.parseInt(identificador_aux);
        System.out.println("Identificador: " + identificador);
        try {
            gerenciarCategoria.excluir(identificador, veiculos_lista);
            JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            ((DefaultTableModel)tabelaCategoria.getModel()).removeRow(linhaSelecionada);
            loadTableCategoria();
            System.out.println("Lista de categorias após exclusão: " + gerenciarCategoria.listar());

        } catch (Exception e) {
            if (e.getMessage().equals("A categoria com o identificador informado não foi encontrada.")) {
                JOptionPane.showMessageDialog(this, "Categoria não encontrado.");
            } else {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        System.out.println("Erro ao excluir categoria: " + e.getMessage());
    }
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void tabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCategoriaMouseClicked
     // Obtém o índice da linha selecionada
    int index = tabelaCategoria.getSelectedRow();

    // Verifica se há uma linha selecionada e se o índice é válido
    if (index >= 0 && index < gerenciarCategoria.tamanho()) {
        // Obtém o veículo correspondente à linha selecionada
      Categoria c = (Categoria) gerenciarCategoria.getLista().getElementoPeloIndice(index);

      // Carrega os dados do veículo na tela
        nomeCategoria.setText(c.getNome());
        identificadorCategoria.setText(String.valueOf(c.getIdentificador()));
        
        modo = "Selecao";
        ManipularInterface();
    }
        
    }//GEN-LAST:event_tabelaCategoriaMouseClicked

    private void TodosVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosVeiculosActionPerformed
       
          modeloLista.removeAllElements();
        
    // iterar sobre todos os elementos da lista de veículos
    for (int i = 0; i < gerenciarCategoria.tamanho(); i++) {
        // adicionar cada veículo encontrado ao modelo da lista
        modeloLista.addElement(gerenciarCategoria.getLista().getElementoPeloIndice(i));
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

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        nomeCategoria.setText("");
        identificadorCategoria.setText("");
        //categoriaVeiculo.setText("");
        modo="Navegar";
        ManipularInterface();

    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        if(modo.equals("Novo")){
            
            Categoria novaCategoria = new Categoria();

            String nome = nomeCategoria.getText();
            int identificador = Integer.parseInt(identificadorCategoria.getText());

            novaCategoria.setNome(nome);
            novaCategoria.setIdentificador(identificador);

            gerenciarCategoria.adicionar(novaCategoria);
            
        }else if(modo.equals("Editar")){

            int index = tabelaCategoria.getSelectedRow();
            if (index >= 0 && index < gerenciarCategoria.tamanho()) {
                Categoria categoria = (Categoria) gerenciarCategoria.getLista().getElementoPeloIndice(index);
                categoria.setNome(nomeCategoria.getText());
                categoria.setIdentificador((int) Integer.parseInt(identificadorCategoria.getText()));

                loadTableCategoria();
            }
        }
        System.out.println("Lista: "+gerenciarCategoria.listar());
        loadTableCategoria();
        modo="Navegar";
        ManipularInterface();

        //pra limpar
        nomeCategoria.setText("");
        identificadorCategoria.setText("");
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InterfaceVeiculo(gerenciarVeiculo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TodosVeiculos;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField identificadorCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nomeCategoria;
    private javax.swing.JTable tabelaCategoria;
    // End of variables declaration//GEN-END:variables
}
