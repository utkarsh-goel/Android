package com.example.utkarsh.recyclerretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by utkarsh on 31/3/18.
 */

public interface RequestInterface {

    @GET("android/jsonandroid")

    Call<JSONResponse> getJSON();
}
