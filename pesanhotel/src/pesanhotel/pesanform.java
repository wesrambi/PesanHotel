/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pesanhotel;

import javax.swing.JOptionPane;

/**
 *
 * @author wesra
 */
public class pesanform extends javax.swing.JInternalFrame {

    /**
     * Creates new form pesanform
     */
    public pesanform() {
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

        namatxt = new javax.swing.JTextField();
        hptxt = new javax.swing.JTextField();
        cekintxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cekouttxt = new javax.swing.JTextField();
        hapusbtn = new javax.swing.JButton();
        pesanbtn = new javax.swing.JButton();
        tipebox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hargatxt = new javax.swing.JTextField();
        ktptxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesananarea = new javax.swing.JTextArea();

        hptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hptxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("No.Handphone");

        jLabel3.setText("Tanggal Check-In");

        jLabel4.setText("Tanggal Check-Out");

        cekouttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekouttxtActionPerformed(evt);
            }
        });

        hapusbtn.setText("HAPUS");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        pesanbtn.setText("PESAN");
        pesanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanbtnActionPerformed(evt);
            }
        });

        tipebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH---", "SIMPLE", "DELUXE", "SUITE", "ADDITIONAL CUSTOM" }));
        tipebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeboxActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga Kamar");

        jLabel6.setText("Tipe Kamar");

        hargatxt.setText("Rp. ");

        jLabel7.setText("No.KTP");

        pesananarea.setColumns(20);
        pesananarea.setRows(5);
        jScrollPane1.setViewportView(pesananarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namatxt)
                    .addComponent(hptxt, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(cekintxt)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ktptxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cekouttxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargatxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipebox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 199, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(pesanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ktptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hargatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipebox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cekouttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cekintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hptxtActionPerformed

    private void cekouttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekouttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cekouttxtActionPerformed

    private void tipeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeboxActionPerformed
        // TODO add your handling code here:
        switch(tipebox.getSelectedIndex()){
            case 0:
                hargatxt.setText("");
                break;
                
            case 1:
                hargatxt.setText("Rp.400.000");
                break;
                
            case 2  :
                hargatxt.setText("Rp.800.000");
                break;
            
            case 3:
                hargatxt.setText("Rp.1.200.000");
                break;
                
            case 4  :
                hargatxt.getText();
                break;
                  }
    }//GEN-LAST:event_tipeboxActionPerformed

    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
        // TODO add your handling code here:
        namatxt.setText("");
        hargatxt.setText("");
        hptxt.setText("");
        tipebox.setSelectedItem(0);
        ktptxt.setText("");
        cekouttxt.setText("");
        cekintxt.setText("");
        pesananarea.setText("");
    }//GEN-LAST:event_hapusbtnActionPerformed

    private void pesanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanbtnActionPerformed
        // TODO add your handling code here:
        if (namatxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi nama terlebih dahulu");
        } else if(hptxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi Nomor Handphone terlebih dahulu");
        }else if(hargatxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi Harga terlebih dahulu");
        }else if(cekintxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi Tanggal Check-In terlebih dahulu");
        }else if(cekouttxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi Tanggal Check-Out terlebih dahulu");
        }
        
     
        
        else{
            String tampil;
            tampil = "";
            tampil += "Nama Pemesan     : "+ namatxt.getText()+"\n";
            tampil += "No.Handphone       : "+ hptxt.getText()+"\n";
            tampil += "Harga                        : "+ hargatxt.getText()+"\n";
            tampil += "Tanggal Cek In       : "+ cekintxt.getText()+"\n";
            tampil += "Tanggal Cek Out    : "+ cekouttxt.getText()+"\n";
            tampil += "Tipe Kamar              : "+ tipebox.getSelectedItem()+"\n";
            
            pesananarea.setText("==============DETAIL PESANAN KAMAR================\n"+tampil);
            
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan");
          }
        
        
    }//GEN-LAST:event_pesanbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cekintxt;
    private javax.swing.JTextField cekouttxt;
    private javax.swing.JButton hapusbtn;
    private javax.swing.JTextField hargatxt;
    private javax.swing.JTextField hptxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ktptxt;
    private javax.swing.JTextField namatxt;
    private javax.swing.JTextArea pesananarea;
    private javax.swing.JButton pesanbtn;
    private javax.swing.JComboBox<String> tipebox;
    // End of variables declaration//GEN-END:variables
}
