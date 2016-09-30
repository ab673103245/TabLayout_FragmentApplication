package qianfeng.tablayoutfragmentapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = ((TabLayout) findViewById(R.id.tab_layout));
        viewPager = ((ViewPager) findViewById(R.id.viewPager));


        List<Fragment> fragments = new ArrayList<>();
        List<String> titles = new ArrayList<>();

        for (int i = 0; i < 3; i++) { // 构造标题
           titles.add("张三"+i);
        }

        for (String title : titles) { // 构造TextView显示的内容
            MyFragment myFragment = new MyFragment();
            fragments.add(myFragment);
            Bundle args = new Bundle();
            args.putString("name",title);
            myFragment.setArguments(args);
        }

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(myAdapter);

        // 将TabLayout和ViewPager关联起来。
        tabLayout.setupWithViewPager(viewPager);  // 没有这个方法，就没办法调用MyAdapter里面的adapter.getPageTitle()




    }



}
