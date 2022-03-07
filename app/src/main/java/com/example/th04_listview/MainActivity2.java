package com.example.th04_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    GridView gridView;
    ArrayList<SanPham> sanPhams;
    SanPhamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gridView = (GridView) findViewById(R.id.gridView);
        sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Cáp chuyển từ Cổng USB sang PS2 Ahihihahalalameomeohoho","69.000 đ","-39%",R.drawable.do_choi_dang_mo_hinh));
        sanPhams.add(new SanPham("Cáp chuyển từ Cổng USB sang PS2 Ahihihahalalameomeohoho","69.000 đ","-39%",R.drawable.ca_nau_lau));
        sanPhams.add(new SanPham("Cáp chuyển từ Cổng USB sang PS2 Ahihihahalalameomeohoho","69.000 đ","-39%",R.drawable.ga_bo_toi));
        sanPhams.add(new SanPham("Cáp chuyển từ Cổng USB sang PS2 Ahihihahalalameomeohoho","69.000 đ","-39%",R.drawable.hieu_long_con_tre));
        sanPhams.add(new SanPham("Cáp chuyển từ Cổng USB sang PS2 Ahihihahalalameomeohoho","69.000 đ","-39%",R.drawable.lanh_dao_gian_don));
        sanPhams.add(new SanPham("Cáp chuyển từ Cổng USB sang PS2 Ahihihahalalameomeohoho","69.000 đ","-39%",R.drawable.xa_can_cau));

        adapter = new SanPhamAdapter(this,R.layout.mot_sp_grid,sanPhams);
        gridView.setAdapter(adapter);


    }
}