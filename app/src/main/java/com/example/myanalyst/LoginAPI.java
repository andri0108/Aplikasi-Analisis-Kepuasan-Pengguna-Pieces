package com.example.myanalyst;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginAPI {
    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> login(@Field("id") String id,
                             @Field("password") String password);

}
