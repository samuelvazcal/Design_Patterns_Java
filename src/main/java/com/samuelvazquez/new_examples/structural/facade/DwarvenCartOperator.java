package com.samuelvazquez.new_examples.structural.facade;

public class DwarvenCartOperator extends DwarvenMineWorker{
    @Override
    public void work() {
        System.out.println("Dwarf cart operator moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
