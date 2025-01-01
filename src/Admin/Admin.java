package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnaPanel = new javax.swing.JTabbedPane();
        Uye = new javax.swing.JPanel();
        UyeListe = new javax.swing.JScrollPane();
        UyeTablo = new javax.swing.JTable();
        UyeSil = new javax.swing.JButton();
        UyeGuncelle = new javax.swing.JButton();
        UyeEkle = new javax.swing.JButton();
        UyeListeGoster = new javax.swing.JButton();
        UyeGosterButton = new javax.swing.JButton();
        UyeSıfırla = new javax.swing.JButton();
        idgir = new javax.swing.JTextField();
        adgir = new javax.swing.JTextField();
        soyadgir = new javax.swing.JTextField();
        mailgir = new javax.swing.JTextField();
        telgir = new javax.swing.JTextField();
        adresgir = new javax.swing.JTextField();
        sifregir = new javax.swing.JTextField();
        kartNogir = new javax.swing.JTextField();
        sktgir = new javax.swing.JTextField();
        cvvgir = new javax.swing.JTextField();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        telnoLabel = new javax.swing.JLabel();
        adresLabel = new javax.swing.JLabel();
        kartnoLabel = new javax.swing.JLabel();
        cvvLabel = new javax.swing.JLabel();
        sktLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        UrunListe = new javax.swing.JScrollPane();
        UrunTablo = new javax.swing.JTable();
        MenuGosterButton = new javax.swing.JButton();
        UrunSil = new javax.swing.JButton();
        UrunGoster = new javax.swing.JButton();
        urungirisi = new javax.swing.JTextField();
        fiyatgirisi = new javax.swing.JTextField();
        kategoriSec = new javax.swing.JComboBox<>();
        UrunEkle = new javax.swing.JButton();
        UrunGuncelle = new javax.swing.JButton();
        idgirisi = new javax.swing.JTextField();
        Sıfırla = new javax.swing.JButton();
        urunidLabel = new javax.swing.JLabel();
        urunadLabel = new javax.swing.JLabel();
        urunfiyatLabel = new javax.swing.JLabel();
        urunkategoriLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Uye.setBackground(new java.awt.Color(0, 153, 153));

        UyeTablo.setBackground(new java.awt.Color(204, 204, 204));
        UyeTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Ad", "Soyad", "Mail", "TelNo", "Adres", "Şifre", "KartNo", "SKT", "Cvv"
            }
        ));
        UyeTablo.setName(""); // NOI18N
        UyeListe.setViewportView(UyeTablo);

        UyeSil.setText("Üye Sil");
        UyeSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeSilActionPerformed(evt);
            }
        });

        UyeGuncelle.setText("Güncelle");
        UyeGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeGuncelleActionPerformed(evt);
            }
        });

        UyeEkle.setText("Üye Ekle");
        UyeEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeEkleActionPerformed(evt);
            }
        });

        UyeListeGoster.setText("Üye Listesini Göster");
        UyeListeGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeListeGosterActionPerformed(evt);
            }
        });

        UyeGosterButton.setText("Üye Bilgisini Göster");
        UyeGosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeGosterButtonActionPerformed(evt);
            }
        });

        UyeSıfırla.setText("Sıfırla");
        UyeSıfırla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeSıfırlaActionPerformed(evt);
            }
        });

        adgir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adgirActionPerformed(evt);
            }
        });

        mailgir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailgirActionPerformed(evt);
            }
        });

        sifregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifregirActionPerformed(evt);
            }
        });

        sktgir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sktgirActionPerformed(evt);
            }
        });

        adLabel.setText("Ad");

        soyadLabel.setText("Soyad");

        mailLabel.setText("Mail");

        sifreLabel.setText("Şifre");

        telnoLabel.setText("Telefon Numarası");

        adresLabel.setText("Adres");

        kartnoLabel.setText("Kart Numarası");

        cvvLabel.setText("Cvv");

        sktLabel.setText("Skt");

        idLabel.setText("Id");

        javax.swing.GroupLayout UyeLayout = new javax.swing.GroupLayout(Uye);
        Uye.setLayout(UyeLayout);
        UyeLayout.setHorizontalGroup(
            UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UyeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UyeListe)
                    .addGroup(UyeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(UyeLayout.createSequentialGroup()
                                .addComponent(soyadgir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifregir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adresgir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cvvgir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sktLabel)
                                    .addComponent(sktgir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(UyeLayout.createSequentialGroup()
                                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adgir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adLabel)
                                    .addComponent(soyadLabel)
                                    .addComponent(idgir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailLabel)
                                    .addComponent(mailgir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifreLabel))
                                .addGap(18, 18, 18)
                                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telnoLabel)
                                    .addComponent(telgir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adresLabel))
                                .addGap(18, 18, 18)
                                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kartNogir)
                                    .addGroup(UyeLayout.createSequentialGroup()
                                        .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cvvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kartnoLabel))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(UyeLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(UyeSil, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UyeGuncelle)
                        .addGap(18, 18, 18)
                        .addComponent(UyeEkle)
                        .addGap(61, 61, 61)
                        .addComponent(UyeGosterButton)
                        .addGap(18, 18, 18)
                        .addComponent(UyeSıfırla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UyeListeGoster)
                        .addGap(14, 14, 14))))
        );
        UyeLayout.setVerticalGroup(
            UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UyeLayout.createSequentialGroup()
                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(idgir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kartnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mailLabel)
                        .addComponent(telnoLabel))
                    .addComponent(adLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UyeLayout.createSequentialGroup()
                        .addComponent(adgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UyeLayout.createSequentialGroup()
                        .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartNogir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sifreLabel)
                                .addComponent(adresLabel))
                            .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cvvLabel)
                                .addComponent(sktLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifregir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sktgir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(UyeListe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UyeGuncelle)
                    .addComponent(UyeEkle)
                    .addComponent(UyeSil)
                    .addComponent(UyeListeGoster)
                    .addComponent(UyeSıfırla)
                    .addComponent(UyeGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        AnaPanel.addTab("Üye İşlemleri", Uye);

        Menu.setBackground(new java.awt.Color(0, 153, 153));

        UrunTablo.setBackground(new java.awt.Color(204, 204, 204));
        UrunTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ÜrünID", "Ürün", "Fiyat", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UrunTablo.setName(""); // NOI18N
        UrunListe.setViewportView(UrunTablo);

        MenuGosterButton.setText("Menü Göster");
        MenuGosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGosterButtonActionPerformed(evt);
            }
        });

        UrunSil.setText("Ürün Sil");
        UrunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunSilActionPerformed(evt);
            }
        });

        UrunGoster.setText("Göster");
        UrunGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunGosterActionPerformed(evt);
            }
        });

        kategoriSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kahvaltı", "Kebaplar", "Çorbalar", "Mezeler", "Salatalar", "Ara Sıcaklar", "Tatlılar", "İçecekler" }));

        UrunEkle.setText("Ürün Ekle");
        UrunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunEkleActionPerformed(evt);
            }
        });

        UrunGuncelle.setText("Güncelle");
        UrunGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunGuncelleActionPerformed(evt);
            }
        });

        idgirisi.setEditable(false);

        Sıfırla.setText("Sıfırla");
        Sıfırla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SıfırlaActionPerformed(evt);
            }
        });

        urunidLabel.setText("Id");

        urunadLabel.setText("Ürün Adı");

        urunfiyatLabel.setText("Fiyat");

        urunkategoriLabel.setText("Kategori");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UrunListe, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idgirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urungirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunadLabel))
                        .addGap(45, 45, 45)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fiyatgirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunfiyatLabel))
                        .addGap(45, 45, 45)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kategoriSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunkategoriLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MenuGosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UrunSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UrunGoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UrunEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UrunGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sıfırla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunidLabel)
                    .addComponent(urunadLabel)
                    .addComponent(urunfiyatLabel)
                    .addComponent(urunkategoriLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenuGosterButton)
                    .addComponent(urungirisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyatgirisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategoriSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idgirisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UrunSil)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UrunGuncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UrunEkle)
                        .addGap(48, 48, 48)
                        .addComponent(UrunGoster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sıfırla)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(UrunListe, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        AnaPanel.addTab("Menü İşlemleri", Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnaPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnaPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SıfırlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SıfırlaActionPerformed
        idgirisi.setText("");
        urungirisi.setText("");
        fiyatgirisi.setText("");
        kategoriSec.setSelectedItem(null);
    }//GEN-LAST:event_SıfırlaActionPerformed

    private void UrunGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunGuncelleActionPerformed
        String ID = null;
        urunGuncelle(ID);
    }//GEN-LAST:event_UrunGuncelleActionPerformed

    private void UrunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunEkleActionPerformed
        urunEkle();
    }//GEN-LAST:event_UrunEkleActionPerformed

    private void UrunGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunGosterActionPerformed
        urunGoster(Id);

    }//GEN-LAST:event_UrunGosterActionPerformed

    private void UrunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunSilActionPerformed
        int selectedRow = UrunTablo.getSelectedRow();
        if (selectedRow != -1) {
            int ID = (int) UrunTablo.getValueAt(selectedRow, 0);
            UrunSil(ID);
        } else {
            JOptionPane.showMessageDialog(null, "Lütfen silmek için bir ürün seçin.");
        }

    }//GEN-LAST:event_UrunSilActionPerformed

    private void MenuGosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGosterButtonActionPerformed
        MenuGoster();
    }//GEN-LAST:event_MenuGosterButtonActionPerformed

    private void sktgirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sktgirActionPerformed
    }//GEN-LAST:event_sktgirActionPerformed

    private void sifregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifregirActionPerformed
    }//GEN-LAST:event_sifregirActionPerformed

    private void mailgirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailgirActionPerformed
    }//GEN-LAST:event_mailgirActionPerformed

    private void adgirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adgirActionPerformed
    }//GEN-LAST:event_adgirActionPerformed

    private void UyeSıfırlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeSıfırlaActionPerformed
        adgir.setText("");
        soyadgir.setText("");
        mailgir.setText("");
        adresgir.setText("");
        telgir.setText("");
        sifregir.setText("");
        kartNogir.setText("");
        cvvgir.setText("");
        sktgir.setText("");
        idgir.setText("");
        
    }//GEN-LAST:event_UyeSıfırlaActionPerformed

    private void UyeGosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeGosterButtonActionPerformed
        uyeGoster(id_uye);
    }//GEN-LAST:event_UyeGosterButtonActionPerformed

    private void UyeListeGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeListeGosterActionPerformed
        uyeListeGoster();
    }//GEN-LAST:event_UyeListeGosterActionPerformed

    private void UyeEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeEkleActionPerformed
        uyeEkle();
    }//GEN-LAST:event_UyeEkleActionPerformed

    private void UyeGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeGuncelleActionPerformed
        uyeGuncelle(ID);
    }//GEN-LAST:event_UyeGuncelleActionPerformed

    private void UyeSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeSilActionPerformed
        int selectedRow = UyeTablo.getSelectedRow();
        if (selectedRow != -1) {
            int uyeId = (int) UyeTablo.getValueAt(selectedRow, 0);
            uyeSil(uyeId);
        } else {
            JOptionPane.showMessageDialog(null, "Lütfen silmek için bir kullanıcı seçin.");
        }
    }//GEN-LAST:event_UyeSilActionPerformed
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        static String dbURL = "jdbc:mysql://localhost:3306/restoran";
        static String dbUser = "root"; 
        static String dbPassword = "";
    
    public void MenuGoster(){
        try
        {
        Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        String sql="select urunId,urun,fiyat from menu ";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery(sql);
        UrunTablo.setModel(Restoran.ResultSetToTableModel.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }    
    private void uyeGuncelle(String ID){
        String Ad=adgir.getText();
        String Soyad=soyadgir.getText();
        String Mail=mailgir.getText();
        String Adres=adresgir.getText();
        String TelNo=telgir.getText().replaceAll("","");
        String Sifre=sifregir.getText();
        String KartNo=kartNogir.getText().replaceAll("","");
        String Cvv=cvvgir.getText().replaceAll("","");
        String Skt=sktgir.getText().replaceAll("","");        
        ID=idgir.getText();
        
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                String query = "UPDATE kullanicilar SET ad= ?, soyad= ?, mail= ?, adres= ?, telNo= ?, sifre= ?, kartNo= ?,cvv= ?, skt= ? WHERE id=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, Ad);
                ps.setString(2, Soyad);
                ps.setString(3, Mail);
                ps.setString(4, Adres);
                ps.setString(5, TelNo);
                ps.setString(6, Sifre);
                ps.setString(7, KartNo);
                ps.setString(8, Cvv);
                ps.setString(9, Skt);
                ps.setString(10, ID);
                
                int rowsAffected = ps.executeUpdate();
                System.out.println("Güncellenen satır sayısı (Üye Güncelle): " + rowsAffected);
                
            } catch (SQLException ex) {
                ex.printStackTrace(); 
                JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());                  
            }   
    }
    String ID= "";    
    private static void UrunSil(int ID) {
        try{
            Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            String sql = "DELETE FROM menu WHERE urunId = ?";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, ID);
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Ürün başarıyla silindi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Silinecek ürün bulunamadı.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + e.getMessage());
        }
    }
    
    public void urunGoster(int Id) {
        
        try {
            int secilenId = UrunTablo.getSelectedRow();
            if (secilenId != -1) {
                Id = (int) UrunTablo.getValueAt(secilenId, 0); 
                // Veritabanı bağlantısı
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                String query = "SELECT * FROM menu WHERE urunId = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, Id);
                ResultSet rs = ps.executeQuery();
        
                if (rs.next()) {
                urungirisi.setText(rs.getString("urun"));
                fiyatgirisi.setText(rs.getString("fiyat"));
                kategoriSec.setSelectedItem(rs.getString("kategori"));
                idgirisi.setText(rs.getString("urunId"));
            
                } else {
                JOptionPane.showMessageDialog(null, "Ürün Bulunamadı.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Görüntülenecek bir ürün seçiniz.");
            }
        
        } catch (SQLException ex) {
            ex.printStackTrace();  // Hata mesajını yazdır
            JOptionPane.showMessageDialog(null, "Ürün Yükleme Hatası: " + ex.getMessage());
        }
    }
    int Id = 0;    
    private boolean urunEkle(){
        String Urun=urungirisi.getText();
        String Fiyat=fiyatgirisi.getText();
        String Kategori=kategoriSec.getSelectedItem().toString();
              
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                String query = "INSERT INTO menu (urun,fiyat,kategori) VALUES (?,?,?) ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, Urun);
                ps.setString(2, Fiyat);
                ps.setString(3, Kategori);
                
                
                int rowsAffected = ps.executeUpdate();
                System.out.println("Güncellenen satır sayısı(Ürün Ekle): " + rowsAffected);
                return rowsAffected > 0;
            } catch (SQLException ex) {
                ex.printStackTrace(); 
                JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());  
                return false;  
            }   
    }    
    private void urunGuncelle(String ID){
        String Urun=urungirisi.getText();
        String Fiyat=fiyatgirisi.getText();
        String Kategori=kategoriSec.getSelectedItem().toString();
        ID = idgirisi.getText();
        
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                String query = "UPDATE menu SET urun= ?,fiyat= ?,kategori= ? WHERE urunId=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, Urun);
                ps.setString(2, Fiyat);
                ps.setString(3, Kategori);
                ps.setString(4, ID);
                
                
                int rowsAffected = ps.executeUpdate();
                System.out.println("Güncellenen satır sayısı: " + rowsAffected);
                
            } catch (SQLException ex) {
                ex.printStackTrace(); 
                JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());  
                
            }
    
    }    
    public void uyeListeGoster(){
        try
        {
        Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        String sql="select * from kullanicilar ";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery(sql);
        UyeTablo.setModel(Restoran.ResultSetToTableModel.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }    
    private void uyeGoster(int id_uye) {
     
        try {
            int secilenId = UyeTablo.getSelectedRow();
            if (secilenId != -1) {
                id_uye = (int) UyeTablo.getValueAt(secilenId, 0); 
                // Veritabanı bağlantısı
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                String query = "SELECT * FROM kullanicilar WHERE id = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, id_uye);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) { 
                adgir.setText(rs.getString("ad"));
                soyadgir.setText(rs.getString("soyad"));
                mailgir.setText(rs.getString("mail"));
                adresgir.setText(rs.getString("adres"));
                telgir.setText(rs.getString("telNo"));
                sifregir.setText(rs.getString("sifre"));
                kartNogir.setText(rs.getString("kartNo"));
                cvvgir.setText(rs.getString("cvv"));
                sktgir.setText(rs.getString("skt"));
                idgir.setText(rs.getString("id"));
                } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı bulunamadı.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Görüntülenecek bir kullanıcı seçiniz.");
            }
        
        } catch (SQLException ex) {
            ex.printStackTrace();  // Hata mesajını yazdır
            JOptionPane.showMessageDialog(null, "Kullanıcı Yükleme Hatası: " + ex.getMessage());
        }
    }
    
    int id_uye = 0;        
    private static void uyeSil(int uyeId) {
        try{
            Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            String sql = "DELETE FROM kullanicilar WHERE id = ?";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, uyeId);
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Üye başarıyla silindi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Silinecek ürün bulunamadı.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + e.getMessage());
        }
    }        
    private boolean uyeEkle(){
        String Ad=adgir.getText();
        String Soyad=soyadgir.getText();
        String Mail=mailgir.getText();
        String telNo=telgir.getText();
        String Adres=adresgir.getText();
        String Sifre=sifregir.getText();
        String KartNo=kartNogir.getText();
        String Cvv=cvvgir.getText();
        String Skt=sktgir.getText();        
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
                String query = "INSERT INTO kullanicilar (ad,soyad,mail,telNo,adres,sifre,kartNo,cvv,skt) VALUES (?,?,?,?,?,?,?,?,?) ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, Ad);
                ps.setString(2, Soyad);
                ps.setString(3, Mail);
                ps.setString(4, telNo);
                ps.setString(5, Adres);
                ps.setString(6, Sifre);
                ps.setString(7, KartNo);
                ps.setString(8, Cvv);
                ps.setString(9, Skt);
                                
                int rowsAffected = ps.executeUpdate();
                System.out.println("Güncellenen satır sayısı(Üye Ekle): " + rowsAffected);
                return rowsAffected > 0;
            } catch (SQLException ex) {
                ex.printStackTrace(); 
                JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());  
                return false;  
            }
    
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AnaPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton MenuGosterButton;
    private javax.swing.JButton Sıfırla;
    private javax.swing.JButton UrunEkle;
    private javax.swing.JButton UrunGoster;
    private javax.swing.JButton UrunGuncelle;
    private javax.swing.JScrollPane UrunListe;
    private javax.swing.JButton UrunSil;
    private javax.swing.JTable UrunTablo;
    private javax.swing.JPanel Uye;
    private javax.swing.JButton UyeEkle;
    private javax.swing.JButton UyeGosterButton;
    private javax.swing.JButton UyeGuncelle;
    private javax.swing.JScrollPane UyeListe;
    private javax.swing.JButton UyeListeGoster;
    private javax.swing.JButton UyeSil;
    private javax.swing.JButton UyeSıfırla;
    private javax.swing.JTable UyeTablo;
    private javax.swing.JLabel adLabel;
    private javax.swing.JTextField adgir;
    private javax.swing.JLabel adresLabel;
    private javax.swing.JTextField adresgir;
    private javax.swing.JLabel cvvLabel;
    private javax.swing.JTextField cvvgir;
    private javax.swing.JTextField fiyatgirisi;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idgir;
    private javax.swing.JTextField idgirisi;
    private javax.swing.JTextField kartNogir;
    private javax.swing.JLabel kartnoLabel;
    private javax.swing.JComboBox<String> kategoriSec;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailgir;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JTextField sifregir;
    private javax.swing.JLabel sktLabel;
    private javax.swing.JTextField sktgir;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField soyadgir;
    private javax.swing.JTextField telgir;
    private javax.swing.JLabel telnoLabel;
    private javax.swing.JLabel urunadLabel;
    private javax.swing.JLabel urunfiyatLabel;
    private javax.swing.JTextField urungirisi;
    private javax.swing.JLabel urunidLabel;
    private javax.swing.JLabel urunkategoriLabel;
    // End of variables declaration//GEN-END:variables
}
