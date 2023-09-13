//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class GfG { 
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int[] arr = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
		    
		    Solution obj = new Solution();
		    System.out.println(obj.firstElementKTime(arr, n, m));
		}
	}
}

// } Driver Code Ends


class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        
        /*for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==k){
                return a[i];
            }
        }
        return -1;*/
        
        Map<Integer,Integer> map=new LinkedHashMap<>();
        // map to store the element of array and the frequency of it
        if(k==1){
            return a[0];
        }
        for(int i=0;i<n;i++){
            //if element is alredy present increse the frequency by 1
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
            
            if(map.get(a[i])==k){
                return a[i]; // return element if frequency is equal to k
            }
            
           /* if(map.containsKey(a[i])){
                int v=map.get(a[i])+1;
                if(v>=k){
                    return a[i];
                }else{
                map.put(a[i],v);
                }
            }
            else{
                map.put(a[i],1);
            }*/
        }
        
        return -1;
        
          } 
}