import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        if ((k % n == 0 && k / n < m) || (k % m == 0 && k / m < n)){
            System.out.println("YES");
        }    
        else{
            System.out.println("NO");
        }    
    }
}
