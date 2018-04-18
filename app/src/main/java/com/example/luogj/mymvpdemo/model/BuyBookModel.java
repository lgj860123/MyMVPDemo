package com.example.luogj.mymvpdemo.model;


import android.os.Handler;

import com.example.luogj.mymvpdemo.bean.TestBean;
import com.example.luogj.mymvpdemo.interfaces.IBuyBookModel;
import com.example.luogj.mymvpdemo.interfaces.IValueCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2018/4/17.
 */

public class BuyBookModel implements IBuyBookModel {
    private List<TestBean> testBeanList;

    public BuyBookModel(){
        this.testBeanList = new ArrayList<>();
    }
    @Override
    public void getTestData(final IValueCallback<List<TestBean>> callBack) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                List<TestBean> list = new ArrayList<>();
                list.add(new TestBean("赵云", 1, "09-27 09:11"));
                list.add(new TestBean("赵云、隔壁老王、小王、典韦、貂蝉、林芳、曹操、刘备、关羽、黄忠、张飞、诸葛孔明", 10, "09-27 09:11"));
                list.add(new TestBean("黄忠、孙权、大乔", 50, "09-27 09:11"));
                list.add(new TestBean("大乔、小乔、貂蝉、孙尚香", 300, "09-27 09:11"));

                Random rd = new Random();
                int N = rd.nextInt(10);
                if (N > 5) {
                    callBack.onSuccess(list);
                } else {
                    callBack.onFail("拒绝请求");
                }
            }
        }, 1000);
    }

    @Override
    public List<TestBean> getAdapterData() {
        return testBeanList;
    }
}
