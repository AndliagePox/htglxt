package com.qyhx.controller;

import com.qyhx.entity.XM;
import com.qyhx.printer.XMPrinter;
import com.qyhx.repertory.XMRepertory;

import java.awt.*;
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
        System.out.print("输入要更新修改的项目id:");
        int id = s.nextInt();
        XMRepertory xmRepertory = new XMRepertory();
        XM xm = xmRepertory.findOneID(id);
        if(xm == null){
            System.out.print("未找到该id");
            return;
        }
    }

    @Override
    public void deleteOne() {

    }

    @Override
    public void insertOne() {

    }
}
