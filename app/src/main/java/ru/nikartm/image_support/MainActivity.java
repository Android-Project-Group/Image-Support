package ru.nikartm.image_support;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.nikartm.support.BadgePosition;
import ru.nikartm.support.ImageBadgeView;

public class MainActivity extends AppCompatActivity {

    private ImageBadgeView imageBadgeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageBadgeView = findViewById(R.id.ibv_icon4);
        initIconWithBadges();
    }

    private void initIconWithBadges() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "exo_regular.ttf");
        imageBadgeView.setBadgeValue(27)
                .setBadgeOvalAfterFirst(true)
                .setBadgeTextSize(16)
                .setMaxBadgeValue(999)
                .setBadgeTextFont(typeface)
                .setBadgeBackground(getResources().getDrawable(R.drawable.rectangle_rounded))
                .setBadgePosition(BadgePosition.BOTTOM_RIGHT)
                .setBadgeTextStyle(Typeface.NORMAL)
                .setShowCounter(true)
                .setBadgePadding(4);
    }
}
