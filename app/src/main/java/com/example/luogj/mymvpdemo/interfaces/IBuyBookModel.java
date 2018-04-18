package com.example.luogj.mymvpdemo.interfaces;

import com.example.luogj.mymvpdemo.bean.TestBean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/17.
 */

public interface IBuyBookModel {
    /**
     * 获取测试数据
     */
    void getTestData(IValueCallback<List<TestBean>> callBack);

    /**
     * 返回本地adapter测试数据
     * @return
     */
    List<TestBean> getAdapterData();
}
