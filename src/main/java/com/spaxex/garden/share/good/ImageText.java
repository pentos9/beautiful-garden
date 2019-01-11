package com.spaxex.garden.share.good;

import com.spaxex.garden.share.bad.ShareCallback;
import com.spaxex.garden.share.bad.ShareType;

public class ImageText extends AbstractShareItem {

    String content;
    String imagePath;

    public ImageText(String content, String imagePath) {
        super(ShareType.IMAGE_TEXT);
        this.content = content;
        this.imagePath = imagePath;
    }

    public void doShare(ShareCallback listener) {

    }
}
