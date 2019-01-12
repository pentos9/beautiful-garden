package com.spaxex.garden.share.good;

import com.spaxex.garden.share.bad.ShareCallback;
import com.spaxex.garden.share.bad.ShareType;

public class Image extends AbstractShareItem {

    String imagePath;

    public Image(String imagePath) {
        super(ShareType.IMAGE);
        this.imagePath = imagePath;
    }

    public void doShare(ShareCallback listener) {
        // do share
    }
}
