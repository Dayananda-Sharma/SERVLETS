package com.xworkz.netfix.NetflixService;

import com.xworkz.netfix.dto.NetflixDto;

public class NetflixService {
public boolean validation(NetflixDto netflixDto){
    if (netflixDto.getName()!=null && netflixDto.getIdNumber()>8 && netflixDto.getPhNumber()<=10 && netflixDto.getIdType()!=null && netflixDto.getOtp()<5){
        return true;
    }else {
        return false;
    }
}
}
