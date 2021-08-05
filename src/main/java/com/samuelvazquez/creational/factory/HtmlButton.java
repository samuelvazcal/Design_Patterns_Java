package com.samuelvazquez.creational.factory;

/**
 * HTML button implementation
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!");
    }
}
