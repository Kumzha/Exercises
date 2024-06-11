import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        App app = new App();
        int[] heights = {3,6,5,7,4,8,1,0}; 
        System.out.println(app.largestRectangleArea(heights));
        
    }
    public int largestRectangleArea(int[] heights) {

        int result = 0;
        Stack<Pair> stack = new Stack<>();

        for(int i = 0; i <= heights.length; i++){


            int start = i;
            int h = (i == heights.length ? 0 : heights[i]);

            while(!stack.isEmpty()){

                if (stack.peek().height <= h) {
                    break;
                }

                Pair p = stack.pop();
                result = Math.max(result, p.height*(i-p.index));
                start = p.index;

            }
            
            stack.push(new Pair(h, start));
            
        }

        return result;
    }
}

class Pair{

    int height;
    int index;

    public Pair(int height, int index) {
        this.height = height;
        this.index = index;
    }

}
