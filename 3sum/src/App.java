import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class App {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();  

        Arrays.sort(nums);


        for(int i = 0; i < nums.length-2; i++){
            
            if(nums.length<3){
                return Collections.emptyList();
            }
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }


            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    continue;
                }
                if (sum > 0) {
                    k--;
                    continue;
                }
                if (sum < 0) {
                    j++;
                    continue;
                }

            }
            

        }
        
        return new ArrayList<>(result);
    }
    
    public List<Integer> twoSum(int[] nums, int target, int start) {
                                                                                                        
        List<Integer> result = new ArrayList<>(); 

        int i = start;
        int j = nums.length-1;
        
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                result.add(target*(-1));
                result.add(nums[i]);
                result.add(nums[j]);
                return result;
            }
            
            if(sum<target){
                i++;
                continue;
            }
            if(sum>target){
                j--;
                continue;
            }
        }
                                                                                                        
        return result;
    }

    public static void main(String[] args) {
        App app = new App();

        int[] nums = {0,0,0,0};

        System.out.println(app.threeSum(nums).toString());

        Set<Integer> targetSet = new HashSet<>(); 

    }
}