package com.samuelvazquez.new_examples.behavioral.observer;

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
