package DesignPatterns;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {

    private Singleton() { }

    private static Singleton instance = null;

    public static Singleton getSingletonInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
