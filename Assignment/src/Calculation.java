
public class Calculation {
	int a;
	int b;
	int c;
	public Calculation()
	{
		a=20;
		b=40;
		c=60;
	}
	public Calculation(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void Sum()
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.Sum();
		Calculation cal2=new Calculation(100,300,500);
		cal2.Sum();
		
	}

}
