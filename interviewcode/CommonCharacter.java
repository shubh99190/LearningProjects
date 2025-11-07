public class CommonCharacter {

    public static void main(String[] args) {
        String s1= "ABCDCD";
        String s2= "CDEFD";
        String s3= commonChar(s1,s2);
        System.out.println(s3);
    }

    public static String commonChar(String s1, String s2) {
        StringBuilder commonChars = new StringBuilder();
        for (char ch : s2.toCharArray()) {
              if (s1.indexOf(ch) != -1) {
                commonChars.append(ch);
            }
        }
        return commonChars.toString();
    }
}
