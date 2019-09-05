/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int tests = 0;
		Scanner s = new Scanner(System.in);
	    tests = s.nextInt();
	    while(tests-->0){
	        int[] a = new int[s.nextInt()];
	        for(int i = 0;i<a.length;i++){
	            a[i] = s.nextInt();
	        }
	        compute(a);
	    }
	}
	
	public static void compute(int[] a){
	    int count = 1;
	    int element = a[0];
	    for(int i=1;i<a.length;i++){
	        if(a[i] == element){
	            count++;
	          //  System.out.println(true);
	        }else{
	       if(count == 0){
	               element = a[i];
	        }else{
	            count--;
	        }
	        }
	    }
	    int finalcount = 0;
	   // System.out.println("count->"+count);
	    if(count>0){
	        for(int j=0;j<a.length;j++){
	            if(a[j] == element){
	                finalcount++;
	            }
	        }
	        if(finalcount>(a.length/2)){
	            System.out.println(element);
	        }else{
	            System.out.println(-1);
	        }
	       // System.out.println(count);
	    }else{
	        System.out.println(-1);
	    }
	    }
	    
	

}
