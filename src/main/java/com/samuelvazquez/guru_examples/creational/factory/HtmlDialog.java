package com.samuelvazquez.guru_examples.creational.factory;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
