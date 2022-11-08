package greetings;

public class HelloCS {
	
	 public static void main(String[] args) {
		  
		  String[] names = { "Java", "Javascript", "Python", "C#", "HTML" };
		  
		  //print greetings using author2

		  for (String name: names) {
		   System.out.format("Hello, %s!\n", name);
		   System.out.println("How are you going today?");
		   System.out.println("Hello Ha?");
		  }
	}
}
