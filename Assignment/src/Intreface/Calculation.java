package Intreface;
interface I
{
	int a=100;
	int b=200;
	void add();
}

interface B
{
	int X=100;
	int y=400;
	void mull();
}






public class Calculation implements I,B 
{
	public void add()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public void mull()
	{
		System.out.println(X);
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculation cl=new Calculation();
    cl.add();
    cl.mull();
	}

}
