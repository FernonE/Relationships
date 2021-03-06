package nl.yer.Relationships.API;

import nl.yer.Relationships.Model.Address;
import nl.yer.Relationships.Service.AddressService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/address")
public class AddressController {


    private AddressService addressService;
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping
    public Iterable<Address> list() {
        return this.addressService.findAll();
    }

    @PostMapping
    public Address create(@RequestBody Address address){
        return this.addressService.save(address);
    }
}
