class SumOfSeries
{
    
    public static long sumOfSeries(long N) {
        // code here
     long sum=N*(N+1)/2;
     return sum*sum; 
    }

    public static void main(String args[])
    {
        long n = 10;
        System.out.println(sumOfSeries(n));
    }
}