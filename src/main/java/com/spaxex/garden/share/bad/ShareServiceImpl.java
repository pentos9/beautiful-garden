package com.spaxex.garden.share.bad;

import org.apache.http.util.TextUtils;

public class ShareServiceImpl {

    public void share(ShareItem item, ShareCallback callback) {
        if (item != null) {
            if (item.type == ShareType.LINK.getCode()) {
                // share link
                if (!TextUtils.isEmpty(item.link) &&
                        !TextUtils.isEmpty(item.title)) {
                    doShareLink(item.link, item.title, item.content, callback);
                } else {
                    if (callback != null) {
                        callback.onCallback(ShareCallback.STATE_FAIL, "分享信息不完整");
                    }
                }
            } else if (item.type == ShareType.IMAGE.getCode()) {
                // share image
                if (!TextUtils.isEmpty(item.imagePath)) {
                    doShareImage(item.imagePath, callback);
                } else {
                    if (callback != null) {
                        callback.onCallback(ShareCallback.STATE_FAIL, "分享信息不完整");
                    }
                }
            } else if (item.type == ShareType.TEXT.getCode()) {
                // share text
                if (!TextUtils.isEmpty(item.content)) {
                    doShareText(item.content, callback);
                } else {
                    if (callback != null) {
                        callback.onCallback(ShareCallback.STATE_FAIL, "分享信息不完整");
                    }
                }
            } else if (item.type == ShareType.IMAGE_TEXT.getCode()) {
                // share image and text
                if (!TextUtils.isEmpty(item.imagePath) &&
                        !TextUtils.isEmpty(item.content)) {
                    doShareImageAndText(item.imagePath, item.content, callback);
                } else {
                    if (callback != null) {
                        callback.onCallback(ShareCallback.STATE_FAIL, "分享信息不完整");
                    }
                }
            } else {
                if (callback != null) {
                    callback.onCallback(ShareCallback.STATE_FAIL, "不支持的分享类型");
                }
            }
        } else {
            if (callback != null) {
                callback.onCallback(ShareCallback.STATE_FAIL, "ShareItem 不能为 null");
            }
        }

    }

    private void doShareLink(String link, String title, String content, ShareCallback listener) {

    }

    private void doShareImage(String imagePath, ShareCallback listener) {

    }

    private void doShareText(String content, ShareCallback listener) {

    }

    private void doShareImageAndText(String imagePath, String content, ShareCallback listener) {

    }
}
