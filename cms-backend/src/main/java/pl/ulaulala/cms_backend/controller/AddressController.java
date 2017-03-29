package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.entity.Address;
import pl.ulaulala.cms_backend.repository.AddressRepository;

import java.util.List;

@RestController("/address")
public class AddressController {

    private AddressRepository addressRepository;

    @Autowired
    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("/address")
    public List<Address> findAllAddresses() {
        return addressRepository.findAll();
    }
}
