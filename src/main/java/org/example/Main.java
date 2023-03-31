package org.example;

public class Main {
    private int id;
    private String Sname;
    private String Address;
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        System.out.println("Setter method is used");
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setter method is used");
        this.id = id;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        System.out.println("Setter method is used");
        Sname = sname;
    }

    public Main(int id, String sname, String address) {
        this.id = id;
        Sname = sname;
        Address = address;
    }

    public Main(){
        super();
}
    @Override
    public String toString() {
        return "Main{" +
                "id=" + id +
                ", Sname='" + Sname + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}