package com.mediomelon.mvvmbasic;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
  //  String Base_URL = "https://www.simplifiedcoding.net/demos/marvel/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
