import java.util.ArrayList;
import java.util.List;

public class PrintPascalTriangle {
    public List<Integer> generateRow(int row){
        int ans = 1;
        List <Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1; col < row ; col++){
            ans *= (row-col);
            ans /= col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> Result = new ArrayList<>();
        for(int i =1 ;i<=numRows;i++){
            Result.add(generateRow(i));
        }
        return Result;
    }
}
