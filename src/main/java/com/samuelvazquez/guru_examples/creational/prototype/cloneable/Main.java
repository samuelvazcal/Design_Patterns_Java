package com.samuelvazquez.guru_examples.creational.prototype.cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        A a = new A(20,"todayisFriday");

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        A b = (A)a.clone();

        System.out.println(b.i);
        System.out.println(b.s);

    }
}


class A implements Cloneable{

    int i = 0;
    String s;

    // parameterized constructor
    A(int i, String s)
    {
        this.i = i;
        this.s = s;
    }

    // overriding clone() method by simply calling Object class clone() method


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}