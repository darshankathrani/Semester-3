import java.util.*;
public class Lab_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n % 2 == 0 && n % 3 != 0) {
            System.out.println("Number is divisible by 2 but not 3");
        }

        else{
            System.out.println("Number is incorrect given condition");
        }
        sc.close();
    }
}
