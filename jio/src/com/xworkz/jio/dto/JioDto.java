package com.xworkz.jio.dto;

import java.util.Objects;

public class JioDto {
    private String name;
    private Long number;
    private Integer otp;

    public JioDto(String name, Long number, Integer otp) {
        this.name = name;
        this.number = number;
        this.otp = otp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "JioService{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", otp=" + otp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JioDto)) return false;
        JioDto that = (JioDto) o;
        return Objects.equals(name, that.name) && Objects.equals(number, that.number) && Objects.equals(otp, that.otp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, otp);
    }
}
