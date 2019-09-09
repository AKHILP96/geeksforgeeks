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
		    int[] a =new int[s.nextInt()];
		    for(int i=0;i<a.length;i++){
		        a[i]=s.nextInt();
		    }
		    Arrays.sort(a);
		    int n = s.nextInt();
		    System.out.println(a[n-1]);
		}
	}
}
