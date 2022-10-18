
public class Student {
	int sid;
	String Sname;
	int sub1;
	int sub2;
	int sub3;
	public void getStuData(int id,String name)
	{
		id=sid;
		name=Sname;
		
		
	}
	public void getStuMarks(int suba,int subb,int subc)
	{
		suba=sub1;
		subb=sub2;
		subc=sub3;
	}
	public void getTotalMarks(int sid,int sub1,int sub2,int sub3)
	{
		System.out.println(sub1+sub2+sub3);
		System.out.println(sid);
		
	}
	public String getTotalMarks1(String Sname)
	{
		return Sname;
	}
	public static void main(String args[])
	{
		Student std=new Student();
		std.getTotalMarks(100,200,400,5);
		System.out.println(std.getTotalMarks1("Ravi"));
		
		
	}
}
	