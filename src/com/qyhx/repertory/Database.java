package com.qyhx.repertory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

abstract class Database {
    private static String driver = "";
    private static String database = "";
    private static String username = "";
    private static String password = "";

    private static Connection connection = null;

    static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                loadConfig();
                Class.forName(driver);
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/" + database + "?useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true",
                        username,
                        password
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static void loadConfig() {
        try {
            int index;
            String line;
            File file = new File("database.cfg");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                line = line.replace("\n", "");
                line = line.replace(" ", "");
                index = line.indexOf("driver=");
                if (index != -1) {
                    line = line.replace("driver=", "");
                    index = line.indexOf(";");
                    line = line.substring(0, index);
                    driver = line;
                    continue;
                }
                index = line.indexOf("database=");
                if (index != -1) {
                    line = line.replace("database=", "");
                    index = line.indexOf(";");
                    line = line.substring(0, index);
                    database = line;
                    continue;
                }
                index = line.indexOf("username=");
                if (index != -1) {
                    line = line.replace("username=", "");
                    index = line.indexOf(";");
                    line = line.substring(0, index);
                    username = line;
                    continue;
                }
                index = line.indexOf("password=");
                if (index != -1) {
                    line = line.replace("password=", "");
                    index = line.indexOf(";");
                    line = line.substring(0, index);
                    password = line;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
