class  Hello{
    public static void main(String [] args)
    {
        System.out.println("Hello World");

        //integer

        int a = 19;
        byte b = 100;
        System.out.println("a:"+a);
        System.out.println("b:"+b);    

        //in default java has double for decimal values

        float x = 12.0f;
        System.out.println("x:"+x);

        double y = 13.25;
        System.out.println("Y:"+y);

        //String
        String str = "Akash";
        System.out.println("Str:"+str);

        //character
        char ch = 'A';
        System.out.println("Char:"+ch);

        //boolean
        boolean bool = true;
        System.out.println("Boolean:"+bool); 

        //Overflow 
        int num1 = 258;
        byte num2 = (byte) num1;
        System.out.println("overfllow casting:"+num2);

        //Operator in Java 
        byte operand1 = 5;
        byte operand2 = 55;
        int result;//beacause an operation happens in byte will get changed to integer

        result = operand1 + operand2;
        System.out.println("Result:"+result);

        //instance of operator
        if(str instanceof String)
        {
            System.out.println("True");
        }    

        // return switch to a variable in java 
        result = switch(operand1){
            case 5 -> 60;
            case 10 -> 50;
            default -> 10;
        };
        System.out.println(result);        
    }
    // Solution addTwo = new Solution();
    // int nums = [1,2,3,4];
    // int target = 6;
    // addTwo.twoSum(nums,target);
    //For-each in java    
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int i,j;
//         for(i=0;i<nums.length;i++)
//         {
//             for(j=0;j<num.length;j++)
//             {
//                 if( nums[i]+nums[j] == target)
//                 {
//                     int x[]=[i,j];
//                     return x;
//                 }
//             }
//         }
//     }
// }