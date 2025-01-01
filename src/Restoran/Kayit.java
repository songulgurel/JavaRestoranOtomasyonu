package Restoran;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Kayit extends javax.swing.JFrame {
    public Kayit() {
        initComponents();
    }
    public void Insert() throws SQLException {
        Connection connect = null;
        baglanti db = new baglanti();
        PreparedStatement statement = null;
        try {
            String dogrula= "@gmail.com";
            String dogrula1= "@hotmail.com";
            String dogrula2= "@outlook.com";
            String dogrula3= "@yahoo.com";
            connect = (Connection) db.getConnection();
            String sql = "INSERT INTO restoran.kullanicilar (ad,soyad,mail,sifre) VALUES (?,?,?,?)";
            statement = connect.prepareStatement(sql);
            statement.setString(1, AdGiris.getText());
            statement.setString(2, SoyadGiris.getText());
            statement.setString(3, MailGiris.getText());
            statement.setString(4, SifreGiris.getText());
            if (MailGiris.getText().contains(dogrula) || MailGiris.getText().contains(dogrula1) || MailGiris.getText().contains(dogrula2) || MailGiris.getText().contains(dogrula3)){
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Kayıt İşleminiz Tamamlandı.");
            }
            else{
            JOptionPane.showMessageDialog(null, "E-posta doğrulanamıyor. Lütfen tekrar deneyiniz!");
            
            }
        }
        catch (SQLException exception){
            JOptionPane.showMessageDialog(null, "Hata: " + exception.getMessage());
        }
        finally{
            if (statement != null){
                statement.close();
            }
            if (connect != null){   
                connect.close();
            }
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnaPanel = new javax.swing.JPanel();
        SolPanel = new javax.swing.JPanel();
        KarsılamaYazi = new javax.swing.JLabel();
        SagPanel = new javax.swing.JPanel();
        KayitOlYazi = new javax.swing.JLabel();
        AdGiris = new javax.swing.JTextField();
        AdYazi = new javax.swing.JLabel();
        SoyadYazi = new javax.swing.JLabel();
        SoyadGiris = new javax.swing.JTextField();
        MailYazi = new javax.swing.JLabel();
        MailGiris = new javax.swing.JTextField();
        SifreYazi = new javax.swing.JLabel();
        SifreGiris = new javax.swing.JTextField();
        KayitOnayBtn = new javax.swing.JButton();
        GeriDonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SolPanel.setBackground(new java.awt.Color(0, 153, 153));

        KarsılamaYazi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        KarsılamaYazi.setForeground(new java.awt.Color(255, 255, 255));
        KarsılamaYazi.setText("HOŞGELDİNİZ");

        javax.swing.GroupLayout SolPanelLayout = new javax.swing.GroupLayout(SolPanel);
        SolPanel.setLayout(SolPanelLayout);
        SolPanelLayout.setHorizontalGroup(
            SolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(KarsılamaYazi)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        SolPanelLayout.setVerticalGroup(
            SolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolPanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(KarsılamaYazi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SagPanel.setBackground(new java.awt.Color(255, 255, 255));
        SagPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        KayitOlYazi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        KayitOlYazi.setForeground(new java.awt.Color(0, 153, 153));
        KayitOlYazi.setText("KAYIT OL");

        AdGiris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdGiris.setToolTipText("Ad");
        AdGiris.setPreferredSize(new java.awt.Dimension(130, 25));

        AdYazi.setText("Ad");

        SoyadYazi.setText("Soyad");

        SoyadGiris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SoyadGiris.setPreferredSize(new java.awt.Dimension(130, 25));
        SoyadGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoyadGirisjTextField3ActionPerformed(evt);
            }
        });

        MailYazi.setText("E-Posta");

        MailGiris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MailGiris.setPreferredSize(new java.awt.Dimension(130, 25));

        SifreYazi.setText("Şifre");

        SifreGiris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SifreGiris.setPreferredSize(new java.awt.Dimension(130, 25));

        KayitOnayBtn.setBackground(new java.awt.Color(0, 153, 153));
        KayitOnayBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KayitOnayBtn.setForeground(new java.awt.Color(255, 255, 255));
        KayitOnayBtn.setText("Kayıt Ol");
        KayitOnayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KayitOnayBtnActionPerformed(evt);
            }
        });

        GeriDonButton.setForeground(new java.awt.Color(0, 153, 153));
        GeriDonButton.setText("Geri Dön");
        GeriDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriDonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SagPanelLayout = new javax.swing.GroupLayout(SagPanel);
        SagPanel.setLayout(SagPanelLayout);
        SagPanelLayout.setHorizontalGroup(
            SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SagPanelLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SagPanelLayout.createSequentialGroup()
                        .addComponent(KayitOlYazi)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SagPanelLayout.createSequentialGroup()
                        .addComponent(GeriDonButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SagPanelLayout.createSequentialGroup()
                        .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SagPanelLayout.createSequentialGroup()
                                    .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SifreYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MailYazi))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SifreGiris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MailGiris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AdYazi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SoyadYazi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdGiris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SoyadGiris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(KayitOnayBtn))
                        .addGap(174, 174, 174))))
        );
        SagPanelLayout.setVerticalGroup(
            SagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SagPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriDonButton)
                .addGap(40, 40, 40)
                .addComponent(KayitOlYazi)
                .addGap(50, 50, 50)
                .addComponent(AdYazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoyadYazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoyadGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MailYazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MailGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SifreYazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SifreGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(KayitOnayBtn)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout AnaPanelLayout = new javax.swing.GroupLayout(AnaPanel);
        AnaPanel.setLayout(AnaPanelLayout);
        AnaPanelLayout.setHorizontalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnaPanelLayout.createSequentialGroup()
                .addComponent(SolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
        );
        AnaPanelLayout.setVerticalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AnaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AnaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SoyadGirisjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoyadGirisjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoyadGirisjTextField3ActionPerformed
    
    private void KayitOnayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KayitOnayBtnActionPerformed
        try {
                Insert();
            }  catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_KayitOnayBtnActionPerformed

    private void GeriDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriDonButtonActionPerformed
        dispose();
        Giris grs = new Giris();
        grs.setVisible(true);
        grs.setLocationRelativeTo(null);
    }//GEN-LAST:event_GeriDonButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kayit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdGiris;
    private javax.swing.JLabel AdYazi;
    private javax.swing.JPanel AnaPanel;
    private javax.swing.JButton GeriDonButton;
    private javax.swing.JLabel KarsılamaYazi;
    private javax.swing.JLabel KayitOlYazi;
    private javax.swing.JButton KayitOnayBtn;
    private javax.swing.JTextField MailGiris;
    private javax.swing.JLabel MailYazi;
    private javax.swing.JPanel SagPanel;
    private javax.swing.JTextField SifreGiris;
    private javax.swing.JLabel SifreYazi;
    private javax.swing.JPanel SolPanel;
    private javax.swing.JTextField SoyadGiris;
    private javax.swing.JLabel SoyadYazi;
    // End of variables declaration//GEN-END:variables
}
