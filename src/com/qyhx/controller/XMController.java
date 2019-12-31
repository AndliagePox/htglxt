package com.qyhx.controller;

import com.qyhx.entity.XM;
import com.qyhx.printer.XMPrinter;
import com.qyhx.repertory.XMRepertory;

import java.util.Scanner;

public class XMController extends BaseController implements ControllerInterface {
    @Override
    public void showAll() {
        XMRepertory xmRepertory = new XMRepertory();
        XMPrinter.printXMList(xmRepertory.findAll());
    }

    @Override
    public void updateOne() {
        Scanner s = new Scanner(System.in);
        System.out.println("输入要更新修改的项目id:");
        int id = s.nextInt();
        XMRepertory xmRepertory = new XMRepertory();
        XM xm = xmRepertory.findOneID(id);
        if(xm == null){
            System.out.println("未找到该id");
            return;
        }
        System.out.println("输入更新后的项目名称:");
        xm.setName(s.nextLine());
        System.out.println("输入更新后的项目号:");
        xm.setNumber(s.nextLine());
        System.out.println("输入更新后的项目开始时间:");
        xm.setsTime(s.nextLine());
        System.out.println("输入更新后的项目结束时间:");
        xm.setfTime(s.nextLine());
        System.out.println("输入更新后的项目资金:");
        xm.setMoney(s.nextFloat());

        xmRepertory.updateOne(xm);
        System.out.println("该项目更新修改完成！");
    }

    @Override
    public void deleteOne() {
        Scanner s = new Scanner(System.in);
        System.out.println("输入要删除的项目id:");
        int id = s.nextInt();
        XMRepertory xmRepertory = new XMRepertory();
        XM xm = xmRepertory.findOneID(id);
        if(xm == null){
            System.out.println("未找到该id");
            return;
        }

        xmRepertory.deleteOne(id);
        System.out.println("该项目删除完成！");
    }

    @Override
    public void insertOne() {
        Scanner s = new Scanner(System.in);

        XMRepertory xmRepertory = new XMRepertory();
        XM xm = new XM(0,"","","","",0);
        xm.setId(xmRepertory.nextEntityId("xmh"));
        System.out.println("输入新项目名称:");
        xm.setName(s.nextLine());
        System.out.println("输入新项目号:");
        xm.setNumber(s.nextLine());
        System.out.println("输入新项目的开始时间:");
        xm.setsTime(s.nextLine());
        System.out.println("输入新项目的结束时间:");
        xm.setfTime(s.nextLine());
        System.out.println("输入新项目的使用资金:");
        xm.setMoney(s.nextFloat());
        xmRepertory.insertOne(xm);
        System.out.println("新项目已建立！");
    }
}
