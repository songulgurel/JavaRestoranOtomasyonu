package Restoran;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
        Connection connection=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
    public Menu() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnaPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        UrunListeMenu = new javax.swing.JScrollPane();
        UrunTabloMenu = new javax.swing.JTable();
        MenuGosterButton = new javax.swing.JButton();
        GeriDonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AnaPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        MenuPanel.setBackground(new java.awt.Color(0, 153, 153));
        MenuPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        UrunTabloMenu.setBackground(new java.awt.Color(204, 204, 204));
        UrunTabloMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ÜrünID", "Ürün", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UrunTabloMenu.setName(""); // NOI18N
        UrunListeMenu.setViewportView(UrunTabloMenu);

        MenuGosterButton.setText("Menü Göster");
        MenuGosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGosterButtonActionPerformed(evt);
            }
        });

        GeriDonButton.setForeground(new java.awt.Color(0, 153, 153));
        GeriDonButton.setText("Geri Dön");
        GeriDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriDonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(UrunListeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(MenuGosterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GeriDonButton)
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(MenuGosterButton))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriDonButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(UrunListeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout AnaPanelLayout = new javax.swing.GroupLayout(AnaPanel);
        AnaPanel.setLayout(AnaPanelLayout);
        AnaPanelLayout.setHorizontalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnaPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AnaPanelLayout.setVerticalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnaPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AnaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuGosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGosterButtonActionPerformed
        Update_table();
    }//GEN-LAST:event_MenuGosterButtonActionPerformed

    private void GeriDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriDonButtonActionPerformed
        dispose();
        Giris grs =new Giris();
        grs.show();
        grs.setLocationRelativeTo(null);
    }//GEN-LAST:event_GeriDonButtonActionPerformed
    public void Update_table(){
        
        try
        {
        String dbURL = "jdbc:mysql://localhost:3306/restoran";
        String dbUser = "root"; 
        String dbPassword = "";
        Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        String sql="select urunId,urun,fiyat from menu ";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery(sql);
        UrunTabloMenu.setModel(ResultSetToTableModel.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnaPanel;
    private javax.swing.JButton GeriDonButton;
    private javax.swing.JButton MenuGosterButton;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JScrollPane UrunListeMenu;
    private javax.swing.JTable UrunTabloMenu;
    // End of variables declaration//GEN-END:variables
}
