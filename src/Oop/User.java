package Oop;

import java.util.ArrayList;

public class User {

    private static int id = 1;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Cards> cards = new ArrayList<>();
    private Role role;
    private boolean manager;

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = new Role(role);
        this.fullName = firstName + " " + lastName;
        id += 1;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneException {

        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new PhoneException("Phone number should start with '+' symbol");
        }
    }

    public void setBillingAddress(String country, String city, String street, String building, String zipCode) {
        this.billingAddress = new Address(country, city, street, building, zipCode);
    }

    public void setDeliveryAddress(String country, String city, String street, String building, String zipCode) {
        this.billingAddress = new Address(country, city, street, building, zipCode);
    }

    public void setCards(String number, String expireDate, String cvv, String cardType) {
        this.cards.add(new Cards(number, expireDate, cvv, cardType));
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    public boolean getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", cards='" + cards + '\'' +
                ", role='" + role + '\'' +
                ", manager=" + manager +
                '}';
    }

    public void printUserInfo() {
        System.out.print(
                "firstName='" + firstName + '\'' + "\n" +
                        "lastName='" + lastName + '\'' + "\n" +
                        "fullName='" + fullName + '\'' + "\n" +
                        "email='" + email + '\'' + "\n" +
                        "phoneNumber='" + phoneNumber + '\'' + "\n" +
                        "billingAddress='" + billingAddress + '\'' + "\n" +
                        "deliveryAddress='" + deliveryAddress + '\'' + "\n" +
                        "role='" + role + '\''
        );
    }
}
