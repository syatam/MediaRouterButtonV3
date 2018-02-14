package com.example.syatam.mediarouterbuttonv3;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.MediaRouteButton;

import com.google.android.gms.cast.framework.CastButtonFactory;

public class MainActivity extends FragmentActivity {


    private MediaRouteButton mMediaRouteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMediaRouteButton = (MediaRouteButton) findViewById(R.id.media_route_button);
        CastButtonFactory.setUpMediaRouteButton(getApplicationContext(), mMediaRouteButton);

    }
}
