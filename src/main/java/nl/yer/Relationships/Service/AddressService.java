package nl.yer.Relationships.Service;

import nl.yer.Relationships.Model.Address;
import nl.yer.Relationships.Persistance.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {


    private AddressRepository addressRepository;
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }



    public <S extends Address> S save(S s) {
        return addressRepository.save(s);
    }

    public Optional<Address> findById(Long aLong) {
        return addressRepository.findById(aLong);
    }

    public Iterable<Address> findAll() {
        return addressRepository.findAll();
    }

    public void deleteById(Long aLong) {
        addressRepository.deleteById(aLong);
    }
}
