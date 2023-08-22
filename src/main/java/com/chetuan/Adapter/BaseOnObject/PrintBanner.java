package com.chetuan.Adapter.BaseOnObject;

import com.chetuan.Adapter.BaseOnClass.Banner;

/**
 * @author 孙浩林
 * @date: 8/22/23 15:34
 */
public class PrintBanner extends Print{
    private Banner banner;
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
