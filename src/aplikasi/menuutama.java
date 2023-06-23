/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author hp
 */
public class menuutama extends javax.swing.JFrame {

    /**
     * Creates new form menuutama
     */
    public menuutama() {
        initComponents();
        setTitle("Mahar Stamp");
        setResizable(false);
        initComponents();
        ImageIcon img = new ImageIcon("src/gambar/logo.png");
        setIconImage(img.getImage());
    }

    /**
     *
     */
    

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
        btnlogout = new javax.swing.JButton();
        btnpegawai = new javax.swing.JButton();
        btnkonsumen = new javax.swing.JButton();
        btnsuplier = new javax.swing.JButton();
        btnpembelian = new javax.swing.JButton();
        btninput = new javax.swing.JButton();
        btntransaksi = new javax.swing.JButton();
        btnpengiriman = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("MENU UTAMA");

        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnlogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnpegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/karyawan.png"))); // NOI18N
        btnpegawai.setText("PEGAWAI");
        btnpegawai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpegawai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpegawaiActionPerformed(evt);
            }
        });

        btnkonsumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/konsumen.png"))); // NOI18N
        btnkonsumen.setText("DATA KONSUMEN");
        btnkonsumen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkonsumen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnkonsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkonsumenActionPerformed(evt);
            }
        });

        btnsuplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/supplier.png"))); // NOI18N
        btnsuplier.setText("SUPLIER");
        btnsuplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsuplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuplierActionPerformed(evt);
            }
        });

        btnpembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/restock.png"))); // NOI18N
        btnpembelian.setText("RESTOCK");
        btnpembelian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpembelian.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpembelianActionPerformed(evt);
            }
        });

        btninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/databarang.png"))); // NOI18N
        btninput.setText("DATA BARANG");
        btninput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btninput.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btninput.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btntransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/transaksi.png"))); // NOI18N
        btntransaksi.setText("TRANSAKSI");
        btntransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btntransaksi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btntransaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btntransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransaksiActionPerformed(evt);
            }
        });

        btnpengiriman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pengiriman2.png"))); // NOI18N
        btnpengiriman.setText("Pengiriman");
        btnpengiriman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpengiriman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpengirimanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btninput)
                        .addGap(18, 18, 18)
                        .addComponent(btnkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btntransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnpengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnpembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnpegawai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(btnkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnsuplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnpembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpengiriman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(194, 194, 194))
        );

        jMenu1.setText("Laporan");

        menu1.setText("Transaksi");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        jMenu1.add(menu1);

        jMenuItem2.setText("Restock");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jCheckBoxMenuItem1.setText("Data Barang");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setText("Data Konsumen");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpegawaiActionPerformed
        // TODO add your handling code here:
        karyawan fb = new karyawan();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnpegawaiActionPerformed

    private void btnkonsumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkonsumenActionPerformed
        // TODO add your handling code here:
        konsumen fb = new konsumen();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnkonsumenActionPerformed

    private void btnsuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuplierActionPerformed
        // TODO add your handling code here:
        suplier fb = new suplier();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsuplierActionPerformed

    private void btnpembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpembelianActionPerformed
        // TODO add your handling code here
        restok fb = new restok();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnpembelianActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        // TODO add your handling code here:
        databarang fb = new databarang();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btninputActionPerformed

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        // TODO add your handling code here:
        transaksi fb = new transaksi();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin ingin keluar?", "MAHAR STAMP", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            login fb = new login();
        fb.setVisible(true);     
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        try{
            String NamaFile = "src/laporan/restock.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_stempel","root","");
            HashMap parameter = new HashMap();
            JasperPrint jp = JasperFillManager.fillReport(NamaFile, parameter, koneksi);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Dapat Dicetak","Mahar Stamp",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
        cetakdatatransaksi fb = new cetakdatatransaksi();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        cetakdatabarang fb = new cetakdatabarang();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        try{
            String NamaFile = "src/laporan/datakonsumen.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_stempel","root","");
            HashMap parameter = new HashMap();
            JasperPrint jp = JasperFillManager.fillReport(NamaFile, parameter, koneksi);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Dapat Dicetak","Mahar Stamp",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void btnpengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpengirimanActionPerformed
        // TODO add your handling code here:
        pengiriman fb = new pengiriman();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnpengirimanActionPerformed

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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnkonsumen;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnpegawai;
    private javax.swing.JButton btnpembelian;
    private javax.swing.JButton btnpengiriman;
    private javax.swing.JButton btnsuplier;
    private javax.swing.JButton btntransaksi;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menu1;
    // End of variables declaration//GEN-END:variables
}
