import java.util.ArrayList;
import java.util.List;

class MooreVotingAlgorithm {
    public int majorityElement(ArrayList<Integer> nums) {
        int count = 0;
        int element = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count == 0) {
                count++;
                element = nums.get(i);
            } else if (nums.get(i) == element) {
                count++;
            } else {
                count--;
            }
        }
        int count2 = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == element) {
                count2++;
            }
        }
        if (count2 > (nums.size() / 2)) {
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
            List.of(7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5)
        );
        MooreVotingAlgorithm obj = new MooreVotingAlgorithm();
        int result = obj.majorityElement(numbers);
        
        if (result > -1) {
            System.out.println("The majority Element : " + result);
        } else {
            System.out.println("Their is no majority Element : ");
        }
    }
}