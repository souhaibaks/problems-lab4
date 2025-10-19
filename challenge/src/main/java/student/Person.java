package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;
    }
    //no args constructor
    public Person(){
        this.id = nextId++;
    };
    //Getters ans Setters

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String toString() {
        return getSecondName()+" "+getFirstName();
    }
}

