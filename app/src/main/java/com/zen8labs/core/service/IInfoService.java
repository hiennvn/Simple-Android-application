package com.zen8labs.core.service;

import rx.Observable;

public interface IInfoService {
    Observable<Boolean> submitInfo(String idCard, String email);
}
