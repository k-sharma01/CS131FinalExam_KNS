public class Application 
{

	public static void main(String[] args) 
	{

		 Instrument myInstrument = new Instrument(65.5);
		 myInstrument.printDetails();
		 
		 Violin myViolin = new Violin(45, "Oak", 5);
		 myViolin.printDetails();
		 
		 myInstrument = new Violin(55, "Elm", 6);
		 myInstrument.printDetails();
		 
		 Playable violinTwo = new Violin(70, "Balsa" , 8);
		 violinTwo.play();
		 
		 GenericExample<Character> myExample = new GenericExample('t' , "Character");
		 System.out.println(myExample.getData());
		
		 GenericExample<String> myExample2 = new GenericExample("This is a string" , "String");
		 System.out.println(myExample2.getData());

		 
		 IntProcessor myProcessor = new IntProcessor(60);
		 try
		 {
			 myProcessor.displayInt();
		 }
		 catch (TooSmall ts)
		 {
			 System.out.println("There was an error.");
		 }
		 finally
		 {
			 System.out.println("Finally block.");
		 }
		 
	}

}
