
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,8,43,61,88,22,30,9};
		System.out.print("Before selectionSort : ");
		
		for(int element:a) {
		System.out.print(element+" ");
		}
		System.out.println();
		
		int min,temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[min]) {
					min=j;
				}
			}
			temp= a[i];
			a[i]= a[min];
			a[min]= temp;
		}
		System.out.print("After SelectionSort : ");
		for(int i=0;i<a.length;i++) {
	
			System.out.print(a[i]+" ");
		}

	}

}
