package com.chamal.accounts.service;

import com.chamal.accounts.dto.CustomerDetailsDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

public interface ICustomerService {
    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
