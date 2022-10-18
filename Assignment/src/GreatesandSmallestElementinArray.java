
public class GreatesandSmallestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {300,400,500,600,800};
    int max=a[0];
    int min=a[0];
    for(int i=1;i<a.length;i++)
    {
    	if(a[i]>max)
    	{
    		max=a[i];
    	}else if(a[i]<min) {
    		min=a[i];
    	}
    
    }
    System.out.println("Largest number is " +max);
    System.out.println("smallest number is " +min);
    
	}
}
