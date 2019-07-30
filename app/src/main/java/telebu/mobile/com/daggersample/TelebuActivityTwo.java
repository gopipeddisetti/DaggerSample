package telebu.mobile.com.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class TelebuActivityTwo extends AppCompatActivity {

    @Inject
    TelebuModel telebuModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Mandatory injection
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TelebuModel telebuModel1 = telebuModel;
        String a= telebuModel1.getEmailID();
    }
}
