import java.util.*;
public class Lab_5_4 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

         
        while (n!=0) {
            int rev = n % 10;
            n = n / 10;      
            System.out.println("Reverse ="+" "+rev);
      
        }
        sc.close();
    }
}