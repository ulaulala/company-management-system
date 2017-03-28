package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.entity.Addresses;
import pl.ulaulala.cms_backend.repository.AddressesRepository;

import java.util.List;

@RestController("/addresses")
public class AddressesController {

    private AddressesRepository addressesRepository;

    @Autowired
    public AddressesController(AddressesRepository addressesRepository) {
        this.addressesRepository = addressesRepository;
    }

    @GetMapping
    public List<Addresses> findAllAddresses(){
        return addressesRepository.findAll();
    }
}
