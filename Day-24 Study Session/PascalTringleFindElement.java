public class PascalTringleFindElement {
    public int  FindElement(int n,int r){
        int res =1;
        for(int i=0;i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
}
