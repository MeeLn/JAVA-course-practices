package Std;
public class Address{
	private String city,street;
	private int ward;
	public Address(String city, String street, int ward){
		this.city = city;
		this.street = street;
		this.ward = ward;
	}
	public String toString(){
		return "City:-"+this.city+"Street:-"+this.street+"Ward:-"+this.ward;
	}
}