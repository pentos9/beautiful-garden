package com.spaxex.garden.share.good;

import com.spaxex.garden.share.bad.ShareCallback;
import com.spaxex.garden.share.bad.ShareType;
import lombok.Data;

@Data
public class Link extends AbstractShareItem {
    String title;
    String content;
    String link;

    public Link(String title, String content, String link) {
        super(ShareType.LINK);
        this.title = title;
        this.content = content;
        this.link = link;
    }

    @Override
    public void doShare(ShareCallback listener) {
        // do share
    }
}
