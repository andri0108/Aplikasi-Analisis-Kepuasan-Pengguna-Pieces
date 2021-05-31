package com.example.myanalyst;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RegisterAPI {
    @FormUrlEncoded
    @GET("view.php")
    Call<Value> view();

    @FormUrlEncoded
    @POST("/insertcontrol.php")
    Call<Value> simpan(
            @Field("id") String id,
            @Field("c") String c,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertperformance.php")
    Call<Value> simpanp(
            @Field("id") String id,
            @Field("p") String p,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertefisien.php")
    Call<Value> simpane(
            @Field("id") String id,
            @Field("e") String e,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertekonomi.php")
    Call<Value> simpanek(
            @Field("id") String id,
            @Field("ek") String ek,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertinformasi.php")
    Call<Value> simpani(
            @Field("id") String id,
            @Field("i") String i,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertservis.php")
    Call<Value> simpans(
            @Field("id") String id,
            @Field("s") String s,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertresultcontrol.php")
    Call<Value> simpanrc(
            @Field("allskor") String allskor,
            @Field("penganalisa") String penganalisa,
            @Field("jstp") String jstp,
            @Field("jtp") String jtp,
            @Field("jrg") String jrg,
            @Field("jp") String jp,
            @Field("jsp") String jsp,
            @Field("hasil") String hasil,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertresultefisien.php")
    Call<Value> simpanre(
            @Field("allskor") String allskor,
            @Field("penganalisa") String penganalisa,
            @Field("jstp") String jstp,
            @Field("jtp") String jtp,
            @Field("jrg") String jrg,
            @Field("jp") String jp,
            @Field("jsp") String jsp,
            @Field("hasil") String hasil,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertresultekonomi.php")
    Call<Value> simpanrek(
            @Field("allskor") String allskor,
            @Field("penganalisa") String penganalisa,
            @Field("jstp") String jstp,
            @Field("jtp") String jtp,
            @Field("jrg") String jrg,
            @Field("jp") String jp,
            @Field("jsp") String jsp,
            @Field("hasil") String hasil,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertresultinformasi.php")
    Call<Value> simpanri(
            @Field("allskor") String allskor,
            @Field("penganalisa") String penganalisa,
            @Field("jstp") String jstp,
            @Field("jtp") String jtp,
            @Field("jrg") String jrg,
            @Field("jp") String jp,
            @Field("jsp") String jsp,
            @Field("hasil") String hasil,
            @Field("status") String status);

    @FormUrlEncoded
    @POST("/insertresultperforma.php")
    Call<Value> simpanrp(
            @Field("allskor") String allskor,
            @Field("penganalisa") String penganalisa,
            @Field("jstp") String jstp,
            @Field("jtp") String jtp,
            @Field("jrg") String jrg,
            @Field("jp") String jp,
            @Field("jsp") String jsp,
            @Field("hasil") String hasil,
            @Field("status") String status);
    @FormUrlEncoded
    @POST("/insertresultservis.php")
    Call<Value> simpanrs(
            @Field("allskor") String allskor,
            @Field("penganalisa") String penganalisa,
            @Field("jstp") String jstp,
            @Field("jtp") String jtp,
            @Field("jrg") String jrg,
            @Field("jp") String jp,
            @Field("jsp") String jsp,
            @Field("hasil") String hasil,
            @Field("status") String status);






}

