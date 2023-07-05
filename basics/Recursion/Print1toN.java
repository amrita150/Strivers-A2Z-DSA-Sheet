class Print1toN
{
    
  public static void printNos(int N)
    {
        //base case
        if(N==0)
        {
            return;
        }
        
        printNos(N-1); //recursive call
        System.out.print(N + " " );
        
    }

    public static void main(String args[])
    {
        int n = 10;
        printNos(n);
    }
}
