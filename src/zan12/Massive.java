package zan12;

public class Massive {
	
	
	int km = 1 ;
	int age = 19 ;
	public String name;
	public String surname;
	int zero=77777;
	
	
	

	public void method1()
	{
		
		int b = km/0;
		
		try {
			System.out.println("������ �� ���� ������");
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("�� ������ ����� ");
		}
		
		
	}
	
	
	public void method2()
	{

		int c = age/0 * 0 ;
		
		try {
			System.out.println("������ �� ���� ������ ))");
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("�� ������ ���-���� ����� ");
		}
		catch (Exception e)
		{
			System.out.println("�� ������ ���-���� ����� ");
		}
		
		
		
		
		
	}
	
	
	public void method3()
	{
		int o= age/zero;
		
		try {
			System.out.println("�� ���-�� ���������))");
			
		}
		catch (NumberFormatException | ArithmeticException aex)
		{
			System.out.println("� ��-�� ��� ���� ");
		}
		
	}
	
	
	public void method4()
	{
		
		try {
			System.out.println("�� ���-�� ���������))");
			
		}
		catch (NumberFormatException | ArithmeticException aex)
		{
			System.out.println("� ��-�� ��� ���� ");
		}
		
		
		finally {
			
			   System.out.println("finally block executed"); 
		    
		}
		
	}
	
	
}
