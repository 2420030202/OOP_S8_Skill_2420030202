package Arrays;
import java.util.Scanner;
public class Bubble_sort {
      public static void Bubblesort(int a[], int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		Bubblesort(a,n);
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
	}
}
