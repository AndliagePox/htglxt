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

    public HT findOneById(int id) {
        try {
            ResultSet rs = executeSelect("select * from htb where id = " + id);
            if (rs.next())
                return new HT(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("number"),
                        rs.getString("qtime"),
                        rs.getInt("kh_id"),
                        rs.getInt("xm_id"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public void updateOne(HT ht) {
        String sql = String.format("update from htb set name = '%s', number = '%s', qtime = '%s', kh_id = %d, xm_id = %d where id = %d",
                ht.getName(), ht.getNumber(), ht.getqTime(), ht.getKhId(), ht.getXmId(), ht.getId());
        executeUpdate(sql);
    }
}
