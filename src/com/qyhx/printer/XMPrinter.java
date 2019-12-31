package com.qyhx.printer;

import com.qyhx.entity.XM;

import java.util.List;

public abstract class XMPrinter extends BasePrinter {
    public static void printXMList(List<XM> list){
        System.out.printf("%6s\t%20s\t%20s\t%20s\t%20s\t%10s\n",
                "id", "name", "number", "stime", "ftime", "money"
        );
        System.out.println("----------------------------------------------------------" +
                "------------------------------------------------------------------");
        for (XM xm : list) {
            System.out.println(xm);
        }
    }

    public static void printXMList(XM xx){

        System.out.printf("%6s\t%20s\t%20s\t%20s\t%20s\t%10s\n",
                "id", "name", "number", "stime", "ftime", "money"
        );
        System.out.println("----------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println(xx);
    }
}
