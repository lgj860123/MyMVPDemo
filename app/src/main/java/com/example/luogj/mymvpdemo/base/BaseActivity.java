package com.example.luogj.mymvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/4/17.
 */

public abstract class BaseActivity<T extends BasePresenter> extends Activity {
    //主持者
    protected T presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        presenter = initPresenter();
        onPrepare();
    }

    /**
     * 获取布局文件
     * @return
     */
    protected abstract int getLayout();

    /**
     * 初始化界面
     */
    protected abstract void initView();

    /**
     * 初始化主持者
     * @return
     */
    protected abstract T initPresenter();

    /**
     * 准备工作
     */
    protected abstract void onPrepare();
}
