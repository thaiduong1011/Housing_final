package android.demo.housing_yuong;

import android.demo.housing_yuong.module.Location;
import android.demo.housing_yuong.module.Product;
import android.demo.housing_yuong.module.PropertyType;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Product> products = new ArrayList<>();
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        setupTabIcons();

        //Add fragments
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new SearchFragment());
        adapter.addFragment(new SaveFragment());
        adapter.addFragment(new NotiFragment());


        //Setting adapter
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#e74c3c"));
        tabLayout.setBackgroundColor(Color.parseColor("#3a1c6e"));


  }

    private void setupTabIcons() {
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());

        int tabIcons[]= {R.drawable.home, R.drawable.search, R.drawable.save, R.drawable.notification};
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);

        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#e74c3c"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(3).getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#e74c3c"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    public void add(){
        products.add(new Product("Modern 3 bedroom apartment with panoramic river view in Binh Thanh District",
                "Binh Thanh District", 1000, PropertyType.APARTMENT.toString(),
                2, 3, 50,
                R.drawable.ic_1,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 800, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 560, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 560, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_5,new Location(10.2167, 132.6768)));products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 500, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_6,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 700, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 300, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_1,new Location(10.2167, 132.6768)));

        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 400, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 600, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_5,new Location(10.2167, 132.6768)));products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 3000, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_6,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 460, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3,new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 890, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4,new Location(10.2167, 132.6768)));

    }

}
