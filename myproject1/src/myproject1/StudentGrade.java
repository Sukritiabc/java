package myproject1;

public class StudentGrade {

	public static void main(String[] args) {
		 String[] names = {"Joe", "William", "Mary", "Emma", "Michael"};
	     int[] labPoints = {43, 50, 39, 48, 45};
	     int[] bonusPoints = {7, 8, 10, 6, 9};
	        
	     System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\");
	     System.out.println("==\t\tStudent Points\t\t==");
	     System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

	     System.out.println("Name\t\tLab\tBonus\tTotal");
	     System.out.println("----\t\t---\t-----\t-----");

	     for (int i = 0; i < names.length; i++) {
	    	 int totalPoints = labPoints[i] + bonusPoints[i];
	    	 System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + totalPoints);
	     }

	}
}
