import java.util.*;
public class Lab_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Char" + " " + ch +" " + "is Vowel");
        }
        else{
            System.out.println("Char" + " " + ch +" " + "is Con.");
        }
        System.out.println(ch);
        sc.close();
    }
}
