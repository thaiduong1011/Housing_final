package android.demo.housing_yuong;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter  extends FragmentPagerAdapter {
    private final List<Fragment> mFragments = new ArrayList<>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment) {
        mFragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag=new HomeFragment();
                break;
            case 1:
                frag=new SearchFragment();
                break;
            case 2:
                frag=new SaveFragment();
                break;
            case 3:
                frag=new NotiFragment();
        }
        return frag;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
    /*public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new AndroidFragment();
                break;
            case 1:
                frag=new IOSFragment();
                break;
            case 2:
                frag=new PHPFragment();
                break;
        }
        return frag;
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Android";
                break;
            case 1:
                title="IOS";
                break;
            case 2:
                title="PHP";
                break;
        }

        return title;
    }*/

}
