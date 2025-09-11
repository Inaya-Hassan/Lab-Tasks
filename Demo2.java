
public class Demo2 {
    public static void main(String[] args) {

        Student2 p = new Student2("Inaya", "inaya@gmail.com", 4.0);
        p.display();
        p.setName("Ahmad");
        p.setEmail("ahmad@gmail.com");
        p.setCgpa(3.8);

        System.out.println("\nAfter updating using setters:");
        p.display();
        System.out.println("\nJust printing using getters:");
        System.out.println("Name only: " + p.getName());
        System.out.println("CGPA only: " + p.getCgpa());
    }
}

