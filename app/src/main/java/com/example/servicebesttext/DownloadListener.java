package com.example.servicebesttext;

/**
 * Created by 陈淦 on 2017/4/25.对下载过程中的各种状态进行监听与回调
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();

}
