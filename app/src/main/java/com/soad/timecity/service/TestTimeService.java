package com.soad.timecity.service;

import com.soad.timecity.model.TimeCity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by soad on 10/17/2015.
 */
public class TestTimeService implements TimeService {

    @Override
    public void getTimeCities(ServiceListener<List<TimeCity>> serviceListener) {

        List<TimeCity> cities = new ArrayList<>();
        cities.add(new TimeCity("Caracas", Calendar.getInstance().getTime()));
        cities.add(new TimeCity("Panama", Calendar.getInstance().getTime()));

        serviceListener.onSuccess(cities);

    }
}
