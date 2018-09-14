package com.massey.williamtaylor.assignment1;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    Declare buttons + number entry field here so they are visible to all methods within this class.
    Assignment is performed within the onCreate() method.
    */
    Button buttonDelete;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonStar;
    Button buttonZero;
    Button buttonHash;
    Button buttonPlaceCall;
    TextView enterNumberField;

    StringBuilder phoneNumberBuild = new StringBuilder();

    MediaPlayer sound;

    //Response for request for phone permission.
    private static final int PHONE_PERMISSION_REQUEST = 1;

    private void askForPermission()
    {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            //If permission has not been given, request permission.
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, PHONE_PERMISSION_REQUEST);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults)
    {
        switch(requestCode)
        {
            case PHONE_PERMISSION_REQUEST:
            {
                if (!permissions[0].equalsIgnoreCase(Manifest.permission.CALL_PHONE) || grantResults[0] != PackageManager.PERMISSION_GRANTED)
                {
                    //Permission Denied. Close app.
                    finish();
                }
            }
        }
    }

    public void buttonPressedTasks(View v)
    {
        enterNumberField.setText(phoneNumberBuild.toString());
        v.setHapticFeedbackEnabled(true);
        v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        sound.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ask for initial permission.
        askForPermission();

        // Initialize buttons + number entry field to their views.
        buttonDelete = findViewById(R.id.btnDelete);
        buttonOne = findViewById(R.id.btnDial1);
        buttonTwo = findViewById(R.id.btnDial2);
        buttonThree = findViewById(R.id.btnDial3);
        buttonFour = findViewById(R.id.btnDial4);
        buttonFive = findViewById(R.id.btnDial5);
        buttonSix = findViewById(R.id.btnDial6);
        buttonSeven = findViewById(R.id.btnDial7);
        buttonEight = findViewById(R.id.btnDial8);
        buttonNine = findViewById(R.id.btnDial9);
        buttonStar = findViewById(R.id.btnDialStar);
        buttonZero = findViewById(R.id.btnDial0);
        buttonHash = findViewById(R.id.btnDialHash);
        buttonPlaceCall = findViewById(R.id.btnPlaceCall);
        enterNumberField = findViewById(R.id.textEnterNumber);

        sound = MediaPlayer.create(getApplicationContext(), R.raw.click);

        // Set up the onClickListeners() for each of the buttons.
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //First ensure that there is a character to delete.
                if(phoneNumberBuild.length() > 0)
                {
                    phoneNumberBuild.deleteCharAt(phoneNumberBuild.length()-1);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "1" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(1);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "2" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(2);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "3" digit to the end of the phone number.
                if (phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(3);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "4" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(4);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "5" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(5);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "6" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(6);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "7" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(7);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "8" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(8);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "9" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(9);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "*" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append('*');
                    buttonPressedTasks(v);
                }
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "0" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append(0);
                    buttonPressedTasks(v);
                }
            }
        });

        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Add a "#" digit to the end of the phone number.
                if(phoneNumberBuild.toString().length() < 26)
                {
                    phoneNumberBuild.append('#');
                    buttonPressedTasks(v);
                }
            }
        });

        buttonPlaceCall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v)
            {
                buttonPressedTasks(v);

                //Converts the string builder object to a string and then to a telephone number.
                String phoneNumber = String.format("tel: %s", phoneNumberBuild.toString());

                //Create the dialing intent.
                Intent dialIntent = new Intent(Intent.ACTION_CALL);

                //Set up the data for the intent.
                dialIntent.setData(Uri.parse(phoneNumber));

                //Check whether the intent is associated with an app installed on the phone. If it is, send the intent. If not, throw an exception.
                if(dialIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(dialIntent);
                }
                else
                {
                    finish();
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putString("number", phoneNumberBuild.toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        phoneNumberBuild.append(savedInstanceState.getString("number"));
        enterNumberField.setText(phoneNumberBuild.toString());
    }
}
