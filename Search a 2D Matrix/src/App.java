public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {{ 1, 3, 5, 7},
                          {10,11,16,20},
                          {23,30,34,60}};
        int target  = 1;
        App a = new App();
        System.out.println(a.searchMatrix(matrix, target));

    }


    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int collums = matrix[0].length;
        int len = rows*collums;

        int left = 0;
        int right = len-1;

        while(left<=right){

        int middle = left+(right-left)/2;
        int row = (middle/collums);
        int collum = (middle%collums);

        if(matrix[row][collum]==target){
            return true;
        }else if(matrix[row][collum]>target){
            right = middle-1;
        }else{
            left = middle+1;
        }

        }
        return false;
    }
}
