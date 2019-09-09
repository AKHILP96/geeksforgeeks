/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		while(tests-->0){
		    int[] a = new int[s.nextInt()];
		    int[] hr = new int[a.length];
		    int[] hl = new int[a.length];
		    int i = 0;
		    int count = 0 ;
		    for(i=0;i<a.length;i++){
		        a[i] = s.nextInt();
		    }
		    for(i=0;i<a.length;i++){
		        if(i==0){
		            hl[i] = a[i];
		        }else{
		            hl[i] = Math.max(a[i],hl[i-1]);
		        }
		    }
		    for(i=a.length-1;i>=0;i--){
		        if(i==a.length-1){
		            hr[i] = a[i];
		        }else{
		            hr[i] = Math.max(a[i],hr[i+1]);
		        }
		    }

		    for(i=0;i<a.length;i++){
		       count = count + Math.min(hl[i],hr[i])-a[i];
		    }
		    System.out.println(count);
		}
	}
}
