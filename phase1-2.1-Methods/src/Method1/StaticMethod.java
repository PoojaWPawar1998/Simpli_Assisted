package Method1;

public class StaticMethod {
	
    public  static void addition (int a, int b)
    {
    	int z= a+b;
    	System.out.println("Addition of two number " +z);
    }
    
	public static void main(String[] args) {
		int a=8;
		int b=9;
		addition(a,b);
	}

}
