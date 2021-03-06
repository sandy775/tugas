/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appdatarw.proggram;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AppDataRW extends javax.swing.JFrame {
    
    private void form_kosong(){
        txt_nik.setEditable(true);
        txt_nik.setText(null);
        txt_nama.setText(null);
        cmb_pekerjaann.setSelectedItem(this);
        cmb_pendidikan.setSelectedItem(this);
        txt_rt.setText(null);
        txt_rumah.setText(null);
        txt_telp.setText(null);
    }
    
    private void form_tampil(){
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("No.");
      model.addColumn("NIK");
      model.addColumn("Nama");
      model.addColumn("Pekerjaan");
      model.addColumn("Pendidikan Akhir");
      model.addColumn("RT");
      model.addColumn("No.Rumah");
      model.addColumn("No.Telp");
      
      try{
      int no = 1;
      String sql = "SELECT * FROM warga";
      java.sql.Connection conn = (Connection)Config.configDB();
      java.sql.Statement stm = conn.createStatement();
      java.sql.ResultSet res = stm.executeQuery(sql);
      
        while(res.next()){
          model.addRow(new Object[]{no++,
          res.getString(1),
          res.getString(2),
          res.getString(3),
          res.getString(4),
          res.getString(5),
          res.getString(6),
          res.getString(7)});
        }
        tabelWarga.setModel(model);
      }catch(SQLException e){
          System.out.println("ERROR"+e.getMessage());
      }
    }
    /**
     * Creates new form AppDataRW
     */
    public AppDataRW() {
        initComponents();
        form_kosong();
        form_tampil();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        cmb_pekerjaann = new javax.swing.JComboBox();
        cmb_pendidikan = new javax.swing.JComboBox();
        txt_rt = new javax.swing.JTextField();
        txt_rumah = new javax.swing.JTextField();
        txt_telp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelWarga = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA WARGA RW 13");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel2.setText("NIK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setText("Pekerjaan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setText("Pendidikan Akhir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setText("RT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel7.setText("No. Rumah");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel8.setText("No. Telp");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        jPanel1.add(txt_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, -1));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, -1));

        cmb_pekerjaann.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Petani", "Peternak", "PNS", "Karyawan Swata", "Buruh Harian Lepas", "Siswa", "Mahasiswa" }));
        jPanel1.add(cmb_pekerjaann, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, -1));

        cmb_pendidikan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SD", "SMP", "SMA", "D1", "D2", "D3", "D4", "S1", "S2", "S3" }));
        jPanel1.add(cmb_pendidikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, -1));
        jPanel1.add(txt_rt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 40, -1));

        txt_rumah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rumahActionPerformed(evt);
            }
        });
        jPanel1.add(txt_rumah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 40, -1));
        jPanel1.add(txt_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, -1));

        tabelWarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelWarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelWargaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelWarga);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 530, 410));

        btn_tambah.setText("Tambah Data");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 60, -1));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 70, -1));

        btn_keluar.setText("Logut");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "App Database Data RW", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rumahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rumahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rumahActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logout Berhasil!");
        System.exit(0);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        form_kosong();        
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO warga VALUES('"+txt_nik.getText()+"',"
                    + "'"+txt_nama.getText()+"',"
                    + "'"+cmb_pekerjaann.getSelectedItem()+"',"
                    + "'"+cmb_pendidikan.getSelectedItem()+"',"
                    + "'"+txt_rt.getText()+"',"
                    + "'"+txt_rumah.getText()+"',"
                    + "'"+txt_telp.getText()+"')";
            
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil!");
            form_tampil();
            form_kosong();           
        }catch(HeadlessException|SQLException e){
            JOptionPane.showMessageDialog(null, "Simpan Data GAGAL!"+e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "UPDATE warga SET nik='"+txt_nik.getText()+"',nama='"+txt_nama.getText()+"',pekerjaan='"+cmb_pekerjaann.getSelectedItem()+"',pendidikan='"+cmb_pendidikan.getSelectedItem()+"',rt='"+txt_rt.getText()+"',no_rumah='"+txt_rumah.getText()+"',no_telp='"+txt_telp.getText()+"' WHERE nik='"+txt_nik.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil!");
        }catch(HeadlessException|SQLException e){
            JOptionPane.showMessageDialog(null, "Edit Data GAGAL!"+e.getMessage());
        }
         form_tampil();
         form_kosong();
    }//GEN-LAST:event_btn_editActionPerformed

    private void tabelWargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelWargaMouseClicked
        // TODO add your handling code here:
        int baris = tabelWarga.rowAtPoint(evt.getPoint());
        String nik = tabelWarga.getValueAt(baris, 1).toString();
        txt_nik.setText(nik);
        String nama = tabelWarga.getValueAt(baris, 2).toString();
        txt_nama.setText(nama);
        String pekerjaan = tabelWarga.getValueAt(baris, 3).toString();
        cmb_pekerjaann.setSelectedItem(pekerjaan);
        String pendidikan = tabelWarga.getValueAt(baris, 4).toString();
        cmb_pendidikan.setSelectedItem(pendidikan);
        String rt = tabelWarga.getValueAt(baris, 5).toString();
        txt_rt.setText(rt);
        String rumah = tabelWarga.getValueAt(baris, 5).toString();
        txt_rumah.setText(rumah);
        String telp = tabelWarga.getValueAt(baris, 6).toString();
        txt_telp.setText(telp);
        
    }//GEN-LAST:event_tabelWargaMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM warga WHERE nik='"+txt_nik.getText()+"'";
            
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil!");          
        }catch(HeadlessException|SQLException e){
            JOptionPane.showMessageDialog(null, "Hapus Data GAGAL!"+e.getMessage());
        }
            form_tampil();
            form_kosong(); 
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        form_kosong();
    }//GEN-LAST:event_btn_batalActionPerformed

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
            java.util.logging.Logger.getLogger(AppDataRW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppDataRW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppDataRW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppDataRW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppDataRW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox cmb_pekerjaann;
    private javax.swing.JComboBox cmb_pendidikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelWarga;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_rt;
    private javax.swing.JTextField txt_rumah;
    private javax.swing.JTextField txt_telp;
    // End of variables declaration//GEN-END:variables
}
