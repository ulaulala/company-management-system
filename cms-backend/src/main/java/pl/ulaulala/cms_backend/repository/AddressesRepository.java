package pl.ulaulala.cms_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ulaulala.cms_backend.entity.Addresses;

@Repository
public interface AddressesRepository extends JpaRepository<Addresses, Integer>{

}
