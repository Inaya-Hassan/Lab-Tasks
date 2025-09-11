public class Student2 {
    private String name;
    private String email;
    private double cgpa;

    public Student2(String name, String email, double cgpa) {
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Cgpa: " + cgpa);
    }
}
