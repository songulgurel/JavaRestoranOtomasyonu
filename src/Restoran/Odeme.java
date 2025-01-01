package Restoran;
import static Restoran.Arayuz.Mail;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Odeme extends javax.swing.JFrame {
     public Odeme() {
        initComponents();
    }
    
    public Odeme(String Id, String toplam) {
        initComponents();
        idLabel.setText(Id);
        Yazi.setText(toplam);
        kartLabelGizle();
        
    }
    
    private void kartLabelGizle(){
        //Ödeme için gerekli butonları gizlemek için
        KapikartButton.setVisible(false);
        KartButton.setVisible(false);
        NakitButton.setVisible(false);
        OdemeOnayButton.setVisible(false);
        //Kart Bilgilerini gizlemek için
        KartNo.setVisible(false);;
        Cvv.setVisible(false);;
        Skt.setVisible(false);;
        KartNoGir.setVisible(false);;
        CvvGir.setVisible(false);;
        SktGir.setVisible(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OdemePanel = new javax.swing.JPanel();
        Yazi = new javax.swing.JLabel();
        OdemeButton = new javax.swing.JButton();
        KartButton = new javax.swing.JButton();
        NakitButton = new javax.swing.JButton();
        KapikartButton = new javax.swing.JButton();
        KartNo = new javax.swing.JLabel();
        KartNoGir = new javax.swing.JTextField();
        Cvv = new javax.swing.JLabel();
        CvvGir = new javax.swing.JTextField();
        SktGir = new javax.swing.JTextField();
        Skt = new javax.swing.JLabel();
        OdemeOnayButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OdemePanel.setBackground(new java.awt.Color(0, 153, 153));

        Yazi.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Yazi.setText("Toplam:");

        OdemeButton.setText("Ödeme yap");
        OdemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdemeButtonActionPerformed(evt);
            }
        });

        KartButton.setText("Kredi/Banka Kartı");
        KartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartButtonActionPerformed(evt);
            }
        });

        NakitButton.setText("Nakit");
        NakitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NakitButtonActionPerformed(evt);
            }
        });

        KapikartButton.setText("Kapıda Kredi/Banka Kartı");
        KapikartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KapikartButtonActionPerformed(evt);
            }
        });

        KartNo.setText("Kart Numarası");

        KartNoGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartNoGirActionPerformed(evt);
            }
        });

        Cvv.setText("Cvv");

        Skt.setText("Skt");

        OdemeOnayButton.setText("Ödemeyi Onayla");
        OdemeOnayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdemeOnayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OdemePanelLayout = new javax.swing.GroupLayout(OdemePanel);
        OdemePanel.setLayout(OdemePanelLayout);
        OdemePanelLayout.setHorizontalGroup(
            OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemePanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemePanelLayout.createSequentialGroup()
                        .addComponent(KartButton)
                        .addGap(103, 103, 103)
                        .addComponent(NakitButton)
                        .addGap(103, 103, 103))
                    .addGroup(OdemePanelLayout.createSequentialGroup()
                        .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(KartNoGir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(OdemePanelLayout.createSequentialGroup()
                                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(OdemePanelLayout.createSequentialGroup()
                                        .addComponent(CvvGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemePanelLayout.createSequentialGroup()
                                        .addComponent(Cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)))
                                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Skt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SktGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(KartNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OdemePanelLayout.createSequentialGroup()
                        .addComponent(KapikartButton)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemePanelLayout.createSequentialGroup()
                        .addComponent(OdemeOnayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(OdemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Yazi, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemePanelLayout.createSequentialGroup()
                        .addComponent(OdemeButton)
                        .addGap(158, 158, 158)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OdemePanelLayout.setVerticalGroup(
            OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OdemePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OdemeButton)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(Yazi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KartButton)
                    .addComponent(NakitButton)
                    .addComponent(KapikartButton))
                .addGap(35, 35, 35)
                .addComponent(KartNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KartNoGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cvv)
                    .addComponent(Skt))
                .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OdemePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OdemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CvvGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SktGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(OdemeOnayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OdemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OdemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OdemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdemeButtonActionPerformed
        KapikartButton.setVisible(true);
        KartButton.setVisible(true);
        NakitButton.setVisible(true);
    }//GEN-LAST:event_OdemeButtonActionPerformed
    private boolean kartBilgiKontrol(String ID) {
        try{
            ID=idLabel.getText();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
            String sql = "SELECT * FROM kullanicilar WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, ID);
            return rs.next();  // Kart bilgisi varsa true döner
        } catch (SQLException e) {
            return false;
        } 
    }
    private void kartBilgiEkle(String kartno, String cvv, String skt, String id) {
        kartno = KartNoGir.getText();
        cvv = CvvGir.getText();
        skt = SktGir.getText();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
            String sql = "UPDATE kullanicilar SET kartNo = ?, cvv = ?, skt = ? WHERE id = "+id;
            PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, kartno);
                stmt.setString(2, cvv);
                stmt.setString(3, skt);
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Yeni kart bilgileri eklendi ve ödeme yapıldı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kart bilgileri eklenemedi: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void kartBilgiGoster(String ID) {
        String kartNO;
        String CVV;
        String SKT;
        ID = idLabel.getText();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
            String sql = "SELECT * FROM kullanicilar WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, ID);
                ResultSet rs = ps.executeQuery();    
                if(rs.next()){
                    kartNO=rs.getString("kartNo");
                    CVV = rs.getString("cvv");
                    SKT = rs.getString("skt");
                    KartNoGir.setText(kartNO);
                    CvvGir.setText(CVV);
                    SktGir.setText(SKT);
                } else{
                    JOptionPane.showMessageDialog(null, "Bu ID'ye ait kart bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void kartLabelGoster() {
        KartNo.setVisible(true);
        Cvv.setVisible(true);
        Skt.setVisible(true);
        KartNoGir.setVisible(true);
        CvvGir.setVisible(true);
        SktGir.setVisible(true);
        OdemeOnayButton.setVisible(true);
    }
    private void KartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartButtonActionPerformed
        kartLabelGoster();
        String ID = idLabel.getText();
        kartBilgiGoster(ID);
    }//GEN-LAST:event_KartButtonActionPerformed

    private void NakitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NakitButtonActionPerformed
        String tutar = Yazi.getText();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(tutar);
        if (matcher.find()) {
            String number = matcher.group();
            int odeme = Integer.parseInt(number);
            JOptionPane.showMessageDialog(null, odeme+"TL Nakit ödemeniz tamamlandı iyi günler dileriz :)"
                + "Uygulamadan Çıkıs Yapılıyor...");
            System.out.println("Toplam Fiyat: " + odeme);
            dispose();
            
        } else { JOptionPane.showMessageDialog(null, "Ödeme bilgileriniz alınamadı. "); }

    }//GEN-LAST:event_NakitButtonActionPerformed

    private void KartNoGirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartNoGirActionPerformed
    }//GEN-LAST:event_KartNoGirActionPerformed

    private void OdemeOnayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdemeOnayButtonActionPerformed
        String Kartno = KartNoGir.getText();
        String cvv = CvvGir.getText();
        String skt = SktGir.getText();
        String ID = idLabel.getText();
        String id = idLabel.getText();
        
        //Eğer boşsa hata versin
        if (Kartno.isEmpty() || cvv.isEmpty() || skt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Kart numarası doğrulama (16 haneli)
        if (Kartno.length() != 16 || !Kartno.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Kart numarası geçersiz, 16 haneli olmalı.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // CVV doğrulama (3 haneli)
        if (cvv.length() != 3 || !cvv.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "CVV geçersiz, 3 haneli olmalı.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // SKT doğrulama (5 haneli, AA/YY formatında)
        if (skt.length() != 5 || !skt.matches("\\d{2}/\\d{2}")) {
            JOptionPane.showMessageDialog(null, "SKT geçersiz, AA/YY formatında olmalı.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Eğer kart bilgileri veritabanında yoksa yeni bilgileri ekle
        if (kartBilgiKontrol(ID)==false) {
            kartBilgiEkle(Kartno, cvv, skt, id);
        } else {
            JOptionPane.showMessageDialog(null, "Bilgiler Güncellenemedi. Hata:"+ JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_OdemeOnayButtonActionPerformed
    private void odemeSecimi() {
        String tutar = Yazi.getText();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(tutar);
        
        if (matcher.find()) {
            String number = matcher.group();
            int odeme = Integer.parseInt(number);
            String[] secenekler = {"Nakit", "Kart"};

            // Kullanıcı ödeme türünü seçiyor
            int secim = JOptionPane.showOptionDialog(null,
            "Ödeme Yöntemini Seçin:",
            "Ödeme Yöntemi",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            secenekler,
            secenekler[0]); // Varsayılan seçim nakit olarak ayarlandı
        
            // Kullanıcının seçimi alınıp işlem yapılıyor
            switch (secim) {
                case 0:
                    // Nakit seçildi
                    JOptionPane.showMessageDialog(null, odeme+"TL nakit ödemeniz onaylanmayı bekliyor. İyi Günler Dileriz :)", "Ödeme Tamamlandı", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Toplam Fiyat: " + odeme);
                    dispose();
                    break;
                case 1:
                    // Kart seçildi
                    JOptionPane.showMessageDialog(null, odeme+ "TL Kart ile ödemeniz için pos cihazı gönderiliyor. İyi Günler Dileriz :)", "Ödeme Tamamlandı", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Toplam Fiyat: " + odeme);
                    dispose();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ödeme seçimi yapılmadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                    break;
                    
            }
        }else { 
            JOptionPane.showMessageDialog(null, "Ödeme bilgileriniz alınamadı. "); 
    }
}
    private void KapikartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KapikartButtonActionPerformed
        odemeSecimi();    
    }//GEN-LAST:event_KapikartButtonActionPerformed
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Odeme().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cvv;
    private javax.swing.JTextField CvvGir;
    private javax.swing.JButton KapikartButton;
    private javax.swing.JButton KartButton;
    private javax.swing.JLabel KartNo;
    private javax.swing.JTextField KartNoGir;
    private javax.swing.JButton NakitButton;
    private javax.swing.JButton OdemeButton;
    private javax.swing.JButton OdemeOnayButton;
    private javax.swing.JPanel OdemePanel;
    private javax.swing.JLabel Skt;
    private javax.swing.JTextField SktGir;
    private javax.swing.JLabel Yazi;
    private javax.swing.JLabel idLabel;
    // End of variables declaration//GEN-END:variables

    
}
