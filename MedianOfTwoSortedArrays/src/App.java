import java.util.Arrays;

public class App {

    public int[] mergeArrays(int[] arr1, int[] arr2) {

        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        int[] arr3 = new int[arr1Size + arr2Size];
        int arr3Size = arr3.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < (arr3Size)) {

            if(j == arr1Size){
                arr3[i] = arr2[k];
                k++;
                i++;
                continue;
            }

            if(k == arr2Size){
                arr3[i] = arr1[j];
                j++;
                i++;
                continue;
            }
            
            if (arr1[j] < arr2[k]) {
                arr3[i] = arr1[j];
                j++;
                
            } 

            else if(arr1[j] > arr2[k]) {
                arr3[i] = arr2[k];
                k++;
            }
            
            else if (arr1[j] == arr2[k]) {
                arr3[i] = arr2[k];
                k++;

            }

            i++;
        }



        return arr3;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] numsCombined = mergeArrays(nums1, nums2);
        int arrSize = numsCombined.length;
        double median  = 0.0f;
        
        if(arrSize % 2 == 0){
            int mid = arrSize / 2;
            int mid1 = numsCombined[mid];
            int mid2 = numsCombined[mid - 1];
            median = (mid1 + mid2) / 2.0f;
        }
        else {
            int mid = arrSize / 2;
            median = numsCombined[mid];
        }

        return median;
    }


    public static void main(String[] args) throws Exception {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        //arr 3 = [1,2,3,4,5,6,7,8,9,10]

        App app = new App();
        int[] arr3 = app.mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));


    }
}
