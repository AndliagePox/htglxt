package com.qyhx.repertory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

abstract class BaseRepertory {
    private static int HTCount = 0;
    private static int KHCount = 0;
    private static int XMCount = 0;

    protected int nextEntityId(String tableName) {
        int baseId;
        try {
            ResultSet rs = executeSelect("select max(id) + 1 as n from " + tableName);
            rs.next();
            baseId = rs.getInt("n");
            switch (tableName) {
                case "htb": return baseId + (BaseRepertory.HTCount++);
                case "khb": return baseId + (BaseRepertory.KHCount++);
                case "xmb": return baseId + (BaseRepertory.XMCount++);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    ResultSet executeSelect(String sql) {
        try {
            Connection con = Database.getConnection();
            Statement statement = con.createStatement();
            return statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    void executeUpdate(String sql) {
        try {
            Connection con = Database.getConnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
