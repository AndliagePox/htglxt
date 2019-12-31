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
                        rs.getString("numeber"),
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
}
