package qianfeng.tablayoutfragmentapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/18 0018.
 */
public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 这里Viewpager显示的内容，是一个碎片，碎片里面的内容，仅仅是一个TextView。
        TextView tv = new TextView(getActivity());

        tv.setText(getArguments().getString("name"));// 在这里创建你想要的Fragment
        Log.d("google-my:", "onCreateView: ---> 什么时候被调用？"+getArguments().getString("name"));
        tv.setTextSize(32);
        return tv;
    }
}
