package com.spaxex.garden.share.bad;

public enum ShareType {
    LINK(1), IMAGE(2), TEXT(3), IMAGE_TEXT(4);
    private int code;

    ShareType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
