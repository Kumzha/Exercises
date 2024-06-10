import java.util.Arrays;

public class App {

    // O(n^2)
    // 
    // public int[] productExceptSelf(int[] nums) {

    //     int[] result = new int[nums.length];

    //     for(int i = 0; i < nums.length; i ++){

    //         int sum = 1;

    //         for(int j = 0; j < nums.length; j++){
    //             if (i == j) {
    //                 continue;
    //             }

    //             sum *= nums[j];
    //         }

    //         result[i] = sum;
    //     }

    //     return result;
    // }

    // public int[] productExceptSelf(int[] nums) {
    //     int[] result = new int[nums.length];
        
    //     int[] prefix = new int[nums.length];
    //     int[] suffix = new int[nums.length];


    //     int sum = 1;
    //     prefix[0] = 1;

    //     for(int i = 1; i < nums.length; i++){

    //         sum *= nums[i-1];
    //         prefix[i] = sum;

    //     }


    //     sum = 1;
    //     suffix[nums.length-1] = 1;

    //     for(int i = nums.length-2; i >= 0; i--){

    //         sum *= nums[i+1];
    //         suffix[i] = sum;

    //     }

    //     for(int i = 0; i < nums.length; i ++){
    //         result[i] = prefix[i] * suffix[i];
    //      }

        
    //     return result;
    // }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
    
        int sum = 1;

        result[0] = 1;

        for(int i = 1; i < nums.length; i++){

            sum *= nums[i-1];
            result[i] = sum;

        }

        sum = 1;

        for(int i = nums.length-2; i >= 0; i--){

            sum *= nums[i+1];
            result[i] *= sum;

        }

        return result;
    }


    public static void main(String[] args) throws Exception {

    App app = new App();

    int[] nums = {1,2,3,4};


    // app.productExceptSelf(nums);
    System.out.println(Arrays.toString(app.productExceptSelf(nums)));

    }
}
