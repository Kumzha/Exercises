public class App {
    public int myAtoi(String s) {
        boolean readingNumber = false;
        boolean readSign = false;

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);

            if(Character.isLetter(c)||c == '.'){
                break;
            }

            if (readingNumber == false) {

                if (!readSign && c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                    continue;
                }

                if (!readSign && c == '+') {
                    readSign = true;
                    result += c;
                    continue;
                }

                if (!readSign && c == '-') {
                    readSign = true;
                    result += c;
                    continue;
                }
                
                

                if (readSign && c == '0') {
                    continue;
                }
                
                if(readSign && Character.isDigit(c) == false){
                    return 0;
                }

                if (Character.isDigit(c)) {
                    readingNumber = true;
                    result += c;
                    continue;
                }

            }

            if(readingNumber == true){

                if(!Character.isDigit(c)){
                    break;
                }

                result += c;
            }



        }
        
        if(readSign == true && result.length()==1){
            return 0;
        }

        if(result.length() == 0){
            return 0;
        }
        
         try {

                return Integer.parseInt(result);

        }catch (Exception e) {

            if(result.charAt(0) == '-'){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
             
        }
    }


    public static void main(String[] args) throws Exception {
        String s = "    42";
        System.out.println(new App().myAtoi(s));
        
    }

}
