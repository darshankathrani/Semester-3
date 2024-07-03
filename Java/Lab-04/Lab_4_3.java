import java.util.*;
public class Lab_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Side : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Side : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Side : ");
        int c = sc.nextInt();

        if (a==b && b==c && c==a) {
            System.out.println("Equilateral Triangle");
        }

        else if (a==b || b==c || c==a ) {
            System.out.println("Isosceles Triangle");
        }

        else if ((a*a)+(b*b)==(c*c) ||
                 (a*a)+(c*c)==(b*b) ||
                 (c*c)+(b*b)==(a*a)) {
            System.out.println("Right Angle Triangle");
        }

        else {
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }    
}
