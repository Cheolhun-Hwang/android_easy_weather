package com.hch.hooney.easyweather.Views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hch.hooney.easyweather.R;

public class GetLocationView extends LinearLayout {
    private TextView location_text;
    private ImageButton location_btn;

    public GetLocationView(Context context) {
        super(context);

        setView(context);
    }

    private void setView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.get_location, this, false);
        location_text = view.findViewById(R.id.get_location_text);
        location_btn = view.findViewById(R.id.get_location_btn);
        setEvent();
        addView(view);
    }

    private void setEvent() {
        location_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
