package com.samuelvazquez.new_examples.behavioral.state;

public class AngryState implements State{
    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println("Mammoth gets angry!");
    }

    @Override
    public void observe() {
        System.out.println("Mammoth is furious!");
    }
}
