import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;



public class App {

    public String[] findRelativeRanks(int[] score) {
        
        
    HashMap<Integer, Integer> map = new HashMap<>();


    String[] answer = new String[score.length];

    for(int i = 0; i < score.length; i++) {
        map.put(i, score[i]);
    }

    LinkedHashMap <Integer, Integer> temp = map.entrySet().stream().sorted((t2,t1) -> t1.getValue().compareTo(t2.getValue()))
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (t1, t2) -> t1, LinkedHashMap::new));

    Iterator<Map.Entry<Integer, Integer>> it = temp.entrySet().iterator();

    
    int i = 0;
    String place = "";

    while(it.hasNext()) {

        Map.Entry<Integer, Integer> pair = it.next();

        if(i==0){place = "Gold Medal";}
        if(i==1){place = "Silver Medal";}
        if(i==2){place = "Bronze Medal";}
        if(i>2){place = String.valueOf(i+1);}

        answer[pair.getKey()] = place;

        i++;
    }

    return answer;
}
}
    

