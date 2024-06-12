public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        int[] arr = {2,3,4,7,11};
        int k = 5;
       System.out.println(app.findKthPositive(arr, k));

    }

    public int findKthPositive(int[] arr, int k) {

        int count = 0;
        int numberInPlace = 1;

        

        for(int i = 0; i<10000; i++){

            if(i>arr.length){
                while(count!=k){
                    count++;
                    numberInPlace++;

                }
                return numberInPlace;
            }


            while(arr[i]!=numberInPlace){

                count++;

                if(count==k){
                    return numberInPlace;
                }

                numberInPlace++;

            }

            numberInPlace++;


        }

        return -1;

    }

    // public int findKthPositive(int[] arr, int k) {

    //     int count = 0;

    //     for(int i = 1; i<1000; i++){

    //         if(search(arr, i) == false){
    //             count++;
    //         }

    //         if(count==k){
    //             return i;
    //         }
    //     }

    //     return -1;

    // }

    // public boolean search(int[] arr, int target){
    //     int l = 0;
    //     int r = arr.length;

    //     while(l<=r){
    //         int middle = l + (r-l)/2;

    //         if(arr[middle] == target){
    //             return true;
    //         }else if(arr[middle] > target){
    //             r = middle - 1;
    //         }else{
    //             l = middle + 1;
    //         }

    //     }

    //     return false;
    // }


}
