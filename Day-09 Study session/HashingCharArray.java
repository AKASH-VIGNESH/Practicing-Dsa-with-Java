import java.util.Scanner;

public class HashingCharArray {
    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter a String");
        String InputData = ReadInput.nextLine();

        int [] hashArray = new int [26];    //Doing this for only Lower case letters
        
        for(int i=0;i<InputData.length();i++)
        {
            int indexValue = InputData.charAt(i)-'a';
            hashArray[indexValue]++;
        }

        System.out.println("Enter the character that you need frequency:");
        char Ch = ReadInput.next().charAt(0);

        System.out.println("Frequency of "+Ch+" : "+ hashArray[Ch-'a']);

        ReadInput.close();
    }
}
