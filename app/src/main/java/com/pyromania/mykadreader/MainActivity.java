package com.pyromania.mykadreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMykad;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMykad = findViewById(R.id.etMykad);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mykad = etMykad.getText().toString().trim();
                int dobY = Integer.parseInt(mykad.substring(0,2));
                int dobM = Integer.parseInt(mykad.substring(2,4));
                int dobD = Integer.parseInt(mykad.substring(4,6));
                int gender = Integer.parseInt(Character.toString(mykad.charAt(11)));
                int firstYears;
                String sGender;

                //String dobMonth = null;

                /*switch (dobM) {
                    case 1: dobMonth = "January";
                    case 2: dobMonth = "February";
                    case 3: dobMonth = "March";
                    case 4: dobMonth = "April";
                    case 5: dobMonth = "May";
                    case 6: dobMonth = "June";
                    case 7: dobMonth = "July";
                    case 8: dobMonth = "August";
                    case 9: dobMonth = "September";
                    case 10: dobMonth = "October";
                    case 11: dobMonth = "November";
                    case 12: dobMonth = "December";
                    break;
                }*/

                if (dobY < 30)
                    firstYears = 20;
                else
                    firstYears = 19;

                if (gender % 2 == 0)
                    sGender = "Female";
                else
                    sGender = "Male";

                // result will be displayed here
                tvResult.setText("Date of birth: "+ dobD + "/" + dobM + "/" + firstYears + dobY + "\n" +
                                    "Gender: " + sGender);
                tvResult.setVisibility(View.VISIBLE);
            }
        });

    }
}
