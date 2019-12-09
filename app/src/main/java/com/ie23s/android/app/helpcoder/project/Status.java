package com.ie23s.android.app.helpcoder.project;

import com.ie23s.android.app.helpcoder.project.status.State;
import com.ie23s.android.app.helpcoder.project.status.StatusCallback;

public class Status extends StatusCallback {

    public Status(State state) {
        super(state);
    }
}
