package net.practice_mvc.Thymeleaf_tutorial.model;

public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String profession;
    private Boolean married;
    private String address;

    public UserForm(){
        super();
    }

    public UserForm(String name, String email, String password, String gender, String profession, Boolean married, String address) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.profession = profession;
        this.married = married;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", profession='" + profession + '\'' +
                ", married=" + married +
                ", address='" + address + '\'' +
                '}';
    }
}
