public class TestStudent {
    public static void main(String[] args) {

        Student s = new Student("Inaya", "Female", "Feb12", "Johar Town");
        Student s1 = new Student("Ali", "Male", "Mar10", "Model Town");
	Student s2 = new Student("Maria", "Female", "Mar22", "Model Town");
      //  Student s2 = new Student(s); // copy constructor


        System.out.println(s.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());

	System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
    }
}
