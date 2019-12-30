package com.qyhx;


import com.qyhx.printer.BasePrinter;

import java.util.Scanner;

public class HTGLXT {
    public static void main(String[] args) {
        String commandLine;
        String[] commands;
        Scanner commandScanner = new Scanner(System.in);
        BasePrinter.welcome();
        while (true) {
            BasePrinter.header();
            commandLine = commandScanner.nextLine();
            commands = commandLine.split(" ");
            if (commands[0].equals("exit")) {
                System.exit(0);
            } else {
                BasePrinter.unknowCommand();
            }
        }
    }
}
