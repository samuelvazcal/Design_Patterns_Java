package com.samuelvazquez.new_examples.structural.adapter;

/**
 * Now that the pirates are coming, our captain needs to escape but there is
 * only one fishing boat available. We need to create an adapter that allows
 * the captain to use his rowing skills to operate the fishing boat.
 */
public class FishingBoatAdapter implements RowingBoat{
    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
