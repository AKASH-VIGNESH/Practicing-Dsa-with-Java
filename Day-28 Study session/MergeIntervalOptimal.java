import java.util.Arrays;

public class MergeIntervalOptimal {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int [][] ans = new int[n][2];
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        int index =0;
        for(int i =1 ; i < n ;i++){
            if(intervals[i][0]<=ans[index][1]){
                ans[index][1] = Math.max(ans[index][1],intervals[i][1]);
            }
            else{
                index++;
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
            }
        }
        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i][0] = ans[i][0];
            result[i][1] = ans[i][1];
        }

        return result;
    }

     public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        MergeIntervalOptimal sol = new MergeIntervalOptimal();
        int[][] merged = sol.merge(intervals);

        System.out.println("Merged intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }

}
