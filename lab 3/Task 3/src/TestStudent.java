public class TestStudent {
    public static void main(String[] args) {


	Date d = new Date(12,2,2007);
	Student s  = new Student("Inaya", "Female",
              new Date(12,2,2007),
              new Address("House 45","Lahore","Pakistan"));

	Student s1 = new Student("Ali", "Male",
              new Date(5,3,2005),
              new Address("Street 12","Karachi","Pakistan"));

	Student s2 = new Student("Maria", "Female",
              new Date(7,7,2006),
              new Address("Block B","Islamabad","Pakistan"));

	Address a = new Address("House No. 45, Block A","PCSIR","Lahore");
	//can be written as new Date(1,2,3)
        //Student s2 = new Student(s); // copy constructor
	//s.setDateOfBirth(12,02,2007);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

	System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
	//System.out.println(d);
    }
}
