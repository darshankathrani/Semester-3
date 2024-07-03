import java.util.Scanner; 
public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num 1");
        int n = sc.nextInt();
        System.out.println("Enter a Num 2");
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println(sum);
        sc.close();
    }
}