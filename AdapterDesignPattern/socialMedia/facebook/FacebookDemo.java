package AdapterDesignPattern.socialMedia.facebook;

import AdapterDesignPattern.socialMedia.adapters.InstagramAdapter;
import AdapterDesignPattern.socialMedia.adapters.WhatsAppAdapter;
import AdapterDesignPattern.socialMedia.company.AllSocialMedia;
import AdapterDesignPattern.socialMedia.company.Instagram;
import AdapterDesignPattern.socialMedia.company.WhatsApp;

public class FacebookDemo {
    public static void main(String[] args) {
        WhatsApp whatsApp = new WhatsApp("Shubham", 9557574743L);
        Instagram instagram = new Instagram("Bansal", "bansal1232");

        AllSocialMedia whatsAppAdapter = new WhatsAppAdapter(whatsApp);
        AllSocialMedia instagramAdapter = new InstagramAdapter(instagram);


        Facebook facebookAsWhatsapp = new Facebook(whatsAppAdapter.getUserName(), whatsAppAdapter.getUserId());
        System.out.printf("Whatsapp, FaceBook Id: %s and userName: %s\n",
                facebookAsWhatsapp.getUserId(), facebookAsWhatsapp.getUserName());

        Facebook facebookAsInstagram = new Facebook(instagramAdapter.getUserName(), instagramAdapter.getUserId());
        System.out.printf("Instagram, FaceBook Id: %s and userName: %s\n",
                facebookAsInstagram.getUserId(), facebookAsInstagram.getUserName());


    }
}
