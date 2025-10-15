public class Address {

	String street;
	String city;
	String country;

	//Address address;

    public Address(String street, String city, String country){
        this.street = street;
        this.city = city;
        this.country = country;
}

    @Override
    public String toString(){
        return street + ", " + city + ", " + country;
    }
}