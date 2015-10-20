package com.soad.timecity.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.soad.timecity.R;
import com.soad.timecity.model.TimeCity;
import com.soad.timecity.service.TestTimeService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends ActionBarActivity implements  TimeCitiesView {


    @Bind(R.id.citylist)
    ListView cityList;

    private TimeCitiesPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        initDependecies();
        mPresenter.onStart(this);



    }

    private void initDependecies() {
        mPresenter = new TimeCitiesPresenter(new TestTimeService());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void load(List<TimeCity> timeCitiesList) {
        Toast.makeText(this, "Tenemos" + timeCitiesList.size() + " ciudades", Toast.LENGTH_LONG).show();

        TimeCitiesAdapter itemsAdapter =
                new TimeCitiesAdapter(this, timeCitiesList);
        cityList.setAdapter(itemsAdapter);

    }

    @Override
    public void onError(Exception e) {
        Toast.makeText(this, "Error: " + e.toString(), Toast.LENGTH_LONG).show();
    }
}
