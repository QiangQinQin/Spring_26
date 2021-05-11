package com.tulun.bean;

public class Student1 {
    private Integer SID;
    private  String Sname;
    private  int Sage;
    private String Ssex;

    public Integer getSID() {
        return SID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getSage() {
        return Sage;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "SID=" + SID +
                ", Sname='" + Sname + '\'' +
                ", Sage=" + Sage +
                ", Ssex='" + Ssex + '\'' +
                '}';
    }
}
