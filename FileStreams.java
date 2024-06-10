package Java.Exercises;

public class FileStreams {
    Hashmap<Integer, Integer> map = new Hashmap<>();

    int[] arr = {5,4,3,2,};

    for(int i = 0; i < arr.length; i++) {
        map.put(i, arr[i]);
    }

    System.out.println(map);
}
