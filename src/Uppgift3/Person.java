package Uppgift3;

public class Person {

    private String birthDate;
    private String name;
    private String streetAdress;
    private String zipCode;
    private String city;
    public Person(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getName(){
        return name;
    }
    public String getStreetAdress(){
        return streetAdress;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
}




