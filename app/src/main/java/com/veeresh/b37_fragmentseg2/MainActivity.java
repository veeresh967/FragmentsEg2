package com.veeresh.b37_fragmentseg2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //savedInstanceState will be null if user opens the screen.
        //if user rotates the phone, savedinstancestate will not be null
        if(savedInstanceState == null) {
            //a. create fragment object
            MyFragment myFragment = new MyFragment();
            //b. get fragment manager object
            FragmentManager manager = getSupportFragmentManager();
            //c. beging the transaction
            FragmentTransaction transaction = manager.beginTransaction();
            //d. add our fragment [myfragment] to <framelayout...container>
            transaction.add(R.id.container1, myFragment);
            //e. save the transaction
            transaction.commit();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
