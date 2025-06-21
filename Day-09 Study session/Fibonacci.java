import java.util.Scanner;

public class Fibonacci {
    //using recursion

    public int FindFibonaaci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return FindFibonaaci(n-1)+FindFibonaaci(n-2);
    }

    public static void main(String [] args)
    {
        Fibonacci obj = new Fibonacci();
        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter the position of fibonacci:");
        int Data = ReadInput.nextInt();
        System.out.println(obj.FindFibonaaci(Data));
        ReadInput.close();
    }
}
