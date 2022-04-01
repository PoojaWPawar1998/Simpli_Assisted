package LinearSearchDemo;

import java.util.Scanner;

public class LinearSearchInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {44,60,78,80,90};
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int Value = sc.nextInt();
        
        int temp=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]== Value) {
        		System.out.println("Item is Present at index position :"+i);
        		temp=temp + 1;
        	}
        }
        if(temp==0) {
        	System.out.println("Item is not found in list");
        }


	}

}
