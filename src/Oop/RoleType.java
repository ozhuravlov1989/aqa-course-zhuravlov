package Oop;

public enum RoleType {

    ADMIN("Admin", true, true, true, true),
    MAIN_CUSTOMER("Main Customer", true, true, true, false),
    CUSTOMER("Customer", true, false, true, false),
    VIEWER("Viewer", true, false, false, false);

    String roleType;
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    RoleType(String roleName, boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.roleType = roleName;
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }

    public boolean viewAll() {
        return viewAll;
    }

    public boolean editAll() {
        return editAll;
    }

    public boolean addAll() {
        return addAll;
    }

    public boolean deleteAll() {
        return deleteAll;
    }
}