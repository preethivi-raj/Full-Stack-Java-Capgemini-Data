package database;

import java.sql.*;

public class MetaData {
    public static void main(String[] args) {
        
        try (Connection connection = ConnectingDB.getConnection("capgemini")) {

           
            DatabaseMetaData metaData = connection.getMetaData();


            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Database URL: " + metaData.getURL());
            System.out.println("Database User Name: " + metaData.getUserName());
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());

          
            System.out.println("\nTables in the database:");
            try (ResultSet tables = metaData.getTables("capgemini", null, null, new String[]{"TABLE"})) {
                while (tables.next()) {
                    String tableName = tables.getString("TABLE_NAME");
                    System.out.println("Table Name : " + tableName);
                }
            }

           
            System.out.println("\n Columns in table : ");
            try (ResultSet columns = metaData.getColumns(null, null, "account", "%")) {
                while (columns.next()) {
                    String columnName = columns.getString("COLUMN_NAME");
                    String columnType = columns.getString("TYPE_NAME");
                    int columnSize = columns.getInt("COLUMN_SIZE");
                    System.out.println("Column: " + columnName + ", Type: " + columnType + ", Size: " + columnSize);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

