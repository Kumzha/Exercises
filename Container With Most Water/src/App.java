public class App {


    public int maxArea(int[] height) {
        int result = 0; 
        int i = 0;
        int j = height.length-1;

        while(i<j){

            result = Math.max((j-i)*Math.min(height[i],height[j]), result);

            if(height[i]==height[j]){
                if(height[i+1]==height[j+1]){
                    i++;
                    j++;
                    continue;
                }
                if(height[i+1]>height[j+1]){
                    i++;
                    continue;
                }
            }
            


        }



        return result;
    }


    public static void main(String[] args) throws Exception {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        App app = new App();

        System.out.println(app.maxArea(nums));
    }
}
