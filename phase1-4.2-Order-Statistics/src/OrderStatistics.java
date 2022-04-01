
import java.util.Arrays;
public class OrderStatistics {
	public static void main(String args[]) {
		int[] arr= {33,5,7,78,55,2,1};
		
		int result= OrderStatistics.kthSmallestElement(arr,4);
		System.out.println("result :"+result);
	}
     static int kthSmallestElement(int[] arr, int k) {
    	 Arrays.sort(arr);
    	 return arr[k-1];
     }
}
