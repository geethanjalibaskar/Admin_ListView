package com.example.anjali.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    String[] fruitname={"Student Details","Google Map","Message"};
    String[] desc={"Student Details are displayed here","Driver can get the current location","Messages are sent to parent from Admin"};
    Integer[] imgid={R.drawable.stu,R.drawable.map,R.drawable.sms2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     lst= (ListView) findViewById(R.id.listview);
       CustomListview customListView=new CustomListview(this,fruitname,desc,imgid);
       lst.setAdapter(customListView);




    }
}
