package com.qyhx.repertory;

import com.qyhx.entity.XM;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class XMRepertory extends BaseRepertory {
    public List<XM> findAll(){
        List<XM> list = new ArrayList<>();
        try{
            ResultSet rs = executeSelect("select * from xmb");
            while (rs.next()){
                list.add(new XM(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("number"),
                        rs.getString("stime"),
                        rs.getString("ftime"),
                        rs.getFloat("money")
                ));
            }
        }catch (SQLException e){
          e.printStackTrace();
        }
        return list;
    }

    public  XM findOneID(int id){
        List<XM> list = new ArrayList<>();
        try{
            ResultSet rs = executeSelect("select * from xmb where id = %d"+id);
            while (rs.next()){
                list.add(new XM(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("numeber"),
                        rs.getString("stime"),
                        rs.getString("ftime"),
                        rs.getFloat("money")
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list.get(0);
    }

    public  XM findOneName(String name){
        List<XM> list = new ArrayList<>();
        try{
            ResultSet rs = executeSelect("select * from xmb where name = '%s'"+name);
            while (rs.next()){
                list.add(new XM(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("numeber"),
                        rs.getString("stime"),
                        rs.getString("ftime"),
                        rs.getFloat("money")
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list.get(0);
    }

    public  XM findOneNumber(String number){
        List<XM> list = new ArrayList<>();
        try{
            ResultSet rs = executeSelect("select * from xmb where number = '%s'"+number);
            while (rs.next()){
                list.add(new XM(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("numeber"),
                        rs.getString("stime"),
                        rs.getString("ftime"),
                        rs.getFloat("money")
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list.get(0);
    }

    public void updateOne(XM xm){
        String sql = String.format("update xmb set name = '%s',number = '%s',stime = '%s',ftime = '%s',money = %f where id = %d",
                xm.getName(),xm.getNumber(),xm.getsTime(),xm.getfTime(),xm.getMoney(),xm.getId());
        executeUpdate(sql);
    }

    public void deleteOne(int id){
        String sql = "delete from xmb where id = %d"+id;
        executeUpdate(sql);
    }

    public void insertOne(XM xm){
        String sql = String.format("insert into xmb( id , name , number , stime , ftime , money)values(%d,'%s','%s','%s','%s',%f)",
        xm.getId(),xm.getName(),xm.getNumber(),xm.getsTime(),xm.getfTime(),xm.getMoney());
        executeUpdate(sql);
    }
}


