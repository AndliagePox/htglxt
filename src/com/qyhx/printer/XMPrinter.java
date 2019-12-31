package com.qyhx.printer;

import com.qyhx.entity.XM;

import java.util.List;

public abstract class XMPrinter extends BasePrinter {
    public static void printXMList(List<XM> list){
        System.out.printf("%6d\t%20d\t%20%\t%20d\t%20d\t%20d\n",
                "id", "name", "number", "stime", "ftime", "money"
        );
        System.out.println("--------------------------------------" +
                "-----------------------------------------------------");
        for (XM xm : list) {
            System.out.println(xm);
        }
    }
}
