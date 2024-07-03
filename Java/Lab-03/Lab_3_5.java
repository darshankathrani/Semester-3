import java.util.*;
public class Lab_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Sub");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Sub");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Sub");
        int c = sc.nextInt();
        System.out.println("Enter 4th Sub");
        int d = sc.nextInt();
        System.out.println("Enter 5th Sub");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        double per = (sum/5.0);

        System.out.println("Percentage = "+ per);

        if (per>70) {
            System.out.println("Class : Distinction");
        }

        else if(per<=60 && per>70){
            System.out.println("Class : First Class");
        }

        else if(per<60 && per>=45){
            System.out.println("Class : Second Class");
        }

        else if (per<45 && per>35){
            System.out.println("Class : Pass Class");
        }

        else{
            System.out.println("Class : Fail Class");
        }
        sc.close();

    }
}