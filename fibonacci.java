import java.util.Scanner;
public class fibonacci{
	static int fibo(int n){
		if(n==0 || n==1)
			return 1;
		else 
			return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the fibonacci number which you want to find out : ");
		n = sc.nextInt();
		int p = fibo(n);
		System.out.println("The required fibonacci number is " + p);
	}
}