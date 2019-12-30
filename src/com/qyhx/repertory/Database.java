package com.qyhx.repertory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

class Database {
    private static String driver = "";
    private static String database = "";
    private static String username = "";
    private static String password = "";

    private static Connection connection = null;

    static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName(driver);
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/" + database + "?useSSL=false&serverTimezone=GMT%2B8",
                        username,
                        password
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    private void loadConfig() {
        try {
            String line;
            File file = new File("database.cfg");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                line = line.replace("\n", "");
                line = line.replace(" ", "");
                int index = line.indexOf("driver=");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
