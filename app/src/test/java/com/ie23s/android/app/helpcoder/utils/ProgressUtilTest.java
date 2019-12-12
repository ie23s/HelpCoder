package com.ie23s.android.app.helpcoder.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgressUtilTest {

    @Test
    public void updateProgress() {
        ProgressUtil progressUtil = new ProgressUtil();
        progressUtil.updateProgress(0.5F);
        System.out.println(progressUtil.getColor() + "");
    }
}