package com.qyhx.repertory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class BaseRepertory {
    public ResultSet executeSelect(String sql) {
        try {
            Connection con = Database.getConnection();
            Statement statement = con.createStatement();
            return statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void executeUpdate(String sql) {
        try {
            Connection con = Database.getConnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
