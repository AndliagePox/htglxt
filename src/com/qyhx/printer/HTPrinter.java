package com.qyhx.printer;

import com.qyhx.entity.HT;

import java.util.List;

public abstract class HTPrinter extends BasePrinter {
    public static void printHTList(List<HT> list) {
        System.out.printf("%6s\t%20s\t%15s\t%25s\t%6s\t%6s\n",
                "ID", "name", "number", "qtime", "KH_ID", "XM_ID"
        );
        System.out.println("--------------------------------------" +
                "-----------------------------------------------------");
        for (HT ht : list) {
            System.out.println(ht);
        }
    }
}
