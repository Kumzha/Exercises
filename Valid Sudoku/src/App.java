import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] board = 
        {
         {'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}
        };

        App app = new App();
        
        System.out.println(app.isValidSudoku(board));
    
    
    }



    public boolean isValidSudoku(char[][] board) {


        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j<9; j++){

            if(board[i][j]!='.'){
                if(!set.add(board[i][j] + "row" + i)||
                   !set.add(board[i][j] + "collum" + j)||
                   !set.add(board[i][j] + "box" + i/3 + "," + j/3)
                   ){
                    return false;
                   }
            }
            }

        }

        return true;
    }
}
