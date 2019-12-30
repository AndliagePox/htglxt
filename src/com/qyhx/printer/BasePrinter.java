package com.qyhx.printer;

public abstract class BasePrinter {
    public static void welcome() {
        System.out.println("欢迎使用合同管理系统 (by强彦欢笑)");
        System.out.println("输入help以查看帮助");
    }

    public static void help() {
        System.out.println();
    }

    public static void header() {
        System.out.print("htglxt> ");
    }

    public static void unknowCommand() {
        System.out.println("无法解析的命令！");
    }
}
