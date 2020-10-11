package com.t3h.foodreview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.foodreview.Models.KhamPha;
import com.t3h.foodreview.Models.TheoDoi;
import com.t3h.foodreview.R;

import java.util.List;

public class PageKhamPhaAdapter extends RecyclerView.Adapter<PageKhamPhaAdapter.PageKhamPhaHolder>{
    private LayoutInflater inflater;
    private List<KhamPha> data;

    public PageKhamPhaAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public void setData(List<KhamPha> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PageKhamPhaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_khampha,parent,false);
        return new PageKhamPhaHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PageKhamPhaAdapter.PageKhamPhaHolder holder, int position) {
        holder.bindView(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class PageKhamPhaHolder extends RecyclerView.ViewHolder {
        private ImageView imUser,imViewDoan;
        private TextView tvTieuDe,tvName;
        public PageKhamPhaHolder(@NonNull View itemView) {
            super(itemView);
            imUser = itemView.findViewById(R.id.im_nguoidungkp);
            imViewDoan = itemView.findViewById(R.id.im_vdoankp);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTieuDe = itemView.findViewById(R.id.tv_tieude);
        }

        public void bindView(KhamPha kp) {
            imViewDoan.setImageResource(kp.getId());
            imUser.setImageResource(kp.getIdUser());
            tvName.setText(kp.getNameUser());
            tvTieuDe.setText(kp.getTieude());
        }

    }
}
