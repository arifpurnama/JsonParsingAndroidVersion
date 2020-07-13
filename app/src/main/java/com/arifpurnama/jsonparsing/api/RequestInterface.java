package com.arifpurnama.jsonparsing.api;

import retrofit2.Call;
import retrofit2.http.GET;

//Untuk merequest API
public interface RequestInterface {

    //folder tempat penyimpanan API
    @GET("android/jsonandroid/")
    Call<JSONResponse> getJSON();


}
