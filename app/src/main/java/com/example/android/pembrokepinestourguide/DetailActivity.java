package com.example.android.pembrokepinestourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        // intent receiving data from fragments
        Intent i = getIntent();

        int viewCheck = i.getIntExtra("vCheck", 0);
        int title = i.getIntExtra("title", 0);
        int foodType = i.getIntExtra("foodType", 0);
        int dollarSign = i.getIntExtra("dollarSign", 0);
        int phoneNumber = i.getIntExtra("phoneNumber", 0);
        int address = i.getIntExtra("address", 0);
        int image = i.getIntExtra("image", 0);

        // Restaurant view
        if (viewCheck == 1) {

            // Restaurant image
            ImageView detailImage = (ImageView) findViewById(R.id.detail_image);
            detailImage.setImageResource(image);

            // Restaurant title
            TextView detailTitle = (TextView) findViewById(R.id.detail_title);
            detailTitle.setText(title);

            // Food type label and tv
            TextView labelOne = (TextView) findViewById(R.id.label_one);
            labelOne.setText(R.string.foodtype_label);

            TextView detailType = (TextView) findViewById(R.id.detail_descOne);
            detailType.setText(foodType);

            // Food cost and tv
            TextView labelTwo = (TextView) findViewById(R.id.label_two);
            labelTwo.setText(R.string.cost_label);

            TextView detailDollarSign = (TextView) findViewById(R.id.detail_descTwo);
            detailDollarSign.setText(dollarSign);

            // Restaurant phone number and label
            TextView labelThree = (TextView) findViewById(R.id.label_three);
            labelThree.setText(R.string.phonenum_label);

            TextView detailPhoneNumber = (TextView) findViewById(R.id.detail_descThree);
            detailPhoneNumber.setText(phoneNumber);

            // Restaurant address and label
            TextView labelFour = (TextView) findViewById(R.id.label_four);
            labelFour.setText(R.string.address_label);

            TextView detailAddress = (TextView) findViewById(R.id.detail_descFour);
            detailAddress.setText(address);



        } else if(viewCheck == 2){ // park and shopping view

            ImageView detailImage = (ImageView) findViewById(R.id.detail_image);
            detailImage.setImageResource(image);

            // park and shapping title
            TextView detailTitle = (TextView) findViewById(R.id.detail_title);
            detailTitle.setText(title);

            // park and shopping address and label
            TextView labelFour = (TextView) findViewById(R.id.label_one);
            labelFour.setText(R.string.address_label);

            TextView detailAddress = (TextView) findViewById(R.id.detail_descOne);
            detailAddress.setText(address);

            // park and shopping phone number and labe
            TextView labelTwo = (TextView) findViewById(R.id.label_two);
            labelTwo.setText(R.string.phonenum_label);

            TextView detailPhoneNumber = (TextView) findViewById(R.id.detail_descTwo);
            detailPhoneNumber.setText(phoneNumber);

        }

    }

}
