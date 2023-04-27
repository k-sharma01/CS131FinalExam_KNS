
public class Violin extends Instrument implements Playable
{

	private String material;
	private int numStrings;
	
	public Violin(double w, String m, int num)
	{
		super(w);
		material = m;
		numStrings = num;
	}
	
	public void printDetails()
	{
		System.out.println("Weight: " + weight +" Material: " + material + "Number of Strings: " + numStrings);
	}
	
	public void play()
	{
		System.out.println("The violin is playing.");
	}
	
}
