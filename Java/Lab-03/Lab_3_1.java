import java.util.Scanner;
public class Lab_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num.");
        double r = sc.nextDouble();
        double dia = r/3.14;
        System.out.println(dia);
        sc.close();
    }
}
