package com.chamal.accounts.dto;

import lombok.Data;


import java.io.Serializable;
@Data
public class AccountDto implements Serializable {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
