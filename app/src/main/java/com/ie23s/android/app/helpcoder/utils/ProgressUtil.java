package com.ie23s.android.app.helpcoder.utils;

import android.graphics.Color;

public class ProgressUtil {
    private static final int BLUE = 0;
    private int green = BLUE;
    private int red = 255;
    private float progress = 0;

    public void updateProgress(float progress) {
        this.green = (int) ((255 - BLUE) * progress + BLUE);
        this.red = (int) ((255 - BLUE) * (1 - progress) + BLUE);
    }

    public int getColor() {
        return Color.rgb(red,green,BLUE);
    }

    public interface Progress {
        void onUpdateProgress(float progress, Color color);
    }
}
