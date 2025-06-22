import java.util.Scanner;

public class DigitSum {

    private int Number;
    private int OddSum = 0;
    private int EvenSum = 0;

    public int getNumber() {
        return Number;
    }

    public int getOddSum() {
        return OddSum;
    }

    public int getEvenSum() {
        return EvenSum;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setOddSum(int oddSum) {
        OddSum = oddSum;
    }

    public void setEvenSum(int evenSum) {
        EvenSum = evenSum;
    }

    public void CalculateDigitSum(int num)
    {
        int digit = num%10;
        if(digit % 2 == 0)
        {
            setEvenSum(getEvenSum()+digit);
        }
        else{
            setOddSum(getOddSum()+digit);
        }
        if(num/10>0)
        {
            CalculateDigitSum(num/10);
        }
        else{
            return ;
        }
    }

    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        DigitSum obj = new DigitSum();

        obj.setNumber(ReadInput.nextInt());

        obj.CalculateDigitSum(obj.getNumber());

        System.out.println(obj.getOddSum());
        System.out.print(obj.getEvenSum());

        ReadInput.close();
    }

}
