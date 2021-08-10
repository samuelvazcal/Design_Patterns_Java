package com.samuelvazquez.new_examples.structural.adapter;

/**
 * The captain wants to have an RowingBoat implementation of the interface so that it can be moved
 */
public class Captain {
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
