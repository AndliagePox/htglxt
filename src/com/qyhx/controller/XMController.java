package com.qyhx.controller;

import com.qyhx.printer.XMPrinter;
import com.qyhx.repertory.XMRepertory;

public class XMController extends BaseController implements ControllerInterface {
    @Override
    public void showAll() {
        XMRepertory xmRepertory = new XMRepertory();
        XMPrinter.printXMList(xmRepertory.findAll());
    }

    @Override
    public void updateOne() {

    }

    @Override
    public void deleteOne() {

    }

    @Override
    public void insertOne() {

    }
}
