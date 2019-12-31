package com.qyhx.controller;

import com.qyhx.entity.HT;
import com.qyhx.printer.HTPrinter;
import com.qyhx.printer.KHPrinter;
import com.qyhx.repertory.HTRepertory;
import com.qyhx.repertory.KHRepertory;
import com.qyhx.entity.KH;

import java.util.List;
import java.util.Scanner;

public class KHController extends BaseController implements ControllerInterface {
    @Override
    public void showAll() {
        KHRepertory khRepertory = new KHRepertory();
        KHPrinter.printKH(khRepertory.findKH());
    }

    @Override
    public void updateOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要更新的客户id：");
        int id = scanner.nextInt();
        KHRepertory khRepertory = new KHRepertory();
        KH kh = khRepertory.findOneById(id);
        if (kh == null) {
            System.out.println("未找到到该客户");
            return;
        }
        scanner.nextLine();
        System.out.print("输入更新后的客户名称：");
        kh.setName(scanner.nextLine());
        System.out.print("输入更新后的客户证件号：");
        kh.setCard(scanner.nextLine());
        System.out.print("输入更新后的手机号：");
        kh.setPhone(scanner.nextLine());
        khRepertory.updateOne(kh);
        System.out.println("更新成功");
    }

    @Override
    public void deleteOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要删除的客户id：");
        int id = scanner.nextInt();
        KHRepertory khRepertory = new KHRepertory();
        KH kh = khRepertory.findOneById(id);
        if (kh == null) {
            System.out.println("未找到到该客户");
        } else {
            khRepertory.deleteOneById(id);
            System.out.println("删除成功");
        }
    }

    @Override
    public void insertOne() {
        Scanner scanner = new Scanner(System.in);
        KHRepertory khRepertory = new KHRepertory();
        KH kh = new KH(0, "", "", "");
        System.out.print("输入客户名称：");
        kh.setName(scanner.nextLine());
        System.out.print("输入客户证件号：");
        kh.setCard(scanner.nextLine());
        System.out.print("输入客户联系方式：");
        kh.setPhone(scanner.nextLine());
        khRepertory.insertOne(kh);
        System.out.println("插入成功");
    }

    public void findById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的客户id：");
        int id = scanner.nextInt();
        KHRepertory khRepertory = new KHRepertory();
        KH kh = khRepertory.findOneById(id);
        if (kh == null) {
            System.out.println("未找到到该客户");
        } else {
            KHPrinter.printOneKH(kh);
            System.out.println("查询成功，显示如上");
        }
    }

    public void findByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的客户name：");
        String name = scanner.nextLine();
        KHRepertory khRepertory = new KHRepertory();
        List<KH> list = khRepertory.findOneByName(name);
        if (list.size() == 0) {
            System.out.println("未找到到该客户");
        } else {
            KHPrinter.printKH(list);
            System.out.println("查询成功，显示如上");
        }
    }

    public void findByCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的客户card：");
        String card = scanner.nextLine();
        KHRepertory khRepertory = new KHRepertory();
        List<KH> list = khRepertory.findOneByCard(card);
        if (list.size() == 0) {
            System.out.println("未找到到该客户");
        } else {
            KHPrinter.printKH(list);
            System.out.println("查询成功，显示如上");
        }
    }

    public void findByPhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要查询的客户phone：");
        String phone = scanner.nextLine();
        KHRepertory khRepertory = new KHRepertory();
        List<KH> list = khRepertory.findOneByPhone(phone);
        if (list.size() == 0) {
            System.out.println("未找到到该客户");
        } else {
            KHPrinter.printKH(list);
            System.out.println("查询成功，显示如上");
        }
    }
}
