// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.nthFaithfulNum(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long nthFaithfulNum(int N) {
       // code here
       Double magicNum=0.0;
       Integer index=0;
       while(N!=0){
           magicNum+=Math.pow(7,index) * (N%2);
           N=N/2;
           index++;
       }
       return magicNum.longValue();
    }
};
