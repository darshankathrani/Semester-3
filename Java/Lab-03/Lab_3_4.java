import java.util.*;
public class Lab_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("Largest is a " + " " + a);
            }
            else{
                System.out.println("Largest is b" + " " + c);
            }
        }

        else{
            if (b>c) {
                System.out.println("Largest is b" + " " + b);
            }

            else{
                System.out.println("Largest is c" + " " + c);
            }
        }
        sc.close();
    }
}
