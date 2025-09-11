public class Employee{
	private String name;
	private int ssn;
	private double basicSalary;
	private String address;

public Employee(String name, int ssn, double basicSalary, String address){
	this.name = name;
	this.ssn = ssn;
	this.basicSalary = basicSalary;
	this.address = address;
}

public String getName(){
	return name;
}

public int getSsn(){
	return ssn;
}

public double getBasicSalary(){
	return basicSalary;
}

public String getAddress(){
	return address;
}

public void setName(String name) {
        this.name = name;
}

public void setSsn(int ssn){
	this.ssn = ssn;
}

public void setBasicSalary(double basicSalary){
	this.basicSalary = basicSalary;
}

public void setAddress(String address){
	this.address = address;
}

public void display() {
        System.out.println("Name: " + name);
        System.out.println("Social Security No.: " + ssn);
        System.out.println("Basic Salary: " + basicSalary);
	System.out.println("Address: " + address);
    }
}


