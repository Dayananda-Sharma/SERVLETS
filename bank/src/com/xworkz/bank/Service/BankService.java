package com.xworkz.bank.Service;

import com.xworkz.bank.dto.BankDto;

public class BankService {
    public boolean validation(BankDto bankDto){
        if (bankDto.getNumber()<10 && bankDto.getIdType()!=null && bankDto.getIdNum()<10 && bankDto.getUserName()!=null ){
            return true;
        }else {
            return false;
        }
    }
}
