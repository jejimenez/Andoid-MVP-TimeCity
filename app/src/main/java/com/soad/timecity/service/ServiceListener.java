package com.soad.timecity.service;

/**
 * Created by soad on 10/17/2015.
 */

public interface ServiceListener<L> {
    void onSuccess(L response);

    void onFailure(Exception e);
}

