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
    public KH findOneById(int id) {
        try {
            ResultSet zz = executeSelect("select * from khb where id = " + id);
            if (zz.next())
                return new KH(zz.getInt("id"),
                        zz.getString("name"),
                        zz.getString("card"),
                        zz.getString("phone"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    public List<KH> findOneByName(String name) {
        List<KH> list = new ArrayList<>();
        try {
            ResultSet zz = executeSelect("select * from khb where name = '" + name + "'");
            while (zz.next()) {
                list.add(new KH(
                        zz.getInt("id"),
                        zz.getString("name"),
                        zz.getString("card"),
                        zz.getString("phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<KH> findOneByCard(String card) {
        List<KH> list = new ArrayList<>();
        try {
            ResultSet zz = executeSelect("select * from khb where card = '" + card + "'");
            while (zz.next()) {
                list.add(new KH(
                        zz.getInt("id"),
                        zz.getString("name"),
                        zz.getString("card"),
                        zz.getString("phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<KH> findOneByPhone(String phone) {
        List<KH> list = new ArrayList<>();
        try {
            ResultSet zz = executeSelect("select * from khb where phone = '" + phone + "'");
            while (zz.next()) {
                list.add(new KH(
                        zz.getInt("id"),
                        zz.getString("name"),
                        zz.getString("card"),
                        zz.getString("phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void updateOne(KH kh) {
        String sql = String.format("update khb set name = '%s', card = '%s', phone = '%s'where id = %d",
                kh.getName(), kh.getCard(), kh.getPhone(), kh.getId());
        executeUpdate(sql);
    }
    public void deleteOneById(int id) {
        String sql = "delete from khb where id = " + id;
        executeUpdate(sql);
    }
    public void insertOne(KH kh) {
        String sql = String.format("insert into khb(name, card, phone) values('%s', '%s', '%s')",
                kh.getName(), kh.getCard(), kh.getPhone());
        executeUpdate(sql);
    }
    public boolean idIsUsedInHTB(int id) {
        String sql = "select * from htb where kh_id = " + id;
        ResultSet zz = executeSelect(sql);
        try {
            return zz.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
}

