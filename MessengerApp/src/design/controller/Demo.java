package design.controller;

import design.service.*;

public class Demo {
    private static final String helloMessage = "Hi all";

    public static void main(String[] args) {
        Contact contact1 = new Contact("Shubham");
        Contact contact2 = new Contact("Manish");
        Contact contact3 = new Contact("Rohan");
        contact1.sendMessage(helloMessage);

        System.out.println("\n-----------Sending group message-----------");
        contact1.sendMessage(helloMessage);
        GroupMessenger grpMessenger = new GroupMessenger();
        grpMessenger.addMessage(new EncryptMessenger(contact1));
        grpMessenger.addMessage(new CompressMessenger(contact2));
        grpMessenger.addMessage(contact3);
        grpMessenger.sendMessage(helloMessage);

        System.out.println("\n-----------Sending encrypted message-----------");
        EncryptMessenger encryptMessenger = new EncryptMessenger(contact1);
        encryptMessenger.sendMessage(helloMessage);

        System.out.println("\n-----------Sending compressed message-----------");
        CompressMessenger compressMessenger = new CompressMessenger(contact2);
        compressMessenger.sendMessage(helloMessage);

    }
}
