package com.android.dmk78.foodequipmentshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ApparatdlyaPopcorn extends AppCompatActivity {
    private ListView listViewApparatPopcorn;
    private ArrayList<ApparatPopcorn> arrayApparatdlyaPopcorna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apparatdlya_popcorna);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }


        listViewApparatPopcorn = findViewById(R.id.listViewApparatPopcorn);

        arrayApparatdlyaPopcorna = new ArrayList<>();

        arrayApparatdlyaPopcorna.add(new ApparatPopcorn(getString(R.string.airhot_pop6_title),getString(R.string.airhot_pop6_info),R.drawable.pop6));
        arrayApparatdlyaPopcorna.add(new ApparatPopcorn(getString(R.string.hkn_pcorn_title),getString(R.string.hkn_pcorn_info),R.drawable.pcorn));
        arrayApparatdlyaPopcorna.add(new ApparatPopcorn(getString(R.string.hkn_pcorn2_title),getString(R.string.hkn_pcorn2_info),R.drawable.pcorn2));

        ArrayAdapter<ApparatPopcorn> adapter = new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,arrayApparatdlyaPopcorna);
        listViewApparatPopcorn.setAdapter(adapter);
        listViewApparatPopcorn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = arrayApparatdlyaPopcorna.get(position).getTitle();
                String info = arrayApparatdlyaPopcorna.get(position).getInfo();
                int imageResourceId = arrayApparatdlyaPopcorna.get(position).getImageResourceId();

                Intent intent = new Intent(getApplicationContext(),PopCornDetailedInfoActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("info",info);
                intent.putExtra("imageResourceId",imageResourceId);
                startActivity(intent);
            }
        });



    }
}
