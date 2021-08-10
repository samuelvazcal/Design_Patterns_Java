package com.samuelvazquez.new_examples.structural.facade;

public class DwarvenGoldDigger extends DwarvenMineWorker{
    @Override
    public void work() {
        System.out.println("Dwarf gold digger digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
