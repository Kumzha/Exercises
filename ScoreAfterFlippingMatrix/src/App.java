
public class App {

    public static int matrixScore(int[][] grid){
        
        for(int i = 0; i < grid.length; i++){
            if(grid[i][0] == 0){
                for(int j = 0; j < grid[0].length; j++){
                    if(grid[i][j]==0){grid[i][j]=1;}
                    else             {grid[i][j]=0;}
                }
            }
            
        }

        for(int i = 1; i < grid[0].length; i++){
            int count0 = 0;
            int count1 = 0;

            for(int j = 0; j < grid.length; j++){
                if(grid[j][i] == 0){count0++;}
                else               {count1++;}
            }
  

            if(count0 > count1){

                for(int j = 0; j < grid.length; j++){
                    if(grid[j][i] == 0){grid[j][i] = 1;}
                    else               {grid[j][i] = 0;}
                }
            }
        }

        int score = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int columnScore = grid[i][j] << (grid[0].length - j - 1);
                score += columnScore;
            }
        }
        
        return score;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        

        System.out.println(matrixScore(grid));

}
}

