import java.util.Stack;

public class App {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        if(s.length()%2==1){
            return false;
        }


        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if (c=='['){
                stack.push(']');
            }else if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty() || c!=stack.pop()){
                return false;
            }

        }

        return stack.isEmpty();
    }

   public static void main(String[] args) throws Exception {
        String s = "()";
        App pp = new App();
        System.out.println(pp.isValid(s));
    }
}
