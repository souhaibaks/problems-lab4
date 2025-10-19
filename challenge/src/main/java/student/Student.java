package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email); //calls the Person constructor
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email,cne,Major.getDefaultMajor()); //calls the previous constructor
    }

    // Getters

    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }
    // Setters


    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return getId()+". "+cne+" "+super.toString();
    }
    public String getFullNameFormatted() {
        return String.format("%s, %s", getSecondName().toUpperCase(), getFirstName());
    }
}

