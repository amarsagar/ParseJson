package com.example.amar.parsejson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by amar on 8/30/2016.
 */
public class BankInfo {
    @SerializedName("bank_name")
    String name_bank;
    @SerializedName("location")
    String location;
    @SerializedName("Employee")
    ArrayList<EmployeeList> employeeLists;

    public BankInfo(String name_bank, String location, ArrayList<EmployeeList> employeeLists) {
        this.name_bank = name_bank;
        this.location = location;
        this.employeeLists = employeeLists;
    }

    public String getName_bank() {
        return name_bank;
    }

    public void setName_bank(String name_bank) {
        this.name_bank = name_bank;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<EmployeeList> getEmployeeLists() {
        return employeeLists;
    }

    public void setEmployeeLists(ArrayList<EmployeeList> employeeLists) {
        this.employeeLists = employeeLists;
    }
}
