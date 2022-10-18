
public class MethodOverloading {
	int sum(int x,int y)
	{
		return x+y;
	}
	int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	double sum(double x,double y)
	{
		return x+y;
	}
	double sum(double x,double y,double z)
	{
		return x+y+z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.sum(10,20));
		System.out.println(mo.sum(10,20,30));
		System.out.println(mo.sum(10.5,20.9));
		System.out.println(mo.sum(10.9,20.5,30.6));

	}

}
