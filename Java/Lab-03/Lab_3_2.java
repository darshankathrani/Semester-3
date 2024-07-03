import java.util.Scanner;
public class Lab_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if (n>0) {
            System.out.println("Number"+ " " + n +" " + "is Positive");
        }

        else if(n==0){
            System.out.println("Number"+ " " + n +" " + "is Zero(0)");
        } 

        else{
            System.out.println("Number"+ " " + n +" " + "is Negative");
        }
        sc.close();
    }
    
}
