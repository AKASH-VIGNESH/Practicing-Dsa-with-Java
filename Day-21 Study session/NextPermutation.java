public class NextPermutation {
    public int [] nums = {3,2,1};
    public void nextPermutation() {
        int index = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
                low++;
            }
        } 
        
        else {
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            int low = index + 1;
            int high = n - 1;
            while (low <= high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
                low++;
            }
        }
    }

    public void display(){
        for(int element : nums){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {     
        NextPermutation obj = new NextPermutation();
        obj.nextPermutation();      
        obj.display();
    }    
}
