public class FuntionalRecursion {
    public int FuntionalRecursionMethod(int n)
    {
        if(n==0) return 0;

        return n + FuntionalRecursionMethod(n-1);
    }
    public static void main(String [] args)
    {
        FuntionalRecursion objectMember = new FuntionalRecursion();
        System.out.println("Sum of n numbers:" + objectMember.FuntionalRecursionMethod(3));
    }
}
