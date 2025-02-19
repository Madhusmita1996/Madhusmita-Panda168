public class fibonanciSeries{
    static void fibonanci(int n)
    {
        int a =0 , b = 1 ;
        for (int i=0;i<n;i++){
            System.out.println(a +" ");
            int c = b+a;
            a = b;
            b = c;
        }
    }
    public static void main (String []args){
        int n =10;
        fibonanci(n);
    }
}