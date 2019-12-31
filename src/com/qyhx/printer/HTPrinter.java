package com.qyhx.printer;

import com.qyhx.entity.HT;

import java.util.List;

public abstract class HTPrinter extends BasePrinter {
    public static void printHTList(List<HT> list) {
        System.out.printf("%6s\t%18s\t%11s\t%21s\t%6s\t%6s\n",
                "ID", "合同名", "合同编号", "签订时间", "客户ID", "项目ID"
        );
        System.out.println("----------------------------------------------" +
                "-----------------------------------------------------");
        for (HT ht : list) {
            System.out.println(ht);
        }
    }
}
