package AdapterDesignPattern.socialMedia.facebook;

import AdapterDesignPattern.socialMedia.company.AllSocialMedia;

public class Facebook implements AllSocialMedia {
    private final String username;

    private final String userId;

    public Facebook(String username, String userId) {
        this.username = username;
        this.userId = userId;
    }


    @Override
    public String getUserName() {
        return this.username;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }
}
