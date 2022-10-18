class Teacher
{
	String designation="Teacher";
	String collegeName="Beginnersbook";
	void does()
	{
		System.out.println("Teaching---------");
	}
}

class ComputerTeacher extends Teacher
{
	String subject="Telugu";
	void display()
	{
		System.out.println("Learning--------");
	}
}




public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ComputerTeacher ct=new ComputerTeacher();
  System.out.println(  ct.designation);
  System.out.println(  ct.subject);
    ct.does();
    ct.display();
	}

}
