
package banca;


import javax.swing.*;
public class Finestra extends javax.swing.JFrame {

    DefaultListModel lista;

    public Finestra() {
        initComponents();
        lista=new DefaultListModel();
        listaMovimenti.setModel(lista);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aggiungiButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        importo = new javax.swing.JTextField();
        rimuoviButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        versamento = new javax.swing.JRadioButton();
        prelievo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMovimenti = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aggiungiButton.setText("Aggiungi");
        aggiungiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Importo");

        rimuoviButton.setText("Rimuovi");
        rimuoviButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rimuoviButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Saldo");

        saldo.setText("0");

        versamento.setText("Versamento");
        versamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versamentoActionPerformed(evt);
            }
        });

        prelievo.setText("Prelievo");
        prelievo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelievoActionPerformed(evt);
            }
        });

        listaMovimenti.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaMovimenti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(importo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(versamento)
                        .addGap(10, 10, 10)
                        .addComponent(prelievo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(rimuoviButton))
                            .addComponent(aggiungiButton))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(importo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(versamento)
                    .addComponent(prelievo))
                .addGap(39, 39, 39)
                .addComponent(aggiungiButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(saldo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rimuoviButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiButtonActionPerformed
        
        if(versamento.isSelected()){
            double soldi=Double.parseDouble(importo.getText());
            double update=Double.parseDouble(saldo.getText());
            update+=soldi;
            lista.insertElementAt(soldi,0);
            saldo.setText(""+update);

        }
        else if(prelievo.isSelected()){
            double soldi = -Double.parseDouble(importo.getText());
            double update=Double.parseDouble(saldo.getText());
            update+=soldi;
            lista.insertElementAt(soldi,0);
            saldo.setText(""+update);
        }
        
    }//GEN-LAST:event_aggiungiButtonActionPerformed

    private void versamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versamentoActionPerformed
        prelievo.setSelected(false);
    }//GEN-LAST:event_versamentoActionPerformed

    private void prelievoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelievoActionPerformed
        versamento.setSelected(false);
    }//GEN-LAST:event_prelievoActionPerformed

    private void rimuoviButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimuoviButtonActionPerformed
        lista.remove(listaMovimenti.getSelectedIndex());
    }//GEN-LAST:event_rimuoviButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiButton;
    private javax.swing.JTextField importo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMovimenti;
    private javax.swing.JRadioButton prelievo;
    private javax.swing.JButton rimuoviButton;
    private javax.swing.JLabel saldo;
    private javax.swing.JRadioButton versamento;
    // End of variables declaration//GEN-END:variables
}
