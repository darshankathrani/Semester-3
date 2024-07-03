import java.util.*;
public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert a Fahrenheit into Celsius : ");
        double f = sc.nextDouble();
        double c = (f-32)*5/9;
        System.out.println(c);
        sc.close();
    }
}