package goldmansachs;

public class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }

        for (int length = str2.length(); length >= 1; length--) {
            if (str1.length() % length != 0 || str2.length() % length != 0) {
                continue;
            }

            int i = 0, j = 0;
            while (i < str1.length() && str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
                j %= str2.length();
            }
            if (i == str1.length()) return str1.substring(0, length);
        }

        return "";
    }
}
