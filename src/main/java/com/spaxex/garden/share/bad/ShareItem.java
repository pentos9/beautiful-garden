package com.spaxex.garden.share.bad;

import lombok.Data;

@Data
public class ShareItem {
    int type;
    String title;
    String content;
    String imagePath;
    String link;
}
