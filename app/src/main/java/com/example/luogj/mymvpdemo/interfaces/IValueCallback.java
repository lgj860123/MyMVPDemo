package com.example.luogj.mymvpdemo.interfaces;

/**
 * 界面请求回调
 * Created by Administrator on 2018/4/17.
 */

public interface IValueCallback<T> {
    /**
     * 请求成功
     * @param t 泛型
     */
    void onSuccess(T t);

    /**
     * 请求失败
     * @param code 失败的错误码
     */
    void onFail(String code);

}
