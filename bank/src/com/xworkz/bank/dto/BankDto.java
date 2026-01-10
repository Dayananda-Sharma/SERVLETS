package com.xworkz.bank.dto;

public class BankDto {
    Long number;
    String idType;
    Long idNum;
    String userName;

    public BankDto(Long number, String idType, Long idNum, String userName) {
        this.number = number;
        this.idType = idType;
        this.idNum = idNum;
        this.userName = userName;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Long getIdNum() {
        return idNum;
    }

    public void setIdNum(Long idNum) {
        this.idNum = idNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "BankDto{" +
                "number=" + number +
                ", idType='" + idType + '\'' +
                ", idNum=" + idNum +
                ", userName='" + userName + '\'' +
                '}';
    }
}
