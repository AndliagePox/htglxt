package com.qyhx;


import com.qyhx.controller.HTController;
import com.qyhx.controller.KHController;
import com.qyhx.controller.XMController;
import com.qyhx.printer.BasePrinter;

import java.util.Scanner;

public class HTGLXT {
    public static void main(String[] args) {
        int commandsCount;
        String commandLine;
        String[] commands;
        Scanner commandScanner = new Scanner(System.in);
        HTController htController = new HTController();
        KHController khController = new KHController();
        XMController xmController = new XMController();
        BasePrinter.welcome();
        while (true) {
            System.out.print("\nhtglxt> ");
            commandLine = commandScanner.nextLine();
            commands = commandLine.split(" ");
            commandsCount = commands.length;
            switch (commands[0]) {
                case "help":
                    BasePrinter.help();
                    break;
                case "show":
                    if (commandsCount != 2) {
                        System.out.println("命令参数数量错误");
                        break;
                    }
                    switch (commands[1]) {
                        case "kh":
                            khController.showAll();
                            break;
                        case "xm":
                            xmController.showAll();
                            break;
                        case "ht":
                            htController.showAll();
                            break;
                        default:
                            System.out.println("无此表");
                    }
                    break;
                case "update":
                    if (commandsCount != 2) {
                        System.out.println("命令参数数量错误");
                        break;
                    }
                    switch (commands[1]) {
                        case "kh":
                            khController.updateOne();
                            break;
                        case "xm":
                            xmController.updateOne();
                            break;
                        case "ht":
                            htController.updateOne();
                            break;
                        default:
                            System.out.println("无此表");
                    }
                    break;
                case "delete":
                    if (commandsCount != 2) {
                        System.out.println("命令参数数量错误");
                        break;
                    }
                    switch (commands[1]) {
                        case "kh":
                            khController.deleteOne();
                            break;
                        case "xm":
                            xmController.deleteOne();
                            break;
                        case "ht":
                            htController.deleteOne();
                            break;
                        default:
                            System.out.println("无此表");
                    }
                    break;
                case "insert":
                    if (commandsCount != 2) {
                        System.out.println("命令参数数量错误");
                        break;
                    }
                    switch (commands[1]) {
                        case "kh":
                            khController.insertOne();
                            break;
                        case "xm":
                            xmController.insertOne();
                            break;
                        case "ht":
                            htController.insertOne();
                            break;
                        default:
                            System.out.println("无此表");
                    }
                    break;
                case "exit":
                    BasePrinter.bye();
                    System.exit(0);
                default: System.out.println("无法解析命令");
            }
        }
    }
}
