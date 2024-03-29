package com.zen8labs.core.api;

import com.zen8labs.biz.model.GoogleSearchResult;
import retrofit.http.GET;
import rx.Observable;

public interface IPlacesApi {
    @GET("nearbysearch/json?location=21.02155,105.83362&radius=500&types=food&key=AIzaSyBk3A8Q3pqVWYYmZhODbE-D2lf2ZHEoKuo")
    Observable<GoogleSearchResult> placesResult();
}
