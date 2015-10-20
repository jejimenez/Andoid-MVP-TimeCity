package com.soad.timecity.service;

import com.soad.timecity.model.TimeCity;

import java.util.List;

/**
 * Created by soad on 10/17/2015.
 */
public interface TimeService {
     void  getTimeCities(ServiceListener <List<TimeCity>> interactorListener);
}
