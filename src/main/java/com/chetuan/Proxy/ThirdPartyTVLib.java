package com.chetuan.proxy;

/**
 * @Author:SunHaoLin
 * @Create:2022/10/18 13:42
 */
public interface ThirdPartyTVLib {
    String listVideos();

    String getVideoInfo(Integer id);

    String downloadVideo(Integer id);


}
