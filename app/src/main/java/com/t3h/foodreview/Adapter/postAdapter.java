package com.t3h.foodreview.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class postAdapter extends RecyclerView.Adapter<postAdapter.postHolder> {
    @NonNull
    @Override
    public postHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull postHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class postHolder extends RecyclerView.ViewHolder {
        public postHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
