package android.demo.housing_yuong.module;

import android.content.Context;
import android.demo.housing_yuong.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MyPC on 06/04/2018.
 */



public class MyApdater extends BaseAdapter {

    Context context;
    int layout;
    List<Product> products;

    public MyApdater(Context context, int layout, List<Product> products) {
            this.context = context;
            this.layout = layout;
            this.products = products;
            }

    @Override
    public int getCount() {
            return products.size();
            }

    @Override
    public Object getItem(int i) {
            return null;
            }

    @Override
    public long getItemId(int i) {
            return 0;
            }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(layout,null);
        TextView txtName = view.findViewById(R.id.image_name);
        txtName.setText(products.get(i).title);
        TextView txtPrice = view.findViewById(R.id.image_price);
        txtPrice.setText(products.get(i).price +"");
        ImageView image = view.findViewById(R.id.image);
        image.setImageResource(products.get(i).image);


        Animation animation = AnimationUtils.loadAnimation(context, R.anim.scale_line);
        view.startAnimation(animation);
        return view;
    }
}
