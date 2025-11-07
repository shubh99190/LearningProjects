import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = new String[]{"flower","flow","flight"};
        String result = longestCommonPrefix(str);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int i = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);

    }
}
