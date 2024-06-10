public class App {
    public boolean isPalindrome(int x) {
        
        

        int i = 0;
        int j = String.valueOf(x).length()-1;

        while (i<j){
            if(String.valueOf(x).charAt(i)!= String.valueOf(x).charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }
}
