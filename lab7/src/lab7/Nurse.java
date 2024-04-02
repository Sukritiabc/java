package lab7;

class Nurse extends Employee {
    private int numberOfPatients;

    // Constructor
    public Nurse(String name, int employeeNumber, int numberOfPatients) {
        super(name, employeeNumber);
        this.numberOfPatients = numberOfPatients;
    }

    public void assist() {
        System.out.println("Nurse " + getName() + " Emp# " + getEmployeeNumber() + " has " + numberOfPatients + " patients");
    }
}

class Receptionist extends Employee {
    // Constructor
    public Receptionist(String name, int employeeNumber) {
        super(name, employeeNumber);
    }

    public void answerPhone() {
        System.out.println("Receptionist " + getName() + " Emp# " + getEmployeeNumber() + " is answering phone calls");
    }
}