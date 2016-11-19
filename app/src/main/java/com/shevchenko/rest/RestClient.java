package com.shevchenko.rest;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by Admin on 19.11.2016.
 */

public class RestClient {
    private LoftSchoolAPI loftSchoolAPI;

    public RestClient(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(logging)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantManager.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        loftSchoolAPI = retrofit.create(LoftSchoolAPI.class);
    }

    public LoftSchoolAPI getLoftSchoolAPI() {
        return loftSchoolAPI;
    }
}

