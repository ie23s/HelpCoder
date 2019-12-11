package com.ie23s.android.app.helpcoder.project.status;

public abstract class StatusCallback {
    private State state;

    public StatusCallback() {
        state = State.EXPECTING;
    }

    public StatusCallback(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getStateName() {
        return this.state.toString();
    }

}
