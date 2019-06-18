import java.util.Scanner;
public class noofsetbits{
	public static void main(String[] args){
		int n;
		System.out.println("Enter the number in which you want to find out the number of set bits : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int count = 0;
		while(n>0){
			count++;
		    n = n & (n-1);
		}

		System.out.println("Hence the number of set bits in this number is "+ count);
	}
}