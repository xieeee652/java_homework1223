package commonsence;

public class Sample6_2 
{
	public static void main(String[] args)
	{
		Car3 car1 = new Car3("1����");
		car1.start();
		
		Car3 car2 = new Car3("2����");
		car2.start();
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}


class Car3 extends Thread
{
	private String name;
	
	public Car3(String nm)
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


