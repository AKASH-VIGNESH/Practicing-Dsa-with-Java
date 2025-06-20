public class Recursion {

    public int PrintNumbers(int n) {
        if (n==15) {
            return n;
        }
        System.err.println(n);
        n++;
        return PrintNumbers(n);
    }

    public static void main(String[] args) {
        Recursion obj = new Recursion();
        System.err.println(obj.PrintNumbers(1));
    }
}
