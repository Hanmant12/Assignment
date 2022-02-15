package mocking;

import java.util.Objects;

public class person {
	private long pid;
    private String name, address, phone;
    public person() {
    }
    public person(long pid, String name, String address, String phone) {
        this.pid = pid;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return pid == person.pid &&
                Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(phone, person.phone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pid, name, address, phone);
    }
    public long getPid() {
        return pid;
    }
    public void setPid(long pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}