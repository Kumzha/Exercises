import java.util.Arrays;

public class App {


    public int binarySearch(int[] nums, int left, int right, int target){
                
        if(right>=left){

            int check = left + (right - left) / 2;

            if(nums[check] == target){
                return check;
            }

            if (nums[check]>target) {
                return binarySearch(nums, left, check-1, target);
            }

            if (nums[check]<target) {
                return binarySearch(nums, check+1, right, target);
            }
        }

        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length-1;

        for(int i = 0; i < len; i++){
            int compliment = target - numbers[i];
            
            int complimentPosition = binarySearch(numbers, i+1, len, compliment);

            if(complimentPosition!=-1){

                System.out.println("FOUND");
                int[] result = {i+1, complimentPosition+1};
                return result;
            }
        }
        System.out.println("Not found");
        return new int[2];
    }


    public static void main(String[] args) throws Exception {
        int[] nums1 = {0,0,1,2};
        int[] nums2 = {5,25,75};
        App app = new App();

        System.out.println(Arrays.toString(app.twoSum(nums1, 0)));
    }

}
