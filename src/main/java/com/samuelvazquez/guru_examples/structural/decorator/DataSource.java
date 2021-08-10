package com.samuelvazquez.guru_examples.structural.decorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}
