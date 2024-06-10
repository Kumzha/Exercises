public class App {

    public boolean 
    isPalindrome(String s) {
        s = removeNonAlphanumeric(s);
                if(s.length() == 0){
            return true;
        }else{
            int i = 0;
            int j = s.length()-1;

            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }


    public String
    removeNonAlphanumeric(String str)
    {
      str = str.toLowerCase();

      str = str.replaceAll(
        "[^a-zA-Z0-9]", "");

      return str;
    }


    public static void main(String[] args) throws Exception {
        String s = "A man, a plan, a canal: Panama";
        App app = new App();
        System.out.println(app.isPalindrome(s));
    }
}
