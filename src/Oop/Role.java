package Oop;

public class Role {

    private String type;
    private boolean viewALl;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public Role(String type) {

        this.type = type;
        switch (type) {
            case "Admin":
                this.viewALl = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = true;
                break;
            case "Main customer":
                this.viewALl = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = false;
                break;
            case "Customer":
                this.viewALl = true;
                this.editAll = false;
                this.addAll = true;
                this.deleteAll = false;
                break;
            case "Viewer":
                this.viewALl = true;
                this.editAll = false;
                this.addAll = false;
                this.deleteAll = false;
                break;
            default:
                throw new IllegalStateException("Unexpected Role value: " + type);
        }
    }

    @Override
    public String toString() {
        return '{' + "viewALl=" + viewALl +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                ", type='" + type + '\'' +
                '}';
    }
}
