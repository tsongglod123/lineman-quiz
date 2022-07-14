package sit.kmutt;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String secret = "aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K";
        String decoded = base64Decode(secret);
        System.out.println(decoded);
        System.out.println(reverseString(decoded));
    }

    static String base64Decode(String secret) {
        byte[] decoded = Base64.getDecoder().decode(secret);
        return new String(decoded, StandardCharsets.UTF_8);
    }

    static String reverseString(String s) {
        char[] chars = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            chars[s.length() - 1 - i] = s.charAt(i);
        }
        return new String(chars);
    }
}