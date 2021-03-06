package com.example.android.new_nds_study.network;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public interface ApiService {
    @GET
    Observable<String> get(@Url String url , @QueryMap Map<String,String> map);
//    @GET("/v1/news/app/category/{uid}/newslist/limit/:limit/page/:page")
//    Observable<MessageListBean> getDataBean(@Query ("category_id") int uid);

    @FormUrlEncoded
    @POST
    Observable<String> post(@Url String url, @FieldMap Map<String,String> map);

}
