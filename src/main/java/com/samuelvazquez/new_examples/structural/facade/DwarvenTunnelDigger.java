package com.samuelvazquez.new_examples.structural.facade;

public class DwarvenTunnelDigger extends DwarvenMineWorker{
    @Override
    public void work() {
        System.out.println("Dwarven tunnel digger creates another promising tunnel.");
    }

    @Override
    public String name() {
        return "Dwarf tunnel digger";
    }
}
