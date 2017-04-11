package pl.ulaulala.cms_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ulaulala.cms_backend.dto.AddressData;
import pl.ulaulala.cms_backend.entity.Address;
import pl.ulaulala.cms_backend.factory.AddressFactory;
import pl.ulaulala.cms_backend.repository.AddressRepository;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;
    private AddressFactory addressFactory;

    @Autowired
    public AddressService(AddressRepository addressRepository, AddressFactory addressFactory) {
        this.addressRepository = addressRepository;
        this.addressFactory = addressFactory;
    }

    public List<AddressData> findAll() {
        List<Address> addresses = addressRepository.findAll();
        return addressFactory.createList(addresses);
    }
}
