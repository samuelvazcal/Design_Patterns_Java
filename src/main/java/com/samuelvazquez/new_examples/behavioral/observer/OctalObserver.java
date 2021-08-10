package com.samuelvazquez.new_examples.behavioral.observer;

/**
 * Class implementing the Observer interface, the observer objects register themselves to listen to a Subject
 */
public class OctalObserver extends Observer{
    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState()));
    }
}
