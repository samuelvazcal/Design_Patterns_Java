package com.samuelvazquez.new_examples.behavioral.state;

public class PeacefulState implements State{
    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println("Mammoth calms down");
    }

    @Override
    public void observe() {
        System.out.println("Mammoth is calm and peaceful.");
    }
}
