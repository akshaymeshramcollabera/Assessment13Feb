import java.util.Objects;

public class Employee {
    private Integer eid;
    private String name, phone, city;

    public Employee(Integer eid, String name, String phone, String city) {
        this.eid = eid;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public Employee() {
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(eid, employee.eid) && Objects.equals(name, employee.name) && Objects.equals(phone, employee.phone) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, name, phone, city);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
