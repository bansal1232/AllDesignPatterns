package AdapterDesignPattern.socialMedia.adapters;

import AdapterDesignPattern.socialMedia.company.AllSocialMedia;
import AdapterDesignPattern.socialMedia.company.Instagram;

public class InstagramAdapter implements AllSocialMedia {
    private final Instagram instagram;

    public InstagramAdapter(Instagram instagram) {
        this.instagram = instagram;
    }

    @Override
    public String getUserName() {
        return instagram.getNickName();
    }

    @Override
    public String getUserId() {
        return instagram.getInstagramId();
    }

}
