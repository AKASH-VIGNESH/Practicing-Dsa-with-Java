class StackAndHeap{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Demo obj = new Demo();
        int result1 = obj.add(5,10);
        System.out.println("Result:"+result1);
        System.out.println(obj);
    }
}

class Demo{
    int result;
    int add(int x,int y)
    {
        return x + y;
    }
}
