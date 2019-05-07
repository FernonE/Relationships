package nl.yer.Relationships.Model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    // fails with the exception that JPA does not know what type of column to create for Address? Clear??
    @OneToOne
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }
}