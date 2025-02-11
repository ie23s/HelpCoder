package com.ie23s.android.app.helpcoder;

import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.ie23s.android.app.helpcoder.utils.ProgressUtil;


@RunWith(AndroidJUnit4.class)
public class ProgressUtilTest1 {

    @Test
    public void updateProgress() {
        ProgressUtil progressUtil = new ProgressUtil();
        progressUtil.updateProgress(0F);
        Log.d("Color", String.format("#%06X", (0xFFFFFF & progressUtil.getColor())));
        progressUtil.updateProgress(0.25F);
        Log.d("Color", String.format("#%06X", (0xFFFFFF & progressUtil.getColor())));
        progressUtil.updateProgress(0.5F);
        Log.d("Color", String.format("#%06X", (0xFFFFFF & progressUtil.getColor())));
        progressUtil.updateProgress(0.75F);
        Log.d("Color", String.format("#%06X", (0xFFFFFF & progressUtil.getColor())));
        progressUtil.updateProgress(1F);
        Log.d("Color", String.format("#%06X", (0xFFFFFF & progressUtil.getColor())));
    }
}