import java.util.Scanner;

public class Factorial {
    private int InputData;
    private int fact=1;
    public int getInputData() {
        return InputData;
    }
    public int getFact() {
        return fact;
    }
    public void setInputData(int inputData) {
        InputData = inputData;
    }
    public void setFact(int fact) {
        this.fact = fact;
    }
    public int CalculateFactorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }

        return n*CalculateFactorial(n-1);
    }
    public static void main(String [] args)
    {
        Scanner ReadInput = new Scanner(System.in);
        Factorial obj = new Factorial();

        obj.setInputData(ReadInput.nextInt());
        obj.setFact(obj.CalculateFactorial(obj.getInputData()));

        if(obj.getFact()==0)
        {
            System.out.println("Error");
        }
        else{
            System.out.println(obj.getFact());
        }
        
        ReadInput.close();
    }
}
