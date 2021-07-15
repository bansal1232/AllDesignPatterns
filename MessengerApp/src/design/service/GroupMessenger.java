package design.service;

import java.util.ArrayList;
import java.util.List;

public class GroupMessenger implements Messenger {

    List<Messenger> messengerList = new ArrayList<>();

    public void addMessage(Messenger message) {
        messengerList.add(message);
    }

    @Override
    public void sendMessage(String message) {
        messengerList.forEach(msger -> msger.sendMessage(message));
    }
}
