package com.qyhx.printer;

import com.qyhx.entity.HT;
import com.qyhx.entity.KH;

import java.util.List;

public abstract class KHPrinter extends BasePrinter {
    public static void printKH(List<KH> list) {
        System.out.printf("%10s\t%10s\t%10s\t%10s\n",
                          "id","name","card","phone"
        );
        System.out.println("--------------------------------------" +
                "-----------");
        for (KH kh : list) {
            System.out.println(kh);
        }
    }
}
