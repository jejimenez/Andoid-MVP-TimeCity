package com.soad.timecity.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.soad.timecity.R;
import com.soad.timecity.model.TimeCity;

import java.util.List;

/**
 * Created by soad on 10/17/2015.
 */
public class TimeCitiesAdapter extends ArrayAdapter<TimeCity> {

    public TimeCitiesAdapter(Context context, List<TimeCity> citiesTime){
        super(context, 0, citiesTime);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TimeCity tc = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.city_time_view, parent, false);
        }

        TextView tvCity = (TextView)convertView.findViewById(R.id.city);
        TextView tvTime = (TextView)convertView.findViewById(R.id.time_city);


        tvCity.setText(tc.getCity());
        tvTime.setText(tc.getTime().toString());

        return convertView;
    }
}
