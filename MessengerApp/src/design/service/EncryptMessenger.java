package design.service;

import design.utils.Utility;

public class EncryptMessenger implements Messenger{

    private final Messenger messenger;

    public EncryptMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Encrypting message");
        messenger.sendMessage(Utility.encryptText(message));
    }
}
