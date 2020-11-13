package com.example.pregunta_dinamica.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofitClient = null;
    private static final String BASE_URL = "https://opentbd.com/";

    public static Retrofit getRetrofitInstance(){
        if (retrofitClient == null){
            retrofitClient = new retrofit2.Retrofit.Builder()
              .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofitClient;
    }
}
