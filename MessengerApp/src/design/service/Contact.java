package design.service;

public class Contact implements Messenger{
    private final String name;
    public Contact(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("This is: "+ name+" with message: "+message);
    }
}
