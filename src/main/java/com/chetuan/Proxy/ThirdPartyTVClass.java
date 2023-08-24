package com.chetuan.proxy;

/**
 * @Author:SunHaoLin
 * @Create:2022/10/18 16:04
 */
public class ThirdPartyTVClass implements  ThirdPartyTVLib {
    @Override
    public String listVideos() {
        return null;
    }

    @Override
    public String getVideoInfo(Integer id) {
        return null;
    }

    @Override
    public String downloadVideo(Integer id) {
        return null;
    }
}
