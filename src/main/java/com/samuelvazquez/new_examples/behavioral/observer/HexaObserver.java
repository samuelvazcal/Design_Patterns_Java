package com.samuelvazquez.new_examples.behavioral.observer;

public class HexaObserver extends Observer{
    private Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
