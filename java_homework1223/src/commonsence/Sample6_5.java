package commonsence;

public class Sample6_5 
{
	public static void main(String[] args)
	{
		Car6 car1 = new Car6("1����");
		car1.start();
				
			try
			{
				car1.join();
			}
			catch(InterruptedException e)
			{	
			}
			System.out.println("����main()���B�z�u�@");
			
		}
}



class Car6 extends Thread
{
	private String name;
	
	public Car6(String nm)
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


