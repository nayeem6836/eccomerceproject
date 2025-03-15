
package com.example.Ecomerce.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.Ecomerce.dto.AddressDto;
import com.example.Ecomerce.dto.Response;
import com.example.Ecomerce.entity.Address;
import com.example.Ecomerce.entity.User;
import com.example.Ecomerce.repository.AddressRepo;
import com.example.Ecomerce.service.interf.AddressService;
import com.example.Ecomerce.service.interf.UserService;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final UserService userService;


    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null){
            address = new Address();
            address.setUser(user);
        }
        if (addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if (addressDto.getState() != null) address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }
}
