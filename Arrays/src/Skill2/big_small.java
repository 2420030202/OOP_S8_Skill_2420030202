package Skill2;
import java.util.Scanner;
public class big_small {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int big=a[0],small=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>big) {
				big=a[i];
			}else if(a[i]<small){
				small=a[i];
			}
		}
		sc.close();
		System.out.println("Biggest: "+big);
		System.out.println("smallest: "+small);
	}
}