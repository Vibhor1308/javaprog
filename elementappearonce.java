import java.util.Scanner;
public class elementappearonce{
	public static void main(String[] args){
		int n;
		System.out.println("Enter the number of elements in the array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0; i <n;++i){
			ar[i] = sc.nextInt();
		}
		int p = ar[0];
		for(int i =1;i<n;++i){
			p = p ^ ar[i];
		}

		System.out.println("The required number is " + p);
	}
}