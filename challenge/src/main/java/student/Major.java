package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    private static Major defaultCS;
    private static int MAX_STUDENTS=50;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code=code;
        this.name=name;
    }
    //no args constructor
    public Major(){
        this.id = nextId++;
    };
    public static Major getDefaultMajor() {
        if (defaultCS == null) {
            defaultCS = new Major("23", "Computer Science");
        }
        return defaultCS;
    }
    // Method to add a student
    public void addStudent(Student s) {
        if (getStudentCount() < MAX_STUDENTS) {
            Student[] newArr = new Student[studentCount + 1];
            for (int i = 0; i < studentCount; i++) {
                newArr[i] = students[i];
            }
            newArr[studentCount] = s;
            students = newArr;
            studentCount++;
        }
    }


    // Getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getCode() {
        return code;
    }

    public Student[] getStudents() {
        return students;
    }
    //Setters:
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    // Display all students in the major
    public void displayStudents() {
        System.out.println("Students that are in the major "+getName());
        for (int i=0;i<studentCount;i++){
            System.out.println(students[i].toString());
        }
    }
    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                return students[i]; // Student found
            }
        }
        return null; //Not found
    }
    public boolean removeStudent(String cne) {
        Student s = findStudentByCNE(cne);
        if (s == null) {
            return false;
        }

        for (int i = 0; i < studentCount; i++) {
            if (students[i] == s) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                return true;
            }
        }
        return false;
    }
    public void getOccupancyRate() {
        System.out.println(name + " capacity: " + MAX_STUDENTS + " students");
        System.out.println("Current enrollment: " + studentCount + " students");
        double rate = ((double) studentCount / MAX_STUDENTS) * 100;
        System.out.println("Occupancy rate = "+rate+"%");
    }
    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The list of students in the ").append(name).append(" major is:\n");
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            sb.append(i + 1)
                    .append(". ")
                    .append(s.getCne())
                    .append(" ")
                    .append(s.getSecondName().toUpperCase())
                    .append(" ")
                    .append(s.getFirstName())
                    .append("\n");
        }
        return sb.toString();
    }



}
