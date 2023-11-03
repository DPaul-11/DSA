public class Recursion
{
    static int fact(int n)
    {
        int result=0;
        if(n==1 || n==0)
            return 1;
        else
            result=n*fact(n-1);
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=fact(n);
        System.out.println("The factorial of "+n+" is "+ ans);

    }
}
