import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,n;
         base = sc.nextInt();
         n = sc.nextInt();
         int pwr = 1;
         while (n!=0){
             pwr = pwr*base;
             System.out.println(n);
             n--;
         }
         System.out.println(pwr);
         
     }
 }
//basw*n*n

