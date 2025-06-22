import java.util.HashMap;
import java.util.Scanner;

class FahrenheitToCelsius{

    private int FahrenheitStart;
    private int FahrenheitEnd;
    private int FahrenheitStep;
    public HashMap<Integer , Integer> map = new HashMap<>();

    //getters
    public int getFahrenheitStart() {
        return FahrenheitStart;
    }
    public int getFahrenheitEnd() {
        return FahrenheitEnd;
    }
    public int getFahrenheitStep() {
        return FahrenheitStep;
    }
    //setters
    public void setFahrenheitStart(int fahrenheitStart) {
        FahrenheitStart = fahrenheitStart;
    }
    public void setFahrenheitEnd(int fahrenheitEnd) {
        FahrenheitEnd = fahrenheitEnd;
    }
    public void setFahrenheitStep(int fahrenheitStep) {
        FahrenheitStep = fahrenheitStep;
    }

    public void CalculateCelsius(int startFahrenheit, int EndFahrenheit , int StepFahrenheit)
    {   
        if(startFahrenheit>EndFahrenheit)
        {
            return ;
        }
        int celsius = (startFahrenheit -32)*5/9;
        map.put(startFahrenheit, celsius);
        CalculateCelsius(startFahrenheit+StepFahrenheit,EndFahrenheit,StepFahrenheit);
    }

    public static void main(String [] args)
    {
        Scanner ReadInput = new Scanner(System.in);
        FahrenheitToCelsius obj = new FahrenheitToCelsius();
        obj.setFahrenheitStart(ReadInput.nextInt());
        obj.setFahrenheitEnd(ReadInput.nextInt());
        obj.setFahrenheitStep(ReadInput.nextInt());

        obj.CalculateCelsius(obj.getFahrenheitStart(), obj.getFahrenheitEnd(), obj.getFahrenheitStep());

        System.out.println(obj.map);
        ReadInput.close();
    }
}