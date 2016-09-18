package com.example.amar.parsejson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amar on 8/30/2016.
 */
public class EmployeeList {
@SerializedName("name")
    String name;
    @SerializedName("address")
    String address;
    @SerializedName("position")
    String position;

    public EmployeeList(String name, String address, String position) {
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
