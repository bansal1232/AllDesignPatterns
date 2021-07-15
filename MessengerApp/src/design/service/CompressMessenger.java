package design.service;

import design.utils.Utility;

public class CompressMessenger implements Messenger{

    private final Messenger messenger;

    public CompressMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Compressing message");
        messenger.sendMessage(Utility.compressText(message));
    }
}
