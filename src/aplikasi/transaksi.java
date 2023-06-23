/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import java.awt.Desktop;
import java.net.URL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author hp
 */
public class transaksi extends javax.swing.JFrame {
    public long total;
    public long bayar;
    public long kembali;
    public Statement st;
    Connection cn = koneksi.getKoneksi();
    private DefaultTableModel model;

    /**
     * Creates new form transaksi
     */
    public transaksi() {
        setTitle("Mahar Stamp");
        setResizable(false);
        initComponents();
        ImageIcon img = new ImageIcon("src/gambar/logo.png");
        setIconImage(img.getImage());
        model = new DefaultTableModel();

        tabeltransaksi.setModel(model);
        model.addColumn("No");
        model.addColumn("ID Konsumen");
        model.addColumn("Nama");
        model.addColumn("kode barang");
        model.addColumn("harga satuan");
        model.addColumn("jml");
        model.addColumn("jumlah beli");
        model.addColumn("harga");
        loadData();
        nokd();
        tampilid();
        tampilkd();
        
        
    }
   public void FilterHuruf(KeyEvent a){
       if(Character.isDigit(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "masukan huruf saja!", "peringatan", JOptionPane.WARNING_MESSAGE);
       }
   }
    public void FilterAngka(KeyEvent a){
       if(Character.isAlphabetic(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "masukan angka saja!", "peringatan", JOptionPane.WARNING_MESSAGE);
       }
   }
   public final void loadData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM list";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[7];
                o[0] = r.getString("no_list");
                o[1] = r.getString("id_konsumen");
                o[2] = r.getString("nama");
                o[3] = r.getString("kd_barang");
                o[4] = r.getString("satuan");
                o[5] = r.getString("jml_beli");
                o[6] = r.getString("harga");
               
                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
   }
    private void tampilid() {
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT id_konsumen FROM konsumen";
            ResultSet r = s.executeQuery(sql);
            
            while (r.next()) {
                pilihid.addItem(r.getString("id_konsumen"));
            }

            r.last();
            int jumlahdata = r.getRow();
            r.first();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void tampilkd() {
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT kd_barang FROM databarang";
            ResultSet r = s.executeQuery(sql);
            
            while (r.next()) {
                pilihkd.addItem(r.getString("kd_barang"));
            }

            r.last();
            int jumlahdata = r.getRow();
            r.first();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
  private void nokd() {
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM transaksi ORDER by kd_pesan desc";
            ResultSet r = s.executeQuery(sql);

            if (r.next()) {
                String nokd = r.getString("kd_pesan").substring(1);
                String AN = "" + (Integer.parseInt(nokd) + 1);
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if (AN.length() == 3) {
                    Nol = "0";
                } else if (AN.length() == 4) {
                    Nol = "";
                }

                kd.setText("T" + Nol + AN);
            } else {
                kd.setText("T0001");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kd = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        tlp = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        pilihid = new javax.swing.JComboBox<>();
        btnhitung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbayar = new javax.swing.JTextField();
        tkembalian = new javax.swing.JTextField();
        btnselesai = new javax.swing.JButton();
        btntotal = new javax.swing.JButton();
        bcetak = new javax.swing.JButton();
        txtcetak = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tharga = new javax.swing.JTextField();
        pilihkd = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        tjumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Transaksi");

        jButton1.setText("Kembali");

        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(btnkembali)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnkembali)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 757, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Pesanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Pemesan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Pemesan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No.Telepon");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kode Barang");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, -1, -1));

        kd.setEditable(false);
        kd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdActionPerformed(evt);
            }
        });
        jPanel1.add(kd, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 70, 90, 30));

        nama.setEditable(false);
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 166, 200, 30));

        tlp.setEditable(false);
        jPanel1.add(tlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 214, 200, 30));

        ttotal.setEditable(false);
        jPanel1.add(ttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 400, 130, 30));

        pilihid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));
        pilihid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihidActionPerformed(evt);
            }
        });
        jPanel1.add(pilihid, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 118, 130, 30));

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        jPanel1.add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 400, -1, 30));

        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltransaksi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 630, 92));

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 441, -1, 31));

        btnhapus.setText("Hapus");
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 441, -1, 31));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("Rp.");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("bayar");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kembalian");

        tbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbayarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbayarKeyTyped(evt);
            }
        });

        btnselesai.setText("Selesai");
        btnselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselesaiActionPerformed(evt);
            }
        });

        btntotal.setText("Total");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        bcetak.setText("Cetak");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bcetak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcetak, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btntotal, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(tkembalian)
                                .addComponent(tbayar)
                                .addComponent(btnselesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tkembalian))
                .addGap(18, 18, 18)
                .addComponent(btnselesai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcetak)
                    .addComponent(bcetak, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 415));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Harga Satuan");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 321, -1, -1));

        tharga.setEditable(false);
        tharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thargaActionPerformed(evt);
            }
        });
        jPanel1.add(tharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 316, 130, 30));

        pilihkd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih kode Barang" }));
        pilihkd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihkdActionPerformed(evt);
            }
        });
        jPanel1.add(pilihkd, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 262, 130, 36));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));
        jPanel1.add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 30, 10));

        tjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjumlahActionPerformed(evt);
            }
        });
        jPanel1.add(tjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihidActionPerformed
        // TODO add your handling code here:
        if (pilihid.getSelectedItem().equals("pilih ID Konsumen")){
            nama.setText("");
            tlp.setText("");
        }else{
            try {
                Connection c = koneksi.getKoneksi();
                Statement s = c.createStatement();

                String sql = "SELECT nama,no_tlp FROM konsumen WHERE id_konsumen ='" + pilihid.getSelectedItem() + "'";
                ResultSet r = s.executeQuery(sql);

                while (r.next()) {
                    nama.setText(r.getString("nama"));
                    tlp.setText(r.getString("no_tlp"));
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_pilihidActionPerformed

    private void pilihkdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihkdActionPerformed
        // TODO add your handling code here:
        if (pilihkd.getSelectedItem().equals("pilih kode Barang")){
            tharga.setText("");
            
        }else{
            try {
                Connection c = koneksi.getKoneksi();
                Statement s = c.createStatement();

                String sql = "SELECT jumlah,harga_satuan FROM databarang WHERE kd_barang ='" + pilihkd.getSelectedItem() + "'";
                ResultSet r = s.executeQuery(sql);

                while (r.next()) {
                    jumlah.setText(r.getString("jumlah"));
                    tharga.setText(r.getString("harga_satuan"));
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_pilihkdActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        if(kd.getText().equals("") ||pilihid.getSelectedItem().equals("") ||nama.getText().equals("") ||tlp.getText().equals("") || pilihkd.getSelectedItem().equals("")|| tharga.getText().equals("")|| tjumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "MAHAR STAMP", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
        String a = tjumlah.getText();
        int aa = Integer.parseInt(a);
        
        String b = jumlah.getText();
        int bb = Integer.parseInt(b);
        if(aa > bb){
             JOptionPane.showMessageDialog(null, "jumlah melebihi stok", "MAHAR STAMP", JOptionPane.INFORMATION_MESSAGE);
             tjumlah.setText("");
        }else{
       
        if(tjumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ISI JUMLAH BELI !");
        }else{
        int jumlah, harga, total;
       
        jumlah = Integer.parseInt(tjumlah.getText().toString());
        harga = Integer.parseInt(tharga.getText().toString());
        total = jumlah * harga;
       
       
             ttotal.setText(Integer.toString(total));
        
        }
        }
        }  
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselesaiActionPerformed
        // TODO add your handling code here:
        if(tbayar.getText().equals("") ||tkembalian.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "Mahar Stamp", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            String a = tkembalian.getText();
            int ab = Integer.parseInt(String.valueOf(tkembalian.getText()));
              if(ab < 0){
                JOptionPane.showMessageDialog(null, "Uang anda kurang", "Mahar Stamp", JOptionPane.INFORMATION_MESSAGE);
                tbayar.setText("");
            tkembalian.setText("");
              }else{
            
           try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM list";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                long millis=System.currentTimeMillis();  
                java.sql.Date date=new java.sql.Date(millis);  
                System.out.println(date); 
                String tgl = date.toString();
                String sqla = "INSERT INTO transaksi VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

              
                PreparedStatement p = c.prepareStatement(sqla);
                p.setString(1, kd.getText());
                p.setString(2, r.getString("id_konsumen"));
                p.setString(3, r.getString("nama"));
                p.setString(4, r.getString("kd_barang"));
                p.setString(5, r.getString("satuan"));
                p.setString(6, r.getString("jml_beli"));
                p.setString(7, r.getString("harga"));
                p.setString(8, jLabel9.getText());
                p.setString(9, tbayar.getText());
                p.setString(10, tkembalian.getText());
                p.setString(11, tgl);
                
                p.executeUpdate();
                p.close();
                
                
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }finally{
         try {
            String sqla ="TRUNCATE `list";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sqla);
            pst.execute();
            JOptionPane.showMessageDialog(null, "TRANSAKSI SELESAI", "Mahar Stamp", JOptionPane.INFORMATION_MESSAGE);
            loadData();
            jTextField1.setText(kd.getText());
            tbayar.setText("");
            tkembalian.setText("");
            jLabel9.setText("");
            nokd();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
           }
              }
         }
    }//GEN-LAST:event_btnselesaiActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
        menuutama fb = new menuutama();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT SUM(`harga`) AS total FROM list";
            ResultSet r = s.executeQuery(sql);
           
            while (r.next()) {
                jLabel9.setText(r.getString(""+"total"));
                
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    }//GEN-LAST:event_btntotalActionPerformed

    private void tbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbayarKeyReleased
        // TODO add your handling code here:
        bayar = Integer.parseInt(String.valueOf(tbayar.getText()));
            total = Integer.parseInt(String.valueOf(jLabel9.getText()));
            kembali = bayar - total;
            
            tkembalian.setText(Long.toString(kembali));
    }//GEN-LAST:event_tbayarKeyReleased

    private void tbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbayarKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_tbayarKeyTyped

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        if(kd.getText().equals("") || pilihkd.getSelectedItem().equals("")|| tharga.getText().equals("")|| tjumlah.getText().equals("")|| ttotal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "MAHAR STAMP", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            String pilihkdd = (String)pilihkd.getSelectedItem();
            String pilihidd = (String)pilihid.getSelectedItem();
            String namaa = nama.getText();
            String hsatuann = tharga.getText();
            String tjumlahh = tjumlah.getText();
            int tt = Integer.parseInt(tjumlahh);
            String totall = ttotal.getText();
            String k = jumlah.getText();
            int kk = Integer.parseInt(k); 
            int sisa = kk - tt;
            
            
            try {
                Connection c = koneksi.getKoneksi();
                
                String sql = "INSERT INTO list VALUES (?, ?, ?, ?, ?, ?, ?)";
                String sql1 = "UPDATE databarang set jumlah = '"+sisa+"' where kd_barang = '"+pilihkd.getSelectedItem().toString()+"'";
                
               PreparedStatement pp = c.prepareStatement(sql1);
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, null);
                p.setString(2, pilihidd);
                p.setString(3, namaa);
                p.setString(4, pilihkdd);
                p.setString(5, hsatuann);
                p.setString(6, tjumlahh);
                p.setString(7, totall);
                pp.executeUpdate();
                p.executeUpdate();
                p.close();
            } catch (SQLException e) {
                System.out.println("Terjadi Error");
            } finally {
                nokd();
                pilihkd.setSelectedItem("");
                tharga.setText("");
                tjumlah.setText("");
                ttotal.setText("");
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "MAHAR STAMP", JOptionPane.INFORMATION_MESSAGE);
                loadData();
                
                
            }
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void tabeltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltransaksiMouseClicked
        // TODO add your handling code here:
        int jawaban;
        if ((jawaban = JOptionPane.showConfirmDialog(null,"Yakin batal?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
        try{
        
        int i = tabeltransaksi.getSelectedRow();
        if (i == -1) {
            return;
        }
        String id = (String) model.getValueAt(i, 0);
        
        st = cn.createStatement();
        st.executeUpdate("delete from list where id_list = '"+id+ "'");
        
        nokd();
        loadData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_tabeltransaksiMouseClicked

    private void tjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tjumlahActionPerformed

    private void thargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thargaActionPerformed

    private void bcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakActionPerformed
        // TODO add your handling code here:
        try {
            String NamaFile = "src/laporan/struk.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_stempel","root","");
            HashMap param = new HashMap();
            //Mengambil parameter
            param.put("nolist",txtcetak.getText());

            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, koneksi);
            JasperViewer.viewReport(JPrint, false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak!","Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bcetakActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void kdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcetak;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnselesai;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kd;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pilihid;
    private javax.swing.JComboBox<String> pilihkd;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JTextField tbayar;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tjumlah;
    private javax.swing.JTextField tkembalian;
    private javax.swing.JTextField tlp;
    private javax.swing.JTextField ttotal;
    private javax.swing.JTextField txtcetak;
    // End of variables declaration//GEN-END:variables
}