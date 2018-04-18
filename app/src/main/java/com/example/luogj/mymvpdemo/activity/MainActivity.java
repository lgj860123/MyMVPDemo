package com.example.luogj.mymvpdemo.activity;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.luogj.mymvpdemo.R;
import com.example.luogj.mymvpdemo.adapter.BuyBookAdapter;
import com.example.luogj.mymvpdemo.base.BaseActivity;
import com.example.luogj.mymvpdemo.interfaces.IBuyBookView;
import com.example.luogj.mymvpdemo.presenter.BuyBookPresenter;

public class MainActivity extends BaseActivity<BuyBookPresenter> implements IBuyBookView {

    private RecyclerView rv_list;
    private BuyBookAdapter adapter;

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void refreshAdapter() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onEmpty() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        rv_list = findViewById(R.id.rv_list);
    }

    @Override
    protected BuyBookPresenter initPresenter() {
        return new BuyBookPresenter(this);
    }

    @Override
    protected void onPrepare() {
        Log.i("onPrepare", "onPrepare:集合个数： " + presenter.getAdapterData().size());
        adapter = new BuyBookAdapter(this,presenter.getAdapterData());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置RecyclerView 布局
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_list.setLayoutManager(layoutManager);
        rv_list.setAdapter(adapter);
    }
}
