package com.ie23s.android.app.helpcoder.additionalactivities.licences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ie23s.android.app.helpcoder.R;

public class LicencesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licences_list);

        String[] licences = getResources().getStringArray(R.array.licences);
        ListView listView = findViewById(R.id.licences_list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, licences);
        listView.setAdapter(adapter);
    }
}
