package gui;

import Gerenciar.GerenciarArquivo;
import Gerenciar.GerenciarCategoria;
import Gerenciar.GerenciarLocacao;
import Gerenciar.GerenciarVeiculo;
import Gerenciar.Veiculo;
import javax.swing.table.DefaultTableModel;
import Gerenciar.Categoria;
import Gerenciar.GerenciarCliente;
import Gerenciar.Locacao;


/**
 *
 * @author milena
 */
public class InterfaceLocacao extends javax.swing.JFrame {
    private GerenciarLocacao gerenciarLocacao;
    private GerenciarCliente gerenciarCliente;
    GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("C:\\Users\\milena\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Veiculos.csv",8);
    GerenciarArquivo arquivo_categorias = new GerenciarArquivo("C:\\Users\\milena\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Categorias.csv",8);
    GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    GerenciarCategoria gerenciarCategoria = new GerenciarCategoria();
    DefaultTableModel modeloV = new DefaultTableModel();   
    
    public InterfaceLocacao(GerenciarLocacao gerenciarLocacao) {
        initComponents();
        this.gerenciarLocacao = gerenciarLocacao; 
    }

    
    //Método que atualiza a 2 tabela
    public void LoadTableLocacao(){
        DefaultTableModel novoModelo = new DefaultTableModel(new Object [] {
       "Placa","Modelo","Marca","ano","potencia","lugares","categoria"
       },0);

       for(int i = 0; i<gerenciarLocacao.getQuantElementos();i++){
           Object linha []=new Object[]{
              ((Locacao)gerenciarLocacao.getLista().getElementoPeloIndice(i)).getRetirada(),
              ((Locacao)gerenciarLocacao.getLista().getElementoPeloIndice(i)).getDevolucao(),
              ((Locacao)gerenciarLocacao.getLista().getElementoPeloIndice(i)).getValor(),
              ((Locacao)gerenciarLocacao.getLista().getElementoPeloIndice(i)).getPlacaVeiculo().getPlaca(),
              ((Locacao)gerenciarLocacao.getLista().getElementoPeloIndice(i)).getCNHCliente().getCNH()
  
           };
           this.modeloV = novoModelo;
       }
        this.modeloV = novoModelo;
        tabelaLocacao.setModel(modeloV); 
    }
    
    //Método que atualiza a 1 tabela
    public void LoadTableLocacaoDisponivel(){
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botaoFiltroPotencia = new javax.swing.JButton();
        botaoNumeroLugar = new javax.swing.JButton();
        botaoFiltroOrdemCrescenteNLugar = new javax.swing.JButton();
        botaoFiltroOrdemDecrescentePotencia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVeiculoDisponivel = new javax.swing.JTable();
        botaoMostrar = new javax.swing.JButton();
        txtFiltroPotencia = new javax.swing.JTextField();
        txtFiltroNLugar = new javax.swing.JTextField();
        botaoFiltroOrdemCrescentePotencia = new javax.swing.JButton();
        botaoFiltroOrdemDecrescenteNLugar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacao = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCNHCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxVeiculo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDataRetirada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataDevolucao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        botaoSalvarLocacao = new javax.swing.JButton();
        botaoCancelarLocacao = new javax.swing.JButton();
        botaoNovoLocacao = new javax.swing.JButton();
        botaoEditarLocacao = new javax.swing.JButton();
        botaoExcluirLocacao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Classificar por:");

        botaoFiltroPotencia.setText("Potência");
        botaoFiltroPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFiltroPotenciaActionPerformed(evt);
            }
        });

        botaoNumeroLugar.setText("N° de lugares");

        botaoFiltroOrdemCrescenteNLugar.setText("Ordem crescente");

        botaoFiltroOrdemDecrescentePotencia.setText("Ordem decrescente");
        botaoFiltroOrdemDecrescentePotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFiltroOrdemDecrescentePotenciaActionPerformed(evt);
            }
        });

        tabelaVeiculoDisponivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "modelo", "marca", "ano", "potencia", "lugares", "categoria"
            }
        ));
        jScrollPane2.setViewportView(tabelaVeiculoDisponivel);

        botaoMostrar.setText("Mostrar");
        botaoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostrarActionPerformed(evt);
            }
        });

        botaoFiltroOrdemCrescentePotencia.setText("Ordem crescente");
        botaoFiltroOrdemCrescentePotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFiltroOrdemCrescentePotenciaActionPerformed(evt);
            }
        });

        botaoFiltroOrdemDecrescenteNLugar.setText("Ordem decrescente");
        botaoFiltroOrdemDecrescenteNLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFiltroOrdemDecrescenteNLugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMostrar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFiltroPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFiltroNLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(botaoFiltroPotencia)
                                        .addGap(51, 51, 51)
                                        .addComponent(botaoFiltroOrdemCrescentePotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoFiltroOrdemDecrescentePotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(botaoNumeroLugar)
                                        .addGap(28, 28, 28)
                                        .addComponent(botaoFiltroOrdemCrescenteNLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoFiltroOrdemDecrescenteNLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoMostrar)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFiltroPotencia)
                    .addComponent(txtFiltroPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFiltroOrdemDecrescentePotencia)
                    .addComponent(botaoFiltroOrdemCrescentePotencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNumeroLugar)
                    .addComponent(txtFiltroNLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFiltroOrdemCrescenteNLugar)
                    .addComponent(botaoFiltroOrdemDecrescenteNLugar))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Veículo disponível", jPanel3);

        tabelaLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CNH", "Placa", "Retirada", "Devolução", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabelaLocacao);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        jLabel1.setText("CNH do cliente");

        jLabel2.setText("Placa do veículo");

        jLabel3.setText("Data de retirada");

        txtDataRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataRetiradaActionPerformed(evt);
            }
        });

        jLabel4.setText("Data de devolução");

        jLabel5.setText("Valor a ser pago");

        botaoSalvarLocacao.setText("Salvar");
        botaoSalvarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarLocacaoActionPerformed(evt);
            }
        });

        botaoCancelarLocacao.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(botaoSalvarLocacao)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelarLocacao))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataDevolucao)
                            .addComponent(txtDataRetirada)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorPago))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxVeiculo, 0, 279, Short.MAX_VALUE)
                            .addComponent(jComboBoxCNHCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCNHCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarLocacao)
                    .addComponent(botaoCancelarLocacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoNovoLocacao.setText("Novo");

        botaoEditarLocacao.setText("Editar");

        botaoExcluirLocacao.setText("Excluir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoNovoLocacao)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditarLocacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoExcluirLocacao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovoLocacao)
                    .addComponent(botaoEditarLocacao)
                    .addComponent(botaoExcluirLocacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Realizar Locação", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar veículos locados", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFiltroPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFiltroPotenciaActionPerformed
    int potencia = Integer.parseInt(txtFiltroPotencia.getText());
    DefaultTableModel modelo = new DefaultTableModel(new Object [] {"Placa","Modelo","Marca","ano","potencia","lugares","categoria"},0);
    
    for(int i = 0; i < gerenciarVeiculo.tamanho(); i++) {
        Object obj = gerenciarVeiculo.getLista().getElementoPeloIndice(i); 
        if (obj instanceof Veiculo) { 
            Veiculo veiculo = (Veiculo) obj; 
            if (Integer.toString(veiculo.getPotencia()).contains("1")) { 
                Object linhaObjeto[] = new Object[]{
                    veiculo.getPlaca(), veiculo.getModelo(), veiculo.getMarca(),
                    veiculo.getAno(), veiculo.getPotencia(), veiculo.getQtdeLugares(),
                    veiculo.getCategoria()
                };
                modelo.addRow(linhaObjeto);
            }
        }
    }
    tabelaVeiculoDisponivel.setModel(modelo);  
    }//GEN-LAST:event_botaoFiltroPotenciaActionPerformed

    private void botaoSalvarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarLocacaoActionPerformed

    }//GEN-LAST:event_botaoSalvarLocacaoActionPerformed

    private void txtDataRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataRetiradaActionPerformed
     
    }//GEN-LAST:event_txtDataRetiradaActionPerformed

    private void botaoFiltroOrdemDecrescentePotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFiltroOrdemDecrescentePotenciaActionPerformed
 
    }//GEN-LAST:event_botaoFiltroOrdemDecrescentePotenciaActionPerformed

    private void botaoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostrarActionPerformed
    DefaultTableModel modelo = new DefaultTableModel(new Object [] {
    "Placa","Modelo","Marca","ano","potencia","lugares","categoria"},0);        
        for(int i = 0; i < 7; i++ ){
            String linha = arquivo_veiculos.lerArquivos()[i];
            String[] linha_separada  = linha.split(";");
            Object linhaObjeto[] = new Object[]{
                linha_separada[0], linha_separada[1], linha_separada[2],
                Integer.parseInt(linha_separada[3]), Integer.parseInt(linha_separada[4]),
                Integer.parseInt(linha_separada[5]), linha_separada[6]
            };
            modelo.addRow(linhaObjeto);   
            gerenciarVeiculo.adicionar(linhaObjeto);
            Veiculo veiculo = new Veiculo(
                linha_separada[0],linha_separada[1],linha_separada[2],Integer.parseInt(linha_separada[3]),
                Integer.parseInt(linha_separada[4]),Integer.parseInt(linha_separada[5]),linha_separada[6]      
            );
            gerenciarVeiculo.adicionar(veiculo);  
       }
        // ------------ SUBSTITUINDO O ID DA CATEGORIA PELO NOME, NA LISTA DE VEICULOS  -------
        for(int i = 0; i < gerenciarVeiculo.tamanho(); i++) {
            Object obj = gerenciarVeiculo.getLista().getElementoPeloIndice(i); 
            if (obj instanceof Veiculo) { 
                Veiculo veiculo = (Veiculo) obj; 
                boolean encontrouCategoria = false; // inicializa a variável auxiliar
                
                for(int j = 0; j < gerenciarCategoria.tamanho(); j++){
                    if (encontrouCategoria) {
                        break; // se já encontrou a categoria, sai do loop interno
                    }
                    Object objeto = gerenciarCategoria.getLista().getElementoPeloIndice(j); 
                    if (objeto instanceof Categoria) { 
                        Categoria categoria = (Categoria) objeto; 
                        if(Integer.parseInt(veiculo.getCategoria()) == (categoria.getIdentificador())){
                            veiculo.setCategoria(categoria.getNome());
                            System.out.println(categoria.getNome());
                            encontrouCategoria = true; // atualiza a variável auxiliar
                        }
                    }
                }
                encontrouCategoria = false; // redefine a variável auxiliar
            }
        }
      
        this.modeloV = modelo;
        tabelaVeiculoDisponivel.setModel(modeloV); 
        
    }//GEN-LAST:event_botaoMostrarActionPerformed

    private void botaoFiltroOrdemDecrescenteNLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFiltroOrdemDecrescenteNLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFiltroOrdemDecrescenteNLugarActionPerformed

    private void botaoFiltroOrdemCrescentePotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFiltroOrdemCrescentePotenciaActionPerformed

    }//GEN-LAST:event_botaoFiltroOrdemCrescentePotenciaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InterfaceLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarLocacao;
    private javax.swing.JButton botaoEditarLocacao;
    private javax.swing.JButton botaoExcluirLocacao;
    private javax.swing.JButton botaoFiltroOrdemCrescenteNLugar;
    private javax.swing.JButton botaoFiltroOrdemCrescentePotencia;
    private javax.swing.JButton botaoFiltroOrdemDecrescenteNLugar;
    private javax.swing.JButton botaoFiltroOrdemDecrescentePotencia;
    private javax.swing.JButton botaoFiltroPotencia;
    private javax.swing.JButton botaoMostrar;
    private javax.swing.JButton botaoNovoLocacao;
    private javax.swing.JButton botaoNumeroLugar;
    private javax.swing.JButton botaoSalvarLocacao;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JComboBox<String> jComboBoxCNHCliente;
    private javax.swing.JComboBox<String> jComboBoxVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaLocacao;
    private javax.swing.JTable tabelaVeiculoDisponivel;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtDataRetirada;
    private javax.swing.JTextField txtFiltroNLugar;
    private javax.swing.JTextField txtFiltroPotencia;
    private javax.swing.JTextField txtValorPago;
    // End of variables declaration//GEN-END:variables
}
