package Oop;

public class Role {

    RoleType roleType;

    public Role(String type) {
        switch (type) {
            case "Admin":
                this.roleType = RoleType.ADMIN;
                break;
            case "Main customer":
                this.roleType = RoleType.MAIN_CUSTOMER;
                break;
            case "Customer":
                this.roleType = RoleType.CUSTOMER;
                break;
            case "Viewer":
                this.roleType = RoleType.VIEWER;
                break;
            default:
                throw new IllegalStateException("Unexpected Role value: " + type);
        }
    }

    @Override
    public String toString() {
        return  "name=" + roleType.roleType +
                ", viewALl=" + roleType.viewAll() +
                ", editAll=" + roleType.editAll() +
                ", addAll=" + roleType.addAll() +
                ", deleteAll=" + roleType.deleteAll() +
                '}';
    }
}
