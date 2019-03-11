package com.zen8labs.core.viewmodel;

import android.databinding.ObservableArrayList;

import com.zen8labs.biz.model.Place;
import rx.Observable;

public interface IPlacesViewModel {
    /**
     * Fetch all places from google
     */
    Observable<Boolean> fetchAllPlaces();

    /**
     * Observe current places
     */
    ObservableArrayList<Place> getCurrentPlaces();

    /**
     * Filter the places
     */
    void filterPlacesByType(String type);
}
