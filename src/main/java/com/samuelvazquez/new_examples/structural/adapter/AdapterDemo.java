package com.samuelvazquez.new_examples.structural.adapter;

/**
 * Now you can use adapter to escape pirates.
 * Because there is only one fishing boat available
 */
public class AdapterDemo {
    public static void main(String[] args) {
         // you must board another type of boat
//        Captain captain = new Captain(() -> System.out.println("If someone hadn't forgotten a little RowingBoat for emergencies"));
//        captain.row();

        //every man for himself!
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
