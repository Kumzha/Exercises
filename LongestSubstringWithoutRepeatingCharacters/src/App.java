// Given a string s, find the length of the longest substring without repeating characters.

import java.util.HashMap;

public class App {

    public static int lengthOfLongestSubstring(String s) {

        int maxCharCount = 0;
        int stringStart = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;

        while (stringStart !=  s.length()) {

            if (s.length()-stringStart < maxCharCount) {
                break;
            }

            if(map.containsKey(s.charAt(i))){
            maxCharCount = Math.max(maxCharCount, map.size());
            map.clear();

            stringStart++;

            i = stringStart;

            }else if(i == s.length()-1){
                maxCharCount = Math.max(maxCharCount, map.size()+1);
                map.clear();

                stringStart++;

                while(stringStart <= i){
                    i--;
                }

            }else{
            map.put(s.charAt(i), i);
            } 

            i++;
    }

        
        return maxCharCount;
    }

    public static void main(String[] args) throws Exception {
        String string = "dvdfdddasdfgh";

        System.out.println(lengthOfLongestSubstring(string));

        // String string1 = string.substring(0, 3);

        // System.out.println(string1);
    }
}
