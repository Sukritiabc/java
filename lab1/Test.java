package week1;

public class Test {

	//a. Change Test to test.
		// Error: Could not find or load main class week1.Test 
		//Caused by: java.lang.NoClassDefFoundError: week1/test (wrong name: week1/Test)
	
	public static void main(String[] args) {
		
		System.out.println ("An Emergency Broadcast");
		//b. Change Emergency to emergency.

		// c. Remove the first quotation mark in the string.
			//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			//Syntax error, insert ")" to complete MethodInvocation
			//Syntax error, insert ";" to complete Statement
			//An cannot be resolved to a variable
			//emergency cannot be resolved to a type
			//Syntax error, insert ";" to complete LocalVariableDeclarationStatement
			//String literal is not properly closed by a double-quote
			//String literal is not properly closed by a double-quote

		System.out.println("An emergency Broadcast");

	}
}



// d. Changing main to man
	//Error: Main method not found in class week1.Test, please define the main method as:
	//public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application


//e. Change println to bogus.
	//System.out.bogus("An emergency Broadcast");
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//The method bogus(String) is undefined for the type PrintStream

//f.  Remove the semicolon at the end of the println statement.
	//System.out.println("An emergency Broadcast")
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//Syntax error, insert ";" to complete Statement


//g. Remove the last brace in the program.
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//Syntax error, insert "}" to complete ClassBody




