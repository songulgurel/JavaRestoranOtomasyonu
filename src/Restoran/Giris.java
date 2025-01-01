package Restoran;
import Admin.Admin;
import Restoran.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Giris extends javax.swing.JFrame { 
    public Giris() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SagPanel = new javax.swing.JPanel();
        GirisYapYazi = new javax.swing.JLabel();
        MailYazi = new javax.swing.JLabel();
        MailGiris = new javax.swing.JTextField();
        SifreYazi = new javax.swing.JLabel();
        SifreGiris = new javax.swing.JPasswordField();
        GirisYapButton = new javax.swing.JButton();
        KayıtOlButton = new javax.swing.JButton();
        HesapYokYazi = new javax.swing.JLabel();
        SolPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        RestoranYazi = new javax.swing.JLabel();
        TelifHakkiYazi = new javax.swing.JLabel();
        MenüGösterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SagPanel.setBackground(new java.awt.Color(255, 255, 255));
        SagPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        GirisYapYazi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GirisYapYazi.setForeground(new java.awt.Color(0, 153, 153));
        GirisYapYazi.setText("GİRİŞ YAP");

        MailYazi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        MailYazi.setText("E-posta");

        MailGiris.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        MailGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailGirisActionPerformed(evt);
            }
        });

        SifreYazi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SifreYazi.setText("Şifre");

        SifreGiris.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        GirisYapButton.setBackground(new java.awt.Color(0, 153, 153));
        GirisYapButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GirisYapButton.setForeground(new java.awt.Color(255, 255, 255));
        GirisYapButton.setText("Giriş Yap");
        GirisYapButton.setBorderPainted(false);
        GirisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisYapButtonActionPerformed(evt);
            }
        });

        KayıtOlButton.setForeground(new java.awt.Color(0, 153, 153));
        KayıtOlButton.setText("Kayıt Ol");
        KayıtOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KayıtOlButtonActionPerformed(evt);
            }
        });

        HesapYokYazi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HesapYokYazi.setText("Henüz bir hesabım yok");

        javax.swing.GroupLayout SagPanelLayout = new javax.swing.GroupLayout(SagPanel);
        SagPanel.setLayout(SagPanelLayout);
        SagPanelLayout.setHorizontalGroup(
            SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SagPanelLayout.createSequentialGroup()
                .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SagPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MailGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MailYazi)
                            .addComponent(SifreYazi)
                            .addComponent(SifreGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GirisYapButton)
                            .addGroup(SagPanelLayout.createSequentialGroup()
                                .addComponent(HesapYokYazi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(KayıtOlButton))))
                    .addGroup(SagPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(GirisYapYazi)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        SagPanelLayout.setVerticalGroup(
            SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SagPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(GirisYapYazi)
                .addGap(60, 60, 60)
                .addComponent(MailYazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MailGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(SifreYazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SifreGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(GirisYapButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KayıtOlButton)
                    .addComponent(HesapYokYazi))
                .addGap(69, 69, 69))
        );

        SolPanel.setBackground(new java.awt.Color(0, 153, 153));
        SolPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Logo1.png"))); // NOI18N

        RestoranYazi.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        RestoranYazi.setText("CEVHER'S RESTAURANT");

        TelifHakkiYazi.setBackground(new java.awt.Color(255, 102, 102));
        TelifHakkiYazi.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        TelifHakkiYazi.setForeground(new java.awt.Color(255, 255, 255));
        TelifHakkiYazi.setText("Copyright © CEVHER'S RESTAURANT. Tüm hakları saklıdır.");

        MenüGösterButton.setBackground(new java.awt.Color(0, 102, 102));
        MenüGösterButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenüGösterButton.setForeground(new java.awt.Color(255, 255, 255));
        MenüGösterButton.setText("Menüyü görmek için tıkla");
        MenüGösterButton.setBorderPainted(false);
        MenüGösterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenüGösterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SolPanelLayout = new javax.swing.GroupLayout(SolPanel);
        SolPanel.setLayout(SolPanelLayout);
        SolPanelLayout.setHorizontalGroup(
            SolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolPanelLayout.createSequentialGroup()
                .addGroup(SolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SolPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(TelifHakkiYazi))
                    .addGroup(SolPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(RestoranYazi))
                    .addGroup(SolPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Logo))
                    .addGroup(SolPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(MenüGösterButton)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        SolPanelLayout.setVerticalGroup(
            SolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RestoranYazi)
                .addGap(60, 60, 60)
                .addComponent(MenüGösterButton)
                .addGap(95, 95, 95)
                .addComponent(TelifHakkiYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SagPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SagPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MailGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailGirisActionPerformed
    }//GEN-LAST:event_MailGirisActionPerformed

    private void GirisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisYapButtonActionPerformed
        String Mail = MailGiris.getText();
        String Sifre = new String(SifreGiris.getPassword());

        // SQL doğrulama işlemi
        if ("CEVHERS".equals(Mail) && "Admin123".equals(Sifre)){
                JOptionPane.showMessageDialog(null, "Hoşgeldiniz Yönetici!");
                dispose();
                Admin admin = new Admin();
                admin.setVisible(true);
                admin.setLocationRelativeTo(null);
            
            }
        else if (validateLogin(Mail, Sifre) && !"CEVHERS".equals(Mail) && !"Admin123".equals(Sifre)) {
            JOptionPane.showMessageDialog(null, "Giriş Başarılı!");
            openArayuzForm(Mail); // Profil formunu aç
        } else {
            JOptionPane.showMessageDialog(null, "Hatalı Kullanıcı Adı veya Şifre.");
        }   
    }//GEN-LAST:event_GirisYapButtonActionPerformed
private boolean validateLogin(String Mail, String Sifre) {
        try {
            // Veritabanı bağlantısı
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
            String query = "SELECT * FROM kullanicilar WHERE mail = ? AND sifre = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, Mail);
            ps.setString(2, Sifre);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            return false;
        }
    }

    // Profil formunu açma
    private void openArayuzForm(String Mail) {
        dispose();
        Arayuz aryuz = new Arayuz(Mail);
        aryuz.show();
        aryuz.setLocationRelativeTo(null);
    }
    private void KayıtOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KayıtOlButtonActionPerformed
        dispose();
        Kayit kyt = new Kayit();
        kyt.setVisible(true);
        kyt.setLocationRelativeTo(null);
    }//GEN-LAST:event_KayıtOlButtonActionPerformed

    private void MenüGösterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenüGösterButtonActionPerformed
        dispose();
        Menu menu = new Menu();
        menu.show();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_MenüGösterButtonActionPerformed
public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GirisYapButton;
    private javax.swing.JLabel GirisYapYazi;
    private javax.swing.JLabel HesapYokYazi;
    private javax.swing.JButton KayıtOlButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField MailGiris;
    private javax.swing.JLabel MailYazi;
    private javax.swing.JButton MenüGösterButton;
    private javax.swing.JLabel RestoranYazi;
    private javax.swing.JPanel SagPanel;
    private javax.swing.JPasswordField SifreGiris;
    private javax.swing.JLabel SifreYazi;
    private javax.swing.JPanel SolPanel;
    private javax.swing.JLabel TelifHakkiYazi;
    // End of variables declaration//GEN-END:variables
}
