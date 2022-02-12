import java.util.*;
class Program2
{
    static int fib(int n)
    {
        if (n <= 1)
            return n;
  
        return fib(n - 1)
            + fib(n - 2);
    }
  
    public static void main(String args[])
    {
        
		Scanner s = new Scanner(System.in);
		int N;
		System.out.println("Enter N:");
		N = s.nextInt();
        for (int i = 0; i < N; i++) {
  
            System.out.print(fib(i) + " ");
        }
    }
}