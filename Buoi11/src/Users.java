public class Users<compareTo> implements Comparable<Users> {
    private String name;
    private String password;
    private String email;
    private String phone;
    private String time;

    public Users(){}

    public Users(String name, String password, String email, String phone, String time) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  name + '|' + password + '|' +
                email + '|' + phone + '|' +
                time ;
    }
    @Override
    public int compareTo(Users o){
        return getName().compareTo(o.getName());
    }
}
