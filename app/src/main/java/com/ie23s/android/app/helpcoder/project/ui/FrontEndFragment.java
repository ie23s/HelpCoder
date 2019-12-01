package com.ie23s.android.app.helpcoder.project.ui;

import com.ie23s.android.app.helpcoder.project.ui.taskslist.TasksListFragment;

public class FrontEndFragment extends TasksListFragment {
    @Override
    protected void loadTasks() {
        setTasks(null);
    }
}
