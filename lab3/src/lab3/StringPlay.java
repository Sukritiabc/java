package lab3;

public class StringPlay {

	public static void main(String[] args) {
		String college = new String ("Leeds Beckett University");

	      String town = " Leeds0UK"; // (a)

	      int stringLength;
	      String change1, change2, change3; 

	      stringLength = college.length(); // (b)

	      System.out.println (college + " contains " + stringLength + " characters.");

	      change1 = college.toUpperCase(); // (c)

	      change2 = change1.replace('e', '*'); // (d)

	      change3 = college.concat(town); // (e)

	      System.out.println ("The final string is " + change3);

	}

}
