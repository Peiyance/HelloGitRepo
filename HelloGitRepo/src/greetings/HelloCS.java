package greetings;

public class HelloCS {
	
	public static void main(String[] args) {
		  
		  String[] names = { "Java", "Javascript", "Python", "C#", "HTML" };
		  
		  //print greetings
		  for (String name: names) {
		   System.out.format("Hello, %s!\n", name);
		  }
		  //it should be okay
	}
}
