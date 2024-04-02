package lab7;

public class HosEmployee {
	public static void main(String[] args) {
	        Doctor doctor = new Doctor("Dr. Smith", 1001, "Cardiology");
	        doctor.diagnose();

	        Nurse nurse = new Nurse("Nurse Johnson", 2001, 10);
	        nurse.assist();

	        Receptionist receptionist = new Receptionist("Receptionist Brown", 3001);
	        receptionist.answerPhone();

	        Cleaner cleaner = new Cleaner("Janitor White", 4001, "Emergency Department");
	        cleaner.clean();
	    }
	
}
