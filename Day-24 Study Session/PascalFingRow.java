
public class PascalFingRow {
    public void generateRow(int row){
        int ans = 1;
        for(int col = 1; col < row ; col++){
            ans *= (row-col);
            ans /= col;
            System.out.println(ans);
        }
    }
}
