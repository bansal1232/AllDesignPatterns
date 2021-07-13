package DesignPatterns.waysToBreak;

import DesignPatterns.Singleton;

public class CloneableTrick {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton originalSingleton = Singleton.getSingletonInstance();

        System.out.println(originalSingleton.hashCode());
        Singleton brokenSingleton = (Singleton) originalSingleton.clone();
        System.out.println(brokenSingleton.hashCode());
    }
}
