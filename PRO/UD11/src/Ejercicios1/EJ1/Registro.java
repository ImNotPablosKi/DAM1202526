package Ejercicios1.EJ1;

import java.time.LocalDate;

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
    private LocalDate last_login;

    public Registro(int id, String firstName, String lastName, Double latitude, Double longitude, String domain, String email, String country, String ip_address, LocalDate last_login) {
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

}
