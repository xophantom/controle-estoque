/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estoque.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewProduto
     */
    public ViewMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadEntPri = new javax.swing.JButton();
        btnCadSaiPri = new javax.swing.JButton();
        btnConProPri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtPesquisaMain = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        jCadProdutos = new javax.swing.JMenuItem();
        jCadUsu = new javax.swing.JMenuItem();
        jCadCat = new javax.swing.JMenuItem();
        jCadFor = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        jRelPro = new javax.swing.JMenuItem();
        jRelUsu = new javax.swing.JMenuItem();
        jRelCat = new javax.swing.JMenuItem();
        jRelFor = new javax.swing.JMenuItem();
        jFerEti = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jFerFun = new javax.swing.JMenuItem();
        jFerBac = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Principal - AT Estoque");
        setResizable(false);

        btnCadEntPri.setText("Cadastrar Entrada");
        btnCadEntPri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEntPriActionPerformed(evt);
            }
        });

        btnCadSaiPri.setText("Cadastrar Sa??da");
        btnCadSaiPri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadSaiPriActionPerformed(evt);
            }
        });

        btnConProPri.setText("Consultar Produto");

        JTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Pre??o"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTProdutos);

        jButton1.setText("Configura????es");

        jButton2.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadEntPri, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadSaiPri, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConProPri, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPesquisaMain, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadEntPri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadSaiPri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConProPri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtPesquisaMain))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MenuCadastros.setText("Cadastros");

        jCadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/package.png"))); // NOI18N
        jCadProdutos.setText("Produtos");
        jCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadProdutosActionPerformed(evt);
            }
        });
        MenuCadastros.add(jCadProdutos);

        jCadUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/user.png"))); // NOI18N
        jCadUsu.setText("Usu??rios");
        jCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadUsuActionPerformed(evt);
            }
        });
        MenuCadastros.add(jCadUsu);

        jCadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/tag_blue.png"))); // NOI18N
        jCadCat.setText("Categorias");
        jCadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadCatActionPerformed(evt);
            }
        });
        MenuCadastros.add(jCadCat);

        jCadFor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/lorry.png"))); // NOI18N
        jCadFor.setText("Fornecedores");
        jCadFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadForActionPerformed(evt);
            }
        });
        MenuCadastros.add(jCadFor);

        MenuPrincipal.add(MenuCadastros);

        MenuRelatorios.setText("Relat??rios");

        jRelPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/package.png"))); // NOI18N
        jRelPro.setText("Produtos");
        MenuRelatorios.add(jRelPro);

        jRelUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/user.png"))); // NOI18N
        jRelUsu.setText("Usu??rios");
        MenuRelatorios.add(jRelUsu);

        jRelCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/tag_blue.png"))); // NOI18N
        jRelCat.setText("Categorias");
        MenuRelatorios.add(jRelCat);

        jRelFor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/lorry.png"))); // NOI18N
        jRelFor.setText("Fornecedores");
        MenuRelatorios.add(jRelFor);

        MenuPrincipal.add(MenuRelatorios);

        jFerEti.setText("Ferramentas");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/printer.png"))); // NOI18N
        jMenuItem9.setText("Etiquetas");
        jFerEti.add(jMenuItem9);

        jFerFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/cog.png"))); // NOI18N
        jFerFun.setText("Fun????es");
        jFerEti.add(jFerFun);

        jFerBac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/database_save.png"))); // NOI18N
        jFerBac.setText("Backup");
        jFerBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFerBacActionPerformed(evt);
            }
        });
        jFerEti.add(jFerBac);

        MenuPrincipal.add(jFerEti);

        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MenuSair);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadUsuActionPerformed
        ViewCadastraUsuario CadUser = new ViewCadastraUsuario();
        CadUser.setVisible(true);
    }//GEN-LAST:event_jCadUsuActionPerformed

    private void btnCadEntPriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEntPriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadEntPriActionPerformed

    private void btnCadSaiPriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadSaiPriActionPerformed
        // TODO add your handling code here:   
        
        if(JTProdutos.getSelectedRow() != -1){
            DefaultTableModel dtmProdutos = (DefaultTableModel) JTProdutos.getModel();
            dtmProdutos.removeRow(JTProdutos.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto na lista!");
        }
    }//GEN-LAST:event_btnCadSaiPriActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
        
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            
        }
    }//GEN-LAST:event_MenuSairMouseClicked

    private void jCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadProdutosActionPerformed
        ViewCadastraProduto CadProd = new ViewCadastraProduto();
        CadProd.setVisible(true);
    }//GEN-LAST:event_jCadProdutosActionPerformed

    private void jCadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadCatActionPerformed
        ViewCadastraCategoria CadCat = new ViewCadastraCategoria();
        CadCat.setVisible(true);
    }//GEN-LAST:event_jCadCatActionPerformed

    private void jCadForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadForActionPerformed
        ViewCadastraFornecedor CadFor = new ViewCadastraFornecedor();
        CadFor.setVisible(true);
    }//GEN-LAST:event_jCadForActionPerformed

    private void jFerBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFerBacActionPerformed
        ViewBackup bkp = new ViewBackup();
        bkp.setVisible(true);
    }//GEN-LAST:event_jFerBacActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTProdutos;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JButton btnCadEntPri;
    private javax.swing.JButton btnCadSaiPri;
    private javax.swing.JButton btnConProPri;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jCadCat;
    private javax.swing.JMenuItem jCadFor;
    private javax.swing.JMenuItem jCadProdutos;
    private javax.swing.JMenuItem jCadUsu;
    private javax.swing.JMenuItem jFerBac;
    private javax.swing.JMenu jFerEti;
    private javax.swing.JMenuItem jFerFun;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jRelCat;
    private javax.swing.JMenuItem jRelFor;
    private javax.swing.JMenuItem jRelPro;
    private javax.swing.JMenuItem jRelUsu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPesquisaMain;
    // End of variables declaration//GEN-END:variables
}
