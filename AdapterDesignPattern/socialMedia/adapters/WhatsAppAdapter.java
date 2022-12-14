package AdapterDesignPattern.socialMedia.adapters;

import AdapterDesignPattern.socialMedia.company.AllSocialMedia;
import AdapterDesignPattern.socialMedia.company.WhatsApp;

public class WhatsAppAdapter implements AllSocialMedia {
    private final WhatsApp whatsApp;

    public WhatsAppAdapter(WhatsApp whatsApp) {
        this.whatsApp = whatsApp;
    }

    @Override
    public String getUserName() {
        return whatsApp.getUsername();
    }

    @Override
    public String getUserId() {
        return whatsApp.getPhoneNumber().toString();
    }


}
