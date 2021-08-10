package com.samuelvazquez.behavioral.observer.listeners;

import java.io.File;

/**
 * Common observer interface
 */
public interface EventListener {
    void update(String eventType, File file);
}
