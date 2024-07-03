import java.util.*;
public class Lab_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Addtion");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Modulo");
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
       
        if (n<=5  && n>0) {
            
            System.out.println("Enter a : ");
            double a = sc.nextDouble();
            System.out.println("Enter b :");
            double b = sc.nextDouble();
    
            switch (n) {
                case 1:
                    double sum = a + b;
                    System.out.println("Addition ="+" "+sum); 
                    break;
                    
                case 2:
                    double sub = a - b;
                    System.out.println("Subtration ="+" "+sub); 
                    break;
    
                case 3:
                    double multiple = a * b;
                    System.out.println("Multiplication ="+" "+multiple); 
                    break;
    
                case 4:
                    double div = a / b;
                    System.out.println("Division ="+" "+div); 
                    break;
                
                case 5:
                    double modulo = a % b;
                    System.out.println("Modulo ="+" "+modulo); 
                    break;
            
                default:
                    break;
                    
            }

        }
        else{
            System.out.println("You enter wrong number , enter number betwen 1 to 5");
        }
        sc.close(); 
    }
}
