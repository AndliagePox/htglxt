package com.qyhx.controller;

import com.qyhx.entity.HT;
import com.qyhx.printer.HTPrinter;
import com.qyhx.repertory.HTRepertory;

import java.util.Scanner;

public class HTController extends BaseController implements ControllerInterface {
    @Override
    public void showAll() {
        HTRepertory htRepertory = new HTRepertory();
        HTPrinter.printHTList(htRepertory.findAll());
    }

    @Override
    public void updateOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要更新的合同id：");
        int id = scanner.nextInt();
        HTRepertory htRepertory = new HTRepertory();
        HT ht = htRepertory.findOneById(id);
        if (ht == null) {
            System.out.println("未查询到该合同");
            return;
        }
        System.out.print("输入更新后的合同名称：");
        ht.setName(scanner.nextLine());
        System.out.print("输入更新后的合同编号：");
        ht.setNumber(scanner.nextLine());
        System.out.println("输入更新后的合同签订时间(格式:yyyy-mm-dd HH:ii:ss)：");
        ht.setqTime(scanner.nextLine());
        System.out.print("输入合同对应客户的客户id：");
        ht.setKhId(scanner.nextInt());
        System.out.print("输入合同对应项目的项目id：");
        ht.setXmId(scanner.nextInt());
        htRepertory.updateOne(ht);
    }

    @Override
    public void deleteOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要删除的合同id：");
        int id = scanner.nextInt();
        HTRepertory htRepertory = new HTRepertory();
        HT ht = htRepertory.findOneById(id);
        if (ht == null) {
            System.out.println("未查询到该合同");
        } else {
            htRepertory.deleteOneById(id);
        }
    }

    @Override
    public void insertOne() {

    }
}
