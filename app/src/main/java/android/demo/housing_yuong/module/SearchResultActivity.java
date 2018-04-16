package android.demo.housing_yuong.module;

import android.content.Intent;
import android.demo.housing_yuong.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchResultActivity extends AppCompatActivity {

    ListView listView;
    public static ArrayList<Product> products = new ArrayList<>();
    MyApdater myApdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        getSupportActionBar().hide();

        add();
        init();
    }

    public void init() {
        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.lisview);
        myApdater = new MyApdater(SearchResultActivity.this, R.layout.listview_item, products);
        listView.setAdapter(myApdater);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SearchResultActivity.this, DetailActivity.class);
                intent.putExtra("id", i);
                startActivity(intent);
            }
        });

    }

    public void add () {
        products.add(new Product("Modern 3 bedroom apartment with panoramic river view in Binh Thanh District",
                "Binh Thanh District", 1000, PropertyType.APARTMENT.toString(),
                2, 3, 50,
                R.drawable.ic_1, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 800, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 560, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 560, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_5, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 500, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_6, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 700, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 300, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_1, new Location(10.2167, 132.6768)));

        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 400, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 600, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_5, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 3000, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_6, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 460, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3, new Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 890, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4, new Location(10.2167, 132.6768)));

    }
}
