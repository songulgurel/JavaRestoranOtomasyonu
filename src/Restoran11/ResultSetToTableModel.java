package Restoran11;

import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class ResultSetToTableModel {
    public static DefaultTableModel resultSetToTableModel(ResultSet rs) throws SQLException {
        // Tabloyu oluşturmak için ResultSet'den verileri al
        ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Kolon adlarını ve verileri almak
        Vector<String> columnNames = new Vector<>();
        for (int i = 1; i <= columnCount; i++) {
            columnNames.add(metaData.getColumnName(i));
        }

        // Verileri almak
        Vector<Vector<Object>> data = new Vector<>();
        while (rs.next()) {
            Vector<Object> row = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                row.add(rs.getObject(i));
            }
            data.add(row);
        }

        // DefaultTableModel ile tabloyu oluştur
        return new DefaultTableModel(data, columnNames);
    }
}
