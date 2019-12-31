package com.qyhx.repertory;

import com.qyhx.entity.XM;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public  String upDate(){
        Scanner RS = new Scanner(System.in);
        System.out.print("添加：(回车结束)");
        String rs = RS.nextLine();

    }
}
