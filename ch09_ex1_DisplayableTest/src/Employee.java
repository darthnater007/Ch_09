public class Employee implements DepartmentConstants, Displayable {

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }

	@Override
	public String toString() {
		String dept = "unknown";
		if (department == ADMIN) dept = "admin";
		else if (department == EDITORIAL) dept = "editorial";
		else if (department == MARKETING) dept = "marketing";
		else dept = "I am not working, and you suck at programming.";
		return "  Employee: " + firstName + " " + lastName + "\n"
			 + "Department: " + dept;
	}
}