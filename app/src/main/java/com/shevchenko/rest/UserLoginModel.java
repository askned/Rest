package com.shevchenko.rest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 19.11.2016.
 */
public class UserLoginModel {

    @SerializedName("status")
    private String status;
    @SerializedName("id")
    private int id;
    @SerializedName("auth_token")
    private String authToken;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
