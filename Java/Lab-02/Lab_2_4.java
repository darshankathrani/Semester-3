import java.util.Scanner;
public class Lab_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight");
        double weight = sc.nextDouble();
        System.out.println("Enter Your Height");
        double height = sc.nextDouble();
        double BMI = weight*0.45359237 / (height*0.0254*height*0.0254);
        System.out.println(BMI);
        sc.close();
    }
}
