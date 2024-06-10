import java.util.PriorityQueue;
import java.util.Collections;


public class App {

    public static long maximumHappinessSum(int[] happiness, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long totalHappiness = 0;
        long turns = 0;

        for (int h : happiness) {
            pq.add(h);
        }
        
        
        
        for (int i = 0; i < k; i++) {
            
        int peek = pq.peek();

            if((peek-turns)<=0){
                totalHappiness += 0;  
            }else{
                totalHappiness += pq.poll() - turns;
            }

            turns++;
        }

        return totalHappiness;

        }

    public static void main(String[] args) {
        int[] happiness = {12, 1, 42};
        int k = 3;

        System.out.println(maximumHappinessSum(happiness, k));
    }
}
