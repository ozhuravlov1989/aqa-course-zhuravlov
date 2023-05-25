package OOP;

public class Address {

    private static int id = 1;
    private String country;
    private String city;
    private String street;
    private String building;
    private String room;
    private String zipCode;

    public Address(String country, String city, String street, String building, String zipCode) {

        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
        id += 1;
    }

    public static int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
