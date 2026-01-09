package com.xworkz.netfix.dto;

import java.util.Objects;

public class NetflixDto {
    private String name;
    private long phNumber;
    private int otp;
    private String idType;
    private long idNumber;

    public NetflixDto(String name, long phNumber, int otp, String idType, long idNumber) {
        this.name = name;
        this.phNumber = phNumber;
        this.otp = otp;
        this.idType = idType;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NetflixDto)) return false;
        NetflixDto that = (NetflixDto) o;
        return phNumber == that.phNumber && otp == that.otp && idNumber == that.idNumber && Objects.equals(name, that.name) && Objects.equals(idType, that.idType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phNumber, otp, idType, idNumber);
    }

    @Override
    public String toString() {
        return "NetflixDto{" +
                "name='" + name + '\'' +
                ", phNumber=" + phNumber +
                ", otp=" + otp +
                ", idType='" + idType + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
