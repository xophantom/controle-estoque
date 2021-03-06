/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estoque.view;

import br.com.estoque.model.bean.Categoria;
import br.com.estoque.model.dao.CategoriaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rafael
 */
public class ViewCadastraCategoria extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastraCategoria
     */
    public ViewCadastraCategoria() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) JTCategoria.getModel();
        JTCategoria.setRowSorter(new TableRowSorter(modelo));
        readTableCategoria();
    }
    
    public void readTableCategoria() {
        DefaultTableModel modelo = (DefaultTableModel) JTCategoria.getModel();
        modelo.setNumRows(0);
        CategoriaDAO dao = new CategoriaDAO();

        for (Categoria c : dao.read()) {
            modelo.addRow(new Object[]{
                c.getIdCategoria(),
                c.getDescricao()
            });
        }
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
        txtDesCat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCadCat = new javax.swing.JButton();
        btnCanCat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTCategoria = new javax.swing.JTable();
        btnExcluirCat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Categorias");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Descri????o:");

        btnCadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/??coneCad.fw.png"))); // NOI18N
        btnCadCat.setText("Salvar");
        btnCadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCatActionPerformed(evt);
            }
        });

        btnCanCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/iconeCan.fw.png"))); // NOI18N
        btnCanCat.setText("  Cancelar");
        btnCanCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanCatActionPerformed(evt);
            }
        });

        JTCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Descri????o"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTCategoria);
        if (JTCategoria.getColumnModel().getColumnCount() > 0) {
            JTCategoria.getColumnModel().getColumn(0).setResizable(false);
            JTCategoria.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        btnExcluirCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/iconeCan.fw.png"))); // NOI18N
        btnExcluirCat.setText("   Excluir");
        btnExcluirCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCatActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estoque/icones/atu.png"))); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDesCat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCadCat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluirCat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCanCat))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDesCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCanCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCanCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanCatActionPerformed
        txtDesCat.setText("");
    }//GEN-LAST:event_btnCanCatActionPerformed

    private void btnExcluirCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCatActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Confirma????o de exclus??o!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            if (JTCategoria.getSelectedRow() != -1) {
                Categoria c = new Categoria();
                CategoriaDAO dao = new CategoriaDAO();

                c.setIdCategoria((int) JTCategoria.getValueAt(JTCategoria.getSelectedRow(), 0));
                dao.delete(c);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto para escluir!");
            }
        }
        txtDesCat.setText("");
        readTableCategoria();
    }//GEN-LAST:event_btnExcluirCatActionPerformed

    private void btnCadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCatActionPerformed
        if (txtDesCat.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "O campo descr????o deve ser preenchidos!");
        } else {
            Categoria c = new Categoria();
            CategoriaDAO dao = new CategoriaDAO();
            
            c.setDescricao(txtDesCat.getText());
            dao.create(c);
        }
        txtDesCat.setText("");
        readTableCategoria();
    }//GEN-LAST:event_btnCadCatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja alterar o cadastro?", "Confirma????o", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            if(JTCategoria.getSelectedRow() != -1){
                Categoria c = new Categoria();
                CategoriaDAO dao = new CategoriaDAO();
                
                c.setDescricao(txtDesCat.getText());
                c.setIdCategoria((int) JTCategoria.getValueAt(JTCategoria.getSelectedRow(),0));
                dao.update(c);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um registro");
            }
        }
        txtDesCat.setText("");
        readTableCategoria();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCategoriaMouseClicked
        if(JTCategoria.getSelectedRow() != -1){
            txtDesCat.setText(JTCategoria.getValueAt(JTCategoria.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_JTCategoriaMouseClicked

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
            java.util.logging.Logger.getLogger(ViewCadastraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastraCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTCategoria;
    private javax.swing.JButton btnCadCat;
    private javax.swing.JButton btnCanCat;
    private javax.swing.JButton btnExcluirCat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDesCat;
    // End of variables declaration//GEN-END:variables
}
