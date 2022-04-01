import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter value of l:");
			int l = sc.nextInt();
			
			System.out.println("Please enter value of r:");
			int r = sc.nextInt();
			
			System.out.println("Result:"+ArrayDemo2.sumRange(arr, l, r));
		}
			
	}
	
	public static int sumRange(int[] arr, int l, int j) {
		int sum=0;
		for(int i= l; i<= j; i++) {
			
			sum += arr[i];
		}
			return sum;	 
	}

}
