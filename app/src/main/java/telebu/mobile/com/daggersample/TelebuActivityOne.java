package telebu.mobile.com.daggersample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class TelebuActivityOne extends AppCompatActivity {


    @Inject
    TelebuModel telebuModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Mandatory injection
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_main);
        telebuModel.setEmailID("gopi");
        TelebuModel telebuModel1 = telebuModel;
        String a= telebuModel1.getEmailID();

        startActivity(new Intent(this,TelebuActivityTwo.class));
    }
}
