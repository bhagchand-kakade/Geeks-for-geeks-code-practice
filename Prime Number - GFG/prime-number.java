//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
        if (N <= 1) {
        return 0;
    }
    int i = 2;
    while (i * i <= N) {
        if (N % i == 0) {
            return 0;
        }
        i++;
    }
    return 1;
        /*if(N==1)
        return 0;
        int m=N/2;
        int count=0;
        for(int i=2;i*i<=m;i++){
            if(N%i==0){
                return 0;
            }
            
           /* count++;
            count=3;*/
           // break;
            
        //}
       // return 1;
        
        /*if(N%2==0){
            return 0;
        }else {
            return 1;
        }*/
    }
}