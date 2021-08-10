package com.samuelvazquez.new_examples.behavioral.observer;

/**
 * Interface with an update() method which is invoked by the SubjectImpl to notify the observer of any changes in its
 * current state
 */
public abstract class Observer {
    //protected Subject subject;
    public abstract void update();
}
