package com.t3h.foodreview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.foodreview.Models.Post;
import com.t3h.foodreview.R;

import java.util.List;

public class postAdapter extends RecyclerView.Adapter<postAdapter.postHolder> {
    private LayoutInflater inflater;
    private List<Post> data;

    public void setData(List<Post> data) {
        this.data = data;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public void setInflater(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public postHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_theodoi,parent,false);
        return new postHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull postHolder holder, int position) {
        holder.binData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class postHolder extends RecyclerView.ViewHolder {
        public postHolder(@NonNull View itemView) {
            super(itemView);

        }

        public void binData(Post post) {
        }
    }
}
