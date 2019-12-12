package com.ie23s.android.app.helpcoder.utils;

import android.graphics.Color;

public class ProgressUtil {
    private static final int BLUE = 160;
    private int green = BLUE;
    private int red = 255;
    private float progress = 0;

    public void updateProgress(float progress) {
        if(progress <  0.5) {
            this.green = 255;
            this.red = (int) ((255 - BLUE) * (1 - progress*2) + BLUE);
        } else if(progress == 0.5) {
            this.green = this.red = 255;
        } else {
            this.red = 255;
            this.green = (int) ((255 - BLUE) * progress * 2 + BLUE);
        }
        this.progress = progress;
    }

    public int getColor() {
        return Color.rgb(red,green,BLUE);
    }

    public interface Progress {
        void onUpdateProgress(float progress, Color color);
    }
}
