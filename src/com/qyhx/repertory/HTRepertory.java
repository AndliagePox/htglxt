package com.qyhx.repertory;

import com.qyhx.entity.HT;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HTRepertory extends BaseRepertory {

    public List<HT> findAll() {
        List<HT> list = new ArrayList<>();
        try {
            ResultSet rs = executeSelect("select * from htb");
            while (rs.next()) {
                list.add(new HT(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("number"),
                        rs.getString("qtime"),
                        rs.getInt("kh_id"),
                        rs.getInt("xm_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
