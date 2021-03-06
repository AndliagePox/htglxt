package com.qyhx.controller;

import com.qyhx.entity.HT;
import com.qyhx.printer.HTPrinter;
import com.qyhx.repertory.HTRepertory;

import java.util.List;
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
        scanner.nextLine();
        System.out.print("输入更新后的合同名称：");
        ht.setName(scanner.nextLine());
        System.out.print("输入更新后的合同编号：");
        ht.setNumber(scanner.nextLine());
        System.out.println("输入更新后的合同签订时间(格式:yyyy-mm-dd HH:ii:ss)：");
        ht.setqTime(scanner.nextLine());
        System.out.print("输入更新后的合同对应客户的客户id：");
        int khId = scanner.nextInt();
        if (htRepertory.idIsNotInKHB(khId)) {
            System.out.println("\n更新失败：必须输入已存在的客户id");
            return;
        }
        System.out.print("输入更新后的合同对应项目的项目id：");
        ht.setKhId(khId);
        int xmId = scanner.nextInt();
        if (htRepertory.idIsNotInXMB(xmId)) {
            System.out.println("\n更新失败：必须输入已存在的项目id");
            return;
        }
        ht.setXmId(xmId);
        htRepertory.updateOne(ht);
        System.out.println("更新成功");
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
            System.out.println("删除成功");
        }
    }

    @Override
    public void insertOne() {
        Scanner scanner = new Scanner(System.in);
        HTRepertory htRepertory = new HTRepertory();
        HT ht = new HT(0, "", "", "", 0, 0);
        System.out.print("输入合同名称：");
        ht.setName(scanner.nextLine());
        System.out.print("输入合同编号：");
        ht.setNumber(scanner.nextLine());
        System.out.println("输入合同签订时间(格式:yyyy-mm-dd HH:ii:ss)：");
        ht.setqTime(scanner.nextLine());
        System.out.print("输入合同对应客户的客户id：");
        int khId = scanner.nextInt();
        if (htRepertory.idIsNotInKHB(khId)) {
            System.out.println("\n插入失败：必须输入已存在的客户id");
            return;
        }
        System.out.print("输入合同对应项目的项目id：");
        ht.setKhId(khId);
        int xmId = scanner.nextInt();
        if (htRepertory.idIsNotInXMB(xmId)) {
            System.out.println("\n插入失败：必须输入已存在的项目id");
            return;
        }
        ht.setXmId(xmId);
        htRepertory.insertOne(ht);
        System.out.println("插入成功");
    }

    public void findById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的合同id：");
        int id = scanner.nextInt();
        HTRepertory htRepertory = new HTRepertory();
        HT ht = htRepertory.findOneById(id);
        if (ht == null) {
            System.out.println("查询的合同不存在");
        } else {
            HTPrinter.printOneHT(ht);
        }
    }

    public void findByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的合同名：");
        String name = scanner.nextLine();
        HTRepertory htRepertory = new HTRepertory();
        List<HT> list = htRepertory.findByName(name);
        if (list.size() == 0) {
            System.out.println("查询的合同不存在");
        } else {
            HTPrinter.printHTList(list);
        }
    }

    public void findByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的合同编号：");
        String number = scanner.nextLine();
        HTRepertory htRepertory = new HTRepertory();
        List<HT> list = htRepertory.findByNumber(number);
        if (list.size() == 0) {
            System.out.println("查询的合同不存在");
        } else {
            HTPrinter.printHTList(list);
        }
    }

    public void findByKH() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的合同对应的客户id：");
        int id = scanner.nextInt();
        HTRepertory htRepertory = new HTRepertory();
        List<HT> list = htRepertory.findByKH(id);
        if (list.size() == 0) {
            System.out.println("查询的合同不存在");
        } else {
            HTPrinter.printHTList(list);
        }
    }

    public void findByXM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的合同对应的项目id：");
        int id = scanner.nextInt();
        HTRepertory htRepertory = new HTRepertory();
        List<HT> list = htRepertory.findByXM(id);
        if (list.size() == 0) {
            System.out.println("查询的合同不存在");
        } else {
            HTPrinter.printHTList(list);
        }
    }
}
