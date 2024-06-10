import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class MinStack {
    
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> stack = new Stack<>(); 
    
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()||val<=getMin()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek()==getMin()){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
