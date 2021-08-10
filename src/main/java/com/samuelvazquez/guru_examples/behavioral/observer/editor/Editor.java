package com.samuelvazquez.guru_examples.behavioral.observer.editor;

import com.samuelvazquez.guru_examples.behavioral.observer.publisher.EventManager;

import java.io.File;

/**
 * Concrete publisher, tracked by other objects
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
