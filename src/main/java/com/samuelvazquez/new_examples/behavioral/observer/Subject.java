package com.samuelvazquez.new_examples.behavioral.observer;

/**
 * Subject interface (or abstract class)
 * Maintains a list of observers, provides methods to register/unregister observers. Also, has a
 * notifyAll() method to notify all registered observers of any state change
 */
public interface Subject {

    int getState();

    void setState(int state);

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers();

}
