package com.example.th04_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SanPhamAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SanPham> sanPhamList;

    public SanPhamAdapter(Context context, int layout, List<SanPham> sanPhamList) {
        this.context = context;
        this.layout = layout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        return sanPhamList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imageView;
        TextView txtTen;
        TextView txtGiaBan;
        TextView txtGiaGiam;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.imageView = (ImageView) view.findViewById(R.id.imgHinhAnh);
            holder.txtTen = (TextView) view.findViewById(R.id.txtTen);
            holder.txtGiaBan = (TextView) view.findViewById(R.id.txtGiaBan);
            holder.txtGiaGiam = (TextView) view.findViewById(R.id.txtGiamGia);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        SanPham sanPham = sanPhamList.get(i);
        holder.txtTen.setText(sanPham.getTen());
        holder.txtGiaGiam.setText(sanPham.getGiamGia());
        holder.txtGiaBan.setText(sanPham.getGiaBan());
        holder.imageView.setImageResource(sanPham.getHinhAnh());
        return view;
    }
}
