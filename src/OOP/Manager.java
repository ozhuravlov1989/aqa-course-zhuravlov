package OOP;

public class Manager extends User {

    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String firstName, String lastName, String email, String role, String position) {

        super(firstName, lastName, email, role);
        this.position = position;
        setManager(true);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public void printUserInfo() {
        System.out.print(
                "firstName='" + getFirstName() + '\'' + "\n" +
                "lastName='" + getLastName() + '\'' + "\n" +
                "fullName='" + getFullName() + '\'' + "\n" +
                "email='" + getEmail() + '\'' + "\n" +
                "phoneNumber='" + getPhoneNumber() + '\'' + "\n" +
                "billingAddress='" + getBillingAddress() + '\'' + "\n" +
                "deliveryAddress='" + getDeliveryAddress() + '\'' + "\n" +
                "role='" + getRole() + '\'' + "\n" +
                "position='" + position + '\'' + "\n" +
                "responsibilityDistrict='" + responsibilityDistrict + '\'' + "\n" +
                "workPhoneNumber='" + workPhoneNumber + '\''
        );
    }
}
