public class Member {

    String name;
    String password;
    String resurs;
    String group;


    public Member(String name, String password, String resurs, String group) {
        this.name = name;
        this.password = password;
        this.resurs = resurs;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getResurs() {
        return resurs;
    }

    public void setResurs(String resurs) {
        this.resurs = resurs;
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
}













