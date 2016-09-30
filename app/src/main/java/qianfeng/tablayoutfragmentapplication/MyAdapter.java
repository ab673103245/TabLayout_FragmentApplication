package qianfeng.tablayoutfragmentapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/9/18 0018.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private List<String> titles;

    public MyAdapter(FragmentManager fm, List<Fragment> list, List<String> titles) {
        super(fm);
        this.list = list;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) { // 拿到 List<Fragment>集合里面的一个碎片，这个碎片是你之前创建过的，new出来过的
        return list.get(position);
    }

    @Override
    public int getCount() {  // 得到碎片的个数，决定ViewPager里面有多少页数
        return list.size();
    }
//    //获取每一页的标题
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return titles.get(position);
//    }


    @Override
    public CharSequence getPageTitle(int position) {  // 这是显示ViewPager的title
        return  titles.get(position);
    }
}
