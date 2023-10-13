package com.ixns;

public class SingleObject {

    private static final SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println(
                "Hello! I am a Singleton and no other can be instantiated");
    }
}
