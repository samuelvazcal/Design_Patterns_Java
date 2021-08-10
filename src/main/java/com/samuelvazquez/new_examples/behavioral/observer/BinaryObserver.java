package com.samuelvazquez.new_examples.behavioral.observer;

/**
 * Class implementing the Observer interface, the observer objects register themselves to listen to a Subject
 */
public class BinaryObserver extends Observer{
    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState()));
    }
}
