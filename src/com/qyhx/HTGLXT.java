package com.qyhx;


import com.qyhx.printer.BasePrinter;
import com.qyhx.printer.HTPrinter;
import com.qyhx.repertory.HTRepertory;

import java.util.Scanner;

public class HTGLXT {
    public static void main(String[] args) {
        int commandsCount;
        String commandLine;
        String[] commands;
        Scanner commandScanner = new Scanner(System.in);
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
                        case "khb":
                        case "xmb":
                        case "htb":
                            HTRepertory htRepertory = new HTRepertory();
                            HTPrinter.printHTList(htRepertory.findAll());
                            break;
                        default:
                            System.out.println("无此表");
                    }
                    break;
                case "exit":
                    BasePrinter.bye();
                    System.exit(0);
                default: System.out.println("无法解析的命令");
            }
        }
    }
}
