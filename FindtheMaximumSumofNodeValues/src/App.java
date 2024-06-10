public class App {

    public static long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;

        for(int i = 0; i < n-1; i++) {

            int aVal = nums[edges[i][0]];
            int bVal = nums[edges[i][1]];

            if((aVal^k + bVal^k) > (aVal+bVal)){
                nums[edges[i][0]] = aVal^k;
                nums[edges[i][1]] = bVal^k;
            }
            
        }
        long sum = 0;

        for(int i = 0; i < n; i++){
           sum +=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {

        int[] nums = {2,3};
        int k = 7;
        int[][] edges = {{0,1}};

        System.out.println(maximumValueSum(nums, k, edges));
    }
}
