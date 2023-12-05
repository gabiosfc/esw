/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pacote.visao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.dominio.Produto;
import pacote.DAO.DAOSistema;
import pacote.dominio.PedidoProdutos;
import pacote.dominio.Pedidos;

/**
 *
 * @author gabriela and marcela
 */
public class Cardapio extends javax.swing.JFrame {
    
    int idItem1, idItem2, idItem3, idItem4, idItem5;
    double valorTotal;
    
    public Cardapio() {
        initComponents();
        initComponents2();
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents2() {

        try {
            DAOSistema daoSistema = new DAOSistema();
            ArrayList<Produto> produtos = daoSistema.obterProdutosDisponiveis();

            for (Produto produto : produtos) {
                switch (produto.getId()) {
                    case 1:
                        campoNomeItem1.setText(produto.getNome());
                        campoValorItem1.setText("R$ " + produto.getValor() + "0");
                        idItem1 = produto.getId();
                        break;
                    case 2:
                        campoNomeItem2.setText(produto.getNome());
                        campoValorItem2.setText("R$ " + produto.getValor() + "0");
                        idItem2 = produto.getId();
                        break;
                    case 3:
                        campoNomeItem3.setText(produto.getNome());
                        campoValorItem3.setText("R$ " + produto.getValor() + "0");
                        idItem3 = produto.getId();
                        break;
                    case 4:
                        campoNomeItem4.setText(produto.getNome());
                        campoValorItem4.setText("R$ " + produto.getValor() + "0");
                        idItem4 = produto.getId();
                        break;
                    case 5:
                        campoNomeItem5.setText(produto.getNome());
                        campoValorItem5.setText("R$ " + produto.getValor() + "0");
                        idItem5 = produto.getId();
                        break;
                    default:
                        // Caso haja mais produtos, você pode adicionar mais cases aqui
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoFecharCardapio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        campoValorTotalCardapio = new javax.swing.JTextField();
        botaoConfirmarPedido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        campoNomeItem1 = new javax.swing.JTextField();
        campoValorItem1 = new javax.swing.JTextField();
        comboQtdItem1 = new javax.swing.JComboBox<>();
        campoNomeItem2 = new javax.swing.JTextField();
        campoValorItem2 = new javax.swing.JTextField();
        comboQtdItem2 = new javax.swing.JComboBox<>();
        campoNomeItem3 = new javax.swing.JTextField();
        campoValorItem3 = new javax.swing.JTextField();
        comboQtdItem3 = new javax.swing.JComboBox<>();
        campoNomeItem4 = new javax.swing.JTextField();
        campoValorItem4 = new javax.swing.JTextField();
        comboQtdItem4 = new javax.swing.JComboBox<>();
        campoNomeItem5 = new javax.swing.JTextField();
        campoValorItem5 = new javax.swing.JTextField();
        comboQtdItem5 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboMesa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        botaoFecharCardapio.setBackground(new java.awt.Color(102, 51, 0));
        botaoFecharCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/img/fechar.png"))); // NOI18N
        botaoFecharCardapio.setBorder(null);
        botaoFecharCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharCardapioActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/img/Logotipo.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(botaoFecharCardapio)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFecharCardapio))
                .addGap(80, 80, 80))
        );

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));

        campoValorTotalCardapio.setBackground(new java.awt.Color(102, 51, 0));
        campoValorTotalCardapio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoValorTotalCardapio.setForeground(new java.awt.Color(255, 255, 255));
        campoValorTotalCardapio.setBorder(null);
        campoValorTotalCardapio.setCaretColor(new java.awt.Color(255, 255, 255));
        campoValorTotalCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorTotalCardapioActionPerformed(evt);
            }
        });

        botaoConfirmarPedido.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botaoConfirmarPedido.setForeground(new java.awt.Color(102, 51, 0));
        botaoConfirmarPedido.setText("Confirmar Pedido");
        botaoConfirmarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarPedidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoValorTotalCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoConfirmarPedido)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoValorTotalCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setLayout(new java.awt.GridLayout(5, 3, 20, 20));

        campoNomeItem1.setBackground(new java.awt.Color(102, 51, 0));
        campoNomeItem1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoNomeItem1.setForeground(new java.awt.Color(255, 255, 255));
        campoNomeItem1.setBorder(null);
        campoNomeItem1.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNomeItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeItem1ActionPerformed(evt);
            }
        });
        jPanel4.add(campoNomeItem1);

        campoValorItem1.setBackground(new java.awt.Color(102, 51, 0));
        campoValorItem1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoValorItem1.setForeground(new java.awt.Color(255, 255, 255));
        campoValorItem1.setBorder(null);
        campoValorItem1.setCaretColor(new java.awt.Color(255, 255, 255));
        campoValorItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorItem1ActionPerformed(evt);
            }
        });
        jPanel4.add(campoValorItem1);

        comboQtdItem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboQtdItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQtdItem1ActionPerformed(evt);
            }
        });
        jPanel4.add(comboQtdItem1);

        campoNomeItem2.setBackground(new java.awt.Color(102, 51, 0));
        campoNomeItem2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoNomeItem2.setForeground(new java.awt.Color(255, 255, 255));
        campoNomeItem2.setBorder(null);
        campoNomeItem2.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNomeItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeItem2ActionPerformed(evt);
            }
        });
        jPanel4.add(campoNomeItem2);

        campoValorItem2.setBackground(new java.awt.Color(102, 51, 0));
        campoValorItem2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoValorItem2.setForeground(new java.awt.Color(255, 255, 255));
        campoValorItem2.setBorder(null);
        campoValorItem2.setCaretColor(new java.awt.Color(255, 255, 255));
        campoValorItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorItem2ActionPerformed(evt);
            }
        });
        jPanel4.add(campoValorItem2);

        comboQtdItem2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboQtdItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQtdItem2ActionPerformed(evt);
            }
        });
        jPanel4.add(comboQtdItem2);

        campoNomeItem3.setBackground(new java.awt.Color(102, 51, 0));
        campoNomeItem3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoNomeItem3.setForeground(new java.awt.Color(255, 255, 255));
        campoNomeItem3.setBorder(null);
        campoNomeItem3.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNomeItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeItem3ActionPerformed(evt);
            }
        });
        jPanel4.add(campoNomeItem3);

        campoValorItem3.setBackground(new java.awt.Color(102, 51, 0));
        campoValorItem3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoValorItem3.setForeground(new java.awt.Color(255, 255, 255));
        campoValorItem3.setBorder(null);
        campoValorItem3.setCaretColor(new java.awt.Color(255, 255, 255));
        campoValorItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorItem3ActionPerformed(evt);
            }
        });
        jPanel4.add(campoValorItem3);

        comboQtdItem3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboQtdItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQtdItem3ActionPerformed(evt);
            }
        });
        jPanel4.add(comboQtdItem3);

        campoNomeItem4.setBackground(new java.awt.Color(102, 51, 0));
        campoNomeItem4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoNomeItem4.setForeground(new java.awt.Color(255, 255, 255));
        campoNomeItem4.setBorder(null);
        campoNomeItem4.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNomeItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeItem4ActionPerformed(evt);
            }
        });
        jPanel4.add(campoNomeItem4);

        campoValorItem4.setBackground(new java.awt.Color(102, 51, 0));
        campoValorItem4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoValorItem4.setForeground(new java.awt.Color(255, 255, 255));
        campoValorItem4.setBorder(null);
        campoValorItem4.setCaretColor(new java.awt.Color(255, 255, 255));
        campoValorItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorItem4ActionPerformed(evt);
            }
        });
        jPanel4.add(campoValorItem4);

        comboQtdItem4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboQtdItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQtdItem4ActionPerformed(evt);
            }
        });
        jPanel4.add(comboQtdItem4);

        campoNomeItem5.setBackground(new java.awt.Color(102, 51, 0));
        campoNomeItem5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoNomeItem5.setForeground(new java.awt.Color(255, 255, 255));
        campoNomeItem5.setBorder(null);
        campoNomeItem5.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNomeItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeItem5ActionPerformed(evt);
            }
        });
        jPanel4.add(campoNomeItem5);

        campoValorItem5.setBackground(new java.awt.Color(102, 51, 0));
        campoValorItem5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        campoValorItem5.setForeground(new java.awt.Color(255, 255, 255));
        campoValorItem5.setBorder(null);
        campoValorItem5.setCaretColor(new java.awt.Color(255, 255, 255));
        campoValorItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorItem5ActionPerformed(evt);
            }
        });
        jPanel4.add(campoValorItem5);

        comboQtdItem5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboQtdItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQtdItem5ActionPerformed(evt);
            }
        });
        jPanel4.add(comboQtdItem5);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informe o nº da sua mesa:");

        comboMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharCardapioActionPerformed

        this.dispose();
    }//GEN-LAST:event_botaoFecharCardapioActionPerformed

    private void botaoConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarPedidoActionPerformed
        String mesa = (String) comboMesa.getSelectedItem();
        
        if(mesa.equals("0")){
            JOptionPane.showMessageDialog(null,"Informe o número da sua mesa." );
        } else if(valorTotal == 0){
            JOptionPane.showMessageDialog(null,"Selecione pelo menos 1 produto para confirmar o pedido." );
        } else {
            
            int pedidoId = salvarPedido(); 
            
            int qtdItem1 = Integer.parseInt(comboQtdItem1.getSelectedItem().toString());
            int qtdItem2 = Integer.parseInt(comboQtdItem2.getSelectedItem().toString());
            int qtdItem3 = Integer.parseInt(comboQtdItem3.getSelectedItem().toString());
            int qtdItem4 = Integer.parseInt(comboQtdItem4.getSelectedItem().toString());
            int qtdItem5 = Integer.parseInt(comboQtdItem5.getSelectedItem().toString());

            if (qtdItem1 > 0){
                salvarPedidoProdutos(pedidoId, idItem1, qtdItem1);
            }

            if (qtdItem2 > 0){
                salvarPedidoProdutos(pedidoId, idItem2, qtdItem2);
            }

            if (qtdItem3 > 0){
                salvarPedidoProdutos(pedidoId, idItem3, qtdItem3);
            }

            if (qtdItem4 > 0){
                salvarPedidoProdutos(pedidoId, idItem4, qtdItem2);
            }

            if (qtdItem5 > 0){
                salvarPedidoProdutos(pedidoId, idItem5, qtdItem5);
            }
        
        }
               
        limparCampos();
    }//GEN-LAST:event_botaoConfirmarPedidoActionPerformed

    public int salvarPedido() {
        Pedidos pedidos = new Pedidos();
        pedidos.setMesa((String) comboMesa.getSelectedItem());
        pedidos.setValor_total(valorTotal);
        pedidos.setStatus_pedido("Preparando");

        DAOSistema insereDados = new DAOSistema();
        int idPedidoInserido = insereDados.inserePedido(pedidos);

        if (idPedidoInserido != -1) {
            JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso!");
            return idPedidoInserido;
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao realizar o pedido.");
            return -1; 
        }
    }

    private void salvarPedidoProdutos(int pedidoId, int idItem, int comboQtdItem){
        
        PedidoProdutos pedido = new PedidoProdutos();
        pedido.setId_pedido(pedidoId);
        pedido.setId_produto(idItem);
        pedido.setQuantidade(comboQtdItem);
        
        DAOSistema insereDados = new DAOSistema();
        insereDados.inserePedidoProdutos(pedido);
    }
   
        
    public void limparCampos()
    {
        campoValorTotalCardapio.setText("");
        comboQtdItem1.setSelectedItem("0");
        comboQtdItem2.setSelectedItem("0");
        comboQtdItem3.setSelectedItem("0");
        comboQtdItem4.setSelectedItem("0");
        comboQtdItem5.setSelectedItem("0");
        comboMesa.setSelectedItem("0");
    }
     
    private double calcularValorTotal(){
        try {
            int qtdItem1 = Integer.parseInt(comboQtdItem1.getSelectedItem().toString());
            double valorItem1 = extrairValor(campoValorItem1.getText());

            int qtdItem2 = Integer.parseInt(comboQtdItem2.getSelectedItem().toString());
            double valorItem2 = extrairValor(campoValorItem2.getText());

            int qtdItem3 = Integer.parseInt(comboQtdItem3.getSelectedItem().toString());
            double valorItem3 = extrairValor(campoValorItem3.getText());

            int qtdItem4 = Integer.parseInt(comboQtdItem4.getSelectedItem().toString());
            double valorItem4 = extrairValor(campoValorItem4.getText());

            int qtdItem5 = Integer.parseInt(comboQtdItem5.getSelectedItem().toString());
            double valorItem5 = extrairValor(campoValorItem5.getText());

            return qtdItem1 * valorItem1 +
                   qtdItem2 * valorItem2 +
                   qtdItem3 * valorItem3 +
                   qtdItem4 * valorItem4 +
                   qtdItem5 * valorItem5;
        }
        catch (NumberFormatException e) {
            return 0.0; 
        }   
    }
        
    private double extrairValor(String texto) {
        return Double.parseDouble(texto.replace("R$ ", ""));
    }
    
    private void atualizarCampoValorTotal() {
    valorTotal = calcularValorTotal();

    String valorFormatado = String.format("R$ %.2f", valorTotal);

    campoValorTotalCardapio.setText(valorFormatado);
}
    
    private void campoValorTotalCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorTotalCardapioActionPerformed
        // TODO add your handling code here:
        atualizarCampoValorTotal();
      
    }//GEN-LAST:event_campoValorTotalCardapioActionPerformed

    private void campoValorItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorItem1ActionPerformed

    private void campoNomeItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeItem1ActionPerformed

    private void campoNomeItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeItem2ActionPerformed

    private void campoValorItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorItem2ActionPerformed

    private void campoNomeItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeItem3ActionPerformed

    private void campoValorItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorItem3ActionPerformed

    private void campoNomeItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeItem4ActionPerformed

    private void campoValorItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorItem4ActionPerformed

    private void campoNomeItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeItem5ActionPerformed

    private void campoValorItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorItem5ActionPerformed

    private void comboQtdItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQtdItem1ActionPerformed
        atualizarCampoValorTotal();
    }//GEN-LAST:event_comboQtdItem1ActionPerformed

    private void comboQtdItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQtdItem2ActionPerformed
        atualizarCampoValorTotal();
    }//GEN-LAST:event_comboQtdItem2ActionPerformed

    private void comboQtdItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQtdItem3ActionPerformed
        atualizarCampoValorTotal();
    }//GEN-LAST:event_comboQtdItem3ActionPerformed

    private void comboQtdItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQtdItem4ActionPerformed
        atualizarCampoValorTotal();
    }//GEN-LAST:event_comboQtdItem4ActionPerformed

    private void comboQtdItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQtdItem5ActionPerformed
        atualizarCampoValorTotal();
    }//GEN-LAST:event_comboQtdItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cardapio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmarPedido;
    private javax.swing.JButton botaoFecharCardapio;
    private javax.swing.JTextField campoNomeItem1;
    private javax.swing.JTextField campoNomeItem2;
    private javax.swing.JTextField campoNomeItem3;
    private javax.swing.JTextField campoNomeItem4;
    private javax.swing.JTextField campoNomeItem5;
    private javax.swing.JTextField campoValorItem1;
    private javax.swing.JTextField campoValorItem2;
    private javax.swing.JTextField campoValorItem3;
    private javax.swing.JTextField campoValorItem4;
    private javax.swing.JTextField campoValorItem5;
    private javax.swing.JTextField campoValorTotalCardapio;
    private javax.swing.JComboBox<String> comboMesa;
    private javax.swing.JComboBox<String> comboQtdItem1;
    private javax.swing.JComboBox<String> comboQtdItem2;
    private javax.swing.JComboBox<String> comboQtdItem3;
    private javax.swing.JComboBox<String> comboQtdItem4;
    private javax.swing.JComboBox<String> comboQtdItem5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
