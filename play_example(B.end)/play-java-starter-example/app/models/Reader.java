package models;

public class Reader {
    private String name;
    private int id;
    private String mobile;
    private String email;


    public Reader(String name, int id, String mobile, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name  - " + name + "\nid  - " + getId() + "\nMobile - " + getMobile() + "email - " + getEmail();
    }
}

