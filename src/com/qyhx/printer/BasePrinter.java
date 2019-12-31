package com.qyhx.printer;

public abstract class BasePrinter {
    public static void welcome() {
        System.out.println("欢迎使用合同管理系统 (by强彦欢笑)");
        System.out.println("输入help以查看帮助");
    }

    public static void help() {
        System.out.println("\t命令    \t\t\t\t作用");
        System.out.println("--------------------------------------------------");
        System.out.println("\tshow xxx\t\t\t\t显示xxx实体对应表中的数据，如show kh。");
        System.out.println("\texit    \t\t\t\t退出");
    }

    public static void bye() {
        System.out.println("Bye!");
    }
}
