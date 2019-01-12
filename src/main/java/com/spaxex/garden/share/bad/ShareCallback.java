package com.spaxex.garden.share.bad;

public interface ShareCallback {
    int STATE_SUCCESS = 0;
    int STATE_FAIL = 1;

    void onCallback(int state, String msg);
}
