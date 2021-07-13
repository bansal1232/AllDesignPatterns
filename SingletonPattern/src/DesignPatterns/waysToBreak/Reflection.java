package DesignPatterns.waysToBreak;

import DesignPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Singleton obj = Singleton.getSingletonInstance();
        System.out.println(obj.hashCode());

        Class<?> singletonClass = Class.forName("DesignPatterns.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton brokenSingleton = constructor.newInstance();
        System.out.println(brokenSingleton.hashCode());
    }
}
