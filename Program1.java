import java.util.Scanner;
 
public class Program1
{
 
    public static void main(String[] args) {
 
    	double a,b,result;  
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number value:");
        a = s.nextDouble(); 
        System.out.print("Enter second number value:");
        b = s.nextDouble();
 
        System.out.print("Enter any operator (+, -, *, /): ");
        char opt = s.next().charAt(0); 
 
        switch(opt) 
        {
            case '+':
            	result = a + b;
                break;   
 
            case '-':
            	result =a - b; 
                break; 
 
            case '*':
            	result = a * b;
                break; 
 
            case '/':
            	result = a / b;
                break; 
 
                default: 
                System.out.printf("You have entered wrong operator or value");
                return;
        }
 
        System.out.println(a+" "+opt+" "+b+": "+result);
    }
}