package greetings;

public class HelloCS {
	
	 public static void main(String[] args) {
		  
		  String[] names = { "Java", "Javascript", "Python", "C#", "HTML" };
		  
		  //print greetings
		  for (int i = 0; i < names.length; i++) {
		   System.out.format("Hello, %s!\n", names[i]);
		  }
	}
}
