package com.example.luogj.mymvpdemo.presenter;

import com.example.luogj.mymvpdemo.activity.MainActivity;
import com.example.luogj.mymvpdemo.base.BasePresenter;
import com.example.luogj.mymvpdemo.bean.TestBean;
import com.example.luogj.mymvpdemo.interfaces.IBuyBookModel;
import com.example.luogj.mymvpdemo.interfaces.IBuyBookPresenter;
import com.example.luogj.mymvpdemo.interfaces.IBuyBookView;
import com.example.luogj.mymvpdemo.interfaces.IValueCallback;
import com.example.luogj.mymvpdemo.model.BuyBookModel;

import java.util.List;

/**
 * Created by luogj on 2018/4/17.
 */

public class BuyBookPresenter extends BasePresenter<MainActivity> implements IBuyBookPresenter {

    private IBuyBookView iBuyBookView;
    private IBuyBookModel iBuyBookModel;

    public BuyBookPresenter(IBuyBookView iBuyBookView){
        this.iBuyBookView = iBuyBookView;
        this.iBuyBookModel = new BuyBookModel();
    }

    @Override
    public List<TestBean> getAdapterData() {
        return iBuyBookModel.getAdapterData();
    }

    @Override
    public void initData() {
        //在这里弹出loading
        iBuyBookModel.getTestData(new IValueCallback<List<TestBean>>() {
            @Override
            public void onSuccess(List<TestBean> dingTestBeans) {
                //在这里取消loading
                //简单数据操作可以在presenter里完成
                iBuyBookModel.getAdapterData().addAll(dingTestBeans);
                iBuyBookView.refreshAdapter();
            }

            @Override
            public void onFail(String code) {
                //在这里取消loading
                iBuyBookView.showToast(code);
                iBuyBookView.onEmpty();
            }
        });
    }

}
