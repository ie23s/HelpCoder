package com.ie23s.android.app.helpcoder.project.ui.taskslist;

import android.app.Activity;

import com.ie23s.android.app.helpcoder.R;

public class TasksMenuManager {
    private Activity activity;
    private int count;
    private int[] list;

    public TasksMenuManager(Activity activity, int count) {
        this.activity = activity;
        this.count = count;
        list = new int[] {
                R.id.taks_list_0_fragment
        };
    }

}
