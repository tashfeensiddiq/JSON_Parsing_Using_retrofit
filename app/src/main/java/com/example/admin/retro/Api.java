package com.example.admin.retro;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by Admin on 2/19/2018.
 */



    public interface Api {

        String BASE_URL = "https://api.coinmarketcap.com/v1/ticker/";

        @GET("?limit=10")
        Call<List<info>> getInfos();
    }

