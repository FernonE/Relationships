package nl.yer.Relationships.Persistance;

import nl.yer.Relationships.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends CrudRepository <Address, Long> {

    Address findByAddress(String address);
}
