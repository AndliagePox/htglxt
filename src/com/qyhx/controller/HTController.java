package com.qyhx.controller;

import com.qyhx.printer.HTPrinter;
import com.qyhx.repertory.HTRepertory;

public class HTController extends BaseController implements ControllerInterface{
    @Override
    public void showAll() {
        HTRepertory htRepertory = new HTRepertory();
        HTPrinter.printHTList(htRepertory.findAll());
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
