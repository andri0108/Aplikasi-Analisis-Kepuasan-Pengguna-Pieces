package com.example.myanalyst;

public class UtilsApi {
    // 10.0.2.2 ini adalah localhost.
    // bisa juga di masukan dengan IP address kalian
    public static final String BASE_URL_API = "https://heloindo1.000webhostapp.com/";

    // Mendeklarasikan Interface BaseApiService
    public static LoginAPI getLoginAPI(){
        return RetrofitClient.getClient(BASE_URL_API).create(LoginAPI.class);
    }
}
