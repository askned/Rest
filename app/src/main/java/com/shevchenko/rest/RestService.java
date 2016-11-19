package com.shevchenko.rest;

import android.support.annotation.NonNull;

import java.io.IOException;

/**
 * Created by Admin on 19.11.2016.
 */

public final class RestService {
    private RestClient restClient;

    public RestService() {
        restClient = new RestClient();
    }

    public UserRegistrationModel register(@NonNull String login,
                                          @NonNull String password) throws IOException {

        return restClient.getLoftSchoolAPI()
                .registerUser(login, password, ConstantManager.REGISTER_FLAG).execute().body();
    }

    public UserLoginModel login(@NonNull String login,
                                @NonNull String password) throws IOException {
        return restClient.getLoftSchoolAPI()
                .login(login, password).execute().body();
    }
}

