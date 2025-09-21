public class TestStudent {
    public static void main(String[] args) {


	Date d = new Date();
        Student s = new Student("Inaya", "Female", d, "Johar Town");
        Student s1 = new Student("Ali", "Male", d, "Model Town");
	Student s2 = new Student("Maria", "Female", d, "Model Town");
      //  Student s2 = new Student(s); // copy constructor


        System.out.println(s.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());

	System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
	//System.out.println(d);
    }
}
