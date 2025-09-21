//default paramet and copy 
public class Student{

	private String id;
	private String name;
	private String gender;
	private Date dateOfBirth;
	private String address;
  	private static int counter = 0;

public Student(){
	counter++; 
        this.id = String.format("SP25-BCS- %03d",counter); 
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.dateOfBirth = dateOfBirth;
	this.address = address;

}

public Student(String name, String gender, Date dateOfBirth, String address){
 	counter++;
        this.id = String.format("SP25-BCS- %03d",counter);
	//this.id = id;
	this.name = name;
	this.gender = gender;
	this.dateOfBirth = dateOfBirth;
	this.address = address;

}

public Student (Student s){
	this.id = s.getId();
	this.name = s.getName();
	this.gender = s.getGender();
	this.dateOfBirth = s.getDateOfBirth();
	this.address = s.getAddress();

}

//set 
public void setId(String id){
	this.id = id;
}

public void setName(String name){
	this.name = name;
}

public void setGender(String gender){
	this.gender = gender;
}

public void setDateOfBirth(Date dateOfBirth){
	this.dateOfBirth = dateOfBirth;
}

public void setAddress(String address){
	this.address = address;
}

//GET
public String getId(){
	return id;
}


public String getName(){
	return name;
}

public String getGender(){
	return gender;
}

public Date getDateOfBirth(){
	return dateOfBirth;
}

public String getAddress(){
	return address;
}
@Override 
public String toString(){
	return String.format("Id:%5s  | Name: %5s | Gender: %6s | Date Of Birth: %7s | Address: %7s", id, name, gender, dateOfBirth, address);
}
//.equal()
public boolean equals(Object other){
	Student s = (Student) other;
	return this.id.equals(s.id);
}


}


