package com.xworkz.jio.service;

import com.xworkz.jio.dto.JioDto;

public class JioService {
    public boolean validation(JioDto jioDto){
     if (jioDto.getName()!=null && jioDto.getNumber()<10 && jioDto.getOtp()<4){
         return true;
     }else {
         return false;
     }

    }
}
