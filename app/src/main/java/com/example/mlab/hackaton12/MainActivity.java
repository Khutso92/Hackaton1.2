package com.example.mlab.hackaton12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private DatabaseReference mDatabase;

    private EditText editTextName, editTextLong, editTextLat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextLong = (EditText) findViewById(R.id.editTextLongtiude);
        editTextLat = (EditText) findViewById(R.id.editTextLatitude);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("co working spaces in soweto");
    }


    @Override
    public void onClick(View view) {

    }

    public void saveUserInformation(View view) {

        String name = editTextName.getText().toString().trim();
        double lat = Double.parseDouble(editTextLat.getText().toString().trim());
        double lon = Double.parseDouble(editTextLong.getText().toString().trim());

        UserInformation userInformation = new UserInformation(lon,lat,name);

        mDatabase.child("co working spaces").setValue(userInformation); //must match with Ref.

        Message.message(getApplicationContext(), "saved");

        editTextLat.getText().clear();
        editTextLong.getText().clear();
        editTextName.getText().clear();


    }

    public void proceed(View view) {

        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(intent);
    }

}
