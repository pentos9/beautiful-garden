package com.spaxex.garden.share.good;

import com.spaxex.garden.share.bad.ShareCallback;
import com.spaxex.garden.share.bad.ShareType;

public class Text extends AbstractShareItem {
    String content;

    public Text(String content) {
        super(ShareType.TEXT);
        this.content = content;
    }

    public void doShare(ShareCallback listener) {
        // do share
    }
}
