package nl.yer.Relationships.Service;

import nl.yer.Relationships.Model.Address;
import nl.yer.Relationships.Model.Address2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Address2Service {

    List<Address2> address2 = new ArrayList<>(Arrays.asList(
            new Address2("Reiger",12),
            new Address2("Reiger",14),
            new Address2("Reiger",16))
    );

    public List<Address2> getAllAddress2() {
        return address2;
    }

    public Address2 getAddress2(int number) {
        return address2.stream().filter(a -> a.getNumber()==number).findFirst().get();
    }

    public void addAddress2(Address2 address2){
        this.address2.add(address2);
    }

    public void updateAddress2(Address2 address2, int number){
        for( int i = 0; i < this.address2.size(); i++){
            if (this.address2.get(i).getNumber()==number){
                this.address2.set(i,address2);
            }
        }
    }

    public void deleteAddress2(int number){
        address2.removeIf(a -> a.getNumber()==number);
    }

}
