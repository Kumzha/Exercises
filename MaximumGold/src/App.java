public class App {
    public static int getMaximumGold(int[][] grid) {

        int n = grid.length;     
        int m = grid[0].length;  
        int maxGold = 0;


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 0) {
                    continue;
                }

                // All starting possitions
                maxGold = Math.max(maxGold, dfsGold(grid, i, j, 0));
                
                
            }
        }
    
        return maxGold;
    }

    public static int dfsGold(int[][] grid, int row, int collum, int maxGold){

        if(row < 0 || row >= grid.length || collum < 0 || collum >= grid[0].length || grid[row][collum] == 0) {
            return 0;
        }

        
        int originalValue = grid[row][collum];
        maxGold += grid[row][collum];
        int tempGold = maxGold;

        //Visited
        grid[row][collum] = 0;
        
        // left
        maxGold = Math.max(dfsGold(grid, row, collum-1, tempGold), maxGold);

        // right
        maxGold = Math.max(dfsGold(grid, row, collum+1, tempGold), maxGold);

        // top
        maxGold = Math.max(dfsGold(grid, row-1, collum, tempGold), maxGold);

        // bottom
        maxGold = Math.max(dfsGold(grid, row+1, collum, tempGold), maxGold);

        // set back to original value for next iterations
        grid[row][collum] = originalValue;
        return maxGold;
    }   


    public static void main(String[] args) {
        int[][] grid = {
            {0,6,0},
            {5,8,7},
            {0,9,0}
        };
        
        // int[][] grid = {
        //     {1,1},
        //     {1,1}
        // };
        
        System.out.println("Answer: " + getMaximumGold(grid));
    }
}
