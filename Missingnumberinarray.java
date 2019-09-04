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
		    int n = s.nextInt();
		    int[] a = new int[n];
		    int sum2 = 0;
		    for(int i=0;i<a.length-1;i++){
		        a[i] = s.nextInt();
		        sum2 = sum2 + a[i];
		  //      System.out.println(sum2);
		    }
		    int sum1 = n*(n+1)/2;
		    //System.out.println(sum1);
		    System.out.println(sum1-sum2);
		}
	}
}
