/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsumindex;

/**
 *
 * @author AHMET KARABUĞA
 */
public class Maxsubsumindex {

    /**
     * @param args the command line arguments
     */
     static private int seqStart = 0;
    static private int seqEnd = -1;
    public static void main(String[] args) {
        // TODO code application logic here
          int a[ ] = { 4, -3, 5, -2, -1, 2, 6, -2 };
       int maxSum;


        maxSum = maxSubSum1( a );
        
        System.out.println("maxSum = "+maxSum);
        for(int s=seqStart;s<=seqEnd;s++){
            System.out.print("a["+s+"] ");
        }
        
    }
      public static int maxSubSum1( int [ ] a )
    {
        int maxSum = 0;

        for( int i = 0; i < a.length; i++ )
            for( int j = i; j < a.length; j++ )
            {
                int thisSum = 0;

                for( int k = i; k <= j; k++ )
                    thisSum += a[ k ];

                if( thisSum > maxSum )
                {
                    maxSum   = thisSum;
                    seqStart = i;
                    seqEnd   = j;
                }
            }
        return maxSum;
    }
    
}
