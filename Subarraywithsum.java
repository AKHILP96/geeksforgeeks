/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		while((test--)>0){
		    int[] a = new int[s.nextInt()];
		    int n = s.nextInt();
		    for(int i=0;i<a.length;i++){
		        a[i] = s.nextInt();
		    }
		    compute(a,n);
		}
	}
	
	public static int compute(int[] a,int n){
	    int start =0;
	    int end = 0;
	    int sum = 0;
	    
	    while(start<a.length || end<=a.length ){
	        if(n == sum){
	            end--;
	            start = start + 1;
	            end = end + 1;
	            System.out.println(start + " " + end);
	            return 0;
	        }else if(n<sum){
	            sum = sum-a[start];
	         //   System.out.println(start + " " +sum);
	            start++;
	        }else{
	            if(end == a.length){
	                System.out.println(-1);
	                return 0;
	            }
	            sum = sum+a[end];
	       //     System.out.println(end + " " + sum);
	            end++;
	        }
	    }
	    return 0;
	}
}
