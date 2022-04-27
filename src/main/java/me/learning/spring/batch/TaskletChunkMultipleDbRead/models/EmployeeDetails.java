package me.learning.spring.batch.TaskletChunkMultipleDbRead.models;

public class EmployeeDetails {

    private int iD;             // iD from Employees is the foreign key here
    private int d_Id;
    private String origin;      // ground or jumper
    private double jobTenure;
    private String maritalStatus;
    private String expertise;

    public int getD_Id() {
        return d_Id;
    }

    public void setD_Id(int d_Id) {
        this.d_Id = d_Id;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getJobTenure() {
        return jobTenure;
    }

    public void setJobTenure(double jobTenure) {
        this.jobTenure = jobTenure;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
