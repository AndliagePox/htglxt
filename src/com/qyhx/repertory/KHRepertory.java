package com.qyhx.repertory;

import com.qyhx.entity.HT;
import com.qyhx.entity.KH;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class KHRepertory extends BaseRepertory {
    public List<KH> findKH() {
        List<KH> list = new ArrayList<>();
        try {
            ResultSet zz = executeSelect("select * from khb");
            while (zz.next()) {
                list.add(new KH(
                        zz.getInt("id"),
                        zz.getString("name"),
                        zz.getString("card"),
                        zz.getString("phone")
                ));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
