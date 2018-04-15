package android.demo.housing_yuong;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class SearchFragment extends Fragment {
    TextView txtMoney, txtBuiding, txtBath, txtBed;
    SeekBar seekMoney, seekBuiding, seekBath, seekBed;
    Button btnSearch;

    public SearchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        Anhxa(view);


        seekMoney.setMax(2000);
        seekMoney.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtMoney.setText(i +"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBuiding.setMax(90);
        seekBuiding.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtBuiding.setText((i + 10)+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBed.setMax(5);
        seekBed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtBed.setText(i +"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBath.setMax(5);
        seekBath.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtBath.setText(i +"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }

    void Anhxa(View view){
        txtMoney = view.findViewById(R.id.textMoney);
        seekMoney = view.findViewById(R.id.seekbarMoney);
        txtBuiding = view.findViewById(R.id.textBuiding);
        seekBuiding = view.findViewById(R.id.seekbarBuiding);
        txtBed = view.findViewById(R.id.textBed);
        seekBed = view.findViewById(R.id.seekbarBed);
        txtBath = view.findViewById(R.id.textBath);
        seekBath = view.findViewById(R.id.seekbarBath);
        btnSearch = view.findViewById(R.id.btnSearch);
        return inflater.inflate(R.layout.fragment_noti, container, false);
    }
}
