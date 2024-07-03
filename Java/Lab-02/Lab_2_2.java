import java.util.Scanner;
public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert a number meter into feet");
        int m = sc.nextInt();
        double feet = 3.2808*m;
        System.out.println(feet); 
        sc.close();
    }
}