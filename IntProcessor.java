
public class IntProcessor 
{

	private int myInt;
	
	public IntProcessor(int i)
	{
		myInt = i;
	}
	
	public void displayInt() throws TooSmall
	{
		if (myInt < 50)
		{
			throw new TooSmall("Int is too small.");
		}
		System.out.println("Integer value: " + myInt);
		
	}
	
}
