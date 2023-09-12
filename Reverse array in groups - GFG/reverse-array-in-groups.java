//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        /*while(k>0){
            for(int i=k;i>0;i--){
                int temp=arr.get(k-1);
                arr.set(k-1,arr.get(k));
                arr.set(k,temp);
            }*/
              int num=n/k;int start=0;
       // ArrayList<Integer> list=new ArrayList<>();
        while(num>0){
            
            reverse(arr,start,start+k-1);
            start=start+k;
            
            num--;
           
        }
         if (n%k!=0) {
           reverse(arr, start, n - 1);
         }
        
    }
    
    public static void reverse(ArrayList<Integer> arr,int start, int end){
        
        
        for(int i=start,j=end;i<j;i++,j--){
            
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            
        }
         
        
    }
}
