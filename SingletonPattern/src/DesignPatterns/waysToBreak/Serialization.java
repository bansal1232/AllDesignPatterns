package DesignPatterns.waysToBreak;

import DesignPatterns.Singleton;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton originalSingleton = Singleton.getSingletonInstance();

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("src/dummy.txt"));
        objectOutputStream.writeObject(originalSingleton);
        objectOutputStream.close();

        ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("src/dummy.txt"));
        Singleton brokenSingleton = (Singleton) inputStream.readObject();

        System.out.println(originalSingleton.hashCode());
        System.out.println(brokenSingleton.hashCode());

    }
}