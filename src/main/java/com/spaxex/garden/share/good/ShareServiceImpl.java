package com.spaxex.garden.share.good;

import com.spaxex.garden.share.bad.ShareCallback;

public class ShareServiceImpl {
    public void share(AbstractShareItem shareItem, ShareCallback callback) {
        if (shareItem == null) {
            if (callback != null) {
                callback.onCallback(ShareCallback.STATE_FAIL, "ShareItem不能为空");
                return;
            }
        }

        if (callback == null) {
            callback = new ShareCallback() {
                public void onCallback(int state, String msg) {
                    System.out.println("ShareCallback is null!");
                }
            };
        }

        shareImpl(shareItem, callback);
    }

    public void shareImpl(AbstractShareItem shareItem, ShareCallback shareCallback) {
        shareItem.doShare(shareCallback);
    }
}
