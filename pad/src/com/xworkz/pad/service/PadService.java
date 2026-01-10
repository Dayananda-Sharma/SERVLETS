package com.xworkz.pad.service;

import com.xworkz.pad.dto.PadDto;

public class PadService {
    public boolean validation(PadDto padDto){
        if (padDto.getName()!=null && padDto.getLocation()!=null){
            return true;
        }else {
            return false;
        }
    }
}
