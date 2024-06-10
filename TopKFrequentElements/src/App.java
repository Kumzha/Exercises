import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class App {

    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        List<Integer>[] bucket = new List[nums.length+1];

        for (int key : mp.keySet()){

            if(bucket[mp.get(key)] == null){
                bucket[mp.get(key)] = new ArrayList<>();
            }

            bucket[mp.get(key)].add(key);
        }


        int count = 0;

        for(int j = bucket.length-1; j>=0; j--){
            
            if(bucket[j]==null){
                continue;
            }

            for(int i = 0; i < bucket[j].size(); i++){

                if(count == k){
                    return result;
                }

                result[count] = bucket[j].get(i);
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        int[] nums = {-1,-1};
        int k = 1;

        App app = new App();

        app.topKFrequent(nums,k);


    

    }
}
