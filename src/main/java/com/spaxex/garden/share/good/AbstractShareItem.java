package com.spaxex.garden.share.good;

import com.spaxex.garden.share.bad.ShareCallback;
import com.spaxex.garden.share.bad.ShareType;

public abstract class AbstractShareItem {
    ShareType type;

    public AbstractShareItem(ShareType type) {
        this.type = type;
    }

    public abstract void doShare(ShareCallback listener);

    public ShareType getType() {
        return type;
    }

    public void setType(ShareType type) {
        this.type = type;
    }
}
