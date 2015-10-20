package com.soad.timecity.ui;

import com.soad.timecity.model.TimeCity;
import com.soad.timecity.service.ServiceListener;
import com.soad.timecity.service.TimeService;

import java.util.List;

/**
 * Created by soad on 10/17/2015.
 */
public class TimeCitiesPresenter {

    private final TimeService mTimeService;


    private TimeCitiesView mView;

    public TimeCitiesPresenter(TimeService timeService) {
        mTimeService = timeService;
    }

    public void onStart(TimeCitiesView view) {
        mView = view;

        mTimeService.getTimeCities(new ServiceListener<List<TimeCity>>() {
            @Override
            public void onSuccess(List<TimeCity> response) {
                mView.load(response);
            }

            @Override
            public void onFailure(Exception e) {
                mView.onError(e);
            }
        });
    }
}
