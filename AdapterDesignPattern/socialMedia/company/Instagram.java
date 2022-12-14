package AdapterDesignPattern.socialMedia.company;

public class Instagram {
    public String getNickName() {
        return nickName;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public Instagram(String nickName, String instagramId) {
        this.nickName = nickName;
        this.instagramId = instagramId;
    }

    String nickName;
    String instagramId;
}
