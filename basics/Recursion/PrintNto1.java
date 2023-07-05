class PrintNto1
{
    
  public static void printNos(int N)
    {
        //Your code here
        if(N==0)
        {
            return;
        }
        System.out.print(N + " " );

        printNos(N-1);
        
    }

    public static void main(String args[])
    {
        int n = 10;
        printNos(n);
    }
}