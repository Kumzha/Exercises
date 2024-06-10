import java.util.Stack;

public class App {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int temp = 0;
    
        for(String s : tokens){
        
                switch (s) {
                    case "/":
                        temp = stack.pop();
                        result = stack.pop();
                        result /= temp;
                        stack.push(result);
                        break;

                    case "*":
                        temp = stack.pop();
                        result = stack.pop();
                        result *= temp;
                        stack.push(result);
                        break;

                    case "+":
                        result = stack.pop();
                        result += stack.pop();
                        stack.push(result);
                        break;

                    case "-":
                        temp = stack.pop();
                        result = stack.pop();
                        result -= temp;
                        stack.push(result);
                        break;
                
                    default:
                        stack.push(Integer.parseInt(s));
                        break;
                }
        }



        return stack.pop();
    }

    
    public static void main(String[] args) throws Exception {
        
        String[] token = {"4","13","5","/","+"};
        App app = new App();
        System.out.println(app.evalRPN(token));
    }
}
