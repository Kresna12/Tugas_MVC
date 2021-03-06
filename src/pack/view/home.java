/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;

/**
 *
 * @author yoan
 */
public class home extends javax.swing.JFrame {

    controllerToko ctoko;
    List<m_toko> listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        getCbKategori().setSelectedItem(null);
        getCbJenis().setSelectedItem(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setText("Admin : ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 20);

        txtadmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtadmin);
        txtadmin.setBounds(80, 20, 140, 20);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel3.setText("Data Barang Toko");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 10, 300, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 70);

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel9.setText("Pencarian Berdasarkan Kategori Makanan");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 10, 330, 30);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baranglain" }));
        jPanel3.add(CbCariKategori);
        CbCariKategori.setBounds(10, 40, 120, 20);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Sitka Subheading", 0, 11)); // NOI18N
        jButton1.setText("C A R I");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(140, 40, 110, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(380, 220, 260, 70);

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel4.setText("Nama Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 110, 20);

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel5.setText("Kategori Barang");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 110, 20);

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel6.setText("Jenis Packaging");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 210, 110, 20);

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel7.setText("Harga");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 250, 110, 20);

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel8.setText("Kode Barang");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 90, 110, 20);
        getContentPane().add(txtharga);
        txtharga.setBounds(130, 250, 230, 30);
        getContentPane().add(txtkode);
        txtkode.setBounds(130, 90, 230, 30);
        getContentPane().add(txtnama);
        txtnama.setBounds(130, 130, 230, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baranglain" }));
        getContentPane().add(cbKategoriBrg);
        cbKategoriBrg.setBounds(130, 170, 230, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack" }));
        getContentPane().add(cbjenis);
        cbjenis.setBounds(130, 210, 230, 30);

        Btn_Bersih.setBackground(new java.awt.Color(204, 255, 204));
        Btn_Bersih.setFont(new java.awt.Font("Forte", 0, 11)); // NOI18N
        Btn_Bersih.setText("B E R S I H K A N");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Bersih);
        Btn_Bersih.setBounds(420, 160, 150, 20);

        Btn_Hapus.setBackground(new java.awt.Color(204, 255, 204));
        Btn_Hapus.setFont(new java.awt.Font("Forte", 0, 11)); // NOI18N
        Btn_Hapus.setText("H A P U S");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Hapus);
        Btn_Hapus.setBounds(420, 100, 150, 20);

        Btn_Keluar.setBackground(new java.awt.Color(204, 0, 51));
        Btn_Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Keluar.setText("K E L U A R");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Keluar);
        Btn_Keluar.setBounds(20, 460, 100, 30);

        Btn_Simpan.setBackground(new java.awt.Color(204, 255, 204));
        Btn_Simpan.setFont(new java.awt.Font("Forte", 0, 11)); // NOI18N
        Btn_Simpan.setText("S I M P A N");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Simpan);
        Btn_Simpan.setBounds(420, 190, 150, 20);

        Btn_Ubah.setBackground(new java.awt.Color(204, 255, 204));
        Btn_Ubah.setFont(new java.awt.Font("Forte", 0, 11)); // NOI18N
        Btn_Ubah.setText("P E R B A R U I");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Ubah);
        Btn_Ubah.setBounds(420, 130, 150, 20);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 630, 130);

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 70, 700, 390);

        setBounds(0, 0, 672, 480);
    }// </editor-fold>//GEN-END:initComponents
    public JTextField getTxtKode(){ 
        return txtkode;
    }

    public JTextField getTxtNama() {
        return txtnama;
    }

    public JTextField getTxtHarga() {
        return txtharga;
    }

    public JComboBox getCbKategori() {
        return cbKategoriBrg;
    }

    public JComboBox getCbJenis() {
        return cbjenis;
    }

    public JComboBox getCbCariKategori() {
        return CbCariKategori;
    }

    public JButton getButtonHapus() {
        return Btn_Hapus;
    }

    public JButton getButtonBersih() {
        return Btn_Bersih;
    }

    public JButton getButtonSimpan() {
        return Btn_Simpan;
    }

    public JButton getButtonUbah() {
        return Btn_Ubah;
    }

    public JButton getButtonKeluar() {
        return Btn_Keluar;
    }

    public JTable getTableData() {
        return Tabel1;
    }
    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        int baris = Tabel1.getSelectedRow();
        if(baris != -1){
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String) Tabel1.getValueAt(baris, 1));
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_Tabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ctoko.CariKategori();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

    
}
