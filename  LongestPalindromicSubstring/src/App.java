public class App {

    String result = "";
    String tempString = "";
    
    public String longestPalindrome(String s) {

        for(int i = 0; i<s.length(); i++){

            //If the string is odd
            tempString = expand(s, i, i);
            if (tempString.length() > result.length()) {
                result = tempString;
            }

            //If the string is even
            tempString = expand(s, i, i+1);
            if (tempString.length() > result.length()) {
                result = tempString;
            }
        }

        return result;
    }

    public String expand(String s, int i, int j) {

        String subString = "" + s.charAt(i);

        while (i >= 0 && j < s.length()) {

            if (s.charAt(i) != s.charAt(j)) {
                return subString;
            }

            subString = s.substring(i, j + 1);

            i--;
            j++;

        }

        return subString;
    }

    public static void main(String[] args) throws Exception {
        String s = "babad";

        App app = new App();

        System.out.println(app.longestPalindrome(s));
    }
}
