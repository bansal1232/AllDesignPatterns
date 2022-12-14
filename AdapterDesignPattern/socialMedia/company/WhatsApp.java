package AdapterDesignPattern.socialMedia.company;

public class WhatsApp {

    public WhatsApp(String username, Long phoneNumber) {
        this.username = username;
        this.phoneNumber = phoneNumber;
    }
    public String getUsername() {
        return username;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    String username;

    Long phoneNumber;
}
