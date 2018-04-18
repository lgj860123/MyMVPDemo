package com.example.luogj.mymvpdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luogj.mymvpdemo.R;
import com.example.luogj.mymvpdemo.bean.TestBean;

import java.util.List;

/**
 * Created by luogj on 2018/4/17.
 */

public class BuyBookAdapter extends RecyclerView.Adapter<BuyBookAdapter.MyViewHolder>{
    private Context context;
    private List<TestBean> testBeanList;

    public BuyBookAdapter(Context context, List<TestBean> data){
        this.context = context;
        this.testBeanList = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TestBean testBean = testBeanList.get(position);

        holder.tv_name.setText(testBean.getName());
        holder.tv_number.setText(testBean.getNumber());
        holder.tv_time.setText(testBean.getTime());
    }


    @Override
    public int getItemCount() {
        return testBeanList == null ? 0 : testBeanList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_name;
        private final TextView tv_number;
        private final TextView tv_time;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_number = itemView.findViewById(R.id.tv_number);
            tv_time = itemView.findViewById(R.id.tv_time);
        }
    }
}
