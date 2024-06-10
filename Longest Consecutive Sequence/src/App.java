import java.util.HashMap;

public class App {

    public int longestConsecutive(int[] nums) {
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        // int[] nums = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        for(int n : nums){

            if(!map.containsKey(n)){
                int left = (map.containsKey(n-1)) ? map.get(n-1) : 0;
                int right = (map.containsKey(n+1)) ? map.get(n+1) : 0;

                int sum = left + right + 1;


                result = Math.max(sum, result);

                map.put(n,sum);
                map.put(n-left, sum);
                map.put(n+right, sum);



            }else{
                continue;
            }

        }
        


        return result;
    }


    public static void main(String[] args) throws Exception {
        App app = new App();

        int[] nums = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        System.out.println(app.longestConsecutive(nums));
    }
}
