package com.samuelvazquez.guru_examples.creational.factory;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
