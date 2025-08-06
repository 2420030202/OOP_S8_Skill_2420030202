package Arrays;
import java.util.Scanner;
public class Avg_value_of_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		sc.close();
		double avg=sum/n;
		System.out.println("sum: "+sum);
		System.out.println("Average: "+avg);
	}
}