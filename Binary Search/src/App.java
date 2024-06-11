public class App {
    public static void main(String[] args) throws Exception {
        App p = new App();
        int[] i = {0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(p.search(i, 11));
    }

    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length-1;

        while (l<=r) {

            int mid = l + (r-l) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }

            if(nums[mid]>target){
                r = mid-1;
            }

            if(nums[mid]<target){
                l = mid+1;
            }

        }


        return -1;

    }


}
