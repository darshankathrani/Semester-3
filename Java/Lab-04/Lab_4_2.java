import java.util.*;
public class Lab_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers of Calls : ");
        int call = sc.nextInt();

        if (call <= 100) {
            double bill = 200;
            System.out.println("Bill :"+ " "+bill);
        }

        else if (call <=150) {
            double bill = 200 + ( call-100)*0.60;
            System.out.println("Bill :"+ " "+bill);
        }

        else if(call <=200){
            double bill = 200 + 50*0.60 +(call-150)*0.50;
            System.out.println("Bill :"+" "+bill);
        }

        else if (call>200) {
            double bill = 200 + 50*0.60 + 50*0.50 + (call-200);
            System.out.println("Bill :"+" "+ bill);
        }

        else{
            System.out.println("Invalid");
        }
        
        

        sc.close();
    }
}
