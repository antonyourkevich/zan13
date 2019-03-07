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
			System.out.println("делить на ноль нельз€");
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("ну иногда можно ");
		}
		
		
	}
	
	
	public void method2()
	{

		int c = age/0 * 0 ;
		
		try {
			System.out.println("ƒ≈Ћ»“№ Ќј ЌќЋ№ Ќ≈Ћ№«я ))");
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("ну иногда все-таки можно ");
		}
		catch (Exception e)
		{
			System.out.println("ну иногда все-таки можно ");
		}
		
		
		
		
		
	}
	
	
	public void method3()
	{
		int o= age/zero;
		
		try {
			System.out.println("оо что-то новенькое))");
			
		}
		catch (NumberFormatException | ArithmeticException aex)
		{
			System.out.println("а не-не все норм ");
		}
		
	}
	
	
	public void method4()
	{
		
		try {
			System.out.println("оо что-то новенькое))");
			
		}
		catch (NumberFormatException | ArithmeticException aex)
		{
			System.out.println("а не-не все норм ");
		}
		
		
		finally {
			
			   System.out.println("finally block executed"); 
		    
		}
		
	}
	
	
}
