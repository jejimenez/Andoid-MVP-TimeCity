package com.soad.timecity;

import com.soad.timecity.model.TimeCity;
import com.soad.timecity.service.ServiceListener;
import com.soad.timecity.service.TimeService;
import com.soad.timecity.ui.TimeCitiesView;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;


public class PresenterTest {

    @Mock
    TimeService mTimeService;

    @Mock
    TimeCitiesView mCimeCitiesView;

    @Captor
    private ArgumentCaptor<ServiceListener<List<TimeCity>>> callbackArgumentCaptor;


    @Test
    public void testExecution(){
        //TODO
        Assert.assertEquals(1, 1 + 1);
    }

    @Test
    public void testFailExecution(){
        //TODO
        Assert.assertEquals(1, 1 + 1);
    }

}