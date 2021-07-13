package DesignPatterns;

public class Demo {
    public static void main(String[] args) {
        Singleton obj = Singleton.getSingletonInstance();
        Singleton newObj = Singleton.getSingletonInstance();

        System.out.println(obj.hashCode());
        System.out.println(newObj.hashCode());
    }
}
