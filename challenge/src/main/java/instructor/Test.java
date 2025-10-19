package instructor;

public class Test {
    public static void main(String[] args) {
        // Create instructor
        Instructor instr = new Instructor();
        instr.setEmployeeNumber(" AB 123 ");
        instr.setFirstName("Amal");
        instr.setSecondName("Safi");
        instr.setEmail("amal@example.com");
        instr.setPhone("0612345678");

        // Test Instructor methods
        System.out.println("=== Instructor Methods ===");
        System.out.println("Clean Employee Number: " + instr.cleanEmployeeNumber());
        System.out.println("Summary Line: " + instr.summaryLine());
        System.out.println("Display Name: " + instr.displayName());
        System.out.println("Instructor Card:\n" + instr.toCard());

        // Create subject
        Subject subj = new Subject();
        subj.setCode(" cs-101 ");
        subj.setTitle("introduction to java");

        // Test Subject methods
        System.out.println("\n=== Subject Methods ===");
        System.out.println("Normalized Code: " + subj.normalizedCode());
        System.out.println("Proper Title: " + subj.properTitle());
        System.out.println("Is Intro Course: " + subj.isIntroCourse());
        System.out.println("Syllabus Line: " + subj.syllabusLine(instr));

        // Additional test with intro code format
        Subject subj2 = new Subject();
        subj2.setCode("INTRO-201");
        subj2.setTitle("advanced programming");
        System.out.println("\nSecond Subject Test:");
        System.out.println("Normalized Code: " + subj2.normalizedCode());
        System.out.println("Proper Title: " + subj2.properTitle());
        System.out.println("Is Intro Course: " + subj2.isIntroCourse());
        System.out.println("Syllabus Line: " + subj2.syllabusLine(instr));
    }

}
