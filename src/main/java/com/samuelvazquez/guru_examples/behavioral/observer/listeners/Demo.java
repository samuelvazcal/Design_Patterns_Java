package com.samuelvazquez.guru_examples.behavioral.observer.listeners;

import com.samuelvazquez.guru_examples.behavioral.observer.editor.Editor;


public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("fileA.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("testA.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
