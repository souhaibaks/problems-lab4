package instructor;

import student.Major;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    public Instructor(String nom, String prenom, String telephone, String email, String employeeNumber) {
        super(prenom, nom, telephone, email); //calls the Person constructor
        this.employeeNumber = employeeNumber;
    }

    public Instructor(){};
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String cleanEmployeeNumber() {
        return employeeNumber.trim().replaceAll("\\s+", "");
    }
    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                cleanEmployeeNumber(), getSecondName(), getFirstName());
    }
    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n")
                .append("----------\n")
                .append("Employee #: ").append(cleanEmployeeNumber()).append("\n")
                .append("Name      : ").append(getSecondName()).append(", ").append(getFirstName()).append("\n")
                .append("Email     : ").append(getEmail()).append("\n")
                .append("Phone     : ").append(getPhone()).append("\n");
        return sb.toString();
    }
    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (getSecondName() != null) sb.append(getSecondName());
        if (getFirstName() != null && !getFirstName().isEmpty()) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(getFirstName());
        }
        return sb.toString();
    }
}
