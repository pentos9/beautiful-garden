package com.spaxex.garden.fill.bad;

import lombok.Data;

@Data
public class CountEntry {
    private int code;
    private int count;

    public CountEntry(int code, int count) {
        this.code = code;
        this.count = count;
    }
}
