package com.ie23s.android.app.helpcoder.project.status;

import androidx.annotation.NonNull;

@SuppressWarnings("unused")
public enum State {
    EXPECTING ("EXPECTING"),
    PERFORMING ("PERFORMING"),
    DONE ("DONE"),
    POSTPONED ("POSTPONED"),
    PERFORMING_POSTPONED ("PERFORMING POSTPONED"),
    FAILED ("FAILED"),
    FAILED_WAITING ("FAILED WAITING"),
    FAILED_POSTPONED ("FAILED WAITING"),
    EXPECTING_IMPORTANT ("EXPECTING IMPORTANT");

    private final String name;

    State(String s) {
        name = s;
    }

    @Override
    @NonNull
    public String toString() {
        return this.name;
    }
}
