public class ReversingArray {
    int [] Arr = {1,2,3,4,2};
    
    public void swap(int i,  int j)
    {
        int temp = Arr[i];
        Arr[i]=Arr[j];
        Arr[j]=temp;
    }

    // with two variables
    public int Reverse(int l,int r)
    {
        if(l>=r)
        {
            return 0;
        }
        swap(l, r);
        return Reverse(l+1, r-1);
    }

    //with Single Variable
    public int ReverseWithSingleVariable(int i,  int n)
    {
        if(i>=n/2)
        {
            return 0;
        }
        swap(i, n-i-1);
        return ReverseWithSingleVariable(i+1, n);
        
    }

    public static void main(String[] args) {
        ReversingArray obj = new ReversingArray();
        
        // obj.Reverse(0, obj.Arr.length - 1);
        // for(int num : obj.Arr)
        // {
        //     System.out.println(num);
        // }

        obj.ReverseWithSingleVariable(0, obj.Arr.length);
        for ( int element : obj.Arr)
        {
            System.out.println(element);
        }
    }
}
