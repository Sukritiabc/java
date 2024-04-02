package lab7;

class Doctor extends Employee {
    private String specialism;

    // Constructor
    public Doctor(String name, int employeeNumber, String specialism) {
        super(name, employeeNumber);
        this.specialism = specialism;
    }

    // Method to print doctor's specialization
    public void diagnose() {
        System.out.println("Doctor " + getName() + " Emp# " + getEmployeeNumber() + " specializes in " + specialism);
    }
}
