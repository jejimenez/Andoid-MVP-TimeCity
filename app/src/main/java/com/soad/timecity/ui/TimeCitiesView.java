package com.soad.timecity.ui;

import com.soad.timecity.model.TimeCity;

import java.util.List;

/**
 * Created by soad on 10/17/2015.
 */
public interface TimeCitiesView {
    void load(List<TimeCity> timeCitiesList);

    void onError(Exception e);
}
