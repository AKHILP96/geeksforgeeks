/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int tests = s.nextInt();
		while(tests-->0){
		    int[] a = new int[s.nextInt()];
		    for(int i=a.length-1;i>=0;i--){
		        a[i] = s.nextInt();
		    }
		    for(int i=0;i<a.length;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}
}
