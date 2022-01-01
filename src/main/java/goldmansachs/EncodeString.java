package goldmansachs;

/**
 * Q: Encode string as: aaabb -> a3b2
 * Link: https://practice.geeksforgeeks.org/problems/run-length-encoding/1/#
 */
public class EncodeString {

    String encode(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            builder.append(str.charAt(i));
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            builder.append(count);
        }

        return builder.toString();
    }

}
