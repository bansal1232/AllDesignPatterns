package design.utils;

public class Utility {
    public static String encryptText(String text) {
        StringBuilder encryptMessage = new StringBuilder();
        for(int i=0; i<text.length(); ++i) {
            encryptMessage.append((char) (text.charAt(i) + 1));
        }
        return encryptMessage.toString();
    }

    public static String compressText(String text) {
        StringBuilder compressMessage = new StringBuilder();
        for(int i=0; i<text.length(); ++i) {
            compressMessage.append((char) (text.charAt(i) + 10));
        }
        return compressMessage.toString();
    }

}
