import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n*n][n*n];
        for(int i=0;i<n*n;i++){
            for(int j=0;j<n*n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int flag = 0;
        
        // check if the sum of all elements in the rows = n*n+1/2
        int sum = ((n*n)*((n*n)+1))/2;
       // System.out.println(sum);
        for(int i=0;i<n*n;i++){
            int temp = 0;
            for(int j=0;j<n*n;j++){
                temp += a[i][j];
            }
            if(temp!=sum){
                flag = 1;
      //          System.out.println("HERE1"+i);
                break;
            }
        }        
        // check the same for columns 
        for(int i=0;i<n*n;i++){
            int temp = 0;
            for(int j=0;j<n*n;j++){
                temp += a[j][i];
            }
            if(temp!=sum){
                flag = 1;
       //         System.out.println("HERE2"+i);
                break;
            }
        }
        //check for the each n*n squares
        for(int i=0;i<n*n;i+=n){
            for(int temp1=0;temp1<n*n;temp1+=n){
                for(int temp2=0;temp2<n*n;temp2+=n){
                    int count = 0;
                    for(int j=temp1;j<temp1+n;j++){
                        for(int k=temp2;k<temp2+n;k++){
                            count += a[j][k];
                        }
                    }
                    if(count != sum){
                        flag = 1;
       //                 System.out.println("HERE3"+temp2);
                        break;
                    }
                }
            }
        }
        if(flag==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        } 
    }
}
