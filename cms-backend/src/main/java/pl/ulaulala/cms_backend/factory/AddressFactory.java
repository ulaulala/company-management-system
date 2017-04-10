package pl.ulaulala.cms_backend.factory;

import org.springframework.stereotype.Component;
import pl.ulaulala.cms_backend.dto.AddressData;
import pl.ulaulala.cms_backend.entity.Address;

@Component
public class AddressFactory implements Factory<AddressData, Address> {

    @Override
    public AddressData create(Address address) {
        if (address == null) {
            return null;
        }

        AddressData dto = new AddressData();

        dto.setHome(address.getHome());
        dto.setFlat(address.getFlat());
        dto.setPostalCode(address.getPostalCode());
        dto.setCity(address.getCity());

        return dto;
    }

}
