package Array;

public class array {

public static void main(String[] args) {

//single-dimensional array
int x[]= {34,45,55,60,90};
for(int i=0;i<5;i++) {
System.out.println("Elements of array x: "+x[i]);
}


//multidimensional array
int[][] b = {
            {1, 4, 6, 8}, 
            {3, 6, 9} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}
