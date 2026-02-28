package Pruebas.Sufrida;

import java.time.LocalDateTime;

public class Registro {

    private int id;
    private String firstName;
    private String lastName;
    private Double latitude;
    private Double longitude;
    private String domain;
    private String email;
    private String country;
    private String ip_address;
    private LocalDateTime last_login;

    public Registro() {
    }

    public Registro(int id, String firstName, String lastName, Double latitude, Double longitude, String domain, String email, String country, String ip_address, LocalDateTime last_login) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.domain = domain;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
        this.last_login = last_login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public LocalDateTime getLast_login() {
        return last_login;
    }

    public void setLast_login(LocalDateTime last_login) {
        this.last_login = last_login;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", domain='" + domain + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", last_login=" + last_login +
                '}';
    }
}
