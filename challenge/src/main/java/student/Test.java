package student;

public class Test {
    public static void main(String[] args) {
        // Create majors using the constructor
        Major cs = Major.getDefaultMajor();
        Major math = new Major("45", "Mathematics");
        Major physics = new Major("12", "Physics");

        // Create some students associated with these majors
        Student s1 = new Student("SAFI", "Amal", "0611111111", "amal.safi@example.com", "22885676"); // default CS
        Student s2 = new Student("ALAMI", "Samir", "0622222222", "samir.alami@example.com", "23585976", cs);
        Student s3 = new Student("Mohamed", "Souhaib", "0612345678", "mohamed@example.com", "CNE001", math);
        Student s4 = new Student("Ali", "Aks", "0623456789", "ali@example.com", "CNE002", physics);

        // Display all computer science students using getFullNameFormatted
        System.out.println("Computer Science Students:");
        for (int i = 0; i < cs.getStudentCount(); i++) {
            System.out.println((i + 1) + ". " + cs.getStudents()[i].getFullNameFormatted()
                    + " (" + cs.getStudents()[i].getCne() + ")");
        }

        // Display occupancy rate
        System.out.println();
        cs.getOccupancyRate();

        // Find a student by CNE
        String searchCNE = "23585976";
        Student found = cs.findStudentByCNE(searchCNE);
        if (found != null) {
            System.out.println("\nStudent found by CNE " + searchCNE + ": " + found.getFullNameFormatted());
        } else {
            System.out.println("\nStudent with CNE " + searchCNE + " not found.");
        }

        // Remove a student by CNE
        String removeCNE = "22885676";
        boolean removed = cs.removeStudent(removeCNE);
        System.out.println("\nRemoving student with CNE " + removeCNE + ": " + (removed ? "Success" : "Failed"));

        // Display updated list
        System.out.println("\nUpdated Computer Science Students:");
        for (int i = 0; i < cs.getStudentCount(); i++) {
            System.out.println((i + 1) + ". " + cs.getStudents()[i].getFullNameFormatted()
                    + " (" + cs.getStudents()[i].getCne() + ")");
        }

        // Display updated occupancy rate
        System.out.println();
        cs.getOccupancyRate();

        // Display student count
        System.out.println("\nTotal CS Students: " + cs.getStudentCount());
    }
}
