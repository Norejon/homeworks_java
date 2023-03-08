package part1;

import part1.Adress;
import part1.Company;
import part1.Geo;

public class User {
    private String name;
    private String username;
    private String email;
    private Adress adress;
    private Geo geo;
    private String phone;
    private String website;
    private Company company;

    public User(String name,String username,String email,Adress adress,double lat,double lng,String phone, String website, Company company){
        this.name = name;
        this.username = username;
        this.email = email;
        this.adress = adress;
        this.geo = new Geo(21.3,3.2);
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                ", geo=" + geo +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}


