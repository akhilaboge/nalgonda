package Intreface;
interface A
{
	int a=10;
	int b=20;
	void sum();
}







public class ClassB implements A
{
	public void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassB cb=new ClassB();
    cb.sum();
	}

}
