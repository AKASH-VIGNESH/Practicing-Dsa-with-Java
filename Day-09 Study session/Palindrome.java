import java.util.Scanner;

public class Palindrome {
    String Value;

    public boolean isPalindrome( int i)
    {
        int n = Value.length();
        if(i>=n/2)
        {
            return true;
        }
        if(Value.charAt(i) != Value.charAt(n-i-1))
        {
            return false;
        }
        return isPalindrome(i+1);
    }

    public static void main(String [] args)
    {
        Palindrome obj = new Palindrome();
        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter input:");     
        obj.Value = ReadInput.nextLine();
        System.out.println("Ispalindrome:"+obj.isPalindrome(0));
        ReadInput.close();
    }
}
