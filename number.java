// 1st qeustion
//111
//222
//333

//2nd qeustion
//333
//222
//111


//1st ans
class number
{
    public static void main(String[]args)
    {   
    
        for(int i=1;i<=3;i++)
        {   
            for(int j=1;j<=3;j++)
            {
                System.out.print(i);
            }
            System.out.println( );
        }
//2nd ans

        for (int i=3;i>=1;i--)
        {
            for (int j=1;j<=3;j++)
            {
                System.out.print(i);
            }  
            System.out.println();
        }    
    }
}