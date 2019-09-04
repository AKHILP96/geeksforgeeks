/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		while(test-->0){
		    int[] a = new int[s.nextInt()];
		    for(int i=0;i<a.length;i++){
		       a[i] = s.nextInt();
		    }
		    Arrays.sort(a);
		    compute(a);
		}
	}
	
	public static void compute(int[] a){
	    int start = 0;
	    int end = a.length-2;
	    int last = a.length-1;
	    int count = 0;
	   // System.out.println(a[a.length-1]);
	    for(int i=a.length-1;i>1;i--){
	        start = 0;
	        end = i-1;
	    while(start<end){
	     //   System.out.println(a[start]+" "+a[end]);
	        if(a[start]+a[end]==a[i]){
	   //         System.out.println(true);
	                   count++;
	                   end--;
	        }else if(a[start]+a[end]>a[i]){
	            end--;
	        }else if(a[start]+a[end]<a[i]){
	            start++;
	        }
	    }
	    }
	    if(count == 0){
	        System.out.println(-1);
	    }else{
	        System.out.println(count);
	    }
	}
}
