import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class App {

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character,Integer> charFreq1 = new HashMap<>();
        
        for(int i  = 0; i < s.length(); i++){

                charFreq1.put(s.charAt(i), charFreq1.getOrDefault(s.charAt(i), 0) + 1);

                charFreq1.put(t.charAt(i), charFreq1.getOrDefault(t.charAt(i), 0) - 1);
       
        }
        
        for(int i = 0; i < s.length(); i++){
            if(charFreq1.get(s.charAt(i)) != 0){
                return false;
            }
        }
        
        return true;

    }


    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(map.containsKey(sortedWord)){
                map.get(sortedWord).add(word);
            }else{
                map.put(sortedWord, new ArrayList<>());
                map.get(sortedWord).add(word);
            }
        }

        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        String[] in = {"eat","tea","tan","ate","nat","bat"};

        // List<List<String>> result = new ArrayList<>();
        // List<String>       subString = new ArrayList<>();

        app.groupAnagrams(in);
        // System.out.println(app.groupAnagrams(in));
    }   
}
