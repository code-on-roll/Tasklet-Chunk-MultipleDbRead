package me.learning.spring.batch.TaskletChunkMultipleDbRead.models;

public class EmployeeMedicalDetails {

    private int m_Id;
    private int p_iD;
    private String insuranceId;
    private String knownAilments;

    public int getM_Id() {
        return m_Id;
    }

    public void setM_Id(int m_Id) {
        this.m_Id = m_Id;
    }

    public int getP_iD() {
        return p_iD;
    }

    public void setP_iD(int p_iD) {
        this.p_iD = p_iD;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getKnownAilments() {
        return knownAilments;
    }

    public void setKnownAilments(String knownAilments) {
        this.knownAilments = knownAilments;
    }
}
