package android.demo.housing_yuong.module;

import android.content.Intent;
import android.demo.housing_yuong.MainActivity;
import android.demo.housing_yuong.R;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView img;
    private TextView txtTitle;
    private TextView txtPrice;
    private TextView txtAddress;
    private TextView txtRoom;
    private TextView txtType;
    private TextView txtUsableArea;
    private TextView txtDes;
    private FloatingActionButton fabCall;
    private FloatingActionButton fabMess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();

        Intent intent = getIntent();
        int i = intent.getIntExtra("id", 0);
        add(i);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DetailActivity.this, MapActivity.class);
                startActivity(intent1);
            }
        });

    }
    public void init(){
        txtDes = findViewById(R.id.txtDes);
        img = findViewById(R.id.img);
        txtTitle = findViewById(R.id.txtTitle);
        txtAddress = findViewById(R.id.txtAddress);
        txtPrice = findViewById(R.id.txtPrice);
        txtRoom = findViewById(R.id.txtRoom);
        txtType = findViewById(R.id.txtType);
        txtUsableArea = findViewById(R.id.txtUsableArea);
        fabCall = findViewById(R.id.fabCall);
        fabMess =findViewById(R.id.fabMess);
    }

    void add(int i){
        Product product = MainActivity.products.get(i);

        img.setImageResource(product.getImage());
        txtUsableArea.setText(product.getUsableArea() + "m2");
        txtTitle.setText(product.getTitle());
        txtAddress.setText(product.getAddress());
        txtPrice.setText(product.getPrice() + " " +"$");
        txtRoom.setText(product.getBathroom() + " bathroom | "
        + product.getBedroom() + " bedroom");
        txtType.setText(product.getPropertyType());
        txtDes.setText("Vinhomes Central Park is a new development that is in the heart of everything that Ho Chi Minh has to offer. Located in Binh Thanh District, it is within easy reach of the new Metro Line No. 1 Ben Thanh – Suoi Tien, 4 minutes to downtown District 1 and 3 minutes to the new Thu Thiem urban area in the near future.\n" +
                "Taking inspiration from the famous New York’s Central Park, Vinhomes Central Park will be the newest green urban area that is modern and the most advanced in Vietnam. With its location beside the river that stretches to over 1km, Vinhomes Central Park will bring a green living space in the heart of Ho Chi Minh City and with nearly 14 hectares of parkland and greenery, will provide a fantastic open space for people to escape for some peace and tranquility.");
    }


}
