import java.util.ArrayList;
import java.util.List;

public class App {

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left ++;
            right --;
        }
        return true;
    }

    public void backTrack(String s, List<String> tempList, List<List<String>> res) {
        String tempString;

        if(s.length()==0|| s == null){
            res.add(new ArrayList<>(tempList));
            return;
        }

        for(int i = 1; i<=s.length(); i++){
            tempString = s.substring(0,i);

            if(isPalindrome(tempString)){
                tempList.add(tempString);
                backTrack(s.substring(i, s.length()), tempList, res);
                tempList.remove(tempList.size()-1);
            }
        }
        return;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        backTrack(s, new ArrayList<>(), res);

        return res;
    }
    public static void main(String[] args) throws Exception {

        App app = new App();

        String abc = "aab";
        System.out.println(app.partition(abc));
    }
}
