package nl.yer.Relationships.Model;

import javax.persistence.*;

@Entity
public class Address {
    //http://springboot.carpago.nl/documentation.adoc/009-jpa-one-to-many.html

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String street;
    private int number;

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}