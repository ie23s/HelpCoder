package com.ie23s.android.app.helpcoder.utils;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.ie23s.android.app.helpcoder.utils.ProgressUtil;


@RunWith(AndroidJUnit4.class)
public class ProgressUtilTest {

    @Test
    public void updateProgress() {
        ProgressUtil progressUtil = new ProgressUtil();
        progressUtil.updateProgress(0.5F);
        System.out.println(progressUtil.getColor() + "");
    }
}