package com.qyhx.printer;

public abstract class BasePrinter {
    public static void welcome() {
        System.out.println("欢迎使用合同管理系统 (by强彦欢笑)");
        System.out.println("输入help以查看帮助");
    }

    public static void help() {
        System.out.println("\t命令           \t\t\t\t作用");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tshow xxx       \t\t\t\t显示xxx实体对应表中的所有数据，如show kh。");
        System.out.println("\tupdate xxx     \t\t\t\t更新xxx实体对应表中的一条数据，如update kh。");
        System.out.println("\tdelete xxx     \t\t\t\t删除xxx实体对应表中的一条数据，如delete kh。");
        System.out.println("\tinsert xxx     \t\t\t\t插入xxx实体对应表中的一条数据，如insert kh。");
        System.out.println("\tfind xxx by yyy\t\t\t\t根据yyy来查找xxx对应表中的数据，如find kh by name。");
        System.out.println("\texit           \t\t\t\t退出");
    }

    public static void bye() {
        System.out.println("Bye!");
    }
}
