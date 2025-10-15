public class Demo3 {
    public static void main(String[] args) {

        Employee p = new Employee("Inaya", 1234, 90000.0, "Bahria Town");
        p.display();
        p.setName("Ahmad");
        p.setSsn(9987);
        p.setBasicSalary(70000.0);
	p.setAddress("Model Town");

        System.out.println("\nAfter updating using setters:");
        p.display();
        System.out.println("\nJust printing using getters:");
        System.out.println("Name only: " + p.getName());
        System.out.println("Ssn only: " + p.getSsn());
    }
}