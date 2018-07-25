package com.example.lenovo.firestor_demo;

public class DocSample {
    private int SL_NO;
    private int SERIAL_NO;
    private int REG_NO;
    private String NAME;
    private String NAME_OF_FATHER;
    private String DOB;
    private String QUALIFICATION;
    private String REG_DATE;
    private String ADDRESS;
    private String DISTRICT;
    private String STATE;
    private String REMARK;

    public int getSL_NO() {
        return SL_NO;
    }

    public void setSL_NO(int SL_NO) {
        this.SL_NO = SL_NO;
    }

    public int getSERIAL_NO() {
        return SERIAL_NO;
    }

    public void setSERIAL_NO(int SERIAL_NO) {
        this.SERIAL_NO = SERIAL_NO;
    }

    public int getREG_NO() {
        return REG_NO;
    }

    public void setREG_NO(int REG_NO) {
        this.REG_NO = REG_NO;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME_OF_FATHER() {
        return NAME_OF_FATHER;
    }

    public void setNAME_OF_FATHER(String NAME_OF_FATHER) {
        this.NAME_OF_FATHER = NAME_OF_FATHER;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getQUALIFICATION() {
        return QUALIFICATION;
    }

    public void setQUALIFICATION(String QUALIFICATION) {
        this.QUALIFICATION = QUALIFICATION;
    }

    public String getREG_DATE() {
        return REG_DATE;
    }

    public void setREG_DATE(String REG_DATE) {
        this.REG_DATE = REG_DATE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getDISTRICT() {
        return DISTRICT;
    }

    public void setDISTRICT(String DISTRICT) {
        this.DISTRICT = DISTRICT;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    @Override
    public String toString() {
        return "DocSample{" +
                "SL_NO=" + SL_NO +
                ", SERIAL_NO=" + SERIAL_NO +
                ", REG_NO=" + REG_NO +
                ", NAME='" + NAME + '\'' +
                ", NAME_OF_FATHER='" + NAME_OF_FATHER + '\'' +
                ", DOB='" + DOB + '\'' +
                ", QUALIFICATION='" + QUALIFICATION + '\'' +
                ", REG_DATE='" + REG_DATE + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", DISTRICT='" + DISTRICT + '\'' +
                ", STATE='" + STATE + '\'' +
                ", REMARK='" + REMARK + '\'' +
                '}';
    }
}
