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

                String dobMonth;

                switch (dobM) {
                    case 1: dobMonth = "January";
                            break;
                    case 2: dobMonth = "February";
                            break;
                    case 3: dobMonth = "March";
                            break;
                    case 4: dobMonth = "April";
                            break;
                    case 5: dobMonth = "May";
                            break;
                    case 6: dobMonth = "June";
                            break;
                    case 7: dobMonth = "July";
                            break;
                    case 8: dobMonth = "August";
                            break;
                    case 9: dobMonth = "September";
                            break;
                    case 10: dobMonth = "October";
                            break;
                    case 11: dobMonth = "November";
                            break;
                    case 12: dobMonth = "December";
                            break;
                    default: dobMonth = "non valid value";
                    break;
                }

                if (dobY < 30)
                    firstYears = 20;
                else
                    firstYears = 19;

                if (gender % 2 == 0)
                    sGender = "Female";
                else
                    sGender = "Male";

                // result will be displayed here
                tvResult.setText("Date of birth: "+ dobD + "/" + dobMonth + "/" + firstYears + dobY + "\n" +
                                    "Gender: " + sGender);
                tvResult.setVisibility(View.VISIBLE);
            }
        });

    }
}
