package commonsence;

public class Sample6_6 
{
	public static void main(String[] args)
	{
		Car7 car1 = new Car7("1����");
		
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car7 implements Runnable
{
	private String name;
	
	public Car7(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("���b�i��" + name + "���B�z�u�@");		
		}
	}
}	


