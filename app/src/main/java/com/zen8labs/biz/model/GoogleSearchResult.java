package com.zen8labs.biz.model;

import com.google.gson.annotations.SerializedName;
import com.zen8labs.biz.model.Place;

import java.util.List;

public class GoogleSearchResult {
    @SerializedName("status")
    public String status;

    @SerializedName("results")
    public List<Place> results;
}
