public class App {


    public int trap(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;

        int leftMax = 0;
        int rightMax = 0;


        while (left<right) {

            leftMax=Math.max(leftMax, height[left]);
            rightMax=Math.max(rightMax, height[right]);

            if (height[left]>height[right]) {
                right--;
                result += Math.max(0,rightMax-height[right]);
                continue;
            }

            left++;
            result += Math.max(0,leftMax-height[left]);
            
        }

        return result;
    }



    public static void main(String[] args) throws Exception {
        int[] ar = {0,2,0,3,1,4,0};
        //          0 0 2 0 2 0

        App app = new App();
        System.out.println(app.trap(ar));
    }
}
