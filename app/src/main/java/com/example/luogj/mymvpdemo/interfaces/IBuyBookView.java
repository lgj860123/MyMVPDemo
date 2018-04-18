package com.example.luogj.mymvpdemo.interfaces;

/**
 * Created by Administrator on 2018/4/17.
 */

public interface IBuyBookView {
    /**
     * 显示toast提示
     */
    void showToast(String msg);

    /**
     * 刷新adapter
     */
    void refreshAdapter();

    /**
     * 显示界面为空
     */
    void onEmpty();
}
