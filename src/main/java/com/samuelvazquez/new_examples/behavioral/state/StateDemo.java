package com.samuelvazquez.new_examples.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();

        // Mammoth is calm and peaceful.
        // The mammoth gets angry!
        // The mammoth is furious!
        // The mammoth calms down.
        // The mammoth is calm and peaceful.
    }
}
