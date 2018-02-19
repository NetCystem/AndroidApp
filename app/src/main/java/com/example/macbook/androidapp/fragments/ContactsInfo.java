package com.example.macbook.androidapp.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.macbook.androidapp.R;

public class ContactsInfo extends AppCompatActivity {



     TabLayout tableLayout;
     ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_info);

        tableLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.view_pager);

        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

//        tableLayout.addTab(tableLayout.newTab().setText("AAAAAA"));
//        tableLayout.addTab(tableLayout.newTab().setText("BBBBBB"));
        tableLayout.setupWithViewPager(viewPager);



       // if (savedInstanceState == null) {


                //data pass by Bundle by newInstane method
//            FragmentDetails.newInstance(getIntent().getExtras());

               ////data pass by Bundle by object
//            FragmentDetails fragmentDetails = new FragmentDetails();
//            fragmentDetails.setArguments(getIntent().getExtras());


              //if we have Fragment Tag in layout, we use this
//            getSupportFragmentManager().beginTransaction().add(R.id.details_layout,fragmentDetails).commit();

       // }







    }



}
