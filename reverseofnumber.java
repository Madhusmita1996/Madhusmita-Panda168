public class reverseofnumber{
    static int reverse(int n)
    {
        int rev =0;
        int rem;
        while(n>0){
            rem = n% 10;
            rev =(rev *10)+rem;
            n= n/10;
        }
        return rev ;
    }
    public static void main(String[]agrs){
        int n = 45269;
        System.out.println("Reversed Number is"+reverse(n));
    }
}