package commonsence;

public class Sample5_3 
{
	public static void main(String[] args)
	{
		try
		{
			int[] test = new int[5];
			System.out.println("�N�ȫ��w��test[10]");
			
			test[10] = 80;
			System.out.println("�N80���w��test[10]");		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�W�X�}�C���d��F");
		}
		finally
		{
			System.out.println("�̫�@�w�|����o�ӳB�z");	
		}
		
		System.out.println("���Q�����槹���F");	
	}
}