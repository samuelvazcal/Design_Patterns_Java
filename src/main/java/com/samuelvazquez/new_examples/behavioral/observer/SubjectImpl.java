package com.samuelvazquez.new_examples.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the
 * attached Observers.
 */
public class SubjectImpl implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

}
