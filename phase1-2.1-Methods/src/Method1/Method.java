package Method1;

public class Method {

	public static void main(String[] args) {
	
		Method a = new Method();
		int ans= a.multiplynumber(10,3);
      System.out.println("Multiply of two number: "+ans);
	}
	public int multiplynumber(int a, int b)
	{
		int z=a*b;
		return z;
	}
}
