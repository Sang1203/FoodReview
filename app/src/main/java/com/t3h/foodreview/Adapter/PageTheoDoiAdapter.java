package com.t3h.foodreview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.foodreview.Models.TheoDoi;
import com.t3h.foodreview.R;

import java.util.List;

public class PageTheoDoiAdapter extends RecyclerView.Adapter<PageTheoDoiAdapter.PageTheodoiHolder>{
    private LayoutInflater inflater;
    private List<TheoDoi> data;

    public PageTheoDoiAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public void setData(List<TheoDoi> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PageTheodoiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_theodoi,parent,false);
        return new PageTheodoiHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PageTheodoiHolder holder, int position) {
        holder.bindView(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class PageTheodoiHolder extends RecyclerView.ViewHolder {
        private ImageView imUser;
        private TextView tvName,tvTheodoi,tvsonguoitheodoi;
        public PageTheodoiHolder(@NonNull View itemView) {
            super(itemView);
            imUser = itemView.findViewById(R.id.im_nguoidung);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTheodoi = itemView.findViewById(R.id.tv_theodoi);
            tvsonguoitheodoi = itemView.findViewById(R.id.tv_songuoitheodoi);
        }

        public void bindView(TheoDoi theoDoi) {
            imUser.setImageResource(theoDoi.getId());
            tvName.setText(theoDoi.getName());
            tvTheodoi.setText(theoDoi.getTheodoi());
            tvsonguoitheodoi.setText(theoDoi.getSonguoitheodoi());

        }
    }
}
