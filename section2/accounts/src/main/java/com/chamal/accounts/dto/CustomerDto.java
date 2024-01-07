package com.chamal.accounts.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerDto implements Serializable {
    private String name;

    private String email;

    private String mobileNumber;

    private AccountDto accountDto;
}
