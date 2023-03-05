package exercises;
import java.util.Scanner;

public class VanyaandFence2 {

	public static void main(String[] args) {
	 
		Scanner sc =new Scanner(System.in); 
		int n = sc.nextInt(); 
		int h = sc.nextInt();
		int [] a = new int[n]; 
		
		int sum = 0; 
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
			sum+=(a[i]>=h) ? 2:1;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

}
