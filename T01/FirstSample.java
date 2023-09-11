public class FirstSample
{
	public void printStuff(String name) {
		String result = printFancyStuff(name);
		System.out.println(result); 
	}
	
	public String printFancyStuff(String name) {
		//prepend: hello world
		String fullString = String.format("Hello, World! %s", name);
		return fullString;
	}

	public static void main(String[] args) {
		FirstSample mySample = new FirstSample();
		mySample.printStuff("Java");
	}
}

	
