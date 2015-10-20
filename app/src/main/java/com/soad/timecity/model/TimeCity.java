package com.soad.timecity.model;

import java.util.Date;

/**
 * Created by soad on 10/17/2015.
 */
public class TimeCity {
    private String city;
    private Date time;

    public TimeCity(String city, Date time){
        this.city = city;
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
