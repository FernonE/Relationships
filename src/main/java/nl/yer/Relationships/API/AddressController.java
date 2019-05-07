package nl.yer.Relationships.API;

import nl.yer.Relationships.Service.AddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/address")
public class AddressController {

    private AddressService addressService;
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }
}
