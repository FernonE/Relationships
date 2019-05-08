package nl.yer.Relationships.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String street;
    private int number;


    public Address2(){}

    public Address2(String street,int number){
        super();
        this.street = street;
        this.number = number;
    }

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
