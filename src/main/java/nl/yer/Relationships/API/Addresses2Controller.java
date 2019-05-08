package nl.yer.Relationships.API;

import nl.yer.Relationships.Model.Address;
import nl.yer.Relationships.Model.Address2;
import nl.yer.Relationships.Service.Address2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Addresses2Controller {

    @Autowired
    private Address2Service address2Service;

    @RequestMapping("/address2")
    public List<Address2> getAllAddress2() {
        return address2Service.getAllAddress2();
    }

    @RequestMapping("/address2/{number}")
    public Address2 getAddress2(@PathVariable int number){
        return address2Service.getAddress2(number);
    }

    @PostMapping("/address2")
    public void addAddress2(@RequestBody Address2 address2){
        address2Service.addAddress2(address2);
    }

    @PutMapping("/address2/{number}")
    public void updateAddress2(@RequestBody Address2 address2, @PathVariable int number){
        address2Service.updateAddress2(address2,number);
    }

    @DeleteMapping("/address2/{number}")
    public void deleteAddress2(@PathVariable int number){
        address2Service.deleteAddress2(number);
    }
}
