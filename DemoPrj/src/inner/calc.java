package inner;

public class calc {
	public static void add(int x,int y)

	{

	System.out.println("The addition of "+x+" and "+y+" is "+(x+y));

	}

	public void sub(int x,int y)

	{

	System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));

	}

	public int mul(int x,int y)

	{

	return(x*y);

	}

	public static void main(String[] args) {
		calc.add(22,33);

		calc c=new calc();

		c.sub(33,11);

		System.out.println(c.mul(22, 2));	

	}

}
